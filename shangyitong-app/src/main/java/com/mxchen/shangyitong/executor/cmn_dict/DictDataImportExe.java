package com.mxchen.shangyitong.executor.cmn_dict;

import cn.hutool.core.collection.ListUtil;
import cn.hutool.core.convert.Convert;
import com.mxchen.shangyitong.common.resultCode.ResultCodeEnum;
import com.mxchen.shangyitong.excel.EasyPoiService;
import com.mxchen.shangyitong.excel.model.DictEeVo;
import com.mxchen.shangyitong.exception.YyghExceptionFactory;
import com.mxchen.shangyitong.gateway.DictGateway;
import com.mxchen.shangyitong.model.cmn.Dict;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.io.InputStream;
import java.util.List;
import java.util.Optional;

/**
 * @program: shangyitong
 * @description:
 * @author: hmxchen
 * @create: 2021-06-24 17:50
 **/
@Component
public class DictDataImportExe {
    @Resource
    private DictGateway dictGateway;

    public void execute(InputStream inputStream) {
        //解析数据
        List<DictEeVo> dictEeVos = EasyPoiService.importExcel(inputStream, 1, 0, DictEeVo.class);
        Optional.ofNullable(dictEeVos).orElseThrow(()-> YyghExceptionFactory.sysException(ResultCodeEnum.NO_DATA_IMPORT));
        List<Dict> dictList = ListUtil.list(false);
        dictEeVos.forEach(u->{
            dictList.add(Convert.convert(Dict.class,u));
        });
        dictGateway.batchSave(dictList);
    }
}
