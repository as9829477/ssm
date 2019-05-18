package com.ssm.utils.dataSourceUtils;

/**
 *  多个枚举数据源中的key
 * Created by JSKJ on 2019/5/13.
 */
public enum DataSourceEnum {
    DSPG("dspg"), DSMYSQL("dsmysql");

    private String key;

    DataSourceEnum(String key) { this.key = key; }

    public String getKey() { return key; }

    public void setKey(String key) {  this.key = key; }
}
