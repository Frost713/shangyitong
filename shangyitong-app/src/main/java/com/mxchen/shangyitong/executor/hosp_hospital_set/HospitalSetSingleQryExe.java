package com.mxchen.shangyitong.executor.hosp_hospital_set;

import cn.hutool.core.convert.Convert;
import com.alibaba.cola.dto.SingleResponse;
import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.mxchen.shangyitong.dto.SingleByLongIdQry;
import com.mxchen.shangyitong.dto.clientObj.SignInfoCO;
import com.mxchen.shangyitong.dto.clientObj.hosp.hospitalSet.HospitalSetCO;
import com.mxchen.shangyitong.dto.clientObj.hosp.hospitalSet.HospitalSetSignQry;
import com.mxchen.shangyitong.gatewayimpl.database.mysql.hosp.HospitalSetBaseServiceI;
import com.mxchen.shangyitong.gatewayimpl.database.mysql.hosp.HospitalSetDO;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

/**
 * @program: shangyitong
 * @description: 带条件获取唯一
 * @author: hmxchen
 * @create: 2021-06-19 11:09
 **/
@Component
public class HospitalSetSingleQryExe {
    @Resource
    private HospitalSetBaseServiceI hospitalSetBaseServiceI;
    public SingleResponse<HospitalSetCO> execute(SingleByLongIdQry singleByLongIdCmd){
        HospitalSetDO hospitalSetDO = hospitalSetBaseServiceI.getById(singleByLongIdCmd.getId());
        return SingleResponse.of(Convert.convert(HospitalSetCO.class,hospitalSetDO));
    }

    public SingleResponse<SignInfoCO> execute(HospitalSetSignQry qry) {
        HospitalSetDO hospitalSetDO = hospitalSetBaseServiceI.getOne(new LambdaQueryWrapper<HospitalSetDO>(){{
            eq(HospitalSetDO::getHoscode,qry.getHoscode());
        }});
        return SingleResponse.of(Convert.convert(SignInfoCO.class,hospitalSetDO));
    }
}
