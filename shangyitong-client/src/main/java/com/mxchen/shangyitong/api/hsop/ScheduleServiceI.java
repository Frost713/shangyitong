package com.mxchen.shangyitong.api.hsop;

import com.alibaba.cola.dto.MultiResponse;
import com.alibaba.cola.dto.Response;
import com.alibaba.cola.dto.SingleResponse;
import com.mxchen.shangyitong.dto.GetByStringIdQry;
import com.mxchen.shangyitong.dto.clientObj.hosp.schedule.*;

/**
 * @program: shangyitong
 * @description:
 * @author: hmxchen
 * @create: 2021-07-03 17:00
 **/
public interface ScheduleServiceI {
    Response remove(ScheduleDleCmd cmd);

    MultiResponse<ScheduleCO> findSchedule(SchedulePageQry cmd);

    Response saveSchedule(ScheduleAddCmd cmd);

    MultiResponse<ScheduleCO> getBookingSchedule(SchedulePageQry qry);

    MultiResponse<ScheduleCO> findScheduleList(ScheduleDataQry scheduleDataQry);

    SingleResponse<ScheduleCO> getSchedule(GetByStringIdQry getByStringIdQry);

    MultiResponse<ScheduleCO> getScheduleOrderVo(GetByStringIdQry getByStringIdQry);
}
