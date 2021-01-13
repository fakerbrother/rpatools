package com.rpatools.demo.controller;


import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.core.toolkit.Assert;
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
@RequestMapping("tools")
public class ToolController {
    @Autowired
    ToolService toolService;

    @GetMapping(value="all")
    public Result list(@RequestParam(defaultValue = "1") Integer currentPage) {
//        System.out.println("enter list search");
        Page<Tool> page = new Page<>(currentPage, 5);
        IPage<Tool> pageData = toolService.page(page, new QueryWrapper<Tool>().orderByDesc("upload_date"));
        return Result.success(pageData);
    }

    @GetMapping("/{id}")
    public Object test(@PathVariable(name = "id") Long id) {
        return toolService.getById(id);

    }
}
