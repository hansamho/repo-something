package com.something.infra.match;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MatchController {

	@RequestMapping(value = "/usrmatch")
	public String usrmatch() {
		
		return "usr/infra/match/match";
	}
	@RequestMapping(value = "/tes")
	public String tes() {
		
		return "element";
	}
	
}
