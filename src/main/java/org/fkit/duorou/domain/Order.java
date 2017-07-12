package org.fkit.duorou.domain;

import java.io.Serializable;

public class Order implements Serializable{
private Integer orderid;
private String username;
private String goodsid;
private String image;
private String dipect;
private Double price;
private Integer number;
private Double totalprice;
private String address;
private String phone;
private String status;

public Order(){
	super();
}

public String getUsername() {
	return username;
}
public void setUsername(String uername) {
	this.username = uername;
}
public String getGoodsid() {
	return goodsid;
}
public void setGoodsid(String goodsid) {
	this.goodsid = goodsid;
}
public String getImage() {
	return image;
}
public void setImage(String image) {
	this.image = image;
}
public Double getPrice() {
	return price;
}
public void setPrice(Double price) {
	this.price = price;
}
public String getDipect() {
	return dipect;
}
public void setDipect(String dipect) {
	this.dipect = dipect;
}
public Integer getNumber() {
	return number;
}
public void setNumber(Integer number) {
	this.number = number;
}
public Double getTotalprice() {
	return totalprice;
}
public void setTotalprice(Double totalprice) {
	this.totalprice = totalprice;
}
public String getAddress() {
	return address;
}
public void setAddress(String address) {
	this.address = address;
}
public String getPhone() {
	return phone;
}
public void setPhone(String phone) {
	this.phone = phone;
}

public String getStatus() {
	return status;
}

public void setStatus(String status) {
	this.status = status;
}

public Integer getOrderid() {
	return orderid;
}

public void setOrderid(Integer orderid) {
	this.orderid = orderid;
}



}
