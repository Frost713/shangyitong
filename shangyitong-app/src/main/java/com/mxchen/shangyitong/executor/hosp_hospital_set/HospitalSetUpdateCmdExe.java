package com.mxchen.shangyitong.executor.hosp_hospital_set;

import cn.hutool.core.convert.Convert;
import com.alibaba.cola.dto.Response;
import com.mxchen.shangyitong.dto.clientObj.hosp.hospitalSet.HospitalSetSUCmd;
import com.mxchen.shangyitong.dto.clientObj.hosp.hospitalSet.HospitalSetUpdateCmd;
import com.mxchen.shangyitong.gateway.hosp.HospitalGateway;
import com.mxchen.shangyitong.model.hosp.Hospital;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

/**
 * @program: shangyitong
 * @description: 修改信息
 * @author: hmxchen
 * @create: 2021-06-19 11:09
 **/
@Component
public class HospitalSetUpdateCmdExe {
    @Resource
    private HospitalGateway hospitalGateway;
    public Response execute(HospitalSetUpdateCmd cmd){
        hospitalGateway.updateSetInfo(Convert.convert(Hospital.class,cmd));
        return Response.buildSuccess();
    }

    public Response execute(HospitalSetSUCmd cmd) {
        hospitalGateway.updateSetStatus(Convert.convert(Hospital.class,cmd));
        return Response.buildSuccess();
    }
}
