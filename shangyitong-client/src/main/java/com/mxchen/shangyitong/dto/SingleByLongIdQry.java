package com.mxchen.shangyitong.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotNull;

/**
 * @program: shangyitong
 * @description: 根据id获取唯一
 * @author: hmxchen
 * @create: 2021-06-19 11:07
 **/
@ApiModel("根据id获取唯一的客户端请求(id类型长整型)")
@NoArgsConstructor
public class SingleByLongIdQry extends GetByLongIdQry{
    public SingleByLongIdQry(@NotNull Long id) {
        super(id);
    }
}
