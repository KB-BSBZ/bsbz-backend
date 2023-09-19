package com.service.spring;

import java.util.List;
import java.util.Map;

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
public class UserInsertTest {
	@Autowired
	private UserDAO userDAO;

	@Autowired
	private TradeLogDAO tradeLogDAO;

	@Test
	public void unitTest() throws Exception {

		System.out.println("========1. register User ==============");
		User user1 = new User("cyh", "1234", "sjsin0905@naver.com", "조용훈", "980905-11111111", "010-8666-2990");
		User user2 = new User("ljm", "1234", "Jumo@naver.com", "이준모", "990905-11111111", "010-1234-3211");
		User user3 = new User("jdh", "1234", "AllHyeon@naver.com", "정다현", "960905-21111111", "010-3213-4345");
		User user4 = new User("jsy", "1234", "YooJaeSuk@naver.com", "정승윤", "960905-11111111", "010-3336-3434");
		User user5 = new User("lcy", "1234", "JejuGirl@naver.com", "이채영", "000905-41111111", "010-5533-2322");
		User user6 = new User("ljw", "1234", "1jjang@naver.com", "이주원", "000905-41111111", "010-8234-2234");
		
		
		userDAO.register(user1);
		userDAO.register(user2);
		userDAO.register(user3);
		userDAO.register(user4);
		userDAO.register(user5);
		userDAO.register(user6);
		System.out.println("회원 등록 완료");

		System.out.println("========2. 외부계좌 등록합니다 ==============");
		
		userDAO.addExternalAccount(user1, "국민 1111");
		userDAO.addExternalAccount(user1, "국민 2222");
		
		userDAO.addExternalAccount(user2, "국민 1111");
		userDAO.addExternalAccount(user2, "국민 2222");
		
		userDAO.addExternalAccount(user3, "국민 1111");
		userDAO.addExternalAccount(user3, "국민 2222");
		
		userDAO.addExternalAccount(user4, "국민 1111");
		userDAO.addExternalAccount(user4, "국민 2222");
		
		userDAO.addExternalAccount(user5, "국민 1111");
		userDAO.addExternalAccount(user5, "국민 2222");
		
		userDAO.addExternalAccount(user6, "국민 1111");
		userDAO.addExternalAccount(user6, "국민 2222");
		
		Product product1 = new Product();
		product1.setProductId(1);
		
		Product product2 = new Product();
		product2.setProductId(2);
		
		Product product3 = new Product();
		product3.setProductId(3);
		
		Product product10 = new Product();
		product10.setProductId(10);
		
		Product product11 = new Product();
		product11.setProductId(11);
		
		Product product12 = new Product();
		product12.setProductId(12);
		
		Product product13 = new Product();
		product13.setProductId(13);
		
		Product product14 = new Product();
		product14.setProductId(14);
		
		Product product22 = new Product();
		product22.setProductId(22);
		
		Product product23 = new Product();
		product23.setProductId(23);
		
		Product product24 = new Product();
		product24.setProductId(24);

		System.out.println("========3. 거래 진행합니다 ==============");
		System.out.println("========user1 거래 진행합니다 ==============");
		
		tradeLogDAO.trade(user1, product1, 30);
		tradeLogDAO.trade(user1, product1, -30);
		
		tradeLogDAO.trade(user1, product2, 60);
		
		tradeLogDAO.trade(user1, product3, 100);
		
		tradeLogDAO.trade(user1, product10, 40);
		
		tradeLogDAO.trade(user1, product12, 30);
		
		tradeLogDAO.trade(user1, product22, 30);
		
		tradeLogDAO.trade(user1, product23, 30);
		
		System.out.println("========user2 거래 진행합니다 ==============");
		
		tradeLogDAO.trade(user2, product1, 30);
		tradeLogDAO.trade(user2, product1, -30);
		
		tradeLogDAO.trade(user2, product2, 60);
		
		tradeLogDAO.trade(user2, product3, 90);
		
		tradeLogDAO.trade(user2, product10, 40);
		
		tradeLogDAO.trade(user2, product12, 30);
		
		tradeLogDAO.trade(user2, product22, 20);
		
		tradeLogDAO.trade(user2, product23, 10);
		
		
		System.out.println("========user3 거래 진행합니다 ==============");
		
		tradeLogDAO.trade(user3, product1, 30);
		tradeLogDAO.trade(user3, product1, -30);
		
		tradeLogDAO.trade(user3, product2, 60);
		
		tradeLogDAO.trade(user3, product3, 100);
		
		tradeLogDAO.trade(user3, product14, 10);
		
		tradeLogDAO.trade(user3, product12, 30);
		
		tradeLogDAO.trade(user3, product22, 30);
		
		tradeLogDAO.trade(user3, product23, 30);
		
		
		System.out.println("========user4 거래 진행합니다 ==============");
		
		tradeLogDAO.trade(user4, product1, 30);
		tradeLogDAO.trade(user4, product1, -30);
		
		tradeLogDAO.trade(user4, product2, 60);
		
		tradeLogDAO.trade(user4, product3, 100);
		
		tradeLogDAO.trade(user4, product10, 40);
		
		tradeLogDAO.trade(user4, product14, 30);
		
		tradeLogDAO.trade(user4, product22, 30);
		
		tradeLogDAO.trade(user4, product24, 40);
		
		
		
		System.out.println("========user5 거래 진행합니다 ==============");
		
		tradeLogDAO.trade(user5, product1, 30);
		tradeLogDAO.trade(user5, product1, -30);
		
		tradeLogDAO.trade(user5, product2, 60);
		
		tradeLogDAO.trade(user5, product3, 200);
		
		tradeLogDAO.trade(user5, product10, 40);
		
		tradeLogDAO.trade(user5, product12, 10);
		
		tradeLogDAO.trade(user5, product22, 30);
		
		tradeLogDAO.trade(user5, product23, 30);
		
		
		
		System.out.println("========user6 거래 진행합니다 ==============");
		
		tradeLogDAO.trade(user6, product1, 30);
		tradeLogDAO.trade(user6, product1, -30);
		
		tradeLogDAO.trade(user6, product2, 60);
		
		tradeLogDAO.trade(user6, product3, 20);
		
		tradeLogDAO.trade(user6, product10, 40);
		
		tradeLogDAO.trade(user6, product12, 30);
		
		tradeLogDAO.trade(user6, product22, 200);
		
		tradeLogDAO.trade(user6, product24, 20);
		
	
	}
}