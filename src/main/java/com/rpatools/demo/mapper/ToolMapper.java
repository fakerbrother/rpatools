package com.rpatools.demo.mapper;

import com.rpatools.demo.entity.Tool;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.springframework.stereotype.Component;


/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author userli19951024@gmail.com
 * @since 2021-01-11
 */
@Component("toolMapper")
public interface ToolMapper extends BaseMapper<Tool> {
}
