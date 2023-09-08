package com.service.spring;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Commit;
import org.springframework.transaction.annotation.Transactional;

import com.service.spring.dao.ProductDAO;

@SpringBootTest
@Transactional
@Commit
public class ProductTest {
	@Autowired
	private ProductDAO productDAO;

	@Test
	public void unitTest() throws Exception {
		// 전체 상품 조회 
		// System.out.println(productDAO.showAllProducts());
		System.out.println(productDAO.showAllArts(""));
	}
}