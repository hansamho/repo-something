package com.something.infra.member;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MemberService {

	@Autowired
	MemberDao dao;
	
	public MemberDto selectLogin(MemberDto dto) {

		return dao.selectLogin();
	}
}
