package com.mxchen.shangyitong.executor.hosp_hospital_set;

import cn.hutool.core.convert.Convert;
import cn.hutool.core.util.ObjectUtil;
import com.alibaba.cola.dto.PageResponse;
import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.mxchen.shangyitong.dto.clientObj.hosp.hospitalSet.HospitalSetCO;
import com.mxchen.shangyitong.dto.clientObj.hosp.hospitalSet.HospitalSetQry;
import com.mxchen.shangyitong.gatewayimpl.database.mysql.hosp.HospitalSetBaseServiceI;
import com.mxchen.shangyitong.gatewayimpl.database.mysql.hosp.HospitalSetDO;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.util.List;

/**
 * @program: shangyitong
 * @description: 分页查询医院设置信息执行类
 * @author: hmxchen
 * @create: 2021-06-18 15:01
 **/
@Component
public class HospitalSetPageQryExe {
    @Resource
    private HospitalSetBaseServiceI hospitalSetBaseServiceI;
    public PageResponse<HospitalSetCO> execute(HospitalSetQry qry) {
        IPage<HospitalSetDO> pageView = hospitalSetBaseServiceI.page(new Page<>(qry.getPageIndex(), qry.getPageSize()),
                new LambdaQueryWrapper<HospitalSetDO>() {{
                    like(ObjectUtil.isNotEmpty(qry.getHosname()),HospitalSetDO::getHosname,qry.getHosname());
                    like(ObjectUtil.isNotEmpty(qry.getHoscode()),HospitalSetDO::getHoscode,qry.getHoscode());
                }});
        List<HospitalSetCO> hospitalSetCOS = Convert.toList(HospitalSetCO.class, pageView.getRecords());
        return PageResponse.of(hospitalSetCOS,(int)pageView.getTotal(),qry.getPageSize(),qry.getPageIndex());
    }
}
