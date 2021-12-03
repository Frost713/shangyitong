package com.mxchen.shangyitong.convertor.hosp;

import cn.hutool.core.convert.Convert;
import com.mxchen.shangyitong.gatewayimpl.database.mongo.hosp.DepartmentDO;
import com.mxchen.shangyitong.gatewayimpl.database.mongo.hosp.ScheduleDO;
import com.mxchen.shangyitong.model.hosp.Department;
import com.mxchen.shangyitong.model.hosp.Schedule;

/**
 * @program: shangyitong
 * @description:
 * @author: hmxchen
 * @create: 2021-07-09 09:58
 **/
public class ScheduleConvertor {
    public static ScheduleDO toDataObj(Schedule schedule){
        return Convert.convert(ScheduleDO.class,schedule);
    }
    public static Schedule toEntity(ScheduleDO scheduleDO){
        return Convert.convert(Schedule.class,scheduleDO);
    }
}
