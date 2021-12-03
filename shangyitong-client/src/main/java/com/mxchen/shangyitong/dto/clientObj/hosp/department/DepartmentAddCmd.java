package com.mxchen.shangyitong.dto.clientObj.hosp.department;

import com.alibaba.cola.dto.Command;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * @program: shangyitong
 * @description:
 * @author: hmxchen
 * @create: 2021-07-03 17:20
 **/
@Data
@ApiModel(description = "科室新增请求")
public class DepartmentAddCmd extends Command {

    @ApiModelProperty(value = "医院编号")
    private String hoscode;

    @ApiModelProperty(value = "科室编号")
    private String depcode;

    @ApiModelProperty(value = "科室名称")
    private String depname;

    @ApiModelProperty(value = "科室描述")
    private String intro;

    @ApiModelProperty(value = "大科室编号")
    private String bigcode;

    @ApiModelProperty(value = "大科室名称")
    private String bigname;
}
