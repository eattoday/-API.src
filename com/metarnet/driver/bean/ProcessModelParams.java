package com.metarnet.driver.bean;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * Created by Administrator on 2017/7/20/0020.
 */
public class ProcessModelParams {

    private String processModelName;
    private String processInstName;
    private Map<String, Object> parameters = new LinkedHashMap();

    public ProcessModelParams() {
        this.parameters.clear();
    }

    public void setParameter(String key, Object value) {
        this.parameters.put(key, value);
    }

    public void removeParameter(String key) {
        this.parameters.remove(key);
    }

    public Object getParameter(String key) {
        return this.parameters.get(key);
    }

    public String getProcessModelName() {
        return this.processModelName;
    }

    public void setProcessModelName(String processModelName) {
        this.processModelName = processModelName;
    }

    public String getProcessInstName() {
        return this.processInstName;
    }

    public void setProcessInstName(String processInstName) {
        this.processInstName = processInstName;
    }

    public Map<String, Object> getParameters() {
        return this.parameters;
    }
}
