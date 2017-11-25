package com.metarnet.driver.bean;

import com.metarnet.driver.bean.*;

import java.util.Date;
import java.util.List;
import java.util.Map;

/**
 * Created with IntelliJ IDEA.
 * User: hadoop
 * Date: 15-5-13
 * Time: 下午3:19
 * To change this template use File | Settings | File Templates.
 */
public class TaskInstance {
    private String taskInstID;
    private String parentTaskInstID;
    private String processModelId;
    private String ProcessModelName;
    private String processModelCNName;
    private String ProcessModelDes;
    private String processInstID;
    private String activityInstID;
    private String activityDefID;
    private String activityInstName;
    private String appID;
    private String formURL;
    private String jobTitle;
    private String jobID;
    private String senderType;
    private String senderID;
    private Date endDate;
    private Date completionDate;
    private Date createDate;
    private Date warningDate;
    private String currentState;
    private String shard;
    private String businessId;
    private String PRODUCT_ID;
    private String MAJOR_ID;
    private String rootProcessInstId;
    private List<com.metarnet.driver.bean.Participant> participants;
//    private com.unicom.ucloud.workflow.objects.ProcessModelParams processMessage;
//    private com.unicom.ucloud.workflow.objects.ProcessConditionMessages processConditionMessage;
//    private java.util.List<com.unicom.ucloud.workflow.objects.ProcessModelParams> subprocessMessageList;
    private Map<String,Object> fileds;
    private Date jobStarttime;
    private Date jobEndtime;
    private Date reBacktime;
    private String jobCode;
    private String TaskWarning;
    private String ReceiverID;
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
    private String jobtype;


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

    public String getProcessModelId() {
        return processModelId;
    }

    public void setProcessModelId(String processModelId) {
        this.processModelId = processModelId;
    }

    public String getProcessModelName() {
        return ProcessModelName;
    }

    public void setProcessModelName(String processModelName) {
        ProcessModelName = processModelName;
    }

    public String getProcessModelCNName() {
        return processModelCNName;
    }

    public void setProcessModelCNName(String processModelCNName) {
        this.processModelCNName = processModelCNName;
    }

    public String getProcessModelDes() {
        return ProcessModelDes;
    }

    public void setProcessModelDes(String processModelDes) {
        ProcessModelDes = processModelDes;
    }

    public String getProcessInstID() {
        return processInstID;
    }

    public void setProcessInstID(String processInstID) {
        this.processInstID = processInstID;
    }

    public String getActivityInstID() {
        return activityInstID;
    }

    public void setActivityInstID(String activityInstID) {
        this.activityInstID = activityInstID;
    }

    public String getActivityDefID() {
        return activityDefID;
    }

    public void setActivityDefID(String activityDefID) {
        this.activityDefID = activityDefID;
    }

    public String getActivityInstName() {
        return activityInstName;
    }

    public void setActivityInstName(String activityInstName) {
        this.activityInstName = activityInstName;
    }

    public String getAppID() {
        return appID;
    }

    public void setAppID(String appID) {
        this.appID = appID;
    }

    public String getFormURL() {
        return formURL;
    }

