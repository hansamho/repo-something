package com.something.infra.member;

public interface MemberDao {
	
	
	public MemberDto selectOne(MemberDto dto);

	public int insert(MemberDto dto);
	
	public MemberDto selectLogin(MemberDto dto);
}
