package com;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Cont {
	public static Connection getConnection() {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			String url = "jdbc:mysql://localhost:3306/xsgl";
			String username = "root";
			String password = "MJCoder";
			Connection con = DriverManager.getConnection(url, username, password);
			return con;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	// 注册功能
	public static boolean register(String stu_name, String stu_id, String stu_pw, String stu_sex, String stu_age,
			String stu_major, String stu_class) {
		Connection con = getConnection();
		String sql = "insert into students values(" + stu_id + ",'" + stu_pw + "','" + stu_name + "','" + stu_sex + "',"
				+ stu_age + ",'" + stu_major + "','" + stu_class + "')";
		Statement stat;
		try {
			stat = con.createStatement();
			if (stat.executeUpdate(sql) == 1) {
				return true;
			} else {
				return false;
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			return false;
		}
	}

	// 学生登陆功能
	public static Stu_cont login(String id, String pw) {
		Connection con = getConnection();
		String sql = "select * from students where stu_id=" + id + ";";
		try {
			Statement stat = con.createStatement();
			ResultSet re = stat.executeQuery(sql);
			if (re.next()) {
				if (re.getString("stu_pw").equals(pw)) {
					Stu_cont student = new Stu_cont(re.getInt("stu_id"), re.getString("stu_pw"),
							re.getString("stu_name"), re.getString("stu_sex"), re.getInt("stu_age"),
							re.getString("stu_major"), re.getString("stu_class"));
					return student;
				} else {
					Stu_cont student = new Stu_cont(0, null, "密码错误", null, 0, null, null);
					return student;
				}
			} else {
				Stu_cont student = new Stu_cont(0, null, "账号不存在", null, 0, null, null);
				re.close();
				con.close();
				return student;
			}
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("有错");
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;

	}

	// 教师登陆功能
	public static Tea_cont tea_login(String id, String pw) {
		Connection con = getConnection();
		String sql = "select * from teachers where tea_id=" + id + ";";
		try {
			Statement stat = con.createStatement();
			ResultSet re = stat.executeQuery(sql);
			if (re.next()) {
				if (re.getString("tea_pw").equals(pw)) {
					Tea_cont teacher = new Tea_cont(re.getInt("tea_id"), re.getString("tea_pw"),
							re.getString("tea_name"), re.getString("tea_sex"), re.getInt("tea_age"));
					return teacher;
				} else {
					Tea_cont teacher = new Tea_cont(0, null, "密码错误", null, 0);
					re.close();
					con.close();
					return teacher;
				}
			} else {
				Tea_cont teacher = new Tea_cont(0, null, "账号不存在", null, 0);
				re.close();
				con.close();
				return teacher;
			}
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("有错");
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;

	}

	// 验证学生学号是不是已存在
	public static boolean stuof(String stu_id) {
		Connection con = getConnection();
		String sql = "select * from students where stu_id=" + stu_id + ";";
		try {
			Statement stat = con.createStatement();
			ResultSet rs = stat.executeQuery(sql);
			while (rs.next()) {
				if (rs.getInt("stu_id") == Integer.parseInt(stu_id))
					return true;
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return false;
	}

	// 管理员登陆功能
	public static Admin_cont admin_login(String id, String pw) {
		Connection con = getConnection();
		String sql = "select * from admin where num='" + id + "';";
		try {
			Statement stat = con.createStatement();
			ResultSet re = stat.executeQuery(sql);
			if (re.next()) {
				if (re.getString("pw").equals(pw)) {
					Admin_cont admin = new Admin_cont(re.getString("num"), re.getString("pw"), re.getString("name"),
							re.getString("sex"), re.getInt("age"));
					re.close();
					con.close();
					return admin;
				} else {
					Admin_cont admin = new Admin_cont(null, null, "密码错误", null, 0);
					re.close();
					con.close();
					return admin;
				}
			} else {
				Admin_cont admin = new Admin_cont(null, null, "账号不存在", null, 0);
				re.close();
				con.close();
				return admin;
			}
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("有错");
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;

	}
}