    public void setFormURL(String formURL) {
        this.formURL = formURL;
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

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public Date getCompletionDate() {
        return completionDate;
    }

    public void setCompletionDate(Date completionDate) {
        this.completionDate = completionDate;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public Date getWarningDate() {
        return warningDate;
    }

    public void setWarningDate(Date warningDate) {
        this.warningDate = warningDate;
    }

    public String getCurrentState() {
        return currentState;
    }

    public void setCurrentState(String currentState) {
        this.currentState = currentState;
    }

    public String getShard() {
        return shard;
    }

    public void setShard(String shard) {
        this.shard = shard;
    }

    public String getBusinessId() {
        return businessId;
    }

    public void setBusinessId(String businessId) {
        this.businessId = businessId;
    }

    public String getPRODUCT_ID() {
        return PRODUCT_ID;
    }

    public void setPRODUCT_ID(String PRODUCT_ID) {
        this.PRODUCT_ID = PRODUCT_ID;
    }

    public String getMAJOR_ID() {
        return MAJOR_ID;
    }

    public void setMAJOR_ID(String MAJOR_ID) {
        this.MAJOR_ID = MAJOR_ID;
    }

    public String getRootProcessInstId() {
        return rootProcessInstId;
    }

    public void setRootProcessInstId(String rootProcessInstId) {
        this.rootProcessInstId = rootProcessInstId;
    }

    public List<com.metarnet.driver.bean.Participant> getParticipants() {
        return participants;
    }

    public void setParticipants(List<com.metarnet.driver.bean.Participant> participants) {
        this.participants = participants;
    }

    public Map<String, Object> getFileds() {
        return fileds;
    }

    public void setFileds(Map<String, Object> fileds) {
        this.fileds = fileds;
    }

    public Date getJobStarttime() {
        return jobStarttime;
    }

    public void setJobStarttime(Date jobStarttime) {
        this.jobStarttime = jobStarttime;
    }

    public Date getJobEndtime() {
        return jobEndtime;
    }

    public void setJobEndtime(Date jobEndtime) {
        this.jobEndtime = jobEndtime;
    }

    public Date getReBacktime() {
        return reBacktime;
    }

    public void setReBacktime(Date reBacktime) {
        this.reBacktime = reBacktime;
    }

    public String getJobCode() {
        return jobCode;
    }

    public void setJobCode(String jobCode) {
        this.jobCode = jobCode;
    }

    public String getTaskWarning() {
        return TaskWarning;
    }

    public void setTaskWarning(String taskWarning) {
        TaskWarning = taskWarning;
    }

    public String getReceiverID() {
        return ReceiverID;
    }

    public void setReceiverID(String receiverID) {
        ReceiverID = receiverID;
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

    public String getJobtype() {
        return jobtype;
    }

    public void setJobtype(String jobtype) {
        this.jobtype = jobtype;
    }

    @Override
    public String toString() {
        return "TaskInstance{" +
                "taskInstID='" + taskInstID + '\'' +
                ", parentTaskInstID='" + parentTaskInstID + '\'' +
                ", processModelId='" + processModelId + '\'' +
                ", ProcessModelName='" + ProcessModelName + '\'' +
                ", processModelCNName='" + processModelCNName + '\'' +
                ", ProcessModelDes='" + ProcessModelDes + '\'' +
                ", processInstID='" + processInstID + '\'' +
                ", activityInstID='" + activityInstID + '\'' +
                ", activityDefID='" + activityDefID + '\'' +
                ", activityInstName='" + activityInstName + '\'' +
                ", appID='" + appID + '\'' +
                ", formURL='" + formURL + '\'' +
                ", jobTitle='" + jobTitle + '\'' +
                ", jobID='" + jobID + '\'' +
                ", senderType='" + senderType + '\'' +
                ", senderID='" + senderID + '\'' +
                ", endDate=" + endDate +
                ", completionDate=" + completionDate +
                ", createDate=" + createDate +
                ", warningDate=" + warningDate +
                ", currentState='" + currentState + '\'' +
                ", shard='" + shard + '\'' +
                ", businessId='" + businessId + '\'' +
                ", PRODUCT_ID='" + PRODUCT_ID + '\'' +
                ", MAJOR_ID='" + MAJOR_ID + '\'' +
                ", rootProcessInstId='" + rootProcessInstId + '\'' +
                ", participants=" + participants +
                ", fileds=" + fileds +
                ", jobStarttime=" + jobStarttime +
                ", jobEndtime=" + jobEndtime +
                ", reBacktime=" + reBacktime +
                ", jobCode='" + jobCode + '\'' +
                ", TaskWarning='" + TaskWarning + '\'' +
                ", ReceiverID='" + ReceiverID + '\'' +
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
                ", jobtype='" + jobtype + '\'' +
                '}';
    }
}
