package com.ordersystem.dao;

import java.util.List;

import com.ordersystem.pojo.OrderListVO;


public interface OrderList_Interface {

	public int insert(OrderListVO orderListVO);
	public int update(OrderListVO orderListVO);
	public void delete(int ord_no);
	public OrderListVO findOrderListByPrimaryKey(int ord_no);
	public List<OrderListVO> getAll();
	
}
