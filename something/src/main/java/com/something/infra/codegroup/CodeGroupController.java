package com.something.infra.codegroup;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class CodeGroupController {
	
	@Autowired
	CodeGroupService service;
	
	
}
