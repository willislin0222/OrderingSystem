package com.ordersystem.test;
 
import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.annotation.Rollback;
import org.springframework.transaction.annotation.Transactional;

import com.ordersystem.pojo.OrderListVO;
import com.ordersystem.pojo.StaffVO;
import com.ordersystem.pojo.StoreVO;
import com.ordersystem.pojo.Store_ProductVO;
import com.ordersystem.service.OrderListService;
import com.ordersystem.service.StaffService;
import com.ordersystem.service.StoreService;
import com.ordersystem.service.Store_ProductService;
 
 
 
public class Store_ProductTest extends Junit4Test{
 
	@Autowired
	private StaffService staffService;	
	
	@Autowired
	private StoreService storeService;
	
	@Autowired
	private Store_ProductService store_productService;
	
	@Autowired
	private OrderListService orderListService;
 
	@Test
	@Transactional
	@Rollback(false)//防止事务自动回滚
	public void test() {
		testUser();
	}
	
	private void testUser() {
		
		
//		//addStore_product
//		Store_ProductVO store_ProductVO = new Store_ProductVO();
//		store_ProductVO.setSto_no(17);
//		store_ProductVO.setSpr_name("珍珠奶茶");
//		store_ProductVO.setSpr_type("飲料");
//		store_ProductVO.setSpr_size("中");
//		store_ProductVO.setSpr_unitprice("30");
//		store_productService.addStore_Product(store_ProductVO);
		
		//updateStore_product
//		Store_ProductVO store_ProductVO = new Store_ProductVO();
//		store_ProductVO = store_productService.getStore_ProductByPK(14);
//		store_ProductVO.setSpr_name("甘蔗牛奶");
//		store_ProductVO.setSpr_unitprice("65");
//		store_productService.updateStore_Product(store_ProductVO);
		
		//deleteStore_product
//		store_productService.deleteStore_Product(14);
		
		//getAllStore_product
//		List<Store_ProductVO> store_Productlist = new ArrayList<Store_ProductVO>();
//		store_Productlist = store_productService.getAll();
//		for(Store_ProductVO store_Product:store_Productlist){
//			System.out.println(store_Product.getSpr_name() + store_Product.getSpr_unitprice());
//		}
	}
}