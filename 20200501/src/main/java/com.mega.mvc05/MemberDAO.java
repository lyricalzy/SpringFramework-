package com.mega.mvc05;
// 평범한 자바 파일: POJO(Plain Old Java Object)

import java.util.ArrayList;

//import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

@Repository // @Component // 어노테이션
public class MemberDAO {
	public ArrayList<String> select(String find) {
		ArrayList<String> list = new ArrayList<>();
		if (find.equals("자동차")) {
			list.add("벤츠");
			list.add("BMW");
			list.add("소렌토");
		} else {
			list.add("보잉747");
			list.add("콩코드");
			list.add("F-15K");
		}

		return list;
	}

	public void insert(MemberDTO dto) {
		System.out.println("dao에서 받은 dto내용\n" + dto);
	}

	public int login(MemberDTO dto) {
		int result = 0; // 로그인 실패. id, pw가 안맞음
		String id = "root";
		String pw = "1234";
		if (id.equals(dto.getId()) && pw.equals(dto.getPw())) {
			result = 1; // 로그인 성공. id, pw가 맞음
		}
		return result;
	}
}
