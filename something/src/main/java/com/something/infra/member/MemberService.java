package com.something.infra.member;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MemberService {

	@Autowired
	MemberDao dao;
	
	public MemberDto selectOne(MemberDto dto) {
		return dao.selectOne(dto);
	}
	
	public MemberDto selectLogin(MemberDto dto) {

		return dao.selectLogin(dto);
	}
	
	public int insert(MemberDto dto) {
		return dao.insert(dto);
	}
}
