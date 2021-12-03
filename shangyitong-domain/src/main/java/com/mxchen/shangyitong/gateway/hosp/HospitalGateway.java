package com.mxchen.shangyitong.gateway.hosp;

import com.mxchen.shangyitong.model.hosp.Hospital;

/**
 * @program: shangyitong
 * @description: 医院相关服务网关
 * @author: hmxchen
 * @create: 2021-06-18 15:07
 **/
public interface HospitalGateway {
    /**
     * @Description: 保存医院设置信息
     * @Param: [hospital]
     * @return: void
     * @Author: hmxchen
     * @Date: 2021/6/19 10:47
     */
    void saveSetInfo(Hospital hospital);
    /***
    * @Description: 更新医院设置信息
    * @Param: [hospital]
    * @return: void
    * @Author: hmxchen
    * @Date: 2021/6/19 11:14
    */ 
    void updateSetInfo(Hospital hospital);
    /**
    * @Description: 医院设置状态
    * @Param: [convert]
    * @return: void
    * @Author: hmxchen
    * @Date: 2021/6/22 11:03
    */ 
    void updateSetStatus(Hospital convert);
    /**
     * @author hmxchen
     * @version v1.0.0
     * @Description //TODO 上传医院信息
     * @Date 2021/4/21 23:17
     * @return
     **/
    void saveHpInfo(Hospital convert);
}
