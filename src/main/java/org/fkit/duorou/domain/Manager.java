package org.fkit.duorou.domain;

import java.io.Serializable;

public class Manager implements Serializable{
	private Integer id;
	private String mgname;
	private String mgpassword;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	
	public String getMgpassword() {
		return mgpassword;
	}
	public void setMgpassword(String mgpassword) {
		this.mgpassword = mgpassword;
	}
	public String getMgname() {
		return mgname;
	}
	public void setMgname(String mgname) {
		this.mgname = mgname;
	}

}
