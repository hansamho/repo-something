package com.something.infra.codegroup;

import java.util.List;

public interface CodeGroupDao {
	
	public List<CodeGroupDto> selectListWithoutPaging();

}
