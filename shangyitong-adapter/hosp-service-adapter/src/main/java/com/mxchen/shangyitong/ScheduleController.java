package com.mxchen.shangyitong;

import com.alibaba.cola.dto.MultiResponse;
import com.alibaba.cola.dto.Response;
import com.alibaba.cola.dto.SingleResponse;
import com.mxchen.shangyitong.api.hsop.ScheduleServiceI;
import com.mxchen.shangyitong.dto.GetByStringIdQry;
import com.mxchen.shangyitong.dto.clientObj.hosp.schedule.*;
import com.mxchen.shangyitong.swagger.annotation.ApiVersion;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.validation.Valid;

/**
 * @program: shangyitong
 * @description:
 * @author: hmxchen
 * @create: 2021-06-28 11:58
 **/
@Api(tags = "平台接口-排班")
@RestController
@RequestMapping("/api/hosp")
public class ScheduleController {

    @Resource
    private ScheduleServiceI scheduleService;
    //删除排班
    @ApiVersion(group = ApiVersionConstant.HOST_API_s)
    @ApiOperation(value = "删除排班")
    @PostMapping("schedule/remove")
    public Response remove(@RequestBody @Valid ScheduleDleCmd cmd) {
        return scheduleService.remove(cmd);
    }

    //查询排班接口
    @ApiVersion(group = ApiVersionConstant.HOST_API_s)
    @ApiOperation(value = "查询排班接口")
    @PostMapping("schedule/list")
    public MultiResponse<ScheduleCO> findSchedule(@RequestBody @Valid SchedulePageQry cmd) {
        return scheduleService.findSchedule(cmd);
    }

    @ApiVersion(group = ApiVersionConstant.HOST_API_s)
    @ApiOperation(value = "上传排班接口")
    @PostMapping("saveSchedule")
    public Response saveSchedule(@RequestBody @Valid ScheduleAddCmd cmd) {
        return scheduleService.saveSchedule(cmd);
    }
    @ApiVersion(group = ApiVersionConstant.HOST_API_s)
    @ApiOperation(value = "获取可预约排班数据")
    @GetMapping("auth/getBookingScheduleRule/{page}/{limit}/{hoscode}/{depcode}")
    public MultiResponse<ScheduleCO> getBookingSchedule(
            @ApiParam(name = "page", value = "当前页码", required = true)
            @PathVariable Integer page,
            @ApiParam(name = "limit", value = "每页记录数", required = true)
            @PathVariable Integer limit,
            @ApiParam(name = "hoscode", value = "医院code", required = true)
            @PathVariable String hoscode,
            @ApiParam(name = "depcode", value = "科室code", required = true)
            @PathVariable String depcode) {
        return scheduleService.getBookingSchedule( SchedulePageQry.create(page,limit,hoscode,depcode));
    }
    @ApiVersion(group = ApiVersionConstant.HOST_API_s)
    @ApiOperation(value = "获取排班数据")
    @GetMapping("auth/findScheduleList/{hoscode}/{depcode}/{workDate}")
    public MultiResponse<ScheduleCO> findScheduleList(
            @ApiParam(name = "hoscode", value = "医院code", required = true)
            @PathVariable String hoscode,
            @ApiParam(name = "depcode", value = "科室code", required = true)
            @PathVariable String depcode,
            @ApiParam(name = "workDate", value = "排班日期", required = true)
            @PathVariable String workDate) {
        return scheduleService.findScheduleList(ScheduleDataQry.create(hoscode,depcode,workDate));
    }
    @ApiVersion(group = ApiVersionConstant.HOST_API_s)
    @ApiOperation(value = "获取排班id获取排班数据")
    @GetMapping("getSchedule/{scheduleId}")
    public SingleResponse<ScheduleCO> getSchedule(@PathVariable String scheduleId) {
        return scheduleService.getSchedule(new GetByStringIdQry(scheduleId));
    }
    @ApiVersion(group = ApiVersionConstant.HOST_API_s)
    @ApiOperation(value = "根据排班id获取预约下单数据")
    @GetMapping("inner/getScheduleOrderVo/{scheduleId}")
    public MultiResponse<ScheduleCO> getScheduleOrderVo(
            @ApiParam(name = "scheduleId", value = "排班id", required = true)
            @PathVariable("scheduleId") String scheduleId) {
        return scheduleService.getScheduleOrderVo(new GetByStringIdQry(scheduleId));
    }
}
