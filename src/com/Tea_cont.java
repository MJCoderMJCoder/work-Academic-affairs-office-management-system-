package com;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class Tea_cont extends Teacher {

	public Tea_cont(int teaId, String teaPw, String teaName, String teaSex, int teaAge) {
		super(teaId, teaPw, teaName, teaSex, teaAge);
		// TODO Auto-generated constructor stub
	}

	// 连接数据库
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

	// 查看该教师自己课程的学生
	public ArrayList<String[]> see_stu() {
		Connection con = getConnection();
		String sql = "select c.cou_name,s.* from students s, score sc , courses c,teachers t where s.stu_id = sc.stu_id and sc.cou_id = c.cou_id and t.tea_id=c.tea_id and t.tea_id="
				+ getTea_id() + ";";
		Statement stat;
		try {
			stat = con.createStatement();
			ResultSet rs = stat.executeQuery(sql);
			ArrayList<String[]> stu = new ArrayList<String[]>();
			while (rs.next()) {
				String a[] = new String[7];
				a[0] = String.valueOf(rs.getInt("stu_id"));
				a[1] = rs.getString("stu_name");
				a[2] = rs.getString("stu_sex");
				a[3] = String.valueOf(rs.getInt("stu_age"));
				a[4] = rs.getString("stu_major");
				a[5] = rs.getString("stu_class");
				a[6] = rs.getString("cou_name");
				stu.add(a);
			}
			return stu;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}

	// 通过学生id查找学生信息
	public ArrayList<String[]> see_stu(String stu_id) {
		Connection con = getConnection();
		String sql = "select c.cou_name,s.* from students s, score sc , courses c,teachers t where s.stu_id = sc.stu_id and sc.cou_id = c.cou_id and t.tea_id=c.tea_id and t.tea_id="
				+ getTea_id() + " and s.stu_id=" + stu_id + ";";
		Statement stat;
		try {
			stat = con.createStatement();
			ResultSet rs = stat.executeQuery(sql);
			ArrayList<String[]> stu = new ArrayList<String[]>();
			while (rs.next()) {
				String a[] = new String[7];
				a[0] = String.valueOf(rs.getInt("stu_id"));
				a[1] = rs.getString("stu_name");
				a[2] = rs.getString("stu_sex");
				a[3] = String.valueOf(rs.getInt("stu_age"));
				a[4] = rs.getString("stu_major");
				a[5] = rs.getString("stu_class");
				a[6] = rs.getString("cou_name");
				stu.add(a);
			}
			return stu;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}

	// 增加课程
	public boolean add_cou(String cou_id, String cou_name, String cou_time, String cou_ctime, String cou_fen,
			String cou_snum) {
		Connection con = getConnection();
		String sql_ = "select * from courses where cou_id=" + cou_id + ";";
		String sql = "insert into courses(tea_id,cou_id,cou_name,cou_time,cou_ctime,cou_fen,cou_snum,cou_lnum) values("
				+ getTea_id() + "," + cou_id + ",'" + cou_name + "','" + cou_time + "','" + cou_ctime + "','" + cou_fen
				+ "'," + cou_snum + ",0);";
		Statement stat;
		try {
			stat = con.createStatement();
			ResultSet rs = stat.executeQuery(sql_);
			if (rs.next()) {
				return false;
			} else if (stat.executeUpdate(sql) == 1) {
				return true;
			} else {
				return false;
			}
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}

	// 修改密码
	public boolean setpw(String tea_pw, String newpw) {
		Connection con = getConnection();
		String sql = "select * from teachers where tea_id=" + getTea_id() + ";";
		String sql_ = "update teachers set tea_pw ='" + newpw + "' where tea_id=" + getTea_id() + ";";
		Statement stat;
		try {
			stat = con.createStatement();
			ResultSet rs = stat.executeQuery(sql);
			rs.next();
			if (rs.getString("tea_pw").equals(tea_pw)) {
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

	// 查看该教师的全部课程
	public ArrayList<String[]> see_cou() {
		Connection con = getConnection();
		String sql = "select * from courses where tea_id=" + getTea_id() + ";";
		Statement stat;
		try {
			stat = con.createStatement();
			ResultSet rs = stat.executeQuery(sql);
			ArrayList<String[]> cou = new ArrayList<String[]>();
			while (rs.next()) {
				String a[] = new String[7];
				a[0] = String.valueOf(rs.getInt("cou_id"));
				a[1] = rs.getString("cou_name");
				a[2] = rs.getString("cou_time");
				a[3] = rs.getString("cou_ctime");
				a[4] = String.valueOf(rs.getInt("cou_fen"));
				a[5] = String.valueOf(rs.getInt("cou_snum"));
				a[6] = String.valueOf(rs.getInt("cou_lnum"));
				cou.add(a);
			}
			return cou;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}

	// 通过课程id查找课程信息
	public String[] see_cou_one(String cou_id) {
		Connection con = getConnection();
		String sql = "select * from courses where tea_id=" + getTea_id() + " and cou_id=" + cou_id + ";";
		Statement stat;
		try {
			stat = con.createStatement();
			ResultSet rs = stat.executeQuery(sql);
			if (rs.next()) {
				String a[] = new String[7];
				a[0] = String.valueOf(rs.getInt("cou_id"));
				a[1] = rs.getString("cou_name");
				a[2] = rs.getString("cou_time");
				a[3] = rs.getString("cou_ctime");
				a[4] = String.valueOf(rs.getInt("cou_fen"));
				a[5] = String.valueOf(rs.getInt("cou_snum"));
				a[6] = String.valueOf(rs.getInt("cou_lnum"));
				rs.close();
				con.close();
				return a;
			} else
				return null;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}

	// 修改课程信息
	public boolean set_cou(String cou_id, String cou_name, String cou_time, String cou_ctime, String cou_fen,
			String cou_snum) {
		Connection con = getConnection();
		String sql = "update courses set cou_name='" + cou_name + "',cou_time='" + cou_time + "',cou_ctime='"
				+ cou_ctime + "',cou_fen=" + cou_fen + ",cou_snum=" + cou_snum + " where cou_id=" + cou_id + ";";
		Statement stat;
		try {
			stat = con.createStatement();
			if (stat.executeUpdate(sql) == 1) {
				con.close();
				return true;
			} else {
				con.close();
				return false;
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false;
		}
	}

	// 查看课程里面学生的成绩和课程信息
	public ArrayList<String[]> see_counum() {
		Connection con = getConnection();
		String sql = "select c.cou_id,c.cou_name,s.stu_id,s.stu_name,s.stu_class,sc.cou_num from students s, score sc , courses c,teachers t where s.stu_id = sc.stu_id and sc.cou_id = c.cou_id and t.tea_id=c.tea_id and t.tea_id="
				+ getTea_id() + ";";
		Statement stat;
		try {
			stat = con.createStatement();
			ResultSet rs = stat.executeQuery(sql);
			ArrayList<String[]> cou_stu = new ArrayList<String[]>();
			while (rs.next()) {
				String a[] = new String[6];
				a[0] = String.valueOf(rs.getInt("cou_id"));
				a[1] = rs.getString("cou_name");
				a[2] = String.valueOf(rs.getInt("stu_id"));
				a[3] = rs.getString("stu_name");
				a[4] = rs.getString("stu_class");
				a[5] = rs.getString("cou_num");
				cou_stu.add(a);
			}
			for (int i = 0; i < cou_stu.size() - 1; i++) {
				for (int j = i + 1; j < cou_stu.size(); j++) {
					if (Integer.parseInt(cou_stu.get(i)[0]) > Integer.parseInt(cou_stu.get(j)[0])) {
						String[] a = new String[6];
						for (int k = 0; k < 6; k++) {
							a[k] = cou_stu.get(j)[k];
						}
						cou_stu.set(j, cou_stu.get(i));
						cou_stu.set(i, a);
					}
				}
			}
			return cou_stu;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}

	// 修改学生课程成绩
	public boolean set_counum(String cou_id, String stu_id, String cou_num) {
		Connection con = getConnection();
		String sql = "update score set cou_num=" + cou_num + " where cou_id=" + cou_id + " and stu_id=" + stu_id + ";";
		Statement stat;
		try {
			stat = con.createStatement();
			if (stat.executeUpdate(sql) == 1) {
				con.close();
				return true;
			} else {
				con.close();
				return false;
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false;
		}
	}

	// 通过学生id与课程id查找课程信息和课程分数
	public String[] see_counum(String stu_id, String cou_id) {
		Connection con = getConnection();
		String sql = "select c.cou_id,c.cou_name,s.stu_id,s.stu_name,s.stu_sex,sc.cou_num from students s, score sc , courses c,teachers t where s.stu_id = sc.stu_id and sc.cou_id = c.cou_id and t.tea_id=c.tea_id and s.stu_id="
				+ stu_id + " and c.cou_id=" + cou_id + " and t.tea_id=" + getTea_id() + ";";
		Statement stat;
		try {
			stat = con.createStatement();
			ResultSet rs = stat.executeQuery(sql);
			if (rs.next()) {
				String a[] = new String[6];
				a[0] = String.valueOf(rs.getInt("cou_id"));
				a[1] = rs.getString("cou_name");
				a[2] = String.valueOf(rs.getInt("stu_id"));
				a[3] = rs.getString("stu_name");
				a[4] = rs.getString("stu_sex");
				a[5] = rs.getString("cou_num");
				rs.close();
				con.close();
				return a;
			} else
				return null;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}

	// 通过课程查找课程信息和学生信息
	public ArrayList<String[]> see_counum(String cou_id) {
		Connection con = getConnection();
		String sql = "select c.cou_id,c.cou_name,s.stu_id,s.stu_name,s.stu_class,sc.cou_num from students s, score sc , courses c,teachers t where s.stu_id = sc.stu_id and sc.cou_id = c.cou_id and t.tea_id=c.tea_id and c.cou_id="
				+ cou_id + " and t.tea_id=" + getTea_id() + ";";
		Statement stat;
		try {
			stat = con.createStatement();
			ResultSet rs = stat.executeQuery(sql);
			ArrayList<String[]> cou_stu = new ArrayList<String[]>();
			while (rs.next()) {
				String a[] = new String[6];
				a[0] = String.valueOf(rs.getInt("cou_id"));
				a[1] = rs.getString("cou_name");
				a[2] = String.valueOf(rs.getInt("stu_id"));
				a[3] = rs.getString("stu_name");
				a[4] = rs.getString("stu_class");
				a[5] = rs.getString("cou_num");
				cou_stu.add(a);
			}
			rs.close();
			con.close();
			return cou_stu;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
}
