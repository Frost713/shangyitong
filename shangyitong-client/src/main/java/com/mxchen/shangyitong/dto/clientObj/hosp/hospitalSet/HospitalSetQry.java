package com.mxchen.shangyitong.dto.clientObj.hosp.hospitalSet;

import com.alibaba.cola.dto.PageQuery;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @program: shangyitong
 * @description: 医院设置查询
 * @author: hmxchen
 * @create: 2021-06-18 14:53
 **/
@ApiModel("医院设置查询")
@NoArgsConstructor
@Data
public class HospitalSetQry extends PageQuery {

    @ApiModelProperty(value = "医院名称")
    private String hosname;

    @ApiModelProperty(value = "医院编号")
    private String hoscode;
    public HospitalSetQry setPageParams(int current,int limit){
        this.setPageIndex(current);
        this.setPageSize(limit);
        return this;
    }

}
