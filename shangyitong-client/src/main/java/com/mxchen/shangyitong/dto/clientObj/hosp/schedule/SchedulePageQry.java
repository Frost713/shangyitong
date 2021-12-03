package com.mxchen.shangyitong.dto.clientObj.hosp.schedule;

import com.alibaba.cola.dto.Command;
import com.mxchen.shangyitong.dto.PageQry;
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
 * @create: 2021-07-03 16:57
 **/
@Data
@NoArgsConstructor
@ApiModel(description = "医院排版删除请求")
public class SchedulePageQry extends PageQry {
    @ApiModelProperty(value = "医院编号")
    @NotEmpty
    private String hoscode;
    @ApiModelProperty(value = "科室编号")
    @NotEmpty
    private String depcode;
    public static SchedulePageQry create(int page,int limit,String hoscode, String depcode){
        SchedulePageQry schedulePageQry = new SchedulePageQry();
        schedulePageQry.setPage(page);
        schedulePageQry.setLimit(limit);
        schedulePageQry.setHoscode(hoscode);
        schedulePageQry.setDepcode(depcode);
        return schedulePageQry ;
    }
}
