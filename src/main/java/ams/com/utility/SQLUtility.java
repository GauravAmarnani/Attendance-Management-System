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

package ams.com.utility;

import ams.com.annotations.Utility;

/**
 * This class contains SQL Queries which are used by DAO Classes after
 * connecting to database.
 * 
 * @author GauravAmarnani
 * @version 1.0
 */

@Utility
public class SQLUtility {

	/**
	 * This variable contains query which will return the authority for a given
	 * username.
	 */

	public static final String AUTHORITY_BY_USERNAME = "SELECT authority FROM ams_staff.authorities WHERE username = ?";
}