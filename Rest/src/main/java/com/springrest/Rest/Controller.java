package com.springrest.Rest;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

	@RequestMapping("/list")
	public String show() {

		return "Hello";
		
	}
}
