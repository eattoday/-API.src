package com.metarnet.driver.bean;

import com.metarnet.driver.bean.*;

import java.util.Date;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/**
 * Created with IntelliJ IDEA.
 * User: hadoop
 * Date: 15-5-13
 * Time: 下午3:20
 * To change this template use File | Settings | File Templates.
 */
public class TaskFilter {

    @Override
    public String toString() {
        return "TaskFilter{" +
                "processModelID='" + processModelID + '\'' +
                ", processModelName='" + processModelName + '\'' +
                ", taskType='" + taskType + '\'' +
                ", taskWarning='" + taskWarning + '\'' +
                ", taskInstID='" + taskInstID + '\'' +
                ", appID='" + appID + '\'' +
                ", parentTaskInstID='" + parentTaskInstID + '\'' +
                ", processInstID='" + processInstID + '\'' +
                ", activityID='" + activityID + '\'' +
                ", activityName='" + activityName + '\'' +
                ", activityDefId='" + activityDefId + '\'' +
                ", activityDefID_op='" + activityDefID_op + '\'' +
                ", jobTitle='" + jobTitle + '\'' +
                ", jobID='" + jobID + '\'' +
                ", senderType='" + senderType + '\'' +
                ", senderID='" + senderID + '\'' +
                ", beginStartDate=" + beginStartDate +
                ", endStartDate=" + endStartDate +
                ", beginEndDate=" + beginEndDate +
                ", endEndDate=" + endEndDate +
                ", pageCondition=" + pageCondition +
                ", ReceiverID='" + ReceiverID + '\'' +
                ", ProductID='" + ProductID + '\'' +
                ", jobCode='" + jobCode + '\'' +
                ", searchMap=" + searchMap +
                ", rootvcColumn1='" + rootvcColumn1 + '\'' +
                ", rootvcColumn2='" + rootvcColumn2 + '\'' +
                ", rootnmColumn1=" + rootnmColumn1 +
                ", rootnmColumn2=" + rootnmColumn2 +
                ", strColumn1='" + strColumn1 + '\'' +
                ", strColumn2='" + strColumn2 + '\'' +
                ", strColumn3='" + strColumn3 + '\'' +
                ", strColumn4='" + strColumn4 + '\'' +
                ", strColumn5='" + strColumn5 + '\'' +
                ", strColumn6='" + strColumn6 + '\'' +
                ", strColumn7='" + strColumn7 + '\'' +
                ", datColumn1=" + datColumn1 +
                ", datColumn2=" + datColumn2 +
                ", numColumn1=" + numColumn1 +
                ", numColumn2=" + numColumn2 +
                ", ReceiverId='" + ReceiverId + '\'' +
                ", JobType='" + JobType + '\'' +
                ", DatColumn1StartTime=" + DatColumn1StartTime +
                ", DatColumn1EndTime=" + DatColumn1EndTime +
                ", DatColumn2StartTime=" + DatColumn2StartTime +
                ", DatColumn2EndTime=" + DatColumn2EndTime +
                ", shard='" + shard + '\'' +
                ", bizExprDataObject=" + bizExprDataObject +
                ", taskExprDataObject=" + taskExprDataObject +
                ", sortMap=" + sortMap +
                '}';
    }

    private String processModelID;
    private String processModelName;
    private String taskType;
    private String taskWarning;
    private String taskInstID;
    private String appID;
    private String parentTaskInstID;
    private String processInstID;
    private String activityID;
    private String activityName;
    private String activityDefId;
    private String activityDefID_op;
    private String jobTitle;
    private String jobID;
    private String senderType;
    private String senderID;
    private Date beginStartDate;
    private Date endStartDate;
    private Date beginEndDate;
    private Date endEndDate;
    private com.metarnet.driver.bean.PageCondition pageCondition;
//    private com.unicom.ucloud.workflow.objects.ProcessModelParams processParams;
    private String ReceiverID;
    private String ProductID;
    private String jobCode;
    private Map<String,String> searchMap;
    private String rootvcColumn1;
    private String rootvcColumn2;
    private int rootnmColumn1;
    private int rootnmColumn2;
    private String strColumn1;
    private String strColumn2;
    private String strColumn3;
    private String strColumn4;
    private String strColumn5;
    private String strColumn6;
    private String strColumn7;
    private Date datColumn1;
    private Date datColumn2;
    private int numColumn1;
    private int numColumn2;
    private String ReceiverId;
    private String JobType;
    private Date DatColumn1StartTime;
    private Date DatColumn1EndTime;
    private Date DatColumn2StartTime;
    private Date DatColumn2EndTime;
    private String shard;
    private List<Object> bizExprDataObject;
    private List<Object> taskExprDataObject;
    private LinkedHashMap<String,String> sortMap;

