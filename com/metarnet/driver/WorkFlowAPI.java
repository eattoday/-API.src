package com.metarnet.driver;


import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.metarnet.driver.bean.ActivityInstance;
import com.metarnet.driver.bean.FlowNodeSettingEntity;
import com.metarnet.driver.bean.ProcessInstance;
import com.metarnet.driver.bean.TaskInstance;

import java.io.*;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;


/**
 * Created by ght on 2017-11-17 20:12:02
 */

public class WorkFlowAPI {

    public static String URL;
    public static String SYSTEM_NAME;

    static {
        InputStream in = null;
        in = WorkFlowAPI.class.getResourceAsStream("params.properties");
        Properties pro = new Properties();
        try {
            pro.load(in);
        } catch (IOException e) {
            e.printStackTrace();
        }
        URL = pro.get("URL").toString();
        SYSTEM_NAME = pro.get("SYSTEM_NAME").toString();
    }

    /**
     * 1.启动流程
     *
     * @param accountId          必须
     * @param participants       必须
     * @param processModelID     必须
     * @param processModelParams
     * @param bizModleParam
     * @param tenantId
     * @param nextStep
     * @return
     */
    public static TaskInstance startProcess(String accountId, String participants,
                                            String processModelID, String processModelParams,
                                            String bizModleParam, String tenantId,
                                            String nextStep) {
        if (processModelParams == null)
            processModelParams = "";
        if (bizModleParam == null)
            bizModleParam = "";
        if (tenantId == null)
            tenantId = "";
        if (nextStep == null)
            nextStep = "";

        accountId += SYSTEM_NAME;

        //将候选人集合添加系统后缀名
        List<String> participantList = JSONArray.parseArray(participants, String.class);
        List<String> newParticipantList = new ArrayList<String>();
        for (String participant : participantList) {
            participant += SYSTEM_NAME;
            newParticipantList.add(participant);
        }
        String systemParticipants = JSON.toJSONString(newParticipantList);

        String sr = sendPost(URL + "workFlowController.do?method=startProcess",
                "&accountId=" + accountId +
                        "&processModelID=" + processModelID +
                        "&participants=" + systemParticipants +
                        "&tenantId=" + tenantId +
                        "&nextStep=" + nextStep +
                        "&processModelParams=" + processModelParams +
                        "&bizModleParam=" + bizModleParam
        );
        JSONObject body = JSONObject.parseObject(sr);
        List<TaskInstance> taskInstanceList = getMyWaitingTasks("", body.getString("processInstID"), "", "", "");
        return taskInstanceList.get(0);
    }

