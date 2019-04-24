package com.ordersystem.controller;
 
import java.sql.Date;
import java.util.List;
 
 
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.ordersystem.pojo.StaffVO;
import com.ordersystem.service.StaffService;
 
 
 
@Controller
@RequestMapping("/staff")
public class StaffController {
 
	@Autowired
	StaffService staffService;
	
	@RequestMapping("/toadd")  //導向新增頁面
	public String regUser() {
		return "addStaff";
	}
	
	@RequestMapping("/addStaff")
	public String addStaff(StaffVO staffVO,Model model) {//新增員工帳號
		staffVO.setSta_status("1");
		staffVO.setSta_joindate(new Date(System.currentTimeMillis()));
		this.staffService.addStaff(staffVO);
		List<StaffVO> list = this.staffService.getAll();
		model.addAttribute("staffList",list);
		return "staffList";
	}	
	
	@RequestMapping("/getStaffInfo")   //取得員工資料
	String getStaffInfo(StaffVO staffVO,Model model) {
		staffVO = this.staffService.getStaffByPK(staffVO.getSta_no());
		model.addAttribute("staffVO",staffVO);
		return "staffInfo";
	}
	
	@RequestMapping("/updateStaff")  //更新員工資料
	String updateStaff(StaffVO staffVO) {
		this.staffService.updateStaff(staffVO);
		return "staffInfo";
	}
	
	@RequestMapping("/deleteStaff")  //刪除員工資料
	String deleteStaff(StaffVO staffVO,Model model) {
		this.staffService.deleteStaff(staffVO.getSta_no());
		List<StaffVO> list = this.staffService.getAll();
		model.addAttribute("staffList",list);
		return "staffList";
	}
	
	
	@RequestMapping(value = "/stafflist")
	public String listStaff(Model model) {//查看員工列表
		List<StaffVO> list = this.staffService.getAll();
		model.addAttribute("staffList",list);
		return "staffList";
	}		
 
}