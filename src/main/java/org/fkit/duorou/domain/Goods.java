package org.fkit.duorou.domain;

import java.io.Serializable;

public class Goods implements Serializable{
	private String typeid;
	private String goodsid;
	private String dipect;
	private Double price;
	private Integer amount;
	private String image;
	
	
	public Goods(){
		super();
	}
	
	
	
	public String getDipect() {
		return dipect;
	}
	public void setDipect(String dipect) {
		this.dipect = dipect;
	}
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
	public Integer getAmount() {
		return amount;
	}
	public void setAmount(Integer amount) {
		this.amount = amount;
	}
	public String getImage() {
		return image;
	}
	public void setImage(String image) {
		this.image = image;
	}



	public String getTypeid() {
		return typeid;
	}



	public void setTypeid(String typeid) {
		this.typeid = typeid;
	}



	public String getGoodsid() {
		return goodsid;
	}



	public void setGoodsid(String goodsid) {
		this.goodsid = goodsid;
	}
	

	
}
