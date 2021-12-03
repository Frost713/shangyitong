package com.mxchen.shangyitong.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum RefundStatusEnum {
    UNREFUND(1,"退款中"),
    REFUND(2,"已退款");
    private Integer status ;
    private String name ;
}
