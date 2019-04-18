package com.ordersystem.service;

import java.util.List;

import com.ordersystem.pojo.StoreVO;

public interface StoreService {

	public void addStore(StoreVO storeVO);
	public int  updateStore(StoreVO storeVO);
	public void deleteStore(int sto_no);
	public StoreVO getStoreByPK(int sto_no);
	public List<StoreVO> getAll();
}
