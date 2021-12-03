package com.mxchen.shangyitong.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;
@AllArgsConstructor
@Getter
public enum AuthStatusEnum {

    NO_AUTH(0, "未认证"),
    AUTH_RUN(1, "认证中"),
    AUTH_SUCCESS(2, "认证成功"),
    AUTH_FAIL(-1, "认证失败");

    private final Integer status;
    private final String name;

    public static String getStatusNameByStatus(Integer status) {
        AuthStatusEnum[] arrObj = AuthStatusEnum.values();
        for (AuthStatusEnum obj : arrObj) {
            if (status.intValue() == obj.getStatus().intValue()) {
                return obj.getName();
            }
        }
        return "";
    }
}
