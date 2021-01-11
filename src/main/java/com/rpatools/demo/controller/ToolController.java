package com.rpatools.demo.controller;


import com.rpatools.demo.service.ToolService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author userli19951024@gmail.com
 * @since 2021-01-11
 */
@RestController
@RequestMapping("/tool")
public class ToolController {
    @Autowired
    ToolService toolService;

    @GetMapping("/{id}")
    public Object test(@PathVariable("id") Long id) {
        return toolService.getById(id);
    }
}
