package com.ztx.entity;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

@AllArgsConstructor//全参构造函数
@NoArgsConstructor//空参构造函数
@Data//set,get
@Accessors(chain = true)//链式编程
public class Dept implements Serializable{
	private static final long serialVersionUID = 1L;
//微服务实体类必须实现serializable
	private Long deptno;//主键
	private String dname;//部门名
	private String db_source;//链接数据库名称
	
}
