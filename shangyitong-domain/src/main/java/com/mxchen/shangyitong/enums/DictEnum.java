package com.mxchen.shangyitong.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum DictEnum {
    HOSTYPE("Hostype", "医院等级"),
    CERTIFICATES_TYPE("CertificatesType", "证件类型");

    private String dictCode;
    private String msg;

}
