package com.mxchen.shangyitong.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * @program: shangyitong
 * @description: 批量删除
 * @author: hmxchen
 * @create: 2021-06-19 11:19
 **/
@ApiModel("批量删除")
@Data
public class BatchDeleteByLongCmd {
    @ApiModelProperty(value = "id 集合")
    private List<Long> idList;
}
