package com.hxy.modules.activiti.service.impl;

import com.alibaba.fastjson.JSON;
import com.hxy.modules.activiti.service.TemplateApiService;
import com.inesa.neo4j.entity.*;
import com.inesa.neo4j.entity.vo.TemplateInfoVo;
import com.inesa.neo4j.entity.vo.TemplateInstInfoVo;
import com.inesa.neo4j.entity.vo.TemplateInstNodesInfoVo;
import com.inesa.neo4j.entity.vo.TemplateNodesInfoVo;
import com.inesa.neo4j.util.HttpClientUtils;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.HashMap;
import java.util.Map;

@Service

public class TemplateApiServiceImpl implements TemplateApiService {
    @Override
    public String getTemplateInfo(Template template) {
        Map<String, String> fields = new HashMap<>();
        Map<String,String> header = new HashMap<>();
        header.put("X-Api-Id","ed773218-9f67-503a-8c9b-d570628110e6");
        header.put("X-Api-Temp","4296d201-f971-42c8-985e-cb147445576f");
        header.put("X-Api-Signature","86709fb7f736df7d74bc6e8a893cbc95");
        fields.put("queryStartDate", "2018-11-08 15:10:42");
        fields.put("queryEndDate", "2019-11-08 23:59:42");
        try {
            HttpClientUtils.HttpClientResult apiResult = HttpClientUtils.doGet(
                    "http://aiidc.vipgz1.idcfengye.com/portal/api/proc/template", header,fields);
            System.out.println(apiResult.getContent());
            TemplateInfoVo templateInfoVo = JSON.parseObject(apiResult.getContent(), TemplateInfoVo.class);
            Map<String, String> map = templateInfoVo.getRows().get(0);
            return map.get("lcmbmc") + map.get("mbml");
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    @Override
    public Map<String, String> getTemplateNodes(TemplateNodes templateNodes) {
        Map<String,String> fields = new HashMap<>();
        fields.put("bahjdm",templateNodes.getBahjdm());
        try {
            HttpClientUtils.HttpClientResult apiResult = HttpClientUtils.doGet("http://114.116.223.7/portal/api/proc/template/nodes",null,fields);
            TemplateNodesInfoVo templateNodesInfoVo = JSON.parseObject(apiResult.getContent(),TemplateNodesInfoVo.class);
            Map<String,String> result = new HashMap<String,String>();
            return result;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public Map<String, String> getTemplateInst(TemplateInst templateInst) {
        Map<String,String> fields = new HashMap<>();
        fields.put("bahjdm",templateInst.getBahjdm());
        try {
            HttpClientUtils.HttpClientResult apiResult = HttpClientUtils.doGet("http://114.116.223.7/portal/api/proc/inst",null,fields);
            TemplateInstInfoVo templateNodesInfoVo = JSON.parseObject(apiResult.getContent(),TemplateInstInfoVo.class);
            Map<String,String> result = new HashMap<String,String>();
            return result;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public Map<String, String> getTemplateInstNodes(TemplateInstNodes templateInstNodes) {
        Map<String,String> fields = new HashMap<>();
        try {
            HttpClientUtils.HttpClientResult apiResult = HttpClientUtils.doGet("http://114.116.223.7/portal/api/proc/inst/nodes",null,fields);
            TemplateInstNodesInfoVo templateNodesInfoVo = JSON.parseObject(apiResult.getContent(),TemplateInstNodesInfoVo.class);
            Map<String,String> result = new HashMap<String,String>();
            return result;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public Map<String, String> getOperationLogs(OperationLogs operationLogs) {
        Map<String,String> fields = new HashMap<>();
        fields.put("bmsah",operationLogs.getBmsah());
        fields.put("czrm",operationLogs.getCzrm());
        try {
            HttpClientUtils.HttpClientResult apiResult = HttpClientUtils.doGet("http://114.116.223.7/portal/api/logs/oper",null,fields);
            OperationLogs operationLogs1 = JSON.parseObject(apiResult.getContent(),OperationLogs.class);
            Map<String,String> result = new HashMap<String,String>();
            return result;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}
