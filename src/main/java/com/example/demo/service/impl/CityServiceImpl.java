package com.example.demo.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.CityDao;
import com.example.demo.service.CityService;
import com.example.demo.vo.CityVo;

/** 
 * @author 作者 zuoruibo: 
 * @date 创建时间：2020年11月13日 上午10:46:38 
 * @version 1.0 
 * @parameter 
 * @since 
 * @return 
 */
@Service
public class CityServiceImpl implements CityService {

	@Autowired
	private CityDao cityDao;

	/**
	 * 获得城市1列表
	 */
	@Override
	public List<CityVo> listCities111() {
		return this.cityDao.listCities111();
	}

	/**
	 * 获得城市2列表
	 */
	@Override
	public List<CityVo> listCities222() {
		return this.cityDao.listCities222();
	}

}
