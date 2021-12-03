package com.mxchen.shangyitong.dto;

import com.alibaba.cola.dto.Command;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotNull;

/**
 * @version v1.0.0
 * @ClassName GetByStringIdQry
 * @Description TODO
 * @Author hmxchen
 * @Date 2021/7/5 23:12
 */
@NoArgsConstructor
@AllArgsConstructor
@Data
public class GetByStringIdQry extends Command {
    @ApiModelProperty(value = "主键id")
    @NotNull
    private String id;
}
