package com.metarnet.driver;


import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.metarnet.driver.bean.TaskInstance;

import java.io.*;
import java.net.URL;
import java.net.URLConnection;
import java.util.HashMap;
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

    }


}



