package com;

public class Student {
	private int stu_id;
	private String stu_pw;
	private String stu_name;
	private String stu_sex;
	private int stu_age;
	private String stu_major;
	private String stu_class;
	public Student(int stuId, String stuPw, String stuName, String stuSex,
			int stuAge, String stuMajor, String stuClass) {
		stu_id = stuId;
		stu_pw = stuPw;
		stu_name = stuName;
		stu_sex = stuSex;
		stu_age = stuAge;
		stu_major = stuMajor;
		stu_class = stuClass;
	}
	public int getStu_id() {
		return stu_id;
	}
	public void setStu_id(int stuId) {
		stu_id = stuId;
	}
	public String getStu_pw() {
		return stu_pw;
	}
	public void setStu_pw(String stuPw) {
		stu_pw = stuPw;
	}
	public String getStu_name() {
		return stu_name;
	}
	public void setStu_name(String stuName) {
		stu_name = stuName;
	}
	public String getStu_sex() {
		return stu_sex;
	}
	public void setStu_sex(String stuSex) {
		stu_sex = stuSex;
	}
	public int getStu_age() {
		return stu_age;
	}
	public void setStu_age(int stuAge) {
		stu_age = stuAge;
	}
	public String getStu_major() {
		return stu_major;
	}
	public void setStu_major(String stuMajor) {
		stu_major = stuMajor;
	}
	public String getStu_class() {
		return stu_class;
	}
	public void setStu_class(String stuClass) {
		stu_class = stuClass;
	}
}
