package com.mxchen.shangyitong.gatewayimpl.impl.hosp;

import com.mxchen.shangyitong.convertor.hosp.DepartmentConvertor;
import com.mxchen.shangyitong.gateway.hosp.DepartmentGateway;
import com.mxchen.shangyitong.gatewayimpl.database.mongo.hosp.DepartmentDORepository;
import com.mxchen.shangyitong.model.hosp.Department;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @program: shangyitong
 * @description:
 * @author: hmxchen
 * @create: 2021-07-09 09:53
 **/
@Slf4j
@Service
public class DepartmentGatewayImpl implements DepartmentGateway {
    @Resource
    private DepartmentDORepository departmentDORepository;

    @Override
    public Department getByHD(String hoscode, String depcode) {
        return null;
    }

    @Override
    public void saveInfo(Department department) {
        departmentDORepository.save(DepartmentConvertor.toDataObj(department));
    }

    @Override
    public void deleteByHD(String hoscode, String depcode) {

    }
}
