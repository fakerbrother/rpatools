package com.rpatools.demo.entity;

import java.io.Serializable;
import java.util.Date;

/**
 * @author userli19951024@gmail.com
 * @date 2021/1/11 9:54
 */
public class Tool implements Serializable {

    private static final long UUID = 2L;

    private String name;

    private String type;

    private String developer;

    private String description;

    private int downloadNum;

    private int loveNum;

    private Date uploadDate;

    private String link;
}
