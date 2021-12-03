package com.mxchen.shangyitong.service;

import com.alibaba.cola.dto.MultiResponse;
import com.alibaba.cola.dto.Response;
import com.alibaba.cola.dto.SingleResponse;
import com.mxchen.shangyitong.api.hsop.HospitalServiceI;
import com.mxchen.shangyitong.dto.clientObj.hosp.hospital.HospitalAddCmd;
import com.mxchen.shangyitong.dto.clientObj.hosp.hospital.HospitalCO;
import com.mxchen.shangyitong.dto.clientObj.hosp.hospital.HospitalPageQry;
import com.mxchen.shangyitong.dto.clientObj.hosp.hospital.HospitalQry;
import com.mxchen.shangyitong.executor.hosp_hospital_set.HospitalSetAddCmdExe;
import com.mxchen.shangyitong.executor.hosp_hostpital.HospitalAddCmdExe;
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
public class HospitalServiceImpl implements HospitalServiceI {
    @Resource
    private HospitalAddCmdExe hospitalAddCmdExe;
    @Override
    public SingleResponse<HospitalCO> getHospital(HospitalQry qry) {
        return SingleResponse.buildSuccess();
    }

    @Override
    public Response saveHosp(HospitalAddCmd cmd) {
        return hospitalAddCmdExe.execute(cmd);
    }

    @Override
    public MultiResponse<HospitalCO> findHospList(HospitalPageQry setParams) {
        return null;
    }

    @Override
    public MultiResponse<HospitalCO> findByHosName(String hosname) {
        return null;
    }

    @Override
    public SingleResponse<HospitalCO> item(String hoscode) {
        return null;
    }
}
