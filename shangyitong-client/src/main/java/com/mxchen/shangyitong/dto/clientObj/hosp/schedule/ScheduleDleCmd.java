package com.mxchen.shangyitong.dto.clientObj.hosp.schedule;

import com.alibaba.cola.dto.Command;
import com.mxchen.shangyitong.dto.DeleteByLongIdCmd;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.NotEmpty;

/**
 * @program: shangyitong
 * @description:
 * @author: hmxchen
 * @create: 2021-07-03 16:57
 **/
@Data
@ApiModel(description = "医院排版删除请求")
public class ScheduleDleCmd extends Command {
    @ApiModelProperty(value = "医院编号")
    @NotEmpty
    private String hoscode;
    @ApiModelProperty(value = "医院排版id")
    @NotEmpty
    private String hosScheduleId;
}
