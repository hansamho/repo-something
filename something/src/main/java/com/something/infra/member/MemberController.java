package com.something.infra.member;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MemberController {

	@RequestMapping(value = "/usrindex")
	public String usrindex() {
		
		return "usr/infra/index/index";
	}
	
	@RequestMapping(value="/usrlogin")
	public String usrlogin() {
		
		return "usr/infra/index/login";
	}
	
	@RequestMapping(value="/usrMyPage")
	public String usrMyPage() {
		
		return "usr/infra/index/myPage";
	}
	
	@RequestMapping(value = "/usrSearch")
	public String usrSearch() {
		
		return "usr/infra/index/friendserach";
	}
	
	@RequestMapping(value="/test")
	public String test() {
		return "usr/infra/index/login1";
	}
}
