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
 
 
 
public class OrderListTest extends Junit4Test{
 
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
		
		
		//addOrderList
//		OrderListVO orderListVO = new OrderListVO();
//		orderListVO.setSpr_no(12);
//		orderListVO.setSta_no(24);
//		orderListVO.setOrd_count("2");
//		orderListVO.setOrd_price("110");
//		orderListVO.setOrd_date(new Date(System.currentTimeMillis()));
//		orderListService.addOrderList(orderListVO);
		
//		upateOrderList
//		OrderListVO orderListVO = new OrderListVO();
//		orderListVO = orderListService.getOrderListByPK(10);
//		orderListVO.setOrd_count("4");
//		orderListVO.setOrd_price("200");
//		orderListService.updateOrderList(orderListVO);
		
		//deleteOrderList
//		orderListService.deleteOrderList(10);
		
		//getAllOrderList
//		List<OrderListVO> orderListlist = new ArrayList<OrderListVO>();
//		orderListlist = orderListService.getAll();
//		for(OrderListVO orderList:orderListlist){
//			System.out.println(orderList.getOrd_no() + orderList.getOrd_price());
//		}
	}
}