package com.example.demo.dao.base;
/** 
 * @author 作者 zuoruibo: 
 * @date 创建时间：2020年11月13日 上午10:22:18 
 * @version 1.0 
 * @parameter 
 * @since 
 * @return 
 */

import javax.annotation.Resource;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;

public abstract class BaseDao {
	/**
	 * 默认库-主库
	 */
	@Resource(name = "masterSessionTemplate")
	@Autowired
	public SqlSessionTemplate sqlSessionTemplateOfMaster;

	/**
	 * 灾备库-用作读库
	 */
	@Resource(name = "slaveSessionTemplate")
	@Autowired
	public SqlSessionTemplate sqlSessionTemplateOfSlave;
}
