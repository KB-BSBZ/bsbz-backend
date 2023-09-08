package com.service.spring.dao.impl;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.service.spring.dao.ProductDAO;
import com.service.spring.domain.Product;

@Repository
public class ProductDAOImpl implements ProductDAO {

	public static final String NS = "sql.product.mapper.";

	@Autowired
	private SqlSession sqlSession;

	@Override
	public List<Product> showAllProducts() throws Exception {
		return sqlSession.selectList(NS + "showAllProducts");
	}

	@Override
	public List<Product> showAllArts(String orderType) throws Exception {
		return null;
	}

	@Override
	public List<Product> showAllLuxuries(String orderType) throws Exception {
		return null;
	}

	@Override
	public List<Product> showAllRealEstate(String orderType) throws Exception {
		return null;
	}

	@Override
	public List<Product> showAllMusicCopyright(String orderType) throws Exception {
		return null;
	}

	@Override
	public Product showDetail(Product product) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void updateProductInfo(Product product) throws Exception {

	}

	@Override
	public List<Product> showPortfolio() throws Exception {
		return null;
	}

}
