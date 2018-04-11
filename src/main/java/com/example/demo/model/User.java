package com.example.demo.model;

import java.util.List;

/**
 * 
 * @author yanzhiying
 *sys_user表
 */
public class User {
	private Integer id;
	private String username;
	private String password;
	private List<Role> roleList;//一个用户拥有多个角色
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
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
	public List<Role> getRoleList() {
		return roleList;
	}
	public void setRoleList(List<Role> roleList) {
		this.roleList = roleList;
	}
	
	
}
