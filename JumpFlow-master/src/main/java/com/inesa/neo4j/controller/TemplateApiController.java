package com.inesa.neo4j.controller;

import com.inesa.neo4j.entity.Template;
import com.inesa.neo4j.service.TemplateApiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("/template")
public class TemplateApiController {
    @Autowired
    private TemplateApiService templateApiService;

    @GetMapping("/getTemplateInfo")
    public Map<String,String> getBillInfo(@RequestBody Template template) {
        System.out.println("fsdfsdfdsfsdfdsfsdfsd");
        return templateApiService.getTemplateInfo(template);
    }
}
