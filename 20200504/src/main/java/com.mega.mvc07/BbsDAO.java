package com.mega.mvc08;


import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class BbsDAO {
	@Autowired
	SqlSessionTemplate my;

	public void insert(BbsDTO dto) {
		my.insert("bbs.insert", dto);
	}
	
	public void delete(BbsDTO dto) {
		my.delete("bbs.delete", dto);
	}
	
	public void update(BbsDTO dto) {
		my.update("bbs.update", dto);
	}
}
