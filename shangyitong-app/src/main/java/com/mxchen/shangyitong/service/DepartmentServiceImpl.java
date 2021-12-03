package com.mxchen.shangyitong.service;

import com.alibaba.cola.dto.MultiResponse;
import com.alibaba.cola.dto.PageResponse;
import com.alibaba.cola.dto.Response;
import com.mxchen.shangyitong.api.hsop.DepartmentServiceI;
import com.mxchen.shangyitong.dto.clientObj.hosp.department.DepartmentAddCmd;
import com.mxchen.shangyitong.dto.clientObj.hosp.department.DepartmentCO;
import com.mxchen.shangyitong.dto.clientObj.hosp.department.DepartmentDleCmd;
import com.mxchen.shangyitong.dto.clientObj.hosp.department.DepartmentPageQry;
import com.mxchen.shangyitong.executor.hosp_department.DepartmentAddExe;
import com.mxchen.shangyitong.executor.hosp_department.DepartmentDelExe;
import com.mxchen.shangyitong.executor.hosp_department.DepartmentListQryExe;
import com.mxchen.shangyitong.executor.hosp_department.DepartmentPageQryExe;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @program: shangyitong
 * @description:
 * @author: hmxchen
 * @create: 2021-07-03 17:02
 **/
@Slf4j
@Service
public class DepartmentServiceImpl implements DepartmentServiceI {
    @Resource
    private DepartmentDelExe departmenDelExe;
    @Resource
    private DepartmentPageQryExe departmenPageQryExe;
    @Resource
    private DepartmentListQryExe departmenListQryExe;
    @Resource
    private DepartmentAddExe departmenAddExe;
    @Override
    public Response removeDepartment(DepartmentDleCmd cmd) {
        return departmenDelExe.execute(cmd);
    }

    @Override
    public PageResponse<DepartmentCO> findDepartment(DepartmentPageQry qry) {
        return departmenPageQryExe.execute(qry);
    }

    @Override
    public Response saveDepartment(DepartmentAddCmd cmd) {
        return departmenAddExe.execute(cmd);
    }

    @Override
    public MultiResponse<DepartmentCO> findDeptTree(String hoscode) {
        return departmenListQryExe.execute(hoscode);
    }
}
