package com.mxchen.shangyitong.executor.cmn_dict;

import cn.hutool.core.collection.ListUtil;
import cn.hutool.core.convert.Convert;
import com.mxchen.shangyitong.common.resultCode.ResultCodeEnum;
import com.mxchen.shangyitong.excel.EasyPoiService;
import com.mxchen.shangyitong.excel.model.DictEeVo;
import com.mxchen.shangyitong.exception.YyghExceptionFactory;
import com.mxchen.shangyitong.gatewayimpl.database.mysql.cmn.DictBaseServiceI;
import com.mxchen.shangyitong.gatewayimpl.database.mysql.cmn.DictDO;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletResponse;
import java.util.List;
import java.util.Optional;

/**
 * @program: shangyitong
 * @description:
 * @author: hmxchen
 * @create: 2021-06-24 15:30
 **/
@Component
public class DictListExportExe {
    @Resource
    private DictBaseServiceI dictBaseServiceI;

    public void execute(HttpServletResponse response) {
        List<DictDO> list = dictBaseServiceI.list();
        Optional.ofNullable(list).orElseThrow(()-> YyghExceptionFactory.sysException(ResultCodeEnum.NO_DATA_EXPORT));
        List<DictEeVo> dictEeVos = ListUtil.list(true);
        list.forEach(u->{
            dictEeVos.add(Convert.convert(DictEeVo.class,u));
        });
        EasyPoiService.exportExcel(dictEeVos,"字典数据","字典数据",DictEeVo.class,"data",true,response);
    }
}
