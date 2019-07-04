package com.example.demo.controller;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class BootController {

	@ResponseBody
	@RequestMapping("/request")
	public String request() {
		return "hello echo";
	}
	
	@RequestMapping("/welcome")
	public String welcome(Map<String, Object> map) {
		
		map.put("welcome", "welcome to thymealeaf");
		
		return "result";
	}
}
