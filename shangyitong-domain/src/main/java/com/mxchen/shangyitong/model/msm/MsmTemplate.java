package com.mxchen.shangyitong.model.msm;

import com.alibaba.cola.domain.Entity;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Map;

/**
 * @program: shangyitong
 * @description: 短信实体
 * @author: hmxchen
 * @create: 2021-06-22 11:11
 **/
@Entity
@ApiModel(description = "短信实体")
@NoArgsConstructor
@AllArgsConstructor
@Data
public class MsmTemplate {
    @ApiModelProperty(value = "phone")
    private String phone;

    @ApiModelProperty(value = "短信模板code")
    private String templateCode;

    @ApiModelProperty(value = "短信模板参数")
    private Map<String,Object> param;


    public static  MsmTemplate create(String phone, String templateCode, Map<String, Object> param){
        return new MsmTemplate(phone,templateCode,param);
    }
}
