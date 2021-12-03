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
public class HospitalSetAddCmd extends Command {
    @ApiModelProperty(value = "医院名称")
    private String hosname;
    @ApiModelProperty(value = "医院编号")
    private String hoscode;
    @ApiModelProperty(value = "api基础路径")
    private String apiUrl;
    @ApiModelProperty(value = "联系人姓名")
    private String contactsName;
    @ApiModelProperty(value = "联系人手机")
    private String contactsPhone;
}

