package com.mxchen.shangyitong.dto;

import com.alibaba.cola.dto.Command;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotNull;

/**
 * @program: shangyitong
 * @description: 根据id获取数据
 * @author: hmxchen
 * @create: 2021-06-24 11:04
 **/
@NoArgsConstructor
@AllArgsConstructor
@Data
public class GetByLongIdQry extends Command {
    @ApiModelProperty(value = "主键id")
    @NotNull
    private Long id;
}
