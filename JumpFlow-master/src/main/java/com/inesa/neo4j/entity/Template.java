package com.inesa.neo4j.entity;

public class Template {
    String lcmbbm;
    String lcmbmc;
    String mbml;
    String queryStartDate;
    String queryEndDate;

    public String getLcmbbm() {
        return lcmbbm;
    }
    public void setLcmbbm(String lcmbbm) {
        this.lcmbbm = lcmbbm;
    }

    public String getLcmbmc() {
        return lcmbmc;
    }
    public void setLcmbmc(String lcmbmc) {
        this.lcmbmc = lcmbmc;
    }
    public String getMbml() {
        return mbml;
    }
    public void setMbml(String mbml) {
        this.mbml = mbml;
    }
    public String getQueryStartDate() {
        return queryStartDate;
    }
    public void setQueryStartDate(String queryStartDate) {
        this.queryStartDate = queryStartDate;
    }
    public String getQueryEndDate() {
        return queryEndDate;
    }
    public void setQueryEndDate(String queryEndDate) {
        this.queryEndDate = queryEndDate;
    }
}
