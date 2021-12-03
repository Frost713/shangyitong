package com.mxchen.shangyitong.convertor.cmn;

import cn.hutool.core.convert.Convert;
import com.mxchen.shangyitong.gatewayimpl.database.mysql.cmn.DictDO;
import com.mxchen.shangyitong.gatewayimpl.database.mysql.hosp.HospitalSetDO;
import com.mxchen.shangyitong.model.cmn.Dict;
import com.mxchen.shangyitong.model.hosp.Hospital;

import java.util.Collection;
import java.util.List;

/**
 * @version v1.0.0
 * @ClassName DictConvertor
 * @Description TODO
 * @Author hmxchen
 * @Date 2021/6/27 20:25
 */
public class DictConvertor {
    public static DictDO toDateObj(Dict dict){
        return Convert.convert(DictDO.class,dict);
    }
    public static Dict toEntity(DictDO dictDO){
        return Convert.convert(Dict.class,dictDO);
    }
    public static List<DictDO> toDateObjList(List<Dict> dictList){
        return Convert.toList(DictDO.class,dictList);
    }
    public static List<Dict> toEntityList(List<DictDO> dictList){
        return Convert.toList(Dict.class,dictList);
    }
}
