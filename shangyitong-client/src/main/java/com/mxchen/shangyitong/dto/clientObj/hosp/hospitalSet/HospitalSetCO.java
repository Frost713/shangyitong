package com.mxchen.shangyitong.dto.clientObj.hosp.hospitalSet;

import com.alibaba.cola.dto.Command;
import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.Date;

/**
 * <p>
 * HospitalSet
 * </p>
 *
 * @author qy
 */
@Data
@ApiModel(description = "医院设置")
public class HospitalSetCO{
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
    @ApiModelProperty(value = "id")
    private Long id;
    @ApiModelProperty(value = "创建时间")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date createTime;
    @ApiModelProperty(value = "更新时间")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date updateTime;
    @ApiModelProperty(value = "逻辑删除(1:已删除，0:未删除)")
    private Integer isDeleted;
}

