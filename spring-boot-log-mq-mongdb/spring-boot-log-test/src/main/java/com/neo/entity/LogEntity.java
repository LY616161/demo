package com.neo.entity;

import java.io.Serializable;

public class LogEntity implements Serializable {
    private static final long serialVersionUID = -325883983911233L;
    private String id;
    private String msg;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
