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

import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

/**
 * SecurityConfiguration Class helps us to manage the various security features provided by 
 * the Spring Framework.
 * 
 * In this Class we can Authenticate and Authorize the Users.
 * Set PasswordEncoders.
 * Set Custom Login and Logout Pages.
 * 
 * @author GauravAmarnani
 * @version 1.0
 */

@EnableWebSecurity(debug = true)  
//Not adding @Configuration because @EnableWebSecurity internally calls it anyways.
public class SecurityConfiguration extends WebSecurityConfigurerAdapter {
	
}
