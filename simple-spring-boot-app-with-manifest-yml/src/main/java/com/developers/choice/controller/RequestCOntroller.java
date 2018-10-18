/**
 * 
 */
package com.developers.choice.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Scorpio
 *
 */
@RestController
public class RequestCOntroller {

	@RequestMapping(name="sayHello", method=RequestMethod.GET)
	public String sayHello(@RequestParam String name) {
		return "Hello "+name;
	}
}
