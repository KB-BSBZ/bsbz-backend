package com.service.spring;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Commit;
import org.springframework.transaction.annotation.Transactional;

import com.service.spring.dao.UserDAO;
import com.service.spring.domain.User;

@SpringBootTest
@Transactional
@Commit
public class UserTest {
	@Autowired
	private UserDAO userDAO;

	@Test
	public void unitTest() throws Exception {
		System.out.println("========1. register User ==============");
		User user = new User();
		user.setUserId("2oo1");
		user.setPassword("2oo1");
		user.setEmail("leejoowon0817@gmail.com");
		user.setSsn("000817-0000000");
		user.setUserName("이주하");
		user.setPhoneNum("010-7175-0000");

		// 아이디 중복 확인
		// System.out.println(userDAO.idExist("joowon817"));
		// 회원가입
		// userDAO.register(user);
		// 로그인
		// System.out.println(userDAO.login(user));

		// 회원 정보 수정
		/*
		 * User user1 = new User();
		 * user1.setUserId("2oo1"); 
		 * user1.setPassword("2oo1");
		 * user1.setEmail("leejoowon0817@gmail.com");
		 * user1.setSsn("000817-0000000");
		 * user1.setUserName("이주하");
		 * user1.setPhoneNum("010-0000-0000");
		 * userDAO.updateUserInfo(user1);
		 */
		// 외부계좌 등록
		System.out.println("진입 전");
		userDAO.addExternalAccount(user, "국민 3435");

	}
}