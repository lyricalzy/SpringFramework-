package com.mega.mvc07;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class EvalDAO {
	@Autowired
	SqlSessionTemplate my;

	public List<EvalDTO> all(EvalDTO dto) {
		List<EvalDTO> list = my.selectList("eval.all", dto);
		return list;
	}

	public void add(EvalDTO dto) {
		my.insert("eval.add", dto);
	}

}
