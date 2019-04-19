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
 
 
 
public class StaffTest extends Junit4Test{
 
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
//		addStaff
//		StaffVO staffVO = new StaffVO();
//		staffVO.setSta_name("1234");
//		staffVO.setSta_id("1081101");
//		staffVO.setSta_tel("0912468335");
//		staffVO.setSta_sex('M');
//		staffVO.setSta_joindate(new Date(System.currentTimeMillis()));
//		staffVO.setSta_status("2");
//		staffService.addStaff(staffVO);	
		

//		updateStaff
//		StaffVO staffVO = new StaffVO();
//		staffVO = staffService.getStaffByPK(25);
//		staffVO.setSta_name("5678");
//		staffVO.setSta_sex('F');
//		staffVO.setSta_joindate(new Date(System.currentTimeMillis()));
//		staffVO.setSta_status("1");
//		staffService.updateStaff(staffVO);
		
//		deleteStaff
//		staffService.deleteStaff(25);
		
//		getAllStaff
//		List<StaffVO> staffList = new ArrayList<StaffVO>();
//		staffList = staffService.getAll();
//		for(StaffVO staff:staffList){
//			System.out.println(staff.getSta_id() + staff.getSta_name() + staff.getSta_tel());
//		}
		
	}
}