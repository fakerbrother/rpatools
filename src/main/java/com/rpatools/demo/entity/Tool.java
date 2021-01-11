package com.rpatools.demo.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.time.LocalDateTime;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <p>
 * 
 * </p>
 *
 * @author userli19951024@gmail.com
 * @since 2021-01-11
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class Tool implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    private String name;

    private String type;

    private String developer;

    private String description;

    private Integer downloadNum;

    private Integer loveNum;

    private LocalDateTime uploadDate;

    private String link;


}
