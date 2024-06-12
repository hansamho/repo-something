package com.something.infra.codegroup;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CodeGroupService {

	@Autowired
	CodeGroupDao dao;
	
	public List<CodeGroupDto> selectListWithoutPaging(){
		
		return dao.selectListWithoutPaging();
				
	}
}
