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
		User user1 = new User("KBEE123", "1234", "sjsin0905@naver.com", "김국민", "001225-3823453", "010-3142-1453");
		User user2 = new User("ljm", "1234", "Jumo@naver.com", "이준모", "990905-11111111", "010-1234-3211");
		User user3 = new User("jdh", "1234", "AllHyeon@naver.com", "정다현", "960905-21111111", "010-3213-4345");
		User user4 = new User("jsy", "1234", "YooJaeSuk@naver.com", "정승윤", "960905-11111111", "010-3336-3434");
		User user5 = new User("lcy", "1234", "JejuGirl@naver.com", "이채영", "000905-41111111", "010-5533-2322");
		User user6 = new User("ljw", "1234", "1jjang@naver.com", "이주원", "000905-41111111", "010-8234-2234");
		User user7 = new User("cyh", "1234", "sjsin0905@naver.com", "조용훈", "980905-1011111", "010-3211-5476");
		
		
//		userDAO.register(user1);
//		userDAO.register(user2);
//		userDAO.register(user3);
//		userDAO.register(user4);
//		userDAO.register(user5);
//		userDAO.register(user6);
//		userDAO.register(user7);
//
//		System.out.println("회원 등록 완료");
//
//		System.out.println("========2. 외부계좌 등록합니다 ==============");
//		
//		userDAO.addExternalAccount(user1, "국민 2232-00-2231");
//		userDAO.addExternalAccount(user1, "국민 7732-11-3122");
//		
//		userDAO.addExternalAccount(user2, "국민 2232-00-2231");
//		userDAO.addExternalAccount(user2, "국민 7732-11-3122");
//		
//		userDAO.addExternalAccount(user3, "국민 2232-00-2231");
//		userDAO.addExternalAccount(user3, "국민 7732-11-3122");
//		
//		userDAO.addExternalAccount(user4, "국민 2232-00-2231");
//		userDAO.addExternalAccount(user4, "국민 7732-11-3122");
//		
//		userDAO.addExternalAccount(user5, "국민 2232-00-2231");
//		userDAO.addExternalAccount(user5, "국민 7732-11-3122");
//		
//		userDAO.addExternalAccount(user6, "국민 2232-00-2231");
//		userDAO.addExternalAccount(user6, "국민 7732-11-3122");
//		
//		userDAO.addExternalAccount(user7, "국민 2232-00-2231");
//		userDAO.addExternalAccount(user7, "국민 7732-11-3122");
		
		
		
		
		
		/////////////////////////////////////////////////////////////////////////////////////////////////////////
		
		
		
		
		
		
		Product product1 = new Product();
		product1.setProductId(1);
		
		Product product2 = new Product();
		product2.setProductId(2);
		
		Product product3 = new Product();
		product3.setProductId(3);
		
		Product product13 = new Product();
		product13.setProductId(13);
		
		Product product19 = new Product();
		product19.setProductId(19);
		
		Product product15 = new Product();
		product15.setProductId(15);
		
		Product product20 = new Product();
		product20.setProductId(20);
		
		Product product21 = new Product();
		product21.setProductId(21);
		
		Product product22 = new Product();
		product22.setProductId(22);
	
		Product product23 = new Product();
		product23.setProductId(23);

		System.out.println("========3. 거래 진행합니다 ==============");
		
		
		System.out.println("========user1 거래 진행합니다 ==============");
		
		tradeLogDAO.trade(user1, product1, 3);
		
		tradeLogDAO.trade(user1, product2, 6);
		
		tradeLogDAO.trade(user1, product3, 25);
		
		tradeLogDAO.trade(user1, product13, 1);
		
		tradeLogDAO.trade(user1, product19, 10);
		
		tradeLogDAO.trade(user1, product15, 5);
		
		tradeLogDAO.trade(user1, product20, 5);
		
		tradeLogDAO.trade(user1, product21, 10);
		
		tradeLogDAO.trade(user1, product22, 7);
		
		tradeLogDAO.trade(user1, product1, 2);
		
		tradeLogDAO.trade(user1, product1, 10);
		
		tradeLogDAO.trade(user1, product1, 2);
		
		tradeLogDAO.trade(user1, product1, 10);
		
		System.out.println("========user2 거래 진행합니다 ==============");
		
		tradeLogDAO.trade(user2, product1, 3);
		
		tradeLogDAO.trade(user2, product2, 6);
		
		tradeLogDAO.trade(user2, product3, 1);
		
		tradeLogDAO.trade(user2, product13, 3);
		
		tradeLogDAO.trade(user2, product19, 3);
		
		tradeLogDAO.trade(user2, product15, 3);
		
		tradeLogDAO.trade(user2, product20, 3);
		
		tradeLogDAO.trade(user2, product21, 3);
		
		tradeLogDAO.trade(user2, product22, 30);
		
		tradeLogDAO.trade(user2, product23, 30);
		
		
		System.out.println("========user3 거래 진행합니다 ==============");
		
		tradeLogDAO.trade(user3, product1, 3);
		
		tradeLogDAO.trade(user3, product2, 6);
		
		tradeLogDAO.trade(user3, product3, 10);
		
		tradeLogDAO.trade(user3, product13, 3);
		
		tradeLogDAO.trade(user3, product19, 3);
		
		tradeLogDAO.trade(user3, product15, 30);
		
		tradeLogDAO.trade(user3, product20, 3);
		
		tradeLogDAO.trade(user3, product21, 3);
		
		tradeLogDAO.trade(user3, product22, 10);
	
		tradeLogDAO.trade(user3, product23, 3);
		
		
		System.out.println("========user4 거래 진행합니다 ==============");
		
		tradeLogDAO.trade(user4, product1, 30);
		
		tradeLogDAO.trade(user4, product2, 6);
		
		tradeLogDAO.trade(user4, product3, 1);
		
		tradeLogDAO.trade(user4, product13, 3);
		
		tradeLogDAO.trade(user4, product19, 10);
		
		tradeLogDAO.trade(user4, product15, 3);
		
		tradeLogDAO.trade(user4, product20, 3);
		
		tradeLogDAO.trade(user4, product21, 3);
		
		tradeLogDAO.trade(user4, product22, 3);
		
		tradeLogDAO.trade(user4, product23, 2);
		
		
		
		System.out.println("========user5 거래 진행합니다 ==============");
		
		tradeLogDAO.trade(user5, product1, 3);
		
		tradeLogDAO.trade(user5, product2, 3);
		
		tradeLogDAO.trade(user5, product3, 1);
		
		tradeLogDAO.trade(user5, product13, 3);
		
		tradeLogDAO.trade(user5, product19, 30);
		
		tradeLogDAO.trade(user5, product15, 3);
		
		tradeLogDAO.trade(user5, product20, 3);
		
		tradeLogDAO.trade(user5, product21, 3);
		
		tradeLogDAO.trade(user5, product22, 3);
	
		tradeLogDAO.trade(user5, product23, 9);	
		
		
		System.out.println("========user6 거래 진행합니다 ==============");
		
		tradeLogDAO.trade(user6, product1, 9);
		
		tradeLogDAO.trade(user6, product2, 6);
		
		tradeLogDAO.trade(user6, product3, 10);
		
		tradeLogDAO.trade(user6, product13, 3);
		
		tradeLogDAO.trade(user6, product19, 3);
		
		tradeLogDAO.trade(user6, product15, 3);
		
		tradeLogDAO.trade(user6, product20, 3);
		
		tradeLogDAO.trade(user6, product21, 3);
		
		tradeLogDAO.trade(user6, product22, 3);
		
		tradeLogDAO.trade(user6, product23, 3);
		
		System.out.println("========user7 거래 진행합니다 ==============");
		
		tradeLogDAO.trade(user7, product1, 30);
		
		tradeLogDAO.trade(user7, product2, 60);
		
		tradeLogDAO.trade(user7, product3, 50);
		
		tradeLogDAO.trade(user7, product13, 30);
		
		tradeLogDAO.trade(user7, product19, 30);
		
		tradeLogDAO.trade(user7, product15, 3);
		
		tradeLogDAO.trade(user7, product20, 3);
		
		tradeLogDAO.trade(user7, product21, 30);
		
		tradeLogDAO.trade(user7, product22, 30);
		
		tradeLogDAO.trade(user7, product23, 30);
		
	
	}
}