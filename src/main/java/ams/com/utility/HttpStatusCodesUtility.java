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

import java.util.HashMap;

/**
 * This class is the one who designates the error message for the code provided to it and then stores all the 
 * information into the {@link ams.com.utility.HttpStatusErrorMessageUtility}.
 * 
 * @author GauravAmarnani
 * @version 1.0
 */

public class HttpStatusCodesUtility {
	
	/**
	 * This variable contains all the error messages as values for codes as keys.
	 */
	
	private HashMap<Integer, String> errorMessages;
	
	/**
	 * @param Http Status Code
	 * 
	 * This message first initializes the Map and sets all the values for codes.
	 * Then it generates error message by mapping the key i.e HTTP Status Code to the value and creates the 
	 * {@link ams.com.utility.HttpStatusErrorMessageUtility} object.
	 * After that it destroys the Map and returns the object.
	 * 
	 * @return {@link ams.com.utility.HttpStatusErrorMessageUtility} object which has all the information about the error.
	 */
	
	public HttpStatusErrorMessageUtility getHttpStatusErrorMessage(Integer code) {
		initializeMap();
		HttpStatusErrorMessageUtility httpStatusErrorMessage = generateErrorMessage(code);
		destroyMap();
		return httpStatusErrorMessage;
	}
	
	/**
	 * This method initializes the Map by setting all the error messages for the HTTP Status Codes.
	 */
	
	public void initializeMap() {
		errorMessages = new HashMap<Integer, String>();
		errorMessages.put(400, "Bad Request (400) - The request cannot be fulfilled due to bad syntax. Please do not repeat the same call again.");
		errorMessages.put(401, "Unauthorized (401) - You are not authorized to access these resources. Might be because of missing or invalid Authentication.");
		errorMessages.put(403, "Forbidden (403) - You are not authorized to access these resources. You don't have the rights.");
		errorMessages.put(404, "Page Not Found (404) - The Page or Resource that you're trying to look for is not available with us.");
		errorMessages.put(405, "Method Not Allowed (405) - A request was made of a resource using a request method not supported by that resource; for example, using GET on a form which requires data to be presented via POST.");
		errorMessages.put(407, "Proxy Authentication Required (407) - This code is similar to 401 (Unauthorized), but indicates that the client must first authenticate itself with the proxy.");
		errorMessages.put(408, "Request Timeout (408) - The client did not produce a request within the time that the server was prepared to wait. The client MAY repeat the request without modifications at any later time.");
		errorMessages.put(409, "Conflict (409) - Indicates that the request could not be processed because of conflict in the request, such as an edit conflict.");
		errorMessages.put(413, "Request Entity Too Large (413) - The request is larger than the server is willing or able to process.");
		errorMessages.put(414, "Request URL Too Long (414) - The URL provided was too long for the server to process.");
		errorMessages.put(415, "Unsupported Media Type (415) - The server is refusing to service the request because the entity of the request is in a format not supported by the requested resource for the requested method.");
		errorMessages.put(429, "Too Many Requests (429) - The user has sent too many requests in a given amount of time. Intended for use with rate limiting schemes.");
		errorMessages.put(500, "Internal Server Error (500) - The server encountered an unexpected condition which prevented it from fulfilling the request.");
		errorMessages.put(501, "Not Implemented (501) - The server either does not recognise the request method, or it lacks the ability to fulfill the request.");
		errorMessages.put(502, "Bad Gateway (502) - The server was acting as a gateway or proxy and received an invalid response from the upstream server.");
		errorMessages.put(503, "Service Unavailable (503) - The server is currently unavailable (because it is overloaded or down for maintenance).");
		errorMessages.put(504, "Gateway Timeout (504) - The server was acting as a gateway or proxy and did not receive a timely response from the upstream server.");
		errorMessages.put(507, "Insufficient Storage (507) - The server is unable to store the representation needed to complete the request.");
		errorMessages.put(508, "Loop Detected (508) - The server detected an infinite loop while processing the request. This status indicates that the entire operation failed.");
	}
	
	/**
	 * @param Http Status Code
	 * 
	 * This is the method where all the searching and assigning of the error message is done.
	 * 
	 * @return {@link ams.com.utility.HttpStatusErrorMessageUtility} object.
	 */
	
	public HttpStatusErrorMessageUtility generateErrorMessage(Integer code) {
		if(errorMessages.containsKey(code)) {
			String[] titleAndDescription = getTitleAndDescription(errorMessages.get(code));
			return new HttpStatusErrorMessageUtility(code, titleAndDescription[0], titleAndDescription[1]);
		}
		return new HttpStatusErrorMessageUtility(1206, "Error Does Not Exists (1206)", "No handling has been found for this error. Please report this error to us.");
	}
	
	/**
	 * @param Complete Error Message
	 * @return Separated Error Message with Title and Description separated.
	 */
	
	public String[] getTitleAndDescription(String completeMessage) {
		String[] seperatedMessage = completeMessage.split("-");
		return seperatedMessage;
	}
	
	/**
	 * Destroys the Map which contains all the error messages.
	 */
	
	public void destroyMap() {
		errorMessages.clear();
	}
}