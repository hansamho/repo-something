package com.something.infra.review;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ReviewController {

	@RequestMapping(value = "/usrReview")
	public String usrReview() {
		
		return "usr/infra/match/review";
	}
	
}
