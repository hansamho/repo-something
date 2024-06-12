package com.something.infra.match;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.something.infra.codegroup.CodeGroupService;
import com.something.infra.member.MemberDto;
import com.something.infra.member.MemberService;

import jakarta.servlet.http.HttpSession;

@Controller
public class MatchController {

	@Autowired
	MemberService mbService;
	
	@Autowired
	MatchService service;
	
	@Autowired
	CodeGroupService codeGroupService;
	
	@RequestMapping(value = "/usrmatch")
	public String usrmatch(MatchDto dto,MatchVo vo,MemberDto mdto,Model model,HttpSession httpSession) {
		
		vo.setParamsPaging(service.selectOneCount(vo));
				
		if (vo.getTotalRows() > 0) {
			model.addAttribute("list", service.matchList(vo));
		}
		
		return "usr/infra/index/match";
	}
	
}
