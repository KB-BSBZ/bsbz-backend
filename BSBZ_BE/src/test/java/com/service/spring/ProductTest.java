package com.service.spring;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Commit;
import org.springframework.transaction.annotation.Transactional;

import com.service.spring.dao.ProductDAO;
import com.service.spring.domain.Product;

@SpringBootTest
@Transactional
@Commit
public class ProductTest {
	@Autowired
	private ProductDAO productDAO;

	@Test
	public void unitTest() throws Exception {
		// 전체 상품 조회
		System.out.println("=============== 전체 상품 출력하기 ===============");
		for (Product t : productDAO.showAllProducts(""))
			System.out.println(t.toString());
		System.out.println();

		System.out.println("=============== 음악저작권 ===============");
		for (Product p : productDAO.showAllMusicCopyright(""))
			System.out.println(p);
		System.out.println();

		Product temp = new Product();
		temp.setProductId(10);
		System.out.println("=============== 디테일 보기 ===============");
		System.out.println(productDAO.showDetail(temp));

		// 정보 수정
		/*
		 * Product temp1 = new Product();
		 * temp1.setProductId(10);
		 * temp1.setExtra("정보 수정 중~~");
		 * temp1.setProfileUrl("업뎃");
		 * temp1.setImageUrl("수정수정");
		 */
		// productDAO.updateProductInfo(temp);

	}
}