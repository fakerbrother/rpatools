package com.rpatools.demo.controller;


import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.rpatools.demo.entity.Tool;
import com.rpatools.demo.mapper.ToolMapper;
import com.rpatools.demo.service.ToolService;
import com.rpatools.demo.utils.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author userli19951024@gmail.com
 * @since 2021-01-11
 */
@RestController
@RequestMapping("{/rpa}")
public class ToolController {
    @Autowired
    ToolService toolService;

    @GetMapping("{/tools}")
    public void findAll() {
        List<Tool> toolList = toolService.list();
        toolList.forEach(System.out::println);
    }
}
