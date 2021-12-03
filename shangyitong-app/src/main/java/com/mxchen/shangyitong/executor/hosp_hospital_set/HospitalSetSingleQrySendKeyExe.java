package com.mxchen.shangyitong.executor.hosp_hospital_set;

import com.alibaba.cola.dto.Response;
import com.mxchen.shangyitong.dto.SingleByLongIdQry;
import com.mxchen.shangyitong.gateway.MsmGateway;
import com.mxchen.shangyitong.gatewayimpl.database.mysql.hosp.HospitalSetBaseServiceI;
import com.mxchen.shangyitong.gatewayimpl.database.mysql.hosp.HospitalSetDO;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

/**
 * @program: shangyitong
 * @description: 发送秘钥
 * @author: hmxchen
 * @create: 2021-06-22 11:03
 **/
@Component
public class HospitalSetSingleQrySendKeyExe {
    @Resource
    private HospitalSetBaseServiceI hospitalSetBaseServiceI;
    @Resource
    private MsmGateway msmGateway;
    public Response execute(SingleByLongIdQry singleByLongIdCmd){
        HospitalSetDO hospitalSetDO = hospitalSetBaseServiceI.getById(singleByLongIdCmd.getId());
        //发送短信
        msmGateway.sendSignKey(hospitalSetDO.getContactsPhone(),hospitalSetDO.getHoscode(),hospitalSetDO.getSignKey());
        return Response.buildSuccess();
    }
}
