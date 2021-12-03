package com.mxchen.shangyitong.gatewayimpl.impl;

import com.mxchen.shangyitong.convertor.cmn.DictConvertor;
import com.mxchen.shangyitong.gateway.DictGateway;
import com.mxchen.shangyitong.gatewayimpl.database.mysql.cmn.DictBaseServiceI;
import com.mxchen.shangyitong.gatewayimpl.database.mysql.cmn.DictDO;
import com.mxchen.shangyitong.model.cmn.Dict;
import lombok.extern.slf4j.Slf4j;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @program: shangyitong
 * @description:
 * @author: hmxchen
 * @create: 2021-06-24 11:20
 **/
@Slf4j
@Service
public class DictGatewayImpl implements DictGateway {
    @Resource
    private DictBaseServiceI dictBaseServiceI;

    @Cacheable(value = "dict",keyGenerator = "keyGenerator")
    @Override
    public List<Dict> findChildData(Long id) {
        return dictBaseServiceI.getBaseMapper().findChildData(id);
    }

    @CacheEvict(value = "dict", allEntries=true)
    @Override
    public void batchSave(List<Dict> dictList) {
        List<DictDO> dictDOS = DictConvertor.toDateObjList(dictList);
        dictBaseServiceI.saveBatch(dictDOS);
    }
}
