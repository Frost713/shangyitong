package com.mxchen.shangyitong;

import com.alibaba.cola.dto.MultiResponse;
import com.alibaba.cola.dto.PageResponse;
import com.alibaba.cola.dto.Response;
import com.alibaba.cola.dto.SingleResponse;
import com.mxchen.shangyitong.api.hsop.HospitalSetServiceI;
import com.mxchen.shangyitong.dto.BatchDeleteByLongCmd;
import com.mxchen.shangyitong.dto.DeleteByLongIdCmd;
import com.mxchen.shangyitong.dto.SingleByLongIdQry;
import com.mxchen.shangyitong.dto.clientObj.hosp.hospitalSet.*;
import com.mxchen.shangyitong.swagger.annotation.ApiVersion;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

@Api(tags = "医院设置管理")
@RestController
@RequestMapping("/admin/hosp/hospitalSet")
public class HospitalSetController {
    @Resource
    private HospitalSetServiceI hospitalSetService;
    @ApiVersion(group = ApiVersionConstant.HOST_API_st)
    @ApiOperation(value = "查询医院设置表所有信息")
    @GetMapping("findAll")
    public MultiResponse<HospitalSetCO> findAllHospitalSet() {
        return hospitalSetService.list();
    }
    @ApiVersion(group = ApiVersionConstant.HOST_API_st)
    @ApiOperation(value = "条件查询带分页")
    @GetMapping("findPageHospSet/{current}/{limit}")
    public PageResponse<HospitalSetCO> findPageHospSet(@PathVariable int current, @PathVariable int limit,
                                                       HospitalSetQry hospitalSetQry){
        return hospitalSetService.findPageHospSet(hospitalSetQry.setPageParams(current,limit));
    }
    @ApiVersion(group = ApiVersionConstant.HOST_API_st)
    @ApiOperation(value = "逻辑删除医院设置")
    @DeleteMapping("{id}")
    public Response removeHospSet(@PathVariable Long id){
        return hospitalSetService.removeHospSet(new DeleteByLongIdCmd(id));
    }
    @ApiVersion(group = ApiVersionConstant.HOST_API_st)
    @ApiOperation(value = "添加医院设置")
    @PostMapping("saveHospitalSet")
    public Response addHospSet(@RequestBody HospitalSetAddCmd hospitalSetAddCmd){
        return hospitalSetService.addHospSet(hospitalSetAddCmd);
    }
    @ApiVersion(group = ApiVersionConstant.HOST_API_st)
    @ApiOperation(value = "根据id获取医院设置")
    @GetMapping("getHospSet/{id}")
    public SingleResponse<HospitalSetCO> getHospSet(@PathVariable Long id) {
        return hospitalSetService.getSingle(new SingleByLongIdQry(id));
    }
    @ApiVersion(group = ApiVersionConstant.HOST_API_st)
    @ApiOperation(value = "修改医院设置")
    @PostMapping("updateHospitalSet")
    public Response updateHospitalSet(@RequestBody HospitalSetUpdateCmd cmd) {
        return hospitalSetService.updateHospitalSet(cmd);
    }
    @ApiVersion(group = ApiVersionConstant.HOST_API_st)
    @ApiOperation(value = "批量删除医院设置")
    @DeleteMapping("batchRemove")
    public Response batchRemoveHospitalSet(@RequestBody BatchDeleteByLongCmd cmd) {
        return hospitalSetService.batchRemoveHospitalSet(cmd);
    }
    @ApiVersion(group = ApiVersionConstant.HOST_API_st)
    @ApiOperation(value = "医院设置锁定和解锁")
    @PutMapping("lockHospitalSet/{id}/{status}")
    public Response lockHospitalSet(@PathVariable Long id,
                                  @PathVariable Integer status) {
        return hospitalSetService.lockHospitalSet(new HospitalSetSUCmd(status,id));
    }
    @ApiVersion(group = ApiVersionConstant.HOST_API_st)
    @ApiOperation(value = "发送医院签名")
    @PutMapping("sendKey/{id}")
    public Response sendKey(@PathVariable Long id) {
        return hospitalSetService.sendKey(new SingleByLongIdQry(id));
    }
}
