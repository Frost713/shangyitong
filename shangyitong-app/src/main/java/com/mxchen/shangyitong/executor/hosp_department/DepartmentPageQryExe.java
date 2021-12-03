package com.mxchen.shangyitong.executor.hosp_department;

import cn.hutool.core.bean.BeanUtil;
import cn.hutool.core.collection.CollUtil;
import cn.hutool.core.collection.ListUtil;
import cn.hutool.core.convert.Convert;
import com.alibaba.cola.dto.PageResponse;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.mxchen.shangyitong.dto.clientObj.hosp.department.DepartmentCO;
import com.mxchen.shangyitong.dto.clientObj.hosp.department.DepartmentPageQry;
import com.mxchen.shangyitong.gateway.hosp.DepartmentGateway;
import com.mxchen.shangyitong.gatewayimpl.database.mongo.hosp.DepartmentDO;
import com.mxchen.shangyitong.gatewayimpl.database.mongo.hosp.DepartmentDORepository;
import com.mxchen.shangyitong.model.hosp.Department;
import org.springframework.beans.BeanUtils;
import org.springframework.data.domain.*;
import org.springframework.stereotype.Component;
import org.w3c.dom.stylesheets.LinkStyle;

import javax.annotation.Resource;
import java.util.List;

/**
 * @program: shangyitong
 * @description:
 * @author: hmxchen
 * @create: 2021-07-09 09:40
 **/
@Component
public class DepartmentPageQryExe {
    @Resource
    private DepartmentGateway departmentGateway;

    public PageResponse<DepartmentCO> execute(DepartmentPageQry qry) {
        return PageResponse.buildSuccess();
    }
}
