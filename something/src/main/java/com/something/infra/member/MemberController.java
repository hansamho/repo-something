package com.something.infra.member;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.something.common.constants.Constants;

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
	public String roomReg() {
		
		return "usr/infra/index/roomReg";
	}
	
	@RequestMapping(value="/usrMyPage")
	public String usrMyPage(MemberDto dto,Model model,HttpSession httpSession) throws Exception{
		
		dto.setIfmmSeq((String)httpSession.getAttribute("sessSeqUsr"));
		
		model.addAttribute("item", service.selectOne(dto));
		
		return "usr/infra/index/myPage";
	}
	
	@RequestMapping(value = "/usrSearch")
	public String usrSearch() {
		
		return "usr/infra/index/friendserach";
	}
	
	@RequestMapping(value = "/usrlogin")
	public String usrlogin(MemberDto dto) throws Exception {
		
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
			httpSession.setAttribute("sessSeqUsr", rtId.getIfmmSeq());
			httpSession.setAttribute("sessIdUsr", rtId.getIfmmId());
			httpSession.setAttribute("sessNameUsr", rtId.getIfmmName());
			
			System.out.println("---------------------");
			System.out.println("httpSession.getAttribute(\"sessIdUsr\"): " + httpSession.getAttribute("sessIdUsr"));
			System.out.println("---------------------");
			
			if(dto.getIfmmId().equals(rtId.getIfmmId())) {
				if(dto.getIfmmPwd().equals(rtId.getIfmmPwd()))   {
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
	
	//로그아웃
	@ResponseBody
	@RequestMapping(value = "/usrSignOut")
	public Map<String, Object> signoutUsr(MemberDto dto, HttpSession httpSession) throws Exception {
		Map<String, Object> returnMap = new HashMap<String, Object>();
		
		returnMap.put("rt", "success");
		httpSession.invalidate();
		return returnMap;
	}
	
	@RequestMapping(value = "/usrRegister")
	public String usrRegister(MemberDto dto,Model model) throws Exception{
		
		return "usr/infra/index/register";
	}
	
	@RequestMapping(value = "/usrMatchList")
	public String usrMatchList(MemberDto dto,Model model,HttpSession httpSession) {
		
		dto.setIfmmSeq((String)httpSession.getAttribute("sessSeqUsr"));
		
		model.addAttribute("item", service.selectOne(dto));
		
		return "usr/infra/index/matchList";
	}
	
	@RequestMapping(value="/insert")
	public String insert(MemberDto dto) throws Exception {
		 
		service.insert(dto);
		
		return "redirect:/usrlogin";
	}
	
	
	// 암호화
	public String encodeBcrypt(String planeText, int strength) {
		  return new BCryptPasswordEncoder(strength).encode(planeText);
	}

			
	public boolean matchesBcrypt(String planeText, String hashValue, int strength) {
	  BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder(strength);
	  return passwordEncoder.matches(planeText, hashValue);
	}
		
}
