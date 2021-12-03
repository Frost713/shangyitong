package com.mxchen.shangyitong.model.hosp;

import com.alibaba.cola.domain.Entity;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import org.springframework.stereotype.Indexed;

/**
 * @program: shangyitong
 * @description: 医院信息
 * @author: hmxchen
 * @create: 2021-06-19 10:35
 **/
@Entity
@Data
public class Hospital {
    @ApiModelProperty(value = "医院设置id")
    private Long id;
    @ApiModelProperty(value = "医院名称")
    private String hosname;

    @ApiModelProperty(value = "医院编号")
    private String hoscode;

    @ApiModelProperty(value = "api基础路径")
    private String apiUrl;

    @ApiModelProperty(value = "签名秘钥")
    private String signKey;

    @ApiModelProperty(value = "联系人姓名")
    private String contactsName;

    @ApiModelProperty(value = "联系人手机")
    private String contactsPhone;

    @ApiModelProperty(value = "状态")
    private Integer status;

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
