package com.haven.pojo;

public class Hello {

    private String teststr;

    public String getTeststr() {
        return teststr;
    }

    public void setTeststr(String teststr) {
        this.teststr = teststr;
    }

    @Override
    public String toString() {
        return "Hello{" +
                "str='" + teststr + '\'' +
                '}';
    }
}
