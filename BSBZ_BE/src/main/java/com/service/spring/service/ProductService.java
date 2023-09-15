package com.service.spring.service;

import java.util.List;
import com.service.spring.domain.Product;

public interface ProductService {

	// 전체 상품 보기
	List<Product> showAllProducts(String orderType) throws Exception;

	// 카테고리별 상품 보기
	List<Product> showAllArts(String orderType) throws Exception;

	List<Product> showAllLuxuries(String orderType) throws Exception;

	List<Product> showAllRealEstate(String orderType) throws Exception;

	List<Product> showAllMusicCopyright(String orderType) throws Exception;

	// 상품 검색
	List<Product> searchProduct(String word, String orderType) throws Exception;

	// 상품 상세 정보 보기
	Product showDetail(Product product) throws Exception;

	// 로얄 수 업뎃(남은 로얄 수)
	void updateProductInfo(Product product) throws Exception;

	// 추천 포토폴리오
	List<Product> showPortfolio() throws Exception;
	
	// 부동산 추천
	List<Product> recommendRealEstateProducts() throws Exception;
	
	// 럭셔리 추천
	List<Product> recommendLuxuryProducts() throws Exception;
		
	// 음악 저작권 추천
	List<Product> recommendMusicCopyrightProducts() throws Exception;
}