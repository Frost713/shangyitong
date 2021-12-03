package com.mxchen.shangyitong.service;

import com.alibaba.cola.dto.MultiResponse;
import com.alibaba.cola.dto.PageResponse;
import com.alibaba.cola.dto.Response;
import com.alibaba.cola.dto.SingleResponse;
import com.mxchen.shangyitong.api.hsop.HospitalSetServiceI;
import com.mxchen.shangyitong.dto.clientObj.SignInfoCO;
import com.mxchen.shangyitong.dto.clientObj.hosp.hospitalSet.*;
import com.mxchen.shangyitong.executor.hosp_hospital_set.*;
import com.mxchen.shangyitong.dto.BatchDeleteByLongCmd;
import com.mxchen.shangyitong.dto.DeleteByLongIdCmd;
import com.mxchen.shangyitong.dto.SingleByLongIdQry;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 *
 */
@Slf4j
@Service
public class HospitalSetServiceImpl implements HospitalSetServiceI {
    @Resource
    private HospitalSetListQryExe hospitalSetGetListExe;
    @Resource
    private HospitalSetDelExe hospitalSetDelExe;
    @Resource
    private HospitalSetPageQryExe hospitalSetPageQryExe;
    @Resource
    private HospitalSetAddCmdExe hospitalSetAddCmdExel;
    @Resource
    private HospitalSetSingleQryExe hospitalSetSingleQryExe;
    @Resource
    private HospitalSetSingleQrySendKeyExe hospitalSetSingleQrySendKeyExe;
    @Resource
    private HospitalSetUpdateCmdExe hospitalSetUpdateCmdExe;
    @Override
    public MultiResponse<HospitalSetCO> list(){
        return hospitalSetGetListExe.execute();
    }

    @Override
    public Response removeHospSet(DeleteByLongIdCmd cmd){
        return hospitalSetDelExe.execute(cmd);
    }

    @Override
    public PageResponse<HospitalSetCO> findPageHospSet(HospitalSetQry hospitalSetQry){
        return hospitalSetPageQryExe.execute(hospitalSetQry);
    }

    @Override
    public Response addHospSet(HospitalSetAddCmd hospitalSetAddCmd) {
        return hospitalSetAddCmdExel.execute(hospitalSetAddCmd);
    }

    @Override
    public SingleResponse<HospitalSetCO> getSingle(SingleByLongIdQry singleByLongIdCmd) {
        return hospitalSetSingleQryExe.execute(singleByLongIdCmd);
    }

    @Override
    public Response updateHospitalSet(HospitalSetUpdateCmd cmd) {
        return hospitalSetUpdateCmdExe.execute(cmd);
    }

    @Override
    public Response batchRemoveHospitalSet(BatchDeleteByLongCmd cmd) {
        return hospitalSetDelExe.execute(cmd);
    }

    @Override
    public Response lockHospitalSet(HospitalSetSUCmd hospitalSetSUCmd) {
        return hospitalSetUpdateCmdExe.execute(hospitalSetSUCmd);
    }

    @Override
    public Response sendKey(SingleByLongIdQry singleByLongIdQry) {
        return hospitalSetSingleQrySendKeyExe.execute(singleByLongIdQry);
    }

    @Override
    public SingleResponse<SignInfoCO> getSignInfoVo(HospitalSetSignQry qry) {
        return  hospitalSetSingleQryExe.execute(qry);
    }
}
