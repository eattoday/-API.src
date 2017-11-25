package com.metarnet.driver.bean;

import java.util.Date;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: hadoop
 * Date: 15-5-13
 * Time: 下午4:14
 * To change this template use File | Settings | File Templates.
 */
public class ActivityInstance {

    private String activityInstID;
    private String processInstID;
    private String activityInstName;
    private String activityInstDesc;
    private String activityType;
    private String currentState;
    private Date createTime;
    private Date startTime;
    private Date endTime;
    private List<String> subProcessID;
    private String activityDefID;
    private String rollbackFlag;
    private String messageID;
    private String absroleId;
    private String activityRolename;

    public String getActivityInstID() {
        return activityInstID;
    }

    public void setActivityInstID(String activityInstID) {
        this.activityInstID = activityInstID;
    }

    public String getProcessInstID() {
        return processInstID;
    }

    public void setProcessInstID(String processInstID) {
        this.processInstID = processInstID;
    }

    public String getActivityInstName() {
        return activityInstName;
    }

    public void setActivityInstName(String activityInstName) {
        this.activityInstName = activityInstName;
    }

    public String getActivityInstDesc() {
        return activityInstDesc;
    }

    public void setActivityInstDesc(String activityInstDesc) {
        this.activityInstDesc = activityInstDesc;
    }

    public String getActivityType() {
        return activityType;
    }

    public void setActivityType(String activityType) {
        this.activityType = activityType;
    }

    public String getCurrentState() {
        return currentState;
    }

    public void setCurrentState(String currentState) {
        this.currentState = currentState;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getStartTime() {
        return startTime;
    }

    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    public Date getEndTime() {
        return endTime;
    }

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    public List<String> getSubProcessID() {
        return subProcessID;
    }

    public void setSubProcessID(List<String> subProcessID) {
        this.subProcessID = subProcessID;
    }

    public String getActivityDefID() {
        return activityDefID;
    }

    public void setActivityDefID(String activityDefID) {
        this.activityDefID = activityDefID;
    }

    public String getRollbackFlag() {
        return rollbackFlag;
    }

    public void setRollbackFlag(String rollbackFlag) {
        this.rollbackFlag = rollbackFlag;
    }

    public String getMessageID() {
        return messageID;
    }

    public void setMessageID(String messageID) {
        this.messageID = messageID;
    }

    public String getAbsroleId() {
        return absroleId;
    }

    public void setAbsroleId(String absroleId) {
        this.absroleId = absroleId;
    }

    public String getActivityRolename() {
        return activityRolename;
    }

    public void setActivityRolename(String activityRolename) {
        this.activityRolename = activityRolename;
    }
}
