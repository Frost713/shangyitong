package com.mxchen.shangyitong.executor.hosp_department;

import com.alibaba.cola.dto.MultiResponse;
import com.mxchen.shangyitong.dto.clientObj.hosp.department.DepartmentCO;
import com.mxchen.shangyitong.gateway.hosp.DepartmentGateway;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

/**
 * @program: shangyitong
 * @description:
 * @author: hmxchen
 * @create: 2021-07-09 09:40
 **/
@Component
public class DepartmentListQryExe {
    @Resource
    private DepartmentGateway departmentGateway;
    public MultiResponse<DepartmentCO> execute(String hoscode) {
        return MultiResponse.buildSuccess();
    }
}
