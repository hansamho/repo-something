package com.something.infra.test;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TestController {
	
	@RequestMapping(value = "/usrLogin")
	public String usrLogin() {
		
		return "usr/infra/index/login";
	}
	
	@RequestMapping(value = "/usrRegister")
	public String usrRegister() {
		
		return "usr/infra/index/register";
	}

}
