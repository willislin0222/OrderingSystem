package com.ordersystem.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ordersystem.dao.Staff_Interface;
import com.ordersystem.pojo.StaffVO;
import com.ordersystem.service.StaffService;

@Service
public class StaffServiceImpl implements StaffService{

	@Autowired
	private Staff_Interface staff_Interface;//UserMapper 是接口

	public void addStaff(StaffVO staffVO) {
		staff_Interface.insert(staffVO);
		
	}

	
	public int updateStaff(StaffVO staffVO) {
		return staff_Interface.update(staffVO);
	}

	
	public void deleteStaff(int sta_no) {
		staff_Interface.delete(sta_no);
		
	}

	
	public StaffVO getStaffByPK(int sta_no) {
		return staff_Interface.findStaffByPrimaryKey(sta_no);
	}

	
	public List<StaffVO> getAll() {
		return staff_Interface.getAll();
	}

}
