package com.example.demo.dao.base.datasource;


import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

/** 
 * @author 作者 zuoruibo: 
 * @date 创建时间：2020年11月13日 上午10:36:28 
 * @version 1.0 
 * @parameter 
 * @since 
 * @return 
 */
@Configuration
public class DataSourceConfig {
	
	@Primary
	@Qualifier("master")
	@Bean(name = "master")
	@ConfigurationProperties(prefix = "spring.datasource.master") // application.yml中对应属性的前缀
	public DataSource masterDataSource() {
		return DataSourceBuilder.create().build();
	}

	@Qualifier("slave")
	@Bean(name = "slave")
	@ConfigurationProperties(prefix = "spring.datasource.slave") // application.yml中对应属性的前缀
	public DataSource slaveDataSource() {
		return DataSourceBuilder.create().build();
	}
}
