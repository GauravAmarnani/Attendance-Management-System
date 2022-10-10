/*
 * Copyright 2021-2022 the original author.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package ams.com.configuration;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

/**
 * ApplicationConfiguration Class is the Spring Initialization Class which
 * replaces the xml file. This is known as the Configuration Class of our
 * application and performs roles like creating beans, starting component scans,
 * etc.
 * 
 * @author Gaurav Amarnani
 * @version 1.0
 */

@Configuration
@EnableWebMvc
@ComponentScan(basePackages = { "ams.com" })
public class ApplicationConfiguration {

	/**
	 * @return The Object of
	 *         {@link org.springframework.web.servlet.view.InternalResourceViewResolver}
	 *         with already set prefix and suffix which will help the Spring
	 *         Application to locate the Java Server Pages more efficiently and
	 *         makes it much more easier for us to call them.
	 */

	@Bean
	public InternalResourceViewResolver getInternalResourceViewResolver() {
		InternalResourceViewResolver internalResourceViewResolver = new InternalResourceViewResolver();
		internalResourceViewResolver.setPrefix("/WEB-INF/views/");
		internalResourceViewResolver.setSuffix(".jsp");
		return internalResourceViewResolver;
	}

	/**
	 * @see org.springframework.security.crypto.password.PasswordEncoder
	 * @return {@link org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder}
	 *         object.
	 */

	@Bean
	public BCryptPasswordEncoder getBCryptPasswordEncoder() {
		return new BCryptPasswordEncoder();
	}

	/**
	 * This is a part of Spring JDBC Framework. DataSource Object is used by the
	 * {@link org.springframework.jdbc.core.JdbcTemplate} and also by Spring
	 * Security in
	 * {@link ams.com.configuration.SecurityConfiguration#configure(org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder)}
	 * 
	 * @return {@link javax.sql.DataSource} object.
	 */

	@Bean
	public DataSource getDataSource() {
		DriverManagerDataSource driverManagerDataSource = new DriverManagerDataSource();
		driverManagerDataSource.setUsername("root");
		driverManagerDataSource.setPassword("mysqlpassword");
		driverManagerDataSource.setUrl("jdbc:mysql://127.0.0.1:3306/ams_staff");
		driverManagerDataSource.setDriverClassName("com.mysql.cj.jdbc.Driver");
		return driverManagerDataSource;
	}

	/**
	 * Major part of Spring JDBC. {@link org.springframework.jdbc.core.JdbcTemplate}
	 * is where everything happens.
	 * 
	 * @return {@link org.springframework.jdbc.core.JdbcTemplate} object.
	 */

	@Bean
	public JdbcTemplate getJdbcTemplate() {
		JdbcTemplate jdbcTemplate = new JdbcTemplate();
		jdbcTemplate.setDataSource(getDataSource());
		return jdbcTemplate;
	}
}
