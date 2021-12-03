package com.mxchen.shangyitong.executor.hosp_hospital_set;

import cn.hutool.core.convert.Convert;
import com.alibaba.cola.dto.Response;
import com.mxchen.shangyitong.dto.clientObj.hosp.hospitalSet.HospitalSetAddCmd;
import com.mxchen.shangyitong.gateway.hosp.HospitalGateway;
import com.mxchen.shangyitong.model.hosp.Hospital;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

/**
 * @program: shangyitong
 * @description: 添加医院设置信息执行类
 * @author: hmxchen
 * @create: 2021-06-19 10:27
 **/
@Component
public class HospitalSetAddCmdExe {
    @Resource
    private HospitalGateway hospitalGateway;
    public Response execute(HospitalSetAddCmd hospitalSetAddCmd){
        hospitalGateway.saveSetInfo(Convert.convert(Hospital.class,hospitalSetAddCmd));
        return Response.buildSuccess();
    }
}
