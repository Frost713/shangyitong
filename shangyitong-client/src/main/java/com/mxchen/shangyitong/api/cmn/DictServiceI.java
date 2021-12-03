package com.mxchen.shangyitong.api.cmn;

import com.alibaba.cola.dto.MultiResponse;
import com.alibaba.cola.dto.Response;
import com.mxchen.shangyitong.dto.GetByLongIdQry;
import com.mxchen.shangyitong.dto.clientObj.cmn.DictCO;

import javax.servlet.http.HttpServletResponse;
import java.io.InputStream;

/**
 * @program: shangyitong
 * @description: 数据字段对外服务
 * @author: hmxchen
 * @create: 2021-06-24 11:01
 **/
public interface DictServiceI {
    MultiResponse<DictCO> findChildData(GetByLongIdQry getByLongIdQry);

    Response exportData(HttpServletResponse response);

    Response importData(InputStream inputStream);
}
