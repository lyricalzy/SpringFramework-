package com.mini.minishop;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ShopDAO {
	@Autowired
	SqlSessionTemplate my;

	public List<ShopDTO> list(Pagination page) {
		List<ShopDTO> list = my.selectList("shop.list", page);
		return list;
	}

	public ShopDTO select(ShopDTO dto) {
		ShopDTO dto2 = my.selectOne("shop.select", dto);
		return dto2;
	}

	public ShopDTO delete(ShopDTO dto) {
		my.delete("shop.delete", dto);
		return dto;
	}

	public ShopDTO update(ShopDTO dto) {
		my.update("shop.update", dto);
		return dto;
	}

	public int countRow() {
		return my.selectOne("shop.countRow");
	}
}
