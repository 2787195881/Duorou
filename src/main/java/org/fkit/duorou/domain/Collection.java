package org.fkit.duorou.domain;

import java.io.Serializable;

public class Collection implements Serializable{
private String goodsid;
private String username;

	public Collection(){
		super();
	}
	public String getGoodsid() {
		return goodsid;
	}
	public void setGoodsid(String goodsid) {
		this.goodsid = goodsid;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	}
