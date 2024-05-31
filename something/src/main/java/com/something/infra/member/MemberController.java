package com.something.infra.member;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import jakarta.servlet.http.HttpSession;

@Controller
public class MemberController {
	
	@Autowired
	MemberService service;

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
	
	@ResponseBody
	@RequestMapping(value = "/usrSignin")
	public Map<String, Object> usrSignin(MemberDto dto, HttpSession httpSession) throws Exception {
		Map<String, Object> returnMap = new HashMap<String, Object>();

		MemberDto rtId = service.selectLogin(dto);
		
		System.out.println(dto.toString());
		// 아이디, 패스워드를 통해서 회원인지 아닌지 여부 조회
		if(rtId != null) {
			
			httpSession.setMaxInactiveInterval(60 * Constants.SESSION_MINUTE_XDM); // 60second * 30 = 30minute
			httpSession.setAttribute("sessSeqUsr", rtId.getMemberSeq());
			httpSession.setAttribute("sessIdUsr", rtId.getMemberId());
			httpSession.setAttribute("sessNameUsr", rtId.getMemberName());
			
			System.out.println("---------------------");
			System.out.println("httpSession.getAttribute(\"sessNameXdm\"): " + httpSession.getAttribute("sessNameXdm"));
			System.out.println("---------------------");
			
			if(dto.getMemberId().equals(rtId.getMemberId())) {
				if(matchesBcrypt(dto.getMemberPwd(),rtId.getMemberPwd(),10) )  {
					returnMap.put("rt", "success");
					System.out.println("111111111111111");
				}else {
					returnMap.put("rt", "pwdfail");
					System.out.println("22222222222222222");
				}
			}else {
				returnMap.put("rt", "idfail");
				System.out.println("3333333333333333333333333");
			}
		}else {
			System.out.println("444444444444444444444444444");
			returnMap.put("rt", "notId");
		}
			return returnMap;
			
	}
	
	@RequestMapping(value = "/usrRegister")
	public String usrRegister() {
		
		return "usr/infra/index/register";
	}
	
	@RequestMapping(value = "/usrMatchList")
	public String usrMatchList() {
		
		return "usr/infra/index/matchList";
	}
		
}
