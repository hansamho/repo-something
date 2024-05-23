package com.something.infra.review;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ReviewController {

	@RequestMapping(value = "/usrReviewList")
	public String usrReviewList() {
		
		return "usr/infra/index/reviewList";
	}
	
	@RequestMapping(value = "/usrReviewReg")
	public String usrReviewReg() {
		
		return "usr/infra/index/reviewReg";
	}
	
}