    public String getAppID() {
        return appID;
    }

    public void setAppID(String appID) {
        this.appID = appID;
    }

    public String getProcessModelID() {
        return processModelID;
    }

    public void setProcessModelID(String processModelID) {
        this.processModelID = processModelID;
    }

    public String getProcessModelName() {
        return processModelName;
    }

    public void setProcessModelName(String processModelName) {
        this.processModelName = processModelName;
    }

    public String getTaskType() {
        return taskType;
    }

    public void setTaskType(String taskType) {
        this.taskType = taskType;
    }

    public String getTaskWarning() {
        return taskWarning;
    }

    public void setTaskWarning(String taskWarning) {
        this.taskWarning = taskWarning;
    }

    public String getTaskInstID() {
        return taskInstID;
    }

    public void setTaskInstID(String taskInstID) {
        this.taskInstID = taskInstID;
    }

    public String getParentTaskInstID() {
        return parentTaskInstID;
    }

    public void setParentTaskInstID(String parentTaskInstID) {
        this.parentTaskInstID = parentTaskInstID;
    }

    public String getProcessInstID() {
        return processInstID;
    }

    public void setProcessInstID(String processInstID) {
        this.processInstID = processInstID;
    }

    public String getActivityID() {
        return activityID;
    }

    public void setActivityID(String activityID) {
        this.activityID = activityID;
    }

    public String getActivityName() {
        return activityName;
    }

    public void setActivityName(String activityName) {
        this.activityName = activityName;
    }

    public String getActivityDefId() {
        return activityDefId;
    }

    public void setActivityDefId(String activityDefId) {
        this.activityDefId = activityDefId;
    }

    public String getActivityDefID_op() {
        return activityDefID_op;
    }

