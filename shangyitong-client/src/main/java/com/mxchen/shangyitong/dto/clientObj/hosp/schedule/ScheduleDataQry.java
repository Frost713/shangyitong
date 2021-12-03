package com.mxchen.shangyitong.dto.clientObj.hosp.schedule;

import com.alibaba.cola.dto.Command;
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
 * @create: 2021-07-03 17:55
 **/
@ApiModel(description = "获取排班数据请求")
@NoArgsConstructor
@AllArgsConstructor
@Data
public class ScheduleDataQry extends Command {
    @ApiModelProperty(value = "医院编号")
    @NotEmpty
    private String hoscode;
    @ApiModelProperty(value = "科室编号")
    @NotEmpty
    private String depcode;
    @ApiModelProperty(value = "排班日期")
    @NotEmpty
    private  String workDate;
    public static ScheduleDataQry create(String hoscode, String depcode, String workDate){
        return new ScheduleDataQry(hoscode,depcode,workDate);
    }

}
