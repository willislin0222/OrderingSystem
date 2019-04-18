package com.ordersystem.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ordersystem.dao.Store_Product_Interface;
import com.ordersystem.pojo.Store_ProductVO;
import com.ordersystem.service.Store_ProductService;

@Service
public class Store_ProductServiceImpl implements Store_ProductService{

	@Autowired
	private Store_Product_Interface store_Product_Interface;//UserMapper 是接口

	@Override
	public void addStore_Product(Store_ProductVO store_ProductVO) {
		store_Product_Interface.insert(store_ProductVO);
		
	}


	@Override
	public int updateStore_Product(Store_ProductVO store_ProductVO) {
		return store_Product_Interface.update(store_ProductVO);
	}


	@Override
	public void deleteStore_Product(int spr_no) {
		store_Product_Interface.delete(spr_no);
		
	}


	@Override
	public Store_ProductVO getStore_ProductByPK(int spr_no) {
		return store_Product_Interface.findStore_ProductByPrimaryKey(spr_no);
	}


	@Override
	public List<Store_ProductVO> getAll() {
		return store_Product_Interface.getAll();
	}

}
