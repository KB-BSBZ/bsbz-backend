package com.service.spring;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Commit;
import org.springframework.transaction.annotation.Transactional;

import com.service.spring.dao.TradeLogDAO;
import com.service.spring.dao.UserDAO;
import com.service.spring.domain.Product;
import com.service.spring.domain.TradeLog;
import com.service.spring.domain.User;

@SpringBootTest
@Transactional
@Commit
public class UserTest {
	@Autowired
	private UserDAO userDAO;
	
	@Autowired 
	private TradeLogDAO tradeLogDAO;

	@Test
	public void unitTest() throws Exception {
		System.out.println("========1. register User ==============");
		User user = new User();
		user.setUserId("jsw9696");
		user.setPassword("jsw9696");
		user.setEmail("jsw9696@gmail.com");
		user.setSsn("001234-0000000");
		user.setUserName("정승윤");
		user.setPhoneNum("010-2345-0000");
		
		Product product = new Product();
		product.setProductId(11);
		
		
		// 아이디 중복 확인
		//System.out.println("아이디 중복 확인"+userDAO.idExist("joown817"));
		// 회원가입
		userDAO.register(user);
		// 로그인
		//System.out.println("로그인 확인"+userDAO.login(user));
		// 외부계좌 등록
		//userDAO.addExternalAccount(user, "국민 3435");
		//userDAO.deleteExternalAccount(user, "국민 3435");

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
		
		System.out.println("진입 전");
		
		
		
		//tradeLogDAO.trade(user, product, -1);
		/*
		List<TradeLog> temp = userDAO.userTradeLog(user);
		for(TradeLog t : temp) {
			System.out.println(t.toString());
		}
		
		System.out.println(user.getUserId() + "님의 총 보유 로얄 수 : " + userDAO.totalRoyals(user));
		 */
//		List<TradeLog> temp2 = userDAO.ownProducts(user);
//		for(TradeLog t : temp2) {
//			System.out.println(t.toString());
//		}
		
	}
}