    /**
     * 2.提交待办
     *
     * @param taskInstanceID 任务实例ID  必须
     * @param participants   候选人列表   必须
     * @param accountId      用户ID    必须
     * @param tenantId       租户ID
     * @param nextStep       下一步
     */
    public static TaskInstance submitTask(String accountId, String participants,
                                          String taskInstanceID, String tenantId,
                                          String nextStep) {
        try {
            if (tenantId == null)
                tenantId = "";
            if (nextStep == null)
                nextStep = "";
            if (accountId == null)
                accountId = "";

            if (!accountId.contains("_eoms")&&!accountId.contains("_irms"))
                accountId += SYSTEM_NAME;

            //将候选人集合添加系统后缀名
            List<String> participantList = JSONArray.parseArray(participants, String.class);
            List<String> newParticipantList = new ArrayList<String>();
            for (String participant : participantList) {
                participant += SYSTEM_NAME;
                newParticipantList.add(participant);
            }
            String systemParticipants = JSON.toJSONString(newParticipantList);

            TaskInstance taskInstanceObject = getTaskInstanceObject("", taskInstanceID, "");
            String processInstID = taskInstanceObject.getProcessInstID();
            String sr = sendPost(URL + "workFlowController.do?method=submitTask",
                    "&accountId=" + accountId +
                            "&taskInstanceID=" + taskInstanceID +
                            "&participants=" + systemParticipants +
                            "&tenantId=" + tenantId +
                            "&nextStep=" + nextStep
            );
            JSONObject body = JSONObject.parseObject(sr);
            if (!"true".equals(body.getString("result"))) {
                System.out.println("提交待办失败");
                return null;
            }
            List<TaskInstance> taskInstanceList = getMyWaitingTasks("", processInstID, "", "", "");
            if (taskInstanceList == null) {
                return null;
            }
            return taskInstanceList.get(0);

        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    /**
     * 3.查询待办-旧版
     *
     * @param accountId     必须
     * @param startRecord
     * @param pageSize
     * @param processInstID
     * @param tenantId
     * @return
     */
    public static List<TaskInstance> getMyWaitingTasks(String accountId, String processInstID,
                                                       String tenantId, String startRecord,
                                                       String pageSize) {

        if (accountId == null)
            accountId = "";
        if (startRecord == null)
            startRecord = "";
        if (pageSize == null)
            pageSize = "";
        if (processInstID == null)
            processInstID = "";
        if (tenantId == null)
            tenantId = "";

        if (!"".equals(accountId))
            accountId += SYSTEM_NAME;

        String sr = sendPost(URL + "workFlowController.do?method=getMyWaitingTasks",
                "&accountId=" + accountId +
                        "&startRecord=" + startRecord +
                        "&pageSize=" + pageSize +
                        "&processInstID=" + processInstID +
                        "&tenantId=" + tenantId
        );
        JSONObject body = JSONObject.parseObject(sr);

        JSONArray exhibitDatas = body.getJSONArray("exhibitDatas");
        List<TaskInstance> list = JSONArray.parseArray(exhibitDatas.toString(), TaskInstance.class);

        return list;
    }

    /**
     * 6.查询已办
     *
     * @param accountId
     * @param startRecord
     * @param pageSize
     * @param processInstID
     * @param tenantId
     * @return
     */
    public static List<TaskInstance> getMyCompletedTasks(String accountId, String processInstID,
                                                         String tenantId, String startRecord,
                                                         String pageSize) {
        if (accountId == null)
            accountId = "";
        if (startRecord == null)
            startRecord = "";
        if (pageSize == null)
            pageSize = "";
        if (processInstID == null)
            processInstID = "";
        if (tenantId == null)
            tenantId = "";

        if (!"".equals(accountId))
            accountId += SYSTEM_NAME;

        String sr = sendPost(URL + "workFlowController.do?method=getMyCompletedTasks",
                "&accountId=" + accountId +
                        "&startRecord=" + startRecord +
                        "&pageSize=" + pageSize +
                        "&processInstID=" + processInstID +
                        "&tenantId=" + tenantId
        );
        JSONObject body = JSONObject.parseObject(sr);

        JSONArray exhibitDatas = body.getJSONArray("exhibitDatas");
        List<TaskInstance> list = JSONArray.parseArray(exhibitDatas.toString(), TaskInstance.class);
        return list;
    }

    /**
     * 7.获取发起过的工单
     */
    public static List<TaskInstance> getWorkOrderStart(String accountId) {
        if (accountId == null)
            accountId = "";

        if (!"".equals(accountId))
            accountId += SYSTEM_NAME;

        String sr = sendPost(URL + "workFlowController.do?method=getWorkOrderStart",
                "&accountId=" + accountId

        );
        JSONObject body = JSONObject.parseObject(sr);

        JSONArray exhibitDatas = body.getJSONArray("exhibitDatas");
        List<TaskInstance> list = JSONArray.parseArray(exhibitDatas.toString(), TaskInstance.class);
        return list;
    }

    /**
     * 8.获取动态表单属性
     * 根据流程id,流程名字和环节定义id获取动态表单属性
     *
     * @param processModelId
     * @param processModelName
     * @param activityDefID
     * @return
     */
    public static FlowNodeSettingEntity queryNodeSetting(String processModelId, String processModelName, String activityDefID) {
        if (processModelId == null)
            processModelId = "";
        if (processModelName == null)
            processModelName = "";
        if (activityDefID == null)
            activityDefID = "";

        String sr = sendPost(URL + "workFlowController.do?method=queryNodeSetting",
                "&processModelId=" + processModelId +
                        "&processModelName=" + processModelName +
                        "&activityDefID=" + activityDefID
        );
        JSONObject body = JSONObject.parseObject(sr);

        FlowNodeSettingEntity flowNodeSettingEntity = JSONObject.parseObject(body.toString(), FlowNodeSettingEntity.class);
        return flowNodeSettingEntity;
    }


    /**
     * 10.获取流程模板列表
     */
    public static JSONArray getProcessModeLists() {

        String sr = sendPost(URL + "workFlowController.do?method=getProcessModeLists", "");
        JSONObject body = JSONObject.parseObject(sr);

        JSONArray data = body.getJSONArray("data");
        return data;
    }


    /**
     * 10.根据流程实例ID获取流程对象
     *
     * @param accountId     用户ID    非必须
     * @param processInstID 流程实例ID  必须
     * @param tenantId      租户ID    非必须
     */
    public static ProcessInstance getProcessInstance(String accountId, String processInstID, String tenantId) {

        if (accountId == null)
            accountId = "";
        if (tenantId == null)
            tenantId = "";
        if (!"".equals(accountId))
            accountId += SYSTEM_NAME;
        String sr = sendPost(URL + "workFlowController.do?method=getProcessInstance",
                "&accountId=" + accountId +
                        "&tenantId=" + tenantId +
                        "&processInstID=" + processInstID
        );
        JSONObject body = JSONObject.parseObject(sr);

        ProcessInstance processInstance = JSONObject.parseObject(body.toString(), ProcessInstance.class);
        return processInstance;
    }

    /**
     * 11.根据任务实例ID获取任务实例对象
     *
     * @param accountId
     * @param taskInstId 必须
     * @param tenantId
     */
    public static TaskInstance getTaskInstanceObject(String accountId, String taskInstId, String tenantId) {
        if (accountId == null)
            accountId = "";
        if (tenantId == null)
            tenantId = "";
        if (!"".equals(accountId))
            accountId += SYSTEM_NAME;
        String sr = sendPost(URL + "workFlowController.do?method=getTaskInstanceObject",
                "&accountId=" + accountId +
                        "&tenantId=" + tenantId +
                        "&taskInstId=" + taskInstId
        );
        JSONObject body = JSONObject.parseObject(sr);


        TaskInstance taskInstance = JSONObject.parseObject(body.toString(), TaskInstance.class);
        return taskInstance;
    }


    /**
     * 12.设置相关数据
     *
     * @param processInstID 流程实例ID  必须
     * @param relaData      相关数据    必须  {"aa":"bb","cc":"dd","list":["ee","ff"]}
     * @param accountId     用户ID    非必须
     * @param tenantId      租户ID    非必须
     */
    public static String setRelativeData(String accountId, String processInstID,
                                         String relaData, String tenantId) {

        if (accountId == null)
            accountId = "";
        if (tenantId == null)
            tenantId = "";
        if (!"".equals(accountId))
            accountId += SYSTEM_NAME;
        String sr = sendPost(URL + "workFlowController.do?method=setRelativeData",
                "&accountId=" + accountId +
                        "&tenantId=" + tenantId +
                        "&processInstID=" + processInstID +
                        "&relaData={relaData}"
        );
        JSONObject body = JSONObject.parseObject(sr);

        return body.getString("result");
    }

    /**
     * 13.获取相关数据
     *
     * @param processInstID 流程实例ID  必须
     * @param keys          查找的数据的key键   必须   ["aa","bb"]
     * @param accountId     用户ID    非必须
     * @param tenantId      租户ID    非必须
     */
    public static JSONObject getRelativeData(String accountId, String processInstID,
                                             String keys, String tenantId) {

        if (accountId == null)
            accountId = "";
        if (tenantId == null)
            tenantId = "";
        if (!"".equals(accountId))
            accountId += SYSTEM_NAME;

        String sr = sendPost(URL + "workFlowController.do?method=getRelativeData",
                "&accountId=" + accountId +
                        "&tenantId=" + tenantId +
                        "&processInstID=" + processInstID +
                        "&keys={keys}"
        );
        JSONObject body = JSONObject.parseObject(sr);

        return body;
    }

    /**
     * 18.更改任务领取人,若为空则设置为空
     */
    public static String deleteAssignee(String user, String taskInstId) {
        if (user == null)
            user = "";
        if (!"".equals(user))
            user += SYSTEM_NAME;

        String sr = sendPost(URL + "workFlowController.do?method=deleteAssignee",
                "&user=" + user +
                        "&taskInstId=" + taskInstId
        );
        JSONObject body = JSONObject.parseObject(sr);
        return body.getString("result");
    }


    /**
     * 20.增加候选人-转办-协办
     * 若传递accountId的值,则会删除accountId的候选资格
     * 可以传递List集合的json形式的候选人集合 进行批量增加
     *
     * @param accountId      用户ID
     * @param taskInstanceId 任务实例ID
     * @param participantIds 转办后执行人ID集合
     * @return 反馈结果    true/false
     */
    public static String forwardTask(String accountId, String taskInstanceId, String participantIds) {
        if (accountId == null)
            accountId = "";
        if (!"".equals(accountId))
            accountId += SYSTEM_NAME;

        //将候选人集合添加系统后缀名
        List<String> participantList = JSONArray.parseArray(participantIds, String.class);
        List<String> newParticipantList = new ArrayList<String>();
        for (String participant : participantList) {
            participant += SYSTEM_NAME;
            newParticipantList.add(participant);
        }
        String systemParticipants = JSON.toJSONString(newParticipantList);

        String sr = sendPost(URL + "workFlowController.do?method=forwardTask",
                "&accountId=" + accountId +
                        "&taskInstanceId=" + taskInstanceId +
                        "&participantIds=" + systemParticipants
        );
        JSONObject body = JSONObject.parseObject(sr);
        return body.getString("result");
    }


    /**
     * 向指定 URL 发送GET方法的请求
     *
     * @param url   发送请求的 URL
     * @param param 请求参数，请求参数应该是 name1=value1&name2=value2 的形式。
     * @return 所代表远程资源的响应结果
     */
    public static String sendGet(String url, String param) {
        String result = "";
        BufferedReader in = null;
        try {
            String urlNameString = url + "?" + param;
            java.net.URL realUrl = new URL(urlNameString);
            // 打开和URL之间的连接
            URLConnection connection = realUrl.openConnection();
            connection.connect();
            in = new BufferedReader(new InputStreamReader(
                    connection.getInputStream()));
            String line;
            while ((line = in.readLine()) != null) {
                result += line;
            }
        } catch (Exception e) {
            System.out.println("发送GET请求出现异常！" + e);
            e.printStackTrace();
        }
        // 使用finally块来关闭输入流
        finally {
            try {
                if (in != null) {
                    in.close();
                }
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
        return result;
    }


    /**
     * 向指定 URL 发送POST方法的请求
     *
     * @param url   发送请求的 URL
     * @param param 请求参数，请求参数应该是 name1=value1&name2=value2 的形式。
     * @return 所代表远程资源的响应结果
     */
    public static String sendPost(String url, String param) {
        PrintWriter out = null;
        BufferedReader in = null;
        String result = "";
        try {
            URL realUrl = new URL(url);
            // 打开和URL之间的连接
            URLConnection conn = realUrl.openConnection();
            // 设置通用的请求属性
            conn.setRequestProperty("accept", "*/*");
            conn.setRequestProperty("connection", "Keep-Alive");
            conn.setRequestProperty("user-agent",
                    "Mozilla/4.0 (compatible; MSIE 6.0; Windows NT 5.1;SV1)");
            // 发送POST请求必须设置如下两行
            conn.setDoOutput(true);
            conn.setDoInput(true);
            // 获取URLConnection对象对应的输出流
            out = new PrintWriter(conn.getOutputStream());
            // 发送请求参数
            out.print(param);
            // flush输出流的缓冲
            out.flush();

            // 定义BufferedReader输入流来读取URL的响应
//            in = new BufferedReader(
//                    new InputStreamReader(conn.getInputStream()));
//            String line;
//            while ((line = in.readLine()) != null) {
//                result += line;
//            }

            //定义字节流来读取
//            InputStream inputStream = conn.getInputStream();
//            StringBuffer sBuffer=new StringBuffer();
//            String tempStr;
//            byte[] b = new byte[4];
//            int i = 0;
//            while ((i = inputStream.read(b)) > 0) {
//                tempStr=new String(b,0,i);
//                sBuffer.append(tempStr);
//            }
//            result = sBuffer.toString();


            //用集合来获取
            InputStream inputStream = conn.getInputStream();
            List<Byte> blist = new ArrayList<Byte>();
            int i = 0;
            while ((i = inputStream.read()) > 0) {
                blist.add((byte) i);
            }
            byte[] aa = new byte[blist.size()];
            for (i = 0; i < blist.size(); i++) {
                aa[i] = blist.get(i);
            }
            result = new String(aa, 0, blist.size(), "UTF-8");

        } catch (Exception e) {
            System.out.println("发送 POST 请求出现异常！" + e);
            e.printStackTrace();
        }
        //使用finally块来关闭输出流、输入流
        finally {
            try {
                if (out != null) {
                    out.close();
                }
                if (in != null) {
                    in.close();
                }
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
        return result;
    }


}
