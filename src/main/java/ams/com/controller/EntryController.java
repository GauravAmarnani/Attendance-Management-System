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

import java.security.Principal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import ams.com.service.LoginService;

/**
 * EntryController Class is a Controller Class which handles all the entry
 * requests for our application such as login and home page.
 * 
 * @author GauravAmarnani
 * @version 1.0
 */

@Controller
public class EntryController {

	/**
	 * This variable is used to set the path for <a href> links by making it easier
	 * to access the Context Path dynamically.
	 */

	@Value("#{servletContext.contextPath}")
	private String servletContextPath;

	/**
	 * {@link ams.com.service.LoginService} object helps the Handler Method to
	 * easily login user without writing much business logic or making any database
	 * connection.
	 */

	@Autowired
	private LoginService loginService;

	/**
	 * This is the Index Page Link Mapping method.
	 * 
	 * @return home-page.jsp
	 */

	@GetMapping("/")
	public String getHomePage(Model model, Principal principal) {
		if (principal != null) {
			if (loginService.isUserHOD(principal.getName())) {
				return "redirect:/hod";
			}
			return "redirect:/teacher";
		}
		model.addAttribute("path", servletContextPath);
		return "home-page";
	}

	/**
	 * This is a testing method so far to see if the user who is indeed a HOD can
	 * reach here and no one else who isn't a HOD.
	 * 
	 * @return HOD HOME PAGE.
	 */

	@ResponseBody
	@GetMapping("/hod")
	public String getHODHomePage() {
		return "HOD HOME PAGE.";
	}

	/**
	 * This is a testing method so far to see if the user who is indeed a TEACHER
	 * can reach here and no one else who isn't a TEACHER.
	 * 
	 * @return TEACHER HOME PAGE.
	 */

	@ResponseBody
	@GetMapping("/teacher")
	public String getTeacherHomePage() {
		return "TEACHER HOME PAGE.";
	}
}