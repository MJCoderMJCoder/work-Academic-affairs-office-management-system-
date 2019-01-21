package com;

public class Teacher {
	private int tea_id;
	private String tea_pw;
	private String tea_name;
	private String tea_sex;
	private int tea_age;
	public Teacher(int teaId, String teaPw, String teaName, String teaSex,
			int teaAge) {
		tea_id = teaId;
		tea_pw = teaPw;
		tea_name = teaName;
		tea_sex = teaSex;
		tea_age = teaAge;
	}
	public int getTea_id() {
		return tea_id;
	}
	public void setTea_id(int teaId) {
		tea_id = teaId;
	}
	public String getTea_pw() {
		return tea_pw;
	}
	public void setTea_pw(String teaPw) {
		tea_pw = teaPw;
	}
	public String getTea_name() {
		return tea_name;
	}
	public void setTea_name(String teaName) {
		tea_name = teaName;
	}
	public String getTea_sex() {
		return tea_sex;
	}
	public void setTea_sex(String teaSex) {
		tea_sex = teaSex;
	}
	public int getTea_age() {
		return tea_age;
	}
	public void setTea_age(int teaAge) {
		tea_age = teaAge;
	}
}
