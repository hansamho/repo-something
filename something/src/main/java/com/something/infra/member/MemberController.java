package com.something.infra.member;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MemberController {

	@RequestMapping(value = "/usrindex")
	public String usrindex() {
		
		return "usr/infra/index/index";
	}
	
	@RequestMapping(value="/roomReg")
	public String usrlogin() {
		
		return "usr/infra/index/roomReg";
	}
	
	@RequestMapping(value="/usrMyPage")
	public String usrMyPage() {
		
		return "usr/infra/index/myPage";
	}
	
	@RequestMapping(value = "/usrSearch")
	public String usrSearch() {
		
		return "usr/infra/index/friendserach";
	}
	
	@RequestMapping(value = "/usrLogin")
	public String usrLogin() {
		
		return "usr/infra/index/login";
	}
	
	@RequestMapping(value = "/usrRegister")
	public String usrRegister() {
		
		return "usr/infra/index/register";
	}
		
}
