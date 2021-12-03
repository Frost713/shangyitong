package com.mxchen.shangyitong.dto.clientObj.hosp.hospital;

import com.mxchen.shangyitong.dto.PageQry;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * @program: shangyitong
 * @description:
 * @author: hmxchen
 * @create: 2021-07-03 17:51
 **/
@ApiModel("医院信息分页查询请求")
@Data
public class HospitalPageQry extends PageQry {
    @ApiModelProperty(value = "医院编号")
    private String hoscode;

    @ApiModelProperty(value = "医院名称")
    private String hosname;

    @ApiModelProperty(value = "医院类型")
    private String hostype;

    @ApiModelProperty(value = "省code")
    private String provinceCode;

    @ApiModelProperty(value = "市code")
    private String cityCode;

    @ApiModelProperty(value = "区code")
    private String districtCode;

    @ApiModelProperty(value = "状态")
    private Integer status;

    public HospitalPageQry setParams(int page,int limit){
        this.setPage(page);
        this.setLimit(limit);
        return this;
    }
}
