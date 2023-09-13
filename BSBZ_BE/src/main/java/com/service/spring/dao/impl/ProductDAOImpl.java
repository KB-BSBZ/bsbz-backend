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
	public List<Product> showAllProducts(String orderType) throws Exception {
		return sqlSession.selectList(NS + "showAllProducts", orderType);
	}

	@Override
	public List<Product> showAllArts(String orderType) throws Exception {
		return sqlSession.selectList(NS + "showAllArts", orderType);
	}

	@Override
	public List<Product> showAllLuxuries(String orderType) throws Exception {
		return sqlSession.selectList(NS + "showAllLuxuries", orderType);
	}

	@Override
	public List<Product> showAllRealEstate(String orderType) throws Exception {
		return sqlSession.selectList(NS + "showAllRealEstate", orderType);
	}

	@Override
	public List<Product> showAllMusicCopyright(String orderType) throws Exception {
		return sqlSession.selectList(NS + "showAllMusicCopyright", orderType);
	}

	@Override
	public Product showDetail(Product product) throws Exception {
		// System.out.println(product.getProductId());
		return sqlSession.selectOne(NS + "showDetail", product);
	}

	@Override
	public void updateProductInfo(Product product) throws Exception {
		sqlSession.update(NS + "updateProductInfo", product);
	}

	@Override
	public List<Product> showPortfolio() throws Exception {
		return sqlSession.selectList(NS + "showPortfolio");
	}

	@Override
	public List<Product> searchProduct(String word) throws Exception {
		System.out.println(word);
		return sqlSession.selectList(NS + "searchProduct", word);
	}

}