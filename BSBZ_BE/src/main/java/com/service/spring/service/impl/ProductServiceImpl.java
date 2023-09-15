package com.service.spring.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.service.spring.dao.ProductDAO;
import com.service.spring.dao.UserDAO;
import com.service.spring.domain.Product;
import com.service.spring.service.ProductService;

@Repository
public class ProductServiceImpl implements ProductService {

	@Autowired
	private ProductDAO productDAO;

	@Override
	public List<Product> showAllProducts(String orderType) throws Exception {
		return productDAO.showAllProducts(orderType);
	}

	@Override
	public List<Product> showAllArts(String orderType) throws Exception {
		return productDAO.showAllArts(orderType);
	}

	@Override
	public List<Product> showAllLuxuries(String orderType) throws Exception {
		return productDAO.showAllLuxuries(orderType);
	}

	@Override
	public List<Product> showAllRealEstate(String orderType) throws Exception {
		return productDAO.showAllRealEstate(orderType);
	}

	@Override
	public List<Product> showAllMusicCopyright(String orderType) throws Exception {
		return productDAO.showAllMusicCopyright(orderType);
	}

	@Override
	public List<Product> searchProduct(String word, String orderType) throws Exception {
		return productDAO.searchProduct(word, orderType);
	}

	@Override
	public Product showDetail(Product product) throws Exception {
		return productDAO.showDetail(product);
	}

	@Override
	public void updateProductInfo(Product product) throws Exception {
		productDAO.updateProductInfo(product);
	}

	@Override
	public List<Product> showPortfolio() throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Product> recommendRealEstateProducts() throws Exception {
		return productDAO.recommendRealEstateProducts();
	}

	@Override
	public List<Product> recommendLuxuryProducts() throws Exception {
		return productDAO.recommendLuxuryProducts();
	}

	@Override
	public List<Product> recommendMusicCopyrightProducts() throws Exception {
		return productDAO.recommendMusicCopyrightProducts();
	}
	
}