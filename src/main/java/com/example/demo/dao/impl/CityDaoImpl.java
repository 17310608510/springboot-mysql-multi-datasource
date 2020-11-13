package com.example.demo.dao.impl;

import java.util.List;

import org.springframework.stereotype.Component;

import com.example.demo.dao.CityDao;
import com.example.demo.dao.base.BaseDao;
import com.example.demo.vo.CityVo;

/** 
 * @author 作者 zuoruibo: 
 * @date 创建时间：2020年11月13日 上午10:44:30 
 * @version 1.0 
 * @parameter 
 * @since 
 * @return 
 */
@Component
public class CityDaoImpl extends BaseDao implements CityDao {

	@Override
	public List<CityVo> listCities111() {
		return this.sqlSessionTemplateOfMaster.selectList("listCities111");
	}

	@Override
	public List<CityVo> listCities222() {
		return this.sqlSessionTemplateOfSlave.selectList("listCities222");
	}

}
