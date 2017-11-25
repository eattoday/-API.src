package com.metarnet.driver.bean;

import java.util.Date;

/**
 * Created with IntelliJ IDEA.
 * User: hadoop
 * Date: 15-5-13
 * Time: 下午4:12
 * To change this template use File | Settings | File Templates.
 */
public class ProcessInstance {

    private String processInstID;
    private String parentProcessInstID;
    private String appID;
    private String processModelID;
    private String processModelName;
    private String processInstStatus;
    private Date startDate;
    private String startAccountID;
    private String parentActID;

    public String getProcessInstID() {
        return processInstID;
    }

    public void setProcessInstID(String processInstID) {
        this.processInstID = processInstID;
    }

    public String getParentProcessInstID() {
        return parentProcessInstID;
    }

    public void setParentProcessInstID(String parentProcessInstID) {
        this.parentProcessInstID = parentProcessInstID;
    }

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

    public String getProcessInstStatus() {
        return processInstStatus;
    }

    public void setProcessInstStatus(String processInstStatus) {
        this.processInstStatus = processInstStatus;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public String getStartAccountID() {
        return startAccountID;
    }

    public void setStartAccountID(String startAccountID) {
        this.startAccountID = startAccountID;
    }

    public String getParentActID() {
        return parentActID;
    }

    public void setParentActID(String parentActID) {
        this.parentActID = parentActID;
    }
}
