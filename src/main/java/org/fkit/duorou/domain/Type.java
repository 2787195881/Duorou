package org.fkit.duorou.domain;

import java.io.Serializable;

public class Type  implements Serializable{
	private String id;
	private String typename;
	public String getTypename() {
		return typename;
	}
	public void setTypename(String typename) {
		this.typename = typename;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	

}
