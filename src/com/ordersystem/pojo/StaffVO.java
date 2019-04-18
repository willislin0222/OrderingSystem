package com.ordersystem.pojo;

import java.sql.Date;

public class StaffVO {
	
	private int sta_no;
	private String sta_name;
	private String sta_id;
	private String sta_tel;
	private char sta_sex;
	private Date sta_joindate;
	private String sta_status;
	
	public int getSta_no() {
		return sta_no;
	}
	public void setSta_no(int sta_no) {
		this.sta_no = sta_no;
	}
	public String getSta_name() {
		return sta_name;
	}
	public void setSta_name(String sta_name) {
		this.sta_name = sta_name;
	}
	public String getSta_id() {
		return sta_id;
	}
	public void setSta_id(String sta_id) {
		this.sta_id = sta_id;
	}
	public String getSta_tel() {
		return sta_tel;
	}
	public void setSta_tel(String sta_tel) {
		this.sta_tel = sta_tel;
	}
	public char getSta_sex() {
		return sta_sex;
	}
	public void setSta_sex(char sta_sex) {
		this.sta_sex = sta_sex;
	}
	public Date getSta_joindate() {
		return sta_joindate;
	}
	public void setSta_joindate(Date sta_joindate) {
		this.sta_joindate = sta_joindate;
	}
	public String getSta_status() {
		return sta_status;
	}
	public void setSta_status(String sta_status) {
		this.sta_status = sta_status;
	}
	
	
	
}
