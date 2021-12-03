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
@ApiModel("医院添加请求")
@Data
public class HospitalAddCmd {
    @ApiModelProperty(value = "医院编号")
    private String hoscode;

    @ApiModelProperty(value = "医院名称")
    private String hosname;

    @ApiModelProperty(value = "医院类型")
    private String hostype;

    @ApiModelProperty(value = "省code")
    private String provinceCode;

    @ApiModelProperty(value = "市code")
    private String cityCode;

    @ApiModelProperty(value = "区code")
    private String districtCode;

    @ApiModelProperty(value = "详情地址")
    private String address;

    @ApiModelProperty(value = "医院logo")
    private String logoData;

    @ApiModelProperty(value = "医院简介")
    private String intro;

    @ApiModelProperty(value = "坐车路线")
    private String route;
    @ApiModelProperty(value = "预约规则")
    private String bookingRule;
}
