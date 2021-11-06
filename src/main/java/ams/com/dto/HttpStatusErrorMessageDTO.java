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

package ams.com.dto;

/**
 * This DTO class helps in setting the appropriate error message with respect to
 * the HTTP Status Code. We send it's object as a model to the JSP.
 * 
 * @author GauravAmarnani
 * @version 1.0
 */

public class HttpStatusErrorMessageDTO {

	/**
	 * The following are the variables for HTTP Status Code, the appropriate title
	 * for it and description respectively.
	 */

	private Integer code;
	private String title;
	private String description;

	/**
	 * Getter Method to be used by Spring Framework when we use it as a model
	 * object.
	 * 
	 * @return HTTP Status Code.
	 */

	public Integer getCode() {
		return code;
	}

	/**
	 * Setter Method to be used by Spring Framework when we use it as a model
	 * object.
	 * 
	 * @param HTTP Status Code.
	 */

	public void setCode(Integer code) {
		this.code = code;
	}

	/**
	 * Getter Method to be used by Spring Framework when we use it as a model
	 * object.
	 * 
	 * @return HTTP Status Code.
	 */

	public String getTitle() {
		return title;
	}

	/**
	 * Setter Method to be used by Spring Framework when we use it as a model
	 * object.
	 * 
	 * @param HTTP Status Code.
	 */

	public void setTitle(String title) {
		this.title = title;
	}

	/**
	 * Getter Method to be used by Spring Framework when we use it as a model
	 * object.
	 * 
	 * @return HTTP Status Code.
	 */

	public String getDescription() {
		return description;
	}

	/**
	 * Setter Method to be used by Spring Framework when we use it as a model
	 * object.
	 * 
	 * @param HTTP Status Code.
	 */

	public void setDescription(String description) {
		this.description = description;
	}

	/**
	 * This is the Parameterized Constructor for this class.
	 *
	 * @param HTTP Status Code
	 * @param title
	 * @param description
	 */

	public HttpStatusErrorMessageDTO(Integer code, String title, String description) {
		this.code = code;
		this.title = title;
		this.description = description;
	}

	/**
	 * @return Object in the String format.
	 */

	@Override
	public String toString() {
		return "HttpStatusErrorMessageUtility [code=" + code + ", title=" + title + ", description=" + description
				+ "]";
	}
}