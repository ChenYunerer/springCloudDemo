package com.yun.springapp3.bean;

public class TestBean {
    private String key;
    private String value;

    @Override
    public String toString() {
        return "TestBean{" +
                "key='" + key + '\'' +
                ", value='" + value + '\'' +
                '}';
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
