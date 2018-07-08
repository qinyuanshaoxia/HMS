package com.pansiot.common.dto;

import java.io.Serializable;
import java.util.List;

public class ReturnData<T> implements Serializable {
    /**
     * 状态码
     */
    private int code;

    /**
     * 状态提示信息
     */
    private String msg;
    /**
     * 总记录数
     */
    private long total;

    /**
     * 返回数据集合
     */
    private List<T> data;

    private T singleData;

    public T getSingleData() {
        return singleData;
    }

    public void setSingleData(T singleData) {
        this.singleData = singleData;
    }

    public int getCode() {
        return code;
    }

    /**
     * 0：业务处理失败 1：业务处理成功 -1：出现异常
     * @param code
     */
    public void setCode(int code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public long getTotal() {
        return total;
    }

    public void setTotal(long total) {
        this.total = total;
    }

    public List<T> getData() {
        return data;
    }

    public void setData(List<T> data) {
        this.data = data;
    }
}
