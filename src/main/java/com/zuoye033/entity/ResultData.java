package com.zuoye033.entity;

/**
 * 回参实体类
 */
public class ResultData {
    /**
     * 请求状态
     */
    private boolean state;
    /**
     * 请求返回内容提示
     */
    private String message;
    /**
     * 请求返回数据
     */
    private Object data;

    public ResultData(boolean state, String message, Object data) {
        this.state = state;
        this.message = message;
        this.data = data;
    }

    public ResultData() {
    }

    public boolean isState() {
        return state;
    }

    public void setState(boolean state) {
        this.state = state;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }
}
