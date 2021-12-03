package com.mxchen.shangyitong.service;

import com.alibaba.cola.dto.MultiResponse;
import com.alibaba.cola.dto.Response;
import com.alibaba.cola.dto.SingleResponse;
import com.mxchen.shangyitong.api.hsop.ScheduleServiceI;
import com.mxchen.shangyitong.dto.GetByStringIdQry;
import com.mxchen.shangyitong.dto.clientObj.hosp.schedule.*;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

/**
 * @program: shangyitong
 * @description:
 * @author: hmxchen
 * @create: 2021-07-03 17:02
 **/
@Slf4j
@Service
public class ScheduleServiceImpl implements ScheduleServiceI {
    @Override
    public Response remove(ScheduleDleCmd cmd) {
        return Response.buildSuccess();
    }

    @Override
    public MultiResponse<ScheduleCO> findSchedule(SchedulePageQry cmd) {
        return MultiResponse.buildSuccess();
    }

    @Override
    public Response saveSchedule(ScheduleAddCmd cmd) {
        return Response.buildSuccess();
    }

    @Override
    public MultiResponse<ScheduleCO> getBookingSchedule(SchedulePageQry qry) {
        return null;
    }

    @Override
    public MultiResponse<ScheduleCO> findScheduleList(ScheduleDataQry scheduleDataQry) {
        return null;
    }

    @Override
    public SingleResponse<ScheduleCO> getSchedule(GetByStringIdQry getByStringIdQry) {
        return null;
    }

    @Override
    public MultiResponse<ScheduleCO> getScheduleOrderVo(GetByStringIdQry getByStringIdQry) {
        return null;
    }
}
