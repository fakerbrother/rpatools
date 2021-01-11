package com.rpatools.demo.entity;

import java.io.Serializable;
import java.util.List;

/**
 * @author userli19951024@gmail.com
 * @date 2021/1/11 10:00
 */
public class Developer implements Serializable {
    private static final long UUID = 3L;

    private String jobNumber;

    private String nickName;

    private List<Tool> uploadTools;

    private List<Tool> downloadTools;
}
