package com.mxchen.shangyitong.executor.hosp_hostpital;

import cn.hutool.core.convert.Convert;
import com.alibaba.cola.dto.Response;
import com.mxchen.shangyitong.dto.clientObj.hosp.hospital.HospitalAddCmd;
import com.mxchen.shangyitong.gateway.hosp.HospitalGateway;
import com.mxchen.shangyitong.model.hosp.Hospital;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

/**
 * @version v1.0.0
 * @ClassName HospitalAddCmdExe
 * @Description TODO
 * @Author hmxchen
 * @Date 2021/7/5 23:33
 */
@Component
public class HospitalAddCmdExe {
    @Resource
    private HospitalGateway hospitalGateway;
    public Response execute(HospitalAddCmd cmd){
        hospitalGateway.saveHpInfo(Convert.convert(Hospital.class, cmd));
        return Response.buildSuccess();
    }
}
