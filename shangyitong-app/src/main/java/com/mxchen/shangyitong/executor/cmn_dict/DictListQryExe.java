package com.mxchen.shangyitong.executor.cmn_dict;

import cn.hutool.core.collection.ListUtil;
import cn.hutool.core.convert.Convert;
import com.alibaba.cola.dto.MultiResponse;
import com.mxchen.shangyitong.dto.GetByLongIdQry;
import com.mxchen.shangyitong.dto.clientObj.cmn.DictCO;
import com.mxchen.shangyitong.gateway.DictGateway;
import com.mxchen.shangyitong.model.cmn.Dict;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.util.List;

/**
 * @program: shangyitong
 * @description: 获取数据列表执行类
 * @author: hmxchen
 * @create: 2021-06-24 11:16
 **/
@Component
public class DictListQryExe {
    @Resource
    private DictGateway dictGateway;

    public MultiResponse<DictCO> execute(GetByLongIdQry getByLongIdQry) {
        List<DictCO> dictCOList = ListUtil.list(false);
        List<Dict> dictList = dictGateway.findChildData(getByLongIdQry.getId());
        dictList.forEach(u->{
            dictCOList.add(Convert.convert(DictCO.class,u));
        });
        return MultiResponse.of(dictCOList);
    }
}
