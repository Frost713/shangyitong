package com.mxchen.shangyitong.convertor.hosp;

import cn.hutool.core.convert.Convert;
import com.mxchen.shangyitong.gatewayimpl.database.mongo.hosp.DepartmentDO;
import com.mxchen.shangyitong.gatewayimpl.database.mysql.hosp.HospitalSetDO;
import com.mxchen.shangyitong.model.hosp.Department;
import com.mxchen.shangyitong.model.hosp.Hospital;

/**
 * @program: shangyitong
 * @description:
 * @author: hmxchen
 * @create: 2021-07-09 09:59
 **/
public class DepartmentConvertor {
    public static DepartmentDO toDataObj(Department department){
        return Convert.convert(DepartmentDO.class,department);
    }
    public static Department toEntity(DepartmentDO departmentDO){
        return Convert.convert(Department.class,departmentDO);
    }
}
