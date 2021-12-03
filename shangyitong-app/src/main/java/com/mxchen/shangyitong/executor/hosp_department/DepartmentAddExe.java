package com.mxchen.shangyitong.executor.hosp_department;

import cn.hutool.core.convert.Convert;
import com.alibaba.cola.dto.Response;
import com.mxchen.shangyitong.dto.clientObj.hosp.department.DepartmentAddCmd;
import com.mxchen.shangyitong.gateway.hosp.DepartmentGateway;
import com.mxchen.shangyitong.model.hosp.Department;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

/**
 * @program: shangyitong
 * @description:
 * @author: hmxchen
 * @create: 2021-07-09 09:40
 **/
@Component
public class DepartmentAddExe {
    @Resource
    private DepartmentGateway departmentGateway;
    public Response execute(DepartmentAddCmd cmd) {
        departmentGateway.saveInfo(Convert.convert(Department.class,cmd));
        return Response.buildSuccess();
    }
}
