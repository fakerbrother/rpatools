package com.rpatools.demo.utils;

import lombok.Data;

import java.io.Serializable;

/**
 * @author userli19951024@gmail.com
 * @date 2021/1/11 14:29
 */
@Data
public class Result implements Serializable {
    private String code;
    private String msg;
    private Object data;

    public static Result success(Object data) {
        Result m = new Result();
        m.setCode("0");
        m.setData(data);
        m.setMsg("操作成功");
        return m;
    }


}
