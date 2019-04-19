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
 
 
 
public class StoreTest extends Junit4Test{
 
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
		
		//addStore
//		StoreVO storeVO = new StoreVO();
//		storeVO.setSto_name("一芳");
//		storeVO.setSto_tel("03-3667188");
//		storeVO.setSto_address("八德介壽路200號");
//		storeService.addStore(storeVO);
		
//		//updateStore
//		StoreVO storeVO = new StoreVO();
//		storeVO = storeService.getStoreByPK(18);
//		storeVO.setSto_name("COCO");
//		storeService.updateStore(storeVO);
		
		//deleteStore
//		storeService.deleteStore(18);
		
		//getALLStore
//		List<StoreVO> storelist = new ArrayList<StoreVO>();
//		storelist = storeService.getAll();
//		for(StoreVO store:storelist){
//			System.out.println(store.getSto_name() + store.getSto_tel());
//		}
	}
}