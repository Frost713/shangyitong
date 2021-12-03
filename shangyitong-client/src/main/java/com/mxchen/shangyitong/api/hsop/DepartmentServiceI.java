package com.mxchen.shangyitong.api.hsop;

import com.alibaba.cola.dto.MultiResponse;
import com.alibaba.cola.dto.PageResponse;
import com.alibaba.cola.dto.Response;
import com.mxchen.shangyitong.dto.clientObj.hosp.department.DepartmentAddCmd;
import com.mxchen.shangyitong.dto.clientObj.hosp.department.DepartmentCO;
import com.mxchen.shangyitong.dto.clientObj.hosp.department.DepartmentDleCmd;
import com.mxchen.shangyitong.dto.clientObj.hosp.department.DepartmentPageQry;

/**
 * @program: shangyitong
 * @description:
 * @author: hmxchen
 * @create: 2021-07-03 17:00
 **/
public interface DepartmentServiceI {
    Response removeDepartment(DepartmentDleCmd cmd);

    PageResponse<DepartmentCO> findDepartment(DepartmentPageQry qry);

    Response saveDepartment(DepartmentAddCmd cmd);

    MultiResponse<DepartmentCO> findDeptTree(String hoscode);
}
