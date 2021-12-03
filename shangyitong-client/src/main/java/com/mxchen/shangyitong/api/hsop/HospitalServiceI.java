package com.mxchen.shangyitong.api.hsop;

import com.alibaba.cola.dto.MultiResponse;
import com.alibaba.cola.dto.Response;
import com.alibaba.cola.dto.SingleResponse;
import com.mxchen.shangyitong.dto.clientObj.hosp.hospital.HospitalAddCmd;
import com.mxchen.shangyitong.dto.clientObj.hosp.hospital.HospitalCO;
import com.mxchen.shangyitong.dto.clientObj.hosp.hospital.HospitalPageQry;
import com.mxchen.shangyitong.dto.clientObj.hosp.hospital.HospitalQry;

/**
 * @program: shangyitong
 * @description:
 * @author: hmxchen
 * @create: 2021-07-03 17:00
 **/
public interface HospitalServiceI {
    SingleResponse<HospitalCO> getHospital(HospitalQry qry);

    Response saveHosp(HospitalAddCmd cmd);

    MultiResponse<HospitalCO> findHospList(HospitalPageQry setParams);

    MultiResponse<HospitalCO> findByHosName(String hosname);

    SingleResponse<HospitalCO> item(String hoscode);
}
