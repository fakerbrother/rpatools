package com.rpatools.demo.entity;

import java.io.Serializable;
import java.util.List;

/**
 * @author userli19951024@gmail.com
 * @date 2021/1/11 10:04
 */
public class Manager implements Serializable {
    private static final long UUID = 4L;

    private String jobNumber;

    private String nickName;

    private List<Tool> downloadTools;

    private List<Tool> uploadTools;

    private List<Tool> deleteTools;
}
