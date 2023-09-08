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
	public List<Product> showAllProducts() throws Exception {
		return productDAO.showAllProducts();
	}

	@Override
	public List<Product> showAllArts(String orderType) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Product> showAllLuxuries(String orderType) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Product> showAllRealEstate(String orderType) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Product> showAllMusicCopyright(String orderType) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Product showDetail(Product product) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void updateProductInfo(Product product) throws Exception {
		// TODO Auto-generated method stub

	}

	@Override
	public List<Product> showPortfolio() throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

}
