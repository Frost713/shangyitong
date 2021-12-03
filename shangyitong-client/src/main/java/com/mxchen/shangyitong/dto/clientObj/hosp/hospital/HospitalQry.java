package com.mxchen.shangyitong.dto.clientObj.hosp.hospital;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * @program: shangyitong
 * @description:
 * @author: hmxchen
 * @create: 2021-07-03 17:29
 **/
@ApiModel("医院信息查询请求")
@Data
public class HospitalQry {
    @ApiModelProperty(value = "医院编号")
    private String hoscode;

    @ApiModelProperty(value = "签名")
    private String sign;
}
