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

package ams.com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * EntryController Class is a Controller Class which handles all the entry requests for our 
 * application such as login and home page. 
 * 
 * @author GauravAmarnani
 * @version 1.0
 */

@Controller
public class EntryController {
	
	/**
	 * This is the Index Page Link Mapping method.
	 * 
	 * @return home-page.jsp 
	 */
	
	@GetMapping("/")
	public String getHomePage() {
		return "home-page";
	}
}