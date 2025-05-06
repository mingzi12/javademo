package com.enumeration.demo;

/**
 * @author XXX
 * @description: XXX
 * @date 2019/9/7 10:38
 */
public enum SIZE {
    SMALL("小号"),MEDIUM("中号"),LARGE("大号"),EXTRA_LARGE("超大号");

    private String desc ;
    SIZE(String desc) {
        this.desc = desc;
    }

    public String getDesc() {
        return this.desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }
}
