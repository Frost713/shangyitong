package com.mxchen.shangyitong.exception;

import com.alibaba.cola.dto.Response;
import com.alibaba.cola.exception.BizException;
import com.alibaba.cola.exception.SysException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

@ControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(BizException.class)
    @ResponseBody
    public Response error(BizException e) {
        e.printStackTrace();
        return Response.buildFailure(e.getErrCode(),e.getMessage());
    }

    @ExceptionHandler(SysException.class)
    @ResponseBody
    public Response error(SysException e) {
        e.printStackTrace();
        return Response.buildFailure(e.getErrCode(),e.getMessage());
    }
    @ExceptionHandler(Exception.class)
    @ResponseBody
    public Response error(Exception e) {
        e.printStackTrace();
        return Response.buildFailure("-1",e.getMessage());
    }

}
