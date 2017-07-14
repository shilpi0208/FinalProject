package com.Mobitel.MobitelBack.model;



import java.util.Date;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Cart {
	@Id
	@GeneratedValue
	int cartItemid;
	
	int cartid;
	
	int prodid;
	int price;
	int quantity;
	String prodname,status,uname;
	Date date;
	public int getCartItemid() {
		return cartItemid;
	}
	public void setCartItemid(int cartItemid) {
		this.cartItemid = cartItemid;
	}
	public int getCartid() {
		return cartid;
	}
	public void setCartid(int cartid) {
		this.cartid = cartid;
	}
	public int getProid() {
		return prodid;
	}
	public void setProid(int proid) {
		this.prodid = proid;
	}
		public String getProname() {
		return prodname;
	}
	public int getPrice() {
			return price;
		}
		public void setPrice(int price) {
			this.price = price;
		}
		public int getQuantity() {
			return quantity;
		}
		public void setQuantity(int quantity) {
			this.quantity = quantity;
		}
	public void setProname(String proname) {
		this.prodname = proname;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getUsername() {
		return uname;
	}
	public void setUsername(String username) {
		this.uname = username;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	
}