package com.mxchen.shangyitong.model.cmn;

import com.alibaba.cola.domain.Entity;
import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * @program: shangyitong
 * @description: 数据字典
 * @author: hmxchen
 * @create: 2021-06-24 10:32
 **/
@Entity
@Data
public class Dict {
    @ApiModelProperty(value = "id")
    private Long id;

    @ApiModelProperty(value = "逻辑删除(1:已删除，0:未删除)")
    private Integer isDeleted;

    @ApiModelProperty(value = "其他参数")
    private Map<String,Object> param = new HashMap<>();

    @ApiModelProperty(value = "上级id")
    private Long parentId;

    @ApiModelProperty(value = "名称")
    private String name;

    @ApiModelProperty(value = "值")
    private String value;

    @ApiModelProperty(value = "编码")
    private String dictCode;

    @ApiModelProperty(value = "是否包含子节点")
    private boolean hasChildren;

    @ApiModelProperty(value = "创建时间")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date createTime;

    @ApiModelProperty(value = "更新时间")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date updateTime;

}
