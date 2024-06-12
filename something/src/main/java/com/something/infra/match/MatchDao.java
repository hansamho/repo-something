package com.something.infra.match;

import java.util.List;

public interface MatchDao {
	
	public List<MatchVo> matchList(MatchVo vo);
	
	public int selectOneCount(MatchVo vo);
}
