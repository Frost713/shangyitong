package com.mxchen.shangyitong.executor.hosp_hospital_set;
import cn.hutool.core.collection.ListUtil;
import cn.hutool.core.convert.Convert;
import com.alibaba.cola.dto.MultiResponse;
import com.mxchen.shangyitong.dto.clientObj.hosp.hospitalSet.HospitalSetCO;
import com.mxchen.shangyitong.gatewayimpl.database.mysql.hosp.HospitalSetBaseServiceI;
import com.mxchen.shangyitong.gatewayimpl.database.mysql.hosp.HospitalSetDO;
import org.springframework.stereotype.Component;
import javax.annotation.Resource;
import java.util.List;

@Component
public class HospitalSetListQryExe {
    @Resource
    private HospitalSetBaseServiceI hospitalSetBaseServiceI;

    public MultiResponse<HospitalSetCO> execute() {
        List<HospitalSetDO> hospitalSetDOS = hospitalSetBaseServiceI.list();
        List<HospitalSetCO> hospitalSetCOS = ListUtil.list(true);
        hospitalSetDOS.forEach(u->{
            hospitalSetCOS.add(Convert.convert(HospitalSetCO.class,u));
        });
        return MultiResponse.of(hospitalSetCOS);
    }
}
