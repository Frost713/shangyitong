package com.mxchen.shangyitong.dto.clientObj.hosp.department;

import com.alibaba.cola.dto.Command;
import com.mxchen.shangyitong.dto.PageQry;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * <p>
 * Department
 * </p>
 *
 * @author qy
 */
@Data
@ApiModel(description = "科室分页查询请求")
public class DepartmentPageQry extends PageQry {
	@ApiModelProperty(value = "医院编号")
	private String hoscode;
}

