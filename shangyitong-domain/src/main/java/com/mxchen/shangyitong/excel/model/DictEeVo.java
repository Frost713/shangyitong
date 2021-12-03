package com.mxchen.shangyitong.excel.model;

import cn.afterturn.easypoi.excel.annotation.Excel;
import cn.afterturn.easypoi.excel.annotation.ExcelTarget;
import com.alibaba.cola.domain.Entity;
import lombok.Data;

import java.io.Serializable;

@Entity
@Data
@ExcelTarget("DictEeVo")
public class DictEeVo  implements Serializable {
	private static final long serialversionUID = 1L;
	@Excel(name = "id",width = 30)
	private Long id;
	@Excel(name = "上级id",width = 30)
	private Long parentId;
	@Excel(name = "名称",width = 30)
	private String name;
	@Excel(name = "值",width = 30)
	private String value;
	@Excel(name = "编码",width = 30)
	private String dictCode;
}

