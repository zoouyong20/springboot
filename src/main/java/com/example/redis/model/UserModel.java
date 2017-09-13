package com.example.redis.model;

import java.io.Serializable;

public class UserModel implements Serializable {

	private static final long serialVersionUID = 4719776738325622802L;
	private String id;
	private String name;
	private String pwd;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPwd() {
		return pwd;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}

	@Override
	public String toString() {
		return "DemoInfo [id=" + id + ", name=" + name + ", pwd=" + pwd + "]";
	}
}
