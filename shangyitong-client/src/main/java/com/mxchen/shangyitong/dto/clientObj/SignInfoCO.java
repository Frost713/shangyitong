package com.mxchen.shangyitong.dto.clientObj;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * @program: shangyitong
 * @description:
 * @author: hmxchen
 * @create: 2021-07-03 18:09
 **/
@Data
public class SignInfoCO {

    @ApiModelProperty(value = "api基础路径")
    private String apiUrl;

    @ApiModelProperty(value = "签名秘钥")
    private String signKey;


}
