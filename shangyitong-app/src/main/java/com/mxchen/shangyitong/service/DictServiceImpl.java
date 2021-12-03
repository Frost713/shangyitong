package com.mxchen.shangyitong.service;

import com.alibaba.cola.dto.MultiResponse;
import com.alibaba.cola.dto.Response;
import com.mxchen.shangyitong.api.cmn.DictServiceI;
import com.mxchen.shangyitong.executor.cmn_dict.DictDataImportExe;
import com.mxchen.shangyitong.executor.cmn_dict.DictListExportExe;
import com.mxchen.shangyitong.executor.cmn_dict.DictListQryExe;
import com.mxchen.shangyitong.dto.GetByLongIdQry;
import com.mxchen.shangyitong.dto.clientObj.cmn.DictCO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletResponse;
import java.io.InputStream;

/**
 * @program: shangyitong
 * @description:
 * @author: hmxchen
 * @create: 2021-06-24 11:10
 **/
@Slf4j
@Service
public class DictServiceImpl implements DictServiceI {
    @Resource
    private DictListQryExe dictListQryExe;
    @Resource
    private DictListExportExe dictListExportExe;
    @Resource
    private DictDataImportExe dictDataImportExe;
    @Override
    public MultiResponse<DictCO> findChildData(GetByLongIdQry getByLongIdQry) {
        return dictListQryExe.execute(getByLongIdQry);
    }

    @Override
    public Response exportData(HttpServletResponse response) {
        dictListExportExe.execute(response);
        return Response.buildSuccess();
    }

    @Override
    public Response importData(InputStream inputStream) {
        dictDataImportExe.execute(inputStream);
        return Response.buildSuccess();
    }
}
