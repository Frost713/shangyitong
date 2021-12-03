package com.mxchen.shangyitong.gateway;

import com.mxchen.shangyitong.model.cmn.Dict;

import java.util.List;

/**
 * @program: shangyitong
 * @description:
 * @author: hmxchen
 * @create: 2021-06-24 11:21
 **/
public interface DictGateway {
    /**
     * @Description: 根据数据id查询子数据列表
     * @Param: [id]
     * @return: java.util.List<com.mxchen.shangyitong.model.cmn.Dict>
     * @Author: hmxchen
     * @Date: 2021/6/24 11:48
     */
    List<Dict> findChildData(Long id);

    /**
     * @return
     * @author hmxchen
     * @version v1.0.0
     * @Description //TODO
     * @Date 2021/4/21 23:17
     **/
    void batchSave(List<Dict> dictList);
}
