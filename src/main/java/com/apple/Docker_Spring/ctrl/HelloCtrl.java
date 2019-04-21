package com.apple.Docker_Spring.ctrl;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("rest/docker")
public class HelloCtrl {
	
	@GetMapping("/hello")
	public String hello(){
		return "Hello Dcoker Testing ";
	}

}
