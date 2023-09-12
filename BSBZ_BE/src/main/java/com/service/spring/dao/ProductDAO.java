package com.service.spring.dao;

import java.util.List;
import com.service.spring.domain.Product;

public interface ProductDAO {

	// 전체 상품 보기
	List<Product> showAllProducts(String orderType) throws Exception;

	// 카테고리별 상품 보기
	List<Product> showAllArts(String orderType) throws Exception;

	List<Product> showAllLuxuries(String orderType) throws Exception;

	List<Product> showAllRealEstate(String orderType) throws Exception;

	List<Product> showAllMusicCopyright(String orderType) throws Exception;

	// 상품 상세 정보 보기
	Product showDetail(Product product) throws Exception;

	// 로얄 수 업뎃(남은 로얄 수)
	void updateProductInfo(Product product) throws Exception;

	// 추천 포토폴리오
	List<Product> showPortfolio() throws Exception;
}