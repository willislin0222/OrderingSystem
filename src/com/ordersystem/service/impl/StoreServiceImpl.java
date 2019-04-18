package com.ordersystem.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ordersystem.dao.Store_Interface;
import com.ordersystem.pojo.StoreVO;
import com.ordersystem.service.StoreService;

@Service
public class StoreServiceImpl implements StoreService{

	@Autowired
	private Store_Interface store_Interface;//UserMapper 是接口


	@Override
	public void addStore(StoreVO storeVO) {
		store_Interface.insert(storeVO);
		
	}


	@Override
	public int updateStore(StoreVO storeVO) {
		return store_Interface.update(storeVO);
	}


	@Override
	public void deleteStore(int sto_no) {
		store_Interface.delete(sto_no);
		
	}


	@Override
	public StoreVO getStoreByPK(int sto_no) {
		return store_Interface.findStoreByPrimaryKey(sto_no);
	}


	@Override
	public List<StoreVO> getAll() {
		return store_Interface.getAll();
	}

}
