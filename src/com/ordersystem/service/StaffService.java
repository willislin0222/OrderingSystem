package com.ordersystem.service;

import java.util.List;

import com.ordersystem.pojo.StaffVO;

public interface StaffService {

	public void addStaff(StaffVO staffVO);
	public int  updateStaff(StaffVO staffVO);
	public void deleteStaff(int sta_no);
	public StaffVO getStaffByPK(int sta_no);
	public List<StaffVO> getAll();
}
