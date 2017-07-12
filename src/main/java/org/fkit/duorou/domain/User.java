package org.fkit.duorou.domain;

import java.io.Serializable;

import javax.validation.constraints.Pattern;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotBlank;

public class User  implements Serializable{
	private Integer id;
	@NotBlank(message="用户名不能为空")
	private String username;
	@NotBlank(message="密码不能为空")
	@Length(min=6,max=16,message="密码长度必须在6位到16位之间")
	private String password;
	@Email(message="必须是合法的邮箱地址")
	private String email;
	@Pattern(regexp="[1][3,8][3,6,9][0-9]{8}",message="无效的电话号码")
	private String phone;
	

	public User(){
		super();
	}


	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}


	public Integer getId() {
		return id;
	}


	public void setId(Integer id) {
		this.id = id;
	}

}