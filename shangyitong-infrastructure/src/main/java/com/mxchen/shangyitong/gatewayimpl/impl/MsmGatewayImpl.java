package com.mxchen.shangyitong.gatewayimpl.impl;

import cn.hutool.json.JSONUtil;
import com.aliyun.dysmsapi20170525.models.SendSmsRequest;
import com.aliyun.dysmsapi20170525.models.SendSmsResponse;
import com.google.common.collect.Lists;

import com.aliyun.dysmsapi20170525.*;
import com.aliyun.dysmsapi20170525.models.AddSmsSignRequest;
import com.aliyun.teaopenapi.models.*;
import com.mxchen.shangyitong.config.aliyun.SmsConfig;
import com.mxchen.shangyitong.gateway.MsmGateway;
import com.mxchen.shangyitong.model.msm.MsmTemplate;
import lombok.extern.slf4j.Slf4j;
import net.minidev.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.HashMap;

/**
 * @program: shangyitong
 * @description: 短信服务实现类
 * @author: hmxchen
 * @create: 2021-06-22 11:13
 **/
@Slf4j
@Service
public class MsmGatewayImpl implements MsmGateway {

    @Resource
    private SmsConfig smsConfig;

    private static String ALIYUN_SIGN_NAME = "仙梦DEMO"; //短信服务签名
    private static String ENDPOINT = "dysmsapi.aliyuncs.com"; //访问的域名

    private static String SEND_VC = "SMS_180051135";//发送验证码短信模板
    private static String SEND_SK = "SMS_180051135";//发送医院代码和秘钥短信模板

    @Override
    public boolean sendCode(String phone, String code) {
        return send(MsmTemplate.create(phone, SEND_VC, new HashMap<String, Object>() {{
            put("code", code);
        }}));
    }

    @Override
    public boolean sendSignKey(String phone, String hosCode, String signKey) {
        return send(MsmTemplate.create(phone, SEND_SK, new HashMap<String, Object>() {{
            put("hosCode", hosCode);
            put("signKey", signKey);
        }}));
    }

    private boolean send(MsmTemplate msmTemplate) {
        try {
            Client client = getClient();
            SendSmsRequest sendSmsRequest = new SendSmsRequest();
            sendSmsRequest.setPhoneNumbers(msmTemplate.getPhone());
            sendSmsRequest.setSignName(ALIYUN_SIGN_NAME);
            sendSmsRequest.setTemplateCode(msmTemplate.getTemplateCode());
            sendSmsRequest.setTemplateParam(JSONUtil.toJsonStr(msmTemplate.getParam()));
            client.sendSms(sendSmsRequest);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    /**
     * 使用AK&SK初始化账号Client
     *
     * @return Client
     * @throws Exception
     */
    private Client getClient() throws Exception {
        Config config = new Config()
                // 您的AccessKey ID
                .setAccessKeyId(smsConfig.getAccessKeyId())
                // 您的AccessKey Secret
                .setAccessKeySecret(smsConfig.getAccessSecret());
        // 访问的域名
        config.setEndpoint(ENDPOINT);
        return new Client(config);
    }


}
