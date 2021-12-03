package com.mxchen.shangyitong.dto;

import com.alibaba.cola.dto.Command;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotNull;

/**
 * @program: shangyitong
 * @description: 根据id删除的客户端请求
 * @author: hmxchen
 * @create: 2021-06-18 14:29
 **/
@ApiModel("根据id删除的客户端请求(id类型长整型)")
@NoArgsConstructor
@AllArgsConstructor
@Data
public class DeleteByLongIdCmd extends Command {
    @ApiModelProperty(value = "主键id")
    @NotNull
    private Long id;
}
