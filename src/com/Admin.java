package com;

public class Admin {
	private String num;
	private String pw;
	private String name;
	private String sex;
	private int age;
	public Admin(String num, String pw, String name, String sex, int age) {
		this.num = num;
		this.pw = pw;
		this.name = name;
		this.sex = sex;
		this.age = age;
	}
	public String getNum() {
		return num;
	}
	public void setNum(String num) {
		this.num = num;
	}
	public String getPw() {
		return pw;
	}
	public void setPw(String pw) {
		this.pw = pw;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
}
