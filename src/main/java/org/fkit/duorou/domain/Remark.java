package org.fkit.duorou.domain;

import java.io.Serializable;

import org.hibernate.validator.constraints.NotBlank;

public class Remark implements Serializable{
	private String goodsid;
	@NotBlank(message="请先登陆！")
	private String username;
	@NotBlank(message="评论不能为空！")
	private String comment;
	
	public String getUsername() {
		return username;
	}
	public Remark(){
		super();
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getComment() {
		return comment;
	}
	public void setComment(String comment) {
		this.comment = comment;
	}
	public String getGoodsid() {
		return goodsid;
	}
	public void setGoodsid(String goodsid) {
		this.goodsid = goodsid;
	}
	
}
