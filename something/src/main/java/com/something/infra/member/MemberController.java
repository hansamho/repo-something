package com.something.infra.member;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MemberController {

	@RequestMapping(value = "/usrindex")
	public String usrindex() {
		
		return "usrindex";
	}

}
