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

package ams.com.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ams.com.dto.HttpStatusErrorMessageDTO;
import ams.com.utility.HttpStatusCodesUtility;

/**
 * HttpStatusService provides service to {@link ams.com.controller.HttpStatusController} to handle HTTP Errors.
 * 
 * It designates an appropriate error message for the provided HTTP Status Code with help of
 * {@link ams.com.utility.HttpStatusCodesUtility} and {@link ams.com.dto.HttpStatusErrorMessageDTO}.
 * 
 * @author GauravAmarnani
 * @version 1.0
 */

@Service
public class HttpStatusService {
	
	/**
	 * {@link ams.com.utility.HttpStatusCodesUtility} class contains all the error messages for respective codes.
	 */
	
	@Autowired
	private HttpStatusCodesUtility httpStatusCodesUtility;
	
	/**
	 * 
	 * @param Http Status Code
	 * 
	 * This methods uses the {@link ams.com.utility.HttpStatusCodesUtility#generateErrorMessage(Integer)} method 
	 * to designate an appropriate message for the provided HTTP Status Code. 
	 * 
	 * @return {@link ams.com.dto.HttpStatusErrorMessageDTO} object which essentially contains the 
	 * information about the code like it's title and description.
	 */
	
	public HttpStatusErrorMessageDTO getHttpStatusErrorMessageUtility(Integer code) {
		return httpStatusCodesUtility.getHttpStatusErrorMessage(code);
	}
}