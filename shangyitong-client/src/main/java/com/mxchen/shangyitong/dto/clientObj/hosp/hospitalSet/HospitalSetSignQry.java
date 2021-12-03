package com.mxchen.shangyitong.dto.clientObj.hosp.hospitalSet;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotEmpty;

/**
 * @program: shangyitong
 * @description:
 * @author: hmxchen
 * @create: 2021-07-03 18:53
 **/
@ApiModel("医院秘钥查询")
@NoArgsConstructor
@AllArgsConstructor
@Data
public class HospitalSetSignQry {
    @ApiModelProperty(value = "医院编号")
    @NotEmpty
    private String hoscode;
}
