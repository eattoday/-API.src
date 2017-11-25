package com.metarnet.driver.bean;


import java.sql.Timestamp;

/**
 * Created by Administrator on 2016/3/8.
 */

public class FlowNodeSettingBase {


    private Long id;
    private String settingID;/*业务主键*/
    private Long createdBy;/*创建人*/
    private Timestamp creationTime;/*创建时间*/
    private Long lastUpdatedBy;/*最后修改人*/
    private Timestamp lastUpdateTime;/*最后修改时间*/
    private Boolean deletedFlag;/*删除标记*/
    private Long deletedBy;/*删除人*/
    private Timestamp deletionTime;/*删除时间*/

    private String processModelId;
    private String processModelName;
    private String activityDefID;

    /**
     * 表单设置
     */
    private Integer formType;   //配置的表单类型;1：表单；2：自定义url；3、技术手段；4、自行开发表单

    private String formID;
    private String formName;

    private String customURL;
    private String tenantId;    /*租户ID*/
    private Boolean extand;/*是否支持扩展*/

    private String componentID;
    private String componentName;

    private String settingStatus;
    private String bpsVersion;

    /**
     * 技术手段
     */
    private String areaName;
    private String component;
    private String editLinks;
    private String showLinks;

    /**
     * 按钮设置
     */
    private String btnIDs;
    private String btnNames;

    /**
     * 前处理、后处理
     */
    private String preProcessor;
    private String postProcessor;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }


    public String getSettingID() {
        return settingID;
    }

    public void setSettingID(String settingID) {
        this.settingID = settingID;
    }


    public Long getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(Long createdBy) {
        this.createdBy = createdBy;
    }


    public Timestamp getCreationTime() {
        return creationTime;
    }

    public void setCreationTime(Timestamp creationTime) {
        this.creationTime = creationTime;
    }

    public Long getLastUpdatedBy() {
        return lastUpdatedBy;
    }

    public void setLastUpdatedBy(Long lastUpdatedBy) {
        this.lastUpdatedBy = lastUpdatedBy;
    }


    public Timestamp getLastUpdateTime() {
        return lastUpdateTime;
    }

    public void setLastUpdateTime(Timestamp lastUpdateTime) {
        this.lastUpdateTime = lastUpdateTime;
    }


    public Boolean getDeletedFlag() {
        return deletedFlag;
    }

    public void setDeletedFlag(Boolean deletedFlag) {
        this.deletedFlag = deletedFlag;
    }


    public Long getDeletedBy() {
        return deletedBy;
    }

    public void setDeletedBy(Long deletedBy) {
        this.deletedBy = deletedBy;
    }


    public Timestamp getDeletionTime() {
        return deletionTime;
    }

    public void setDeletionTime(Timestamp deletionTime) {
        this.deletionTime = deletionTime;
    }


    public String getProcessModelId() {
        return processModelId;
    }

    public void setProcessModelId(String processModelId) {
        this.processModelId = processModelId;
    }


    public String getProcessModelName() {
        return processModelName;
    }

    public void setProcessModelName(String processModelName) {
        this.processModelName = processModelName;
    }


    public String getActivityDefID() {
        return activityDefID;
    }

    public void setActivityDefID(String activityDefID) {
        this.activityDefID = activityDefID;
    }


    public String getFormID() {
        return formID;
    }

    public void setFormID(String formID) {
        this.formID = formID;
    }


    public String getFormName() {
        return formName;
    }

    public void setFormName(String formName) {
        this.formName = formName;
    }


    public String getCustomURL() {
        return customURL;
    }

    public void setCustomURL(String customURL) {
        this.customURL = customURL;
    }


    public String getComponentID() {
        return componentID;
    }

    public void setComponentID(String componentID) {
        this.componentID = componentID;
    }


    public String getComponentName() {
        return componentName;
    }

    public void setComponentName(String componentName) {
        this.componentName = componentName;
    }


    public String getSettingStatus() {
        return settingStatus;
    }

    public void setSettingStatus(String settingVersion) {
        this.settingStatus = settingVersion;
    }

    public String getBpsVersion() {
        return bpsVersion;
    }

    public void setBpsVersion(String bpsVersion) {
        this.bpsVersion = bpsVersion;
    }

    public Integer getFormType() {
        return formType;
    }

    public void setFormType(Integer formType) {
        this.formType = formType;
    }


    public Boolean getExtand() {
        return extand;
    }

    public void setExtand(Boolean extand) {
        this.extand = extand;
    }


    public String getTenantId() {
        return tenantId;
    }

    public void setTenantId(String tenantId) {
        this.tenantId = tenantId;
    }


    public String getAreaName() {
        return areaName;
    }

    public void setAreaName(String areaName) {
        this.areaName = areaName;
    }

    public String getComponent() {
        return component;
    }

    public void setComponent(String component) {
        this.component = component;
    }


    public String getEditLinks() {
        return editLinks;
    }

    public void setEditLinks(String editLinks) {
        this.editLinks = editLinks;
    }


    public String getShowLinks() {
        return showLinks;
    }

    public void setShowLinks(String showLinks) {
        this.showLinks = showLinks;
    }


    public String getBtnNames() {
        return btnNames;
    }

    public void setBtnNames(String btnNames) {
        this.btnNames = btnNames;
    }


    public String getBtnIDs() {
        return btnIDs;
    }

    public void setBtnIDs(String btnIDs) {
        this.btnIDs = btnIDs;
    }


    public String getPreProcessor() {
        return preProcessor;
    }

    public void setPreProcessor(String preProcessor) {
        this.preProcessor = preProcessor;
    }


    public String getPostProcessor() {
        return postProcessor;
    }

    public void setPostProcessor(String postProcessor) {
        this.postProcessor = postProcessor;
    }
}
