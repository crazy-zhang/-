package com.inesa.neo4j.entity.vo;

import lombok.Data;
import lombok.ToString;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

@Data
@ToString
public class TemplateInfoVo implements Serializable {
    String cjsj;
    String fwqwjmc;
    String lcmbbm;
    String lcmbmc;
    String lcmbsm;
    String lcstxxdz;
    String mbml;
    String sfsc;
    String sjbsbh;
    String sjly;
    String zhxgsj;

    private List<Map<String,String>> Rows;

}
