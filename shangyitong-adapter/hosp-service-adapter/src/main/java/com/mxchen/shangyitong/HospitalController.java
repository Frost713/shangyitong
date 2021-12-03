package com.mxchen.shangyitong;

import com.alibaba.cola.dto.MultiResponse;
import com.alibaba.cola.dto.Response;
import com.alibaba.cola.dto.SingleResponse;
import com.mxchen.shangyitong.api.hsop.HospitalServiceI;
import com.mxchen.shangyitong.api.hsop.HospitalSetServiceI;
import com.mxchen.shangyitong.dto.clientObj.SignInfoCO;
import com.mxchen.shangyitong.dto.clientObj.hosp.hospital.HospitalAddCmd;
import com.mxchen.shangyitong.dto.clientObj.hosp.hospital.HospitalCO;
import com.mxchen.shangyitong.dto.clientObj.hosp.hospital.HospitalPageQry;
import com.mxchen.shangyitong.dto.clientObj.hosp.hospital.HospitalQry;
import com.mxchen.shangyitong.dto.clientObj.hosp.hospitalSet.HospitalSetSignQry;
import com.mxchen.shangyitong.swagger.annotation.ApiVersion;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.validation.Valid;

/**
 * @program: shangyitong
 * @description:
 * @author: hmxchen
 * @create: 2021-06-28 11:58
 **/
@Api(tags = "平台接口-医院")
@RestController
@RequestMapping("/api/hosp")
public class HospitalController {
    @Resource
    private HospitalServiceI hospitalService;
    @Resource
    private HospitalSetServiceI hospitalSetServiceI;

    //查询医院
    @ApiVersion(group = ApiVersionConstant.HOST_API_i)
    @ApiOperation(value = "查询医院")
    @PostMapping("hospital/show")
    public SingleResponse<HospitalCO> getHospital(@RequestBody @Valid HospitalQry qry) {
        return hospitalService.getHospital(qry);
    }

    //上传医院接口
    @ApiVersion(group = ApiVersionConstant.HOST_API_i)
    @ApiOperation(value = "上传医院接口")
    @PostMapping("saveHospital")
    public Response saveHosp(@RequestBody @Valid HospitalAddCmd cmd) {
        return hospitalService.saveHosp(cmd);
    }

    @ApiOperation(value = "查询医院列表")
    @GetMapping("findHospList/{page}/{limit}")
    public MultiResponse<HospitalCO> findHospList(@PathVariable Integer page,
                                                  @PathVariable Integer limit,
                                                  HospitalPageQry qry
    ) {
        return hospitalService.findHospList(qry.setParams(page, limit));
    }

    @ApiVersion(group = ApiVersionConstant.HOST_API_i)
    @ApiOperation(value = "根据医院名称查询")
    @GetMapping("findByHosName/{hosname}")
    public MultiResponse<HospitalCO> findByHosName(@PathVariable String hosname) {

        return hospitalService.findByHosName(hosname);
    }

    @ApiVersion(group = ApiVersionConstant.HOST_API_i)
    @ApiOperation(value = "根据医院编号获取医院预约挂号详情")
    @GetMapping("findHospDetail/{hoscode}")
    public SingleResponse<HospitalCO> item(@PathVariable String hoscode) {
        return hospitalService.item(hoscode);
    }

    @ApiVersion(group = ApiVersionConstant.HOST_API_i)
    @ApiOperation(value = "获取医院签名信息")
    @GetMapping("inner/getSignInfoVo/{hoscode}")
    public SingleResponse<SignInfoCO> getSignInfoVo(HospitalSetSignQry qry) {
        return hospitalSetServiceI.getSignInfoVo(qry);
    }
}
