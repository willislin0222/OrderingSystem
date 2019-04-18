package com.ordersystem.dao;

import java.util.List;

import com.ordersystem.pojo.StaffVO;


public interface Staff_Interface {

	public int insert(StaffVO staffVO);
	public int update(StaffVO staffVO);
	public void delete(int sta_no);
	public StaffVO findStaffByPrimaryKey(int sta_no);
	public List<StaffVO> getAll();
}
