package com.service.spring;

import java.util.List;

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
		List<Product> temp2 = productDAO.showAllProducts("");
		for(Product t : temp2) {
			System.out.println(t.toString());
		}
		System.out.println("음악저작권 다 보여주기~");

		for (Product p : productDAO.showAllMusicCopyright("")) System.out.println(p);


		System.out.println("디테일 보기");


		// 정보 수정
		Product temp = new Product();
		temp.setProductId(10);
		temp.setExtra("정보 수정 중~~");
		temp.setProfileUrl("업뎃");
		temp.setImageUrl("수정수정");
		//productDAO.updateProductInfo(temp);
		System.out.println(productDAO.showDetail(temp));
	}
}