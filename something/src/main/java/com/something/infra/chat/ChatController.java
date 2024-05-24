package com.something.infra.chat;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ChatController {

	@RequestMapping(value="/chat")
	public String chat()throws Exception{
		
		return "usr/infra/index/chat";
	}
	
}
