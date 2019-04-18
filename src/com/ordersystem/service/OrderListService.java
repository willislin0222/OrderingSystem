package com.ordersystem.service;

import java.util.List;

import com.ordersystem.pojo.OrderListVO;

public interface OrderListService {

	public void addOrderList(OrderListVO orderListVO);
	public int  updateOrderList(OrderListVO orderListVO);
	public void deleteOrderList(int ord_no);
	public OrderListVO getOrderListByPK(int ord_no);
	public List<OrderListVO> getAll();
}
