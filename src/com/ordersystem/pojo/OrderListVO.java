package com.ordersystem.pojo;

import java.sql.Date;

public class OrderListVO {

		private int ord_no;
		private int sta_no;
		private int spr_no;
		private String ord_price;
		private String ord_count;
		private Date ord_date;
		public int getOrd_no() {
			return ord_no;
		}
		public void setOrd_no(int ord_no) {
			this.ord_no = ord_no;
		}
		public int getSta_no() {
			return sta_no;
		}
		public void setSta_no(int sta_no) {
			this.sta_no = sta_no;
		}
		public int getSpr_no() {
			return spr_no;
		}
		public void setSpr_no(int spr_no) {
			this.spr_no = spr_no;
		}
		
		public String getOrd_price() {
			return ord_price;
		}
		public void setOrd_price(String ord_price) {
			this.ord_price = ord_price;
		}
		public String getOrd_count() {
			return ord_count;
		}
		public void setOrd_count(String ord_count) {
			this.ord_count = ord_count;
		}
		public Date getOrd_date() {
			return ord_date;
		}
		public void setOrd_date(Date ord_date) {
			this.ord_date = ord_date;
		}
		
		
}
