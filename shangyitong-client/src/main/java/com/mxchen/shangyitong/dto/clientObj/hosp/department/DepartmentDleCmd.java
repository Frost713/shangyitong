package com.mxchen.shangyitong.dto.clientObj.hosp.department;

import com.alibaba.cola.dto.Command;
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
@ApiModel(description = "科室删除请求")
public class DepartmentDleCmd extends Command {
	@ApiModelProperty(value = "医院编号")
	private String hoscode;
	@ApiModelProperty(value = "科室编号")
	private String depcode;
}

