package com.mxchen.shangyitong.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum PaymentTypeEnum {
    ALIPAY(1,"支付宝"),
    WEIXIN(2,"微信" );
    private Integer status ;
    private String comment ;
}
