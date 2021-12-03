package com.alibaba.cola.dto;

import java.io.Serializable;

/**
 数据传输对象，包括命令、查询和响应，命令和查询是cQRS的概念。
 *
 * @author Frank Zhang 2020.11.13
 *
 */
public abstract class DTO implements Serializable {

    private static final long serialVersionUID = 1L;

}
