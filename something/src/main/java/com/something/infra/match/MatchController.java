package com.something.infra.match;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.something.infra.member.MemberDto;
import com.something.infra.member.MemberService;

import jakarta.servlet.http.HttpSession;

@Controller
public class MatchController {

	
	@RequestMapping(value = "/usrmatch")
	public String usrmatch() {
		
		
		
		return "usr/infra/index/match";
	}
	
}
