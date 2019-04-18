package com.ordersystem.service;


import java.util.List;

import com.ordersystem.pojo.Store_ProductVO;

public interface Store_ProductService {

	public void addStore_Product(Store_ProductVO store_ProductVO);
	public int  updateStore_Product(Store_ProductVO store_ProductVO);
	public void deleteStore_Product(int spr_no);
	public Store_ProductVO getStore_ProductByPK(int spr_no);
	public List<Store_ProductVO> getAll();
}
