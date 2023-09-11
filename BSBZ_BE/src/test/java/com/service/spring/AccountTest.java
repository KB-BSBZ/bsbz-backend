package com.service.spring;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Commit;
import org.springframework.transaction.annotation.Transactional;

import com.service.spring.dao.BBAccountDAO;
import com.service.spring.dao.TradeLogDAO;
import com.service.spring.dao.UserDAO;
import com.service.spring.domain.Product;
import com.service.spring.domain.TradeLog;
import com.service.spring.domain.User;

@SpringBootTest
@Transactional
@Commit
public class AccountTest {
	
	@Autowired 
	BBAccountDAO bbAccountDAO;

	@Test
	public void unitTest() throws Exception {
		System.out.println("======== Account Test ========");
		User user = new User();
		user.setUserId("lcy923");
		user.setPassword("1oo1");
		user.setEmail("lee11@gmail.com");
		user.setSsn("001234-0000000");
		user.setUserName("이하");
		user.setPhoneNum("010-7185-0000");
		
		Product product = new Product();
		product.setProductId(11);

		
		System.out.println("진입 전");
		System.out.println(user.getUserId()+"님의 계좌 잔액은 " + bbAccountDAO.showBalance(user) +"원 입니다.");
		System.out.println("입금 진행");
		bbAccountDAO.deposit(user, 100000);
		System.out.println(user.getUserId()+"님의 계좌 잔액은 " + bbAccountDAO.showBalance(user) +"원 입니다.");
		System.out.println("출금 진행");
		bbAccountDAO.withdraw(user, 10000);
		System.out.println(user.getUserId()+"님의 계좌 잔액은 " + bbAccountDAO.showBalance(user) +"원 입니다.");
		
	}
}