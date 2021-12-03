package com.mxchen.shangyitong.exception;

import com.alibaba.cola.exception.BizException;
import com.alibaba.cola.exception.ExceptionFactory;
import com.alibaba.cola.exception.SysException;
import com.mxchen.shangyitong.common.resultCode.ResultCodeEnum;
import io.swagger.annotations.ApiModel;
import lombok.Data;

/**
 * 自定义全局异常类
 *
 * @author qy
 */
@Data
@ApiModel(value = "自定义全局异常类")
public class YyghExceptionFactory extends ExceptionFactory {

    public static BizException bizException(ResultCodeEnum resultCodeEnum) {
        return bizException(resultCodeEnum.getCode().toString(), resultCodeEnum.getMessage());
    }

    public static SysException sysException(ResultCodeEnum resultCodeEnum) {
        return sysException(resultCodeEnum.getCode().toString(), resultCodeEnum.getMessage());
    }
}
