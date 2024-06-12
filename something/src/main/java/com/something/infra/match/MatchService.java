package com.something.infra.match;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MatchService {
	
	@Autowired
	MatchDao dao;
	
	public List<MatchVo> matchList(MatchVo vo){
		
		return dao.matchList(vo);
	}
	
	public int selectOneCount(MatchVo vo) {
		
		return dao.selectOneCount(vo);
	}
}
