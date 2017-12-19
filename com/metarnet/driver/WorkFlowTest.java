package com.metarnet.driver;


import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.metarnet.driver.bean.TaskInstance;

import java.io.*;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by guohaotian01 on 2017/11/18.
 */
public class WorkFlowTest {


    public static void main(String[] args)throws Exception {

//        //发送 GET 请求
//        String s=sendGet("http://localhost:8083/EMOS/workFlowController.do", "method=getMyWaitingTasks&accountId=root");
//        JSONObject jsonObject=JSONObject.parseObject(s);
//        JSONArray exhibitDatas =  jsonObject.getJSONArray("exhibitDatas");
//        System.out.println(exhibitDatas.toJSONString());


//        //发送 POST 请求
//        String sr=sendPost("http://localhost:8083/EMOS/workFlowController.do", "method=getMyWaitingTasks&accountId=root");
//        System.out.println(sr);

        //根据任务实例ID查询任务对象
//        TaskInstance taskInstanceObject = WorkFlowAPI.getTaskInstanceObject("36541", "36541", "36541");
//        System.out.println(taskInstanceObject.toString());



//        TaskInstance jsonObject = WorkFlowAPI.startProcess("root", "['root']",
//                "demo-1", "","","default","");
//
//        System.out.println(jsonObject.toString());

        //测试流程资源的xml文件
        //http://10.225.222.201:8090/activiti-rest/repository/process-definitions/CircuitAttemper:9:39497/resourcedata
        String url= "http://10.225.222.201:8090/activiti-rest/repository/process-definitions/CircuitAttemper:9:39497/resourcedata";


        String sr = sendGet(url,"" );
        System.out.println(sr);


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



