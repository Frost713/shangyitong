package com.mxchen.shangyitong.dto;

import com.alibaba.cola.dto.Command;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * @program: shangyitong
 * @description:
 * @author: hmxchen
 * @create: 2021-07-03 17:10
 **/

@Data
public  class PageQry extends Command {
    @ApiModelProperty(value = "当前页")
    private int page = 1;
    @ApiModelProperty(value = "每页记录数")
    private int limit = 10;
}
