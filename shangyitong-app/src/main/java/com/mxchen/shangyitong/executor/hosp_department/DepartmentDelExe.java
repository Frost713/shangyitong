package com.mxchen.shangyitong.executor.hosp_department;

import com.alibaba.cola.dto.Response;
import com.mxchen.shangyitong.dto.clientObj.hosp.department.DepartmentDleCmd;
import com.mxchen.shangyitong.gateway.hosp.DepartmentGateway;
import com.mxchen.shangyitong.gatewayimpl.database.mongo.hosp.DepartmentDORepository;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

/**
 * @program: shangyitong
 * @description:
 * @author: hmxchen
 * @create: 2021-07-09 09:40
 **/
@Component
public class DepartmentDelExe {
    @Resource
    private DepartmentGateway departmentGateway;
    public Response execute(DepartmentDleCmd cmd) {
        departmentGateway.deleteByHD(cmd.getHoscode(),cmd.getDepcode());
        return Response.buildSuccess();
    }
}
