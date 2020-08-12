package com.hxy.modules.activiti.controller;

import com.inesa.neo4j.entity.Template;
import com.hxy.modules.activiti.service.TemplateApiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("template")
public class TemplateApiController {
    @Autowired
    private TemplateApiService templateApiService;

    @GetMapping("xx")
    public String getXX() {
        return "ok";
    }
    @ResponseBody
    @GetMapping("getTemplateInfo")
    public String getBillInfo(@RequestParam(value = "queryStartDate",required = false) String queryStartDate,
                              @RequestParam(value = "queryEndDate",required = false) String queryEndDate) {
        Template template = new Template();
        return templateApiService.getTemplateInfo(template);
    }
}
