package com.mxchen.shangyitong.dto.clientObj.hosp.hospitalSet;

import com.alibaba.cola.dto.Command;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @program: shangyitong
 * @description: 医院设置状态更新
 * @author: hmxchen
 * @create: 2021-06-22 10:36
 **/
@ApiModel(description = "医院设置状态更新")
@AllArgsConstructor
@NoArgsConstructor
@Data
public class HospitalSetSUCmd extends Command {
    @ApiModelProperty(value = "状态：1：锁定 0：解锁")
    private Integer status;
    @ApiModelProperty(value = "医院id")
    private Long id;
}
