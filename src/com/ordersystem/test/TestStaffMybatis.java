package com.ordersystem.test;
 
import java.sql.Date;
 
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
 
 
 
public class TestStaffMybatis extends Junit4Test{
 
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
		//addStaff
//		StaffVO staffVO = new StaffVO();
//		staffVO.setSta_name("1234");
//		staffVO.setSta_id("1081101");
//		staffVO.setSta_tel("0912468335");
//		staffVO.setSta_sex('M');
//		staffVO.setSta_joindate(new Date(System.currentTimeMillis()));
//		staffVO.setSta_status("2");
//		staffService.addStaff(staffVO);	
		
		//addStore
//		StoreVO storeVO = new StoreVO();
//		storeVO.setSto_name("一芳");
//		storeVO.setSto_tel("03-3667188");
//		storeVO.setSto_address("八德介壽路200號");
//		storeService.addStore(storeVO);
		
		//addStore_product
		Store_ProductVO store_ProductVO = new Store_ProductVO();
		store_ProductVO.setSto_no(17);
		store_ProductVO.setSpr_name("珍珠奶茶");
		store_ProductVO.setSpr_type("飲料");
		store_ProductVO.setSpr_size("中");
		store_ProductVO.setSpr_unitprice("30");
		store_productService.addStore_Product(store_ProductVO);
		
		//addOrderList
		OrderListVO orderListVO = new OrderListVO();
		orderListVO.setSpr_no(12);
		orderListVO.setSta_no(24);
		orderListVO.setOrd_count("2");
		orderListVO.setOrd_price("110");
		orderListVO.setOrd_date(new Date(System.currentTimeMillis()));
		orderListService.addOrderList(orderListVO);
		
	}
}