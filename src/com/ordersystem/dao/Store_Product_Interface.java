package com.ordersystem.dao;

import java.util.List;

import com.ordersystem.pojo.Store_ProductVO;


public interface Store_Product_Interface {

	public int insert(Store_ProductVO store_ProductVO);
	public int update(Store_ProductVO store_ProductVO);
	public int delete(int spr_no);
	public Store_ProductVO findStore_ProductByPrimaryKey(int spr_no);
	public List<Store_ProductVO> getAll();
	
}
