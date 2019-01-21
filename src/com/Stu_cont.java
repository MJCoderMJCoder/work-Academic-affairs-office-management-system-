package com;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class Stu_cont extends Student {

	public Stu_cont(int stuId, String stuPw, String stuName, String stuSex, int stuAge, String stuMajor,
			String stuClass) {
		super(stuId, stuPw, stuName, stuSex, stuAge, stuMajor, stuClass);
		// TODO Auto-generated constructor stub
	}

	public Connection getConnection() {
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

	// 获取该学生全部课程信息和课程分数
	public ArrayList<String[]> getnumber() {
		Connection con = this.getConnection();
		String sql = "select c.*,sc.cou_num,t.tea_name from students s, score sc , courses c,teachers t where s.stu_id = sc.stu_id and sc.cou_id = c.cou_id and t.tea_id=c.tea_id and s.stu_id="
				+ getStu_id() + ";";
		try {
			Statement stat = con.createStatement();
			ResultSet rs = stat.executeQuery(sql);
			ArrayList<String[]> cou = new ArrayList<String[]>();
			while (rs.next()) {
				String a[] = new String[5];
				a[0] = rs.getString("cou_name");
				a[1] = rs.getString("cou_time");
				a[2] = String.valueOf(rs.getInt("cou_fen"));
				a[3] = rs.getString("tea_name");
				a[4] = rs.getString("cou_num");
				cou.add(a);
			}
			rs.close();
			con.close();
			return cou;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	// 修改密码
	public boolean setpw(String stu_pw, String newpw) {
		Connection con = getConnection();
		String sql = "select * from students where stu_id=" + getStu_id() + ";";
		String sql_ = "update students set stu_pw ='" + newpw + "' where stu_id=" + getStu_id() + ";";
		Statement stat;
		try {
			stat = con.createStatement();
			ResultSet rs = stat.executeQuery(sql);
			rs.next();
			if (rs.getString("stu_pw").equals(stu_pw)) {
				if (stat.executeUpdate(sql_) == 1) {
					return true;
				} else {
					return false;
				}
			} else {
				return false;
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false;
		}
	}

	// 查看全部课程
	public ArrayList<String[]> see_cou() {
		Connection con = getConnection();
		String sql = "select * from courses c,teachers t where t.tea_id=c.tea_id;";
		String sql_ = "select * from score where stu_id=" + getStu_id() + "";
		Statement stat;
		try {
			stat = con.createStatement();
			ResultSet rs = stat.executeQuery(sql_);
			ArrayList<String> cou_id = new ArrayList<String>();
			while (rs.next()) {
				cou_id.add(rs.getString("cou_id"));
			}
			rs.close();
			rs = stat.executeQuery(sql);
			ArrayList<String[]> cou = new ArrayList<String[]>();
			while (rs.next()) {
				String a[] = new String[5];
				a[0] = String.valueOf(rs.getInt("cou_id"));
				a[1] = rs.getString("cou_name");
				a[2] = rs.getString("tea_name");
				a[3] = String.valueOf(rs.getInt("cou_snum") - rs.getInt("cou_lnum"));
				a[4] = "未选";
				for (int i = 0; i < cou_id.size(); i++) {
					if (a[0].equals(cou_id.get(i))) {
						a[4] = "已选";
					}
				}
				cou.add(a);
			}
			return cou;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}

	// 用课程id作为条件查找课程信息
	public String[] see_cou(String cou_id) {
		Connection con = getConnection();
		String sql = "select * from courses c,teachers t where c.cou_id=" + cou_id + " and t.tea_id=c.tea_id;";
		Statement stat;
		try {
			stat = con.createStatement();
			ResultSet rs = stat.executeQuery(sql);
			String a[] = new String[9];
			if (rs.next()) {
				a[0] = String.valueOf(rs.getInt("cou_id"));
				a[1] = rs.getString("cou_name");
				a[2] = rs.getString("cou_time");
				a[3] = rs.getString("cou_ctime");
				a[4] = String.valueOf(rs.getInt("cou_fen"));
				a[5] = String.valueOf(rs.getInt("cou_snum"));
				a[6] = String.valueOf(rs.getInt("cou_lnum"));
				a[7] = rs.getString("tea_id");
				a[8] = rs.getString("tea_name");
				con.close();
				rs.close();
				return a;
			} else
				return null;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}

	// 学生选课模块选定课程
	public boolean set_sc(String cou_id) {
		String cou_lnum = this.see_cou(cou_id)[6];
		cou_lnum = String.valueOf(Integer.parseInt(cou_lnum) + 1);
		Connection con = getConnection();
		String sql = "insert into score(stu_id,cou_id) values(" + getStu_id() + "," + cou_id + ");";
		String sql_ = "update courses set cou_lnum=" + cou_lnum + " where cou_id=" + cou_id + ";";
		Statement stat;
		try {
			stat = con.createStatement();
			if (stat.executeUpdate(sql) == 1) {
				if (stat.executeUpdate(sql_) == 1) {
					return true;
				} else
					return false;
			} else {
				return false;
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false;
		}
	}
}
