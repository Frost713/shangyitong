package com.mxchen.shangyitong.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum PaymentStatusEnum {
    UNPAID(1,"支付中"),
    PAID(2,"已支付");
    private Integer status ;
    private String name ;
}
