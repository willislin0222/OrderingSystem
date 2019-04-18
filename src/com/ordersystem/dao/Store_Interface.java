package com.ordersystem.dao;

import java.util.List;

import com.ordersystem.pojo.StoreVO;


public interface Store_Interface {

	public int insert(StoreVO storeVO);
	public int update(StoreVO storeVO);
	public void delete(int sto_no);
	public StoreVO findStoreByPrimaryKey(int sto_no);
	public List<StoreVO> getAll();
	
}
