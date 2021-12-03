package com.mxchen.shangyitong.dto.clientObj.hosp.schedule;

import com.alibaba.cola.dto.Command;
import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;

/**
 * @program: shangyitong
 * @description:
 * @author: hmxchen
 * @create: 2021-07-03 17:12
 **/
@Data
public class ScheduleAddCmd extends Command {
    @ApiModelProperty(value = "医院编号")
    private String hoscode;

    @ApiModelProperty(value = "科室编号")
    private String depcode;
    @ApiModelProperty(value = "职称")
    private String title;
    @ApiModelProperty(value = "医生名称")
    private String docname;
    @ApiModelProperty(value = "擅长技能")
    private String skill;
    @ApiModelProperty(value = "排班日期")
    @JsonFormat(pattern = "yyyy-MM-dd")
    private Date workDate;
    @ApiModelProperty(value = "排班时间（0：上午 1：下午）")
    private Integer workTime;

    @ApiModelProperty(value = "可预约数")
    private Integer reservedNumber;

    @ApiModelProperty(value = "剩余预约数")
    private Integer availableNumber;

    @ApiModelProperty(value = "挂号费")
    private BigDecimal amount;

    @ApiModelProperty(value = "排班状态（-1：停诊 0：停约 1：可约）")
    private Integer status;

    @ApiModelProperty(value = "排班编号（医院自己的排班主键）")
    private String hosScheduleId;
}
