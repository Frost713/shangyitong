package com.mxchen.shangyitong.dto.clientObj.hosp.hospital;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.List;

/**
 * @program: shangyitong
 * @description:
 * @author: hmxchen
 * @create: 2021-07-03 17:29
 **/
@ApiModel("医院添加请求")
@Data
public class HospitalCO {
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

    @ApiModelProperty(value = "状态 0：未上线 1：已上线")
    private Integer status;

    @ApiModelProperty(value = "预约周期")
    private Integer cycle;

    @ApiModelProperty(value = "放号时间")
    private String releaseTime;

    @ApiModelProperty(value = "停挂时间")
    private String stopTime;

    @ApiModelProperty(value = "退号截止天数（如：就诊前一天为-1，当天为0）")
    private Integer quitDay;

    @ApiModelProperty(value = "退号时间")
    private String quitTime;

    @ApiModelProperty(value = "预约规则")
    private List<String> rule;
}
