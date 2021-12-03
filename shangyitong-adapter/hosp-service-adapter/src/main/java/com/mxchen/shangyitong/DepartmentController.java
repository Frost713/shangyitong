package com.mxchen.shangyitong;

import com.alibaba.cola.dto.MultiResponse;
import com.alibaba.cola.dto.PageResponse;
import com.alibaba.cola.dto.Response;
import com.mxchen.shangyitong.api.hsop.DepartmentServiceI;
import com.mxchen.shangyitong.dto.clientObj.hosp.department.DepartmentAddCmd;
import com.mxchen.shangyitong.dto.clientObj.hosp.department.DepartmentCO;
import com.mxchen.shangyitong.dto.clientObj.hosp.department.DepartmentDleCmd;
import com.mxchen.shangyitong.dto.clientObj.hosp.department.DepartmentPageQry;
import com.mxchen.shangyitong.swagger.annotation.ApiVersion;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

/**
 * @program: shangyitong
 * @description:
 * @author: hmxchen
 * @create: 2021-06-28 11:58
 **/
@Api(tags = "平台接口-科室")
@RestController
@RequestMapping("/api/hosp")
public class DepartmentController {
    @Autowired
    private DepartmentServiceI departmentService;
    @ApiVersion(group = ApiVersionConstant.HOST_API_d)
    //删除科室接口
    @PostMapping("department/remove")
    public Response removeDepartment(@RequestBody @Valid DepartmentDleCmd cmd) {
        return departmentService.removeDepartment(cmd);
    }
    @ApiVersion(group = ApiVersionConstant.HOST_API_d)
    //查询科室接口
    @PostMapping("department/list")
    public PageResponse<DepartmentCO> findDepartment(@RequestBody @Valid DepartmentPageQry qry) {
        return departmentService.findDepartment(qry);
    }
    @ApiVersion(group = ApiVersionConstant.HOST_API_d)
    //上传科室接口
    @PostMapping("saveDepartment")
    public Response saveDepartment(@RequestBody @Valid DepartmentAddCmd cmd) {
        return departmentService.saveDepartment(cmd);
    }
    @ApiVersion(group = ApiVersionConstant.HOST_API_d)
    @ApiOperation(value = "根据医院编号获取科室")
    @GetMapping("department/{hoscode}")
    public MultiResponse<DepartmentCO> findDeptTree(@PathVariable String hoscode) {
        return departmentService.findDeptTree(hoscode);
    }
}
