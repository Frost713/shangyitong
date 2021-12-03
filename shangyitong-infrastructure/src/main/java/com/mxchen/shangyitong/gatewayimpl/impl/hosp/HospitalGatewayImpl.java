package com.mxchen.shangyitong.gatewayimpl.impl.hosp;

import cn.hutool.core.bean.BeanUtil;
import cn.hutool.core.util.RandomUtil;
import com.baomidou.mybatisplus.core.conditions.update.LambdaUpdateWrapper;
import com.mxchen.shangyitong.common.utils.MD5;
import com.mxchen.shangyitong.convertor.hosp.HospitalConvertor;
import com.mxchen.shangyitong.gateway.hosp.HospitalGateway;
import com.mxchen.shangyitong.gatewayimpl.database.mongo.hosp.HospitalDO;
import com.mxchen.shangyitong.gatewayimpl.database.mongo.hosp.HospitalDORepository;
import com.mxchen.shangyitong.gatewayimpl.database.mysql.hosp.HospitalSetBaseServiceI;
import com.mxchen.shangyitong.gatewayimpl.database.mysql.hosp.HospitalSetDO;
import com.mxchen.shangyitong.model.hosp.Hospital;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @program: shangyitong
 * @description: 医院网关实现
 * @author: hmxchen
 * @create: 2021-06-19 10:48
 **/
@Slf4j
@Service
public class HospitalGatewayImpl implements HospitalGateway {
    @Resource
    private HospitalSetBaseServiceI hospitalSetBaseServiceI;
    @Resource
    private HospitalDORepository hospitalDORepository;

    @Override
    public void saveSetInfo(Hospital hospital) {
        HospitalSetDO hospitalSetDO = HospitalConvertor.toDataObj(hospital);
        hospitalSetDO.setStatus(1);
        hospitalSetDO.setSignKey(getSignKey());
        hospitalSetBaseServiceI.save(hospitalSetDO);
    }

    @Override
    public void updateSetInfo(Hospital hospital) {
        HospitalSetDO hospitalSetDO = HospitalConvertor.toDataObj(hospital);
        hospitalSetBaseServiceI.updateById(hospitalSetDO);
    }

    @Override
    public void updateSetStatus(Hospital hospital) {
        hospitalSetBaseServiceI.update(new LambdaUpdateWrapper<HospitalSetDO>() {{
            eq(HospitalSetDO::getId, hospital.getId());
            set(HospitalSetDO::getStatus, hospital.getStatus());
        }});
    }

    @Override
    public void saveHpInfo(Hospital hospital) {
        HospitalDO hospitalDO = HospitalConvertor.toDDataObj(hospital);
        HospitalDO hospitalDO1 = hospitalDORepository.getHospitalByHoscode(hospitalDO.getHoscode());
        hospitalDO.setStatus(hospitalDO1.getStatus());
        hospitalDO.setIsDeleted(0);
        if (hospitalDO1 != null) {
            BeanUtil.copyProperties(hospitalDO,hospitalDO1);
            hospitalDO = hospitalDO1;
        }
        hospitalDORepository.save(hospitalDO);
    }

    private String getSignKey() {
        return MD5.encrypt(System.currentTimeMillis() + "" + RandomUtil.randomInt(1000));
    }
}