    public void setActivityDefID_op(String activityDefID_op) {
        this.activityDefID_op = activityDefID_op;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public String getJobID() {
        return jobID;
    }

    public void setJobID(String jobID) {
        this.jobID = jobID;
    }

    public String getSenderType() {
        return senderType;
    }

    public void setSenderType(String senderType) {
        this.senderType = senderType;
    }

    public String getSenderID() {
        return senderID;
    }

    public void setSenderID(String senderID) {
        this.senderID = senderID;
    }

    public Date getBeginStartDate() {
        return beginStartDate;
    }

    public void setBeginStartDate(Date beginStartDate) {
        this.beginStartDate = beginStartDate;
    }

    public Date getEndStartDate() {
        return endStartDate;
    }

    public void setEndStartDate(Date endStartDate) {
        this.endStartDate = endStartDate;
    }

    public Date getBeginEndDate() {
        return beginEndDate;
    }

    public void setBeginEndDate(Date beginEndDate) {
        this.beginEndDate = beginEndDate;
    }

    public Date getEndEndDate() {
        return endEndDate;
    }

    public void setEndEndDate(Date endEndDate) {
        this.endEndDate = endEndDate;
    }

    public com.metarnet.driver.bean.PageCondition getPageCondition() {
        return pageCondition;
    }

    public void setPageCondition(com.metarnet.driver.bean.PageCondition pageCondition) {
        this.pageCondition = pageCondition;
    }

    public String getReceiverID() {
        return ReceiverID;
    }

    public void setReceiverID(String receiverID) {
        ReceiverID = receiverID;
    }

    public String getProductID() {
        return ProductID;
    }

    public void setProductID(String productID) {
        ProductID = productID;
    }

    public String getJobCode() {
        return jobCode;
    }

    public void setJobCode(String jobCode) {
        this.jobCode = jobCode;
    }

    public Map<String, String> getSearchMap() {
        return searchMap;
    }

    public void setSearchMap(Map<String, String> searchMap) {
        this.searchMap = searchMap;
    }

    public String getRootvcColumn1() {
        return rootvcColumn1;
    }

    public void setRootvcColumn1(String rootvcColumn1) {
        this.rootvcColumn1 = rootvcColumn1;
    }

    public String getRootvcColumn2() {
        return rootvcColumn2;
    }

    public void setRootvcColumn2(String rootvcColumn2) {
        this.rootvcColumn2 = rootvcColumn2;
    }

    public int getRootnmColumn1() {
        return rootnmColumn1;
    }

    public void setRootnmColumn1(int rootnmColumn1) {
        this.rootnmColumn1 = rootnmColumn1;
    }

    public int getRootnmColumn2() {
        return rootnmColumn2;
    }

    public void setRootnmColumn2(int rootnmColumn2) {
        this.rootnmColumn2 = rootnmColumn2;
    }

    public String getStrColumn1() {
        return strColumn1;
    }

    public void setStrColumn1(String strColumn1) {
        this.strColumn1 = strColumn1;
    }

    public String getStrColumn2() {
        return strColumn2;
    }

    public void setStrColumn2(String strColumn2) {
        this.strColumn2 = strColumn2;
    }

    public String getStrColumn3() {
        return strColumn3;
    }

    public void setStrColumn3(String strColumn3) {
        this.strColumn3 = strColumn3;
    }

    public String getStrColumn4() {
        return strColumn4;
    }

    public void setStrColumn4(String strColumn4) {
        this.strColumn4 = strColumn4;
    }

    public String getStrColumn5() {
        return strColumn5;
    }

    public void setStrColumn5(String strColumn5) {
        this.strColumn5 = strColumn5;
    }

    public String getStrColumn6() {
        return strColumn6;
    }

    public void setStrColumn6(String strColumn6) {
        this.strColumn6 = strColumn6;
    }

    public String getStrColumn7() {
        return strColumn7;
    }

    public void setStrColumn7(String strColumn7) {
        this.strColumn7 = strColumn7;
    }

    public Date getDatColumn1() {
        return datColumn1;
    }

    public void setDatColumn1(Date datColumn1) {
        this.datColumn1 = datColumn1;
    }

    public Date getDatColumn2() {
        return datColumn2;
    }

    public void setDatColumn2(Date datColumn2) {
        this.datColumn2 = datColumn2;
    }

    public int getNumColumn1() {
        return numColumn1;
    }

    public void setNumColumn1(int numColumn1) {
        this.numColumn1 = numColumn1;
    }

    public int getNumColumn2() {
        return numColumn2;
    }

    public void setNumColumn2(int numColumn2) {
        this.numColumn2 = numColumn2;
    }

    public String getReceiverId() {
        return ReceiverId;
    }

    public void setReceiverId(String receiverId) {
        ReceiverId = receiverId;
    }

    public String getJobType() {
        return JobType;
    }

    public void setJobType(String jobType) {
        JobType = jobType;
    }

    public Date getDatColumn1StartTime() {
        return DatColumn1StartTime;
    }

    public void setDatColumn1StartTime(Date datColumn1StartTime) {
        DatColumn1StartTime = datColumn1StartTime;
    }

    public Date getDatColumn1EndTime() {
        return DatColumn1EndTime;
    }

    public void setDatColumn1EndTime(Date datColumn1EndTime) {
        DatColumn1EndTime = datColumn1EndTime;
    }

    public Date getDatColumn2StartTime() {
        return DatColumn2StartTime;
    }

    public void setDatColumn2StartTime(Date datColumn2StartTime) {
        DatColumn2StartTime = datColumn2StartTime;
    }

    public Date getDatColumn2EndTime() {
        return DatColumn2EndTime;
    }

    public void setDatColumn2EndTime(Date datColumn2EndTime) {
        DatColumn2EndTime = datColumn2EndTime;
    }

    public String getShard() {
        return shard;
    }

    public void setShard(String shard) {
        this.shard = shard;
    }

    public List<Object> getBizExprDataObject() {
        return bizExprDataObject;
    }

    public void setBizExprDataObject(List<Object> bizExprDataObject) {
        this.bizExprDataObject = bizExprDataObject;
    }

    public List<Object> getTaskExprDataObject() {
        return taskExprDataObject;
    }

    public void setTaskExprDataObject(List<Object> taskExprDataObject) {
        this.taskExprDataObject = taskExprDataObject;
    }

    public LinkedHashMap<String, String> getSortMap() {
        return sortMap;
    }

    public void setSortMap(LinkedHashMap<String, String> sortMap) {
        this.sortMap = sortMap;
    }
}
