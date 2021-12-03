package com.mxchen.shangyitong.convertor.hosp;

import cn.hutool.core.bean.BeanUtil;
import cn.hutool.core.convert.Convert;
import cn.hutool.core.util.ObjectUtil;
import cn.hutool.json.JSONUtil;
import com.mxchen.shangyitong.gatewayimpl.database.mongo.hosp.BookingRuleDO;
import com.mxchen.shangyitong.gatewayimpl.database.mongo.hosp.HospitalDO;
import com.mxchen.shangyitong.gatewayimpl.database.mysql.hosp.HospitalSetDO;
import com.mxchen.shangyitong.model.hosp.Hospital;

/**
 * @program: shangyitong
 * @description: 医院信息转换器
 * @author: hmxchen
 * @create: 2021-06-19 10:44
 **/
public class HospitalConvertor {
    public static HospitalSetDO toDataObj(Hospital hospital){
        return Convert.convert(HospitalSetDO.class,hospital);
    }
    public static Hospital toEntity(HospitalSetDO hospitalSetDO){
        return Convert.convert(Hospital.class,hospitalSetDO);
    }
    public static HospitalDO toDDataObj(Hospital hospital){
        HospitalDO hospitalDO = BeanUtil.copyProperties(hospital,HospitalDO.class);
        hospitalDO.setBookingRule(JSONUtil.toBean(hospital.getBookingRule(), BookingRuleDO.class));
        return hospitalDO;
    }
    public static Hospital toDEntity(HospitalDO hospitalSetDO){
        Hospital hospital = BeanUtil.copyProperties(hospitalSetDO,Hospital.class);
        hospital.setBookingRule(JSONUtil.toJsonStr(hospitalSetDO.getBookingRule()));
        return hospital;
    }
}
