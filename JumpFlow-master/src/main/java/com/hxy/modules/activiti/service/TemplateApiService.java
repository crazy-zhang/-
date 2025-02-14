package com.hxy.modules.activiti.service;

import com.inesa.neo4j.entity.*;

import java.util.Map;

public interface TemplateApiService {
    String getTemplateInfo(Template template);

    Map<String,String> getTemplateNodes(TemplateNodes templateNodes);

    Map<String,String> getTemplateInst(TemplateInst templateInst);

    Map<String,String> getTemplateInstNodes(TemplateInstNodes templateInstNodes);

    Map<String,String> getOperationLogs(OperationLogs operationLogs);
}
