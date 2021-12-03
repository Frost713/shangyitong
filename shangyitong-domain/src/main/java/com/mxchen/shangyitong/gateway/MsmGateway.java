package com.mxchen.shangyitong.gateway;

import com.mxchen.shangyitong.model.msm.MsmTemplate;

/**
 * @program: shangyitong
 * @description: 短信网关
 * @author: hmxchen
 * @create: 2021-06-22 11:10
 **/
public interface MsmGateway {
    /**
     * @Description: 发送短信验证码
     * @Param: [phone, code]
     * @return: boolean
     * @Author: hmxchen
     * @Date: 2021/6/22 11:12
     */
    boolean sendCode(String phone, String code);
    /**
    * @Description: 发送签名短信
    * @Param: [phone, signKey]
    * @return: boolean
    * @Author: hmxchen
    * @Date: 2021/6/22 12:01
    */
    boolean sendSignKey(String contactsPhone, String hoscode, String signKey);
}
