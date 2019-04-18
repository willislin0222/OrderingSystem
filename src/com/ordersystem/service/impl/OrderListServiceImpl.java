package com.ordersystem.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ordersystem.dao.OrderList_Interface;
import com.ordersystem.pojo.OrderListVO;
import com.ordersystem.service.OrderListService;

@Service
public class OrderListServiceImpl implements OrderListService{

	@Autowired
	private OrderList_Interface orderList_Interface;//UserMapper 是接口

	@Override
	public void addOrderList(OrderListVO orderListVO) {
		orderList_Interface.insert(orderListVO);
		
	}


	@Override
	public int updateOrderList(OrderListVO orderListVO) {
		return orderList_Interface.update(orderListVO);
	}


	@Override
	public OrderListVO getOrderListByPK(int ord_no) {
		return orderList_Interface.findOrderListByPrimaryKey(ord_no);
	}


	@Override
	public void deleteOrderList(int ord_no) {
		orderList_Interface.delete(ord_no);
		
	}


	@Override
	public List<OrderListVO> getAll() {
		return orderList_Interface.getAll();
	}

}
