package com;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class Admin_cont extends Admin {

	public Admin_cont(String num, String pw, String name, String sex, int age) {
		super(num, pw, name, sex, age);
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

	// 查看全部信息，用数组链表返回全部学生信息
	public ArrayList<String[]> see_stu() {
		Connection con = getConnection();
		String sql = "select * from students;";
		Statement stat;
		try {
			stat = con.createStatement();
			ResultSet rs = stat.executeQuery(sql);
			ArrayList<String[]> stu = new ArrayList<String[]>();
			while (rs.next()) {
				String a[] = new String[6];
				a[0] = String.valueOf(rs.getInt("stu_id"));
				a[1] = rs.getString("stu_name");
				a[2] = rs.getString("stu_sex");
				a[3] = String.valueOf(rs.getInt("stu_age"));
				a[4] = rs.getString("stu_major");
				a[5] = rs.getString("stu_class");
				stu.add(a);
			}
			return stu;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}

	// 条件查找学生，用数组链表返回全部学生信息
	public ArrayList<String[]> see_stu(String type, String content) {
		Connection con = getConnection();
		String sql = "select * from students where " + type + "='" + content + "';";
		Statement stat;
		try {
			stat = con.createStatement();
			ResultSet rs = stat.executeQuery(sql);
			ArrayList<String[]> stu = new ArrayList<String[]>();
			while (rs.next()) {
				String a[] = new String[6];
				a[0] = String.valueOf(rs.getInt("stu_id"));
				a[1] = rs.getString("stu_name");
				a[2] = rs.getString("stu_sex");
				a[3] = String.valueOf(rs.getInt("stu_age"));
				a[4] = rs.getString("stu_major");
				a[5] = rs.getString("stu_class");
				stu.add(a);
			}
			return stu;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}

	// 删除学生，用学生id来删除学生
	public boolean del_stu(String stu_id) {
		Connection con = getConnection();
		String sql = "delete from score where stu_id=" + stu_id + ";";
		String sql_ = "delete from students where stu_id=" + stu_id + ";";
		Statement stat;
		try {
			stat = con.createStatement();
			int a = stat.executeUpdate(sql);
			int b = stat.executeUpdate(sql_);
			if (a != 0 || b != 0) {
				return true;
			} else {
				return false;
			}
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}

	// 查看全部教师，用数组链表返回全部教师信息
	public ArrayList<String[]> see_tea() {
		Connection con = getConnection();
		String sql = "select * from teachers;";
		Statement stat;
		try {
			stat = con.createStatement();
			ResultSet rs = stat.executeQuery(sql);
			ArrayList<String[]> tea = new ArrayList<String[]>();
			while (rs.next()) {
				String a[] = new String[4];
				a[0] = rs.getString("tea_id");
				a[1] = rs.getString("tea_name");
				a[2] = rs.getString("tea_sex");
				a[3] = String.valueOf(rs.getInt("tea_age"));
				tea.add(a);
			}
			return tea;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}

	// 条件查找教师，用数组链表返回全部教师信息
	public ArrayList<String[]> see_tea(String type, String content) {
		Connection con = getConnection();
		String sql = "select * from teachers where " + type + "='" + content + "';";
		Statement stat;
		try {
			stat = con.createStatement();
			ResultSet rs = stat.executeQuery(sql);
			ArrayList<String[]> tea = new ArrayList<String[]>();
			while (rs.next()) {
				String a[] = new String[4];
				a[0] = rs.getString("tea_id");
				a[1] = rs.getString("tea_name");
				a[2] = rs.getString("tea_sex");
				a[3] = String.valueOf(rs.getInt("tea_age"));
				tea.add(a);
			}
			return tea;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}

	// 删除教师，用教师id删除
	public boolean del_tea(String tea_id) {
		Connection con = getConnection();
		String sql_ = "delete from courses where tea_id=" + tea_id + ";";
		String sql = "delete from teachers where tea_id=" + tea_id + ";";
		String sql_s = "select courses.cou_id from courses where tea_id=" + tea_id + ";";
		Statement stat;
		try {
			stat = con.createStatement();
			ResultSet rs = stat.executeQuery(sql_s);
			String del = "delete from score where ";
			if (rs.next()) {
				del = del.concat("cou_id=" + rs.getString("cou_id") + " ");
				while (rs.next()) {
					del = del.concat("or cou_id=" + rs.getString("cou_id") + " ");
				}
				del = del.concat(";");
				int a = stat.executeUpdate(del);
				int b = stat.executeUpdate(sql_);
				int c = stat.executeUpdate(sql);
				if (a != 0 || b != 0 || c != 0) {
					return true;
				} else {
					return false;
				}
			} else {
				int a = stat.executeUpdate(sql_);
				int b = stat.executeUpdate(sql);
				if (a != 0 || b != 0) {
					return true;
				} else {
					return false;
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}

	// 查看课程信息，用数组链表返回课程信息
	public ArrayList<String[]> see_cou() {
		Connection con = getConnection();
		String sql = "select * from courses c,teachers t where t.tea_id=c.tea_id;";
		Statement stat;
		try {
			stat = con.createStatement();
			ResultSet rs = stat.executeQuery(sql);
			ArrayList<String[]> cou = new ArrayList<String[]>();
			while (rs.next()) {
				String a[] = new String[3];
				a[0] = String.valueOf(rs.getInt("cou_id"));
				a[1] = rs.getString("cou_name");
				a[2] = rs.getString("tea_name");
				cou.add(a);
			}
			return cou;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}

	// 增加课程，在界面获取管理员输入的增加课程信息，作为参数进行课程的增加，返回true即为成功
	public boolean add_cou(String tea_id, String cou_id, String cou_name, String cou_time, String cou_ctime,
			String cou_fen, String cou_snum) {
		Connection con = getConnection();
		String sql_ = "select * from courses where cou_id=" + cou_id + ";";
		String sql = "insert into courses(tea_id,cou_id,cou_name,cou_time,cou_ctime,cou_fen,cou_snum,cou_lnum) values("
				+ tea_id + "," + cou_id + ",'" + cou_name + "','" + cou_time + "','" + cou_ctime + "','" + cou_fen
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

	// 删除课程，在界面获取课程id进行课程的删除
	public boolean del_cou(String cou_id) {
		Connection con = getConnection();
		String sql_ = "delete from courses where cou_id=" + cou_id + ";";
		String sql = "delete from score where cou_id=" + cou_id + ";";
		Statement stat;
		try {
			stat = con.createStatement();
			int a = stat.executeUpdate(sql);
			int b = stat.executeUpdate(sql_);
			if (a != 0 || b != 0) {
				return true;
			} else {
				return false;
			}
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}

	// 修改密码。在界面获取密码和新密码进行密码比较，相同就执行修改新密码语句
	public boolean setpw(String pw, String newpw) {
		Connection con = getConnection();
		String sql = "select * from admin where num=" + getNum() + ";";
		String sql_ = "update admin set pw ='" + newpw + "' where num=" + getNum() + ";";
		Statement stat;
		try {
			stat = con.createStatement();
			ResultSet rs = stat.executeQuery(sql);
			rs.next();
			if (rs.getString("pw").equals(pw)) {
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

	// 用教师id来查找教师，用数组返回教师信息
	public String[] see_tea(String tea_id) {
		Connection con = getConnection();
		String sql = "select * from teachers where tea_id=" + tea_id + ";";
		Statement stat;
		try {
			stat = con.createStatement();
			ResultSet rs = stat.executeQuery(sql);
			String a[] = new String[4];
			if (rs.next()) {
				a[0] = rs.getString("tea_id");
				a[1] = rs.getString("tea_name");
				a[2] = rs.getString("tea_sex");
				a[3] = String.valueOf(rs.getInt("tea_age"));
			}
			return a;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}

	// 修改教师密码，在界面获取教师账号和教师新密码直接进行密码修改
	public boolean set_teapw(String tea_id, String newpw) {
		Connection con = getConnection();
		String sql_ = "update teachers set tea_pw ='" + newpw + "' where tea_id=" + tea_id + ";";
		Statement stat;
		try {
			stat = con.createStatement();
			if (stat.executeUpdate(sql_) == 1) {
				con.close();
				return true;
			} else {
				return false;
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false;
		}
	}

	// 用课程id查找课程，用数组返回课程信息
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
				return a;
			} else
				return null;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}

	// 增加教师
	public boolean add_tea(String tea_id, String tea_name, String tea_pw, String tea_sex, String tea_age) {
		Connection con = getConnection();
		String sql_ = "select * from teachers where tea_id=" + tea_id + ";";
		String sql = "insert into teachers(tea_id,tea_name,tea_pw,tea_sex,tea_age) values(" + tea_id + ",'" + tea_name
				+ "','" + tea_pw + "','" + tea_sex + "'," + tea_age + ");";
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

	// 修改管理员信息
	public boolean set_admin(String name, String sex, String age) {
		Connection con = getConnection();
		String sql = "update admin set name ='" + name + "',sex='" + sex + "',age=" + age + " where num=" + getNum()
				+ ";";
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
			e.printStackTrace();
			return false;
		}
	}

	// 查看全部课程学生的分数，用数组链表返回学生课程和分数的信息
	public ArrayList<String[]> see_counum() {
		Connection con = getConnection();
		String sql = "select c.cou_id,c.cou_name,s.stu_id,s.stu_name,s.stu_class,sc.cou_num from students s, score sc , courses c,teachers t where s.stu_id = sc.stu_id and sc.cou_id = c.cou_id and t.tea_id=c.tea_id;";
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

	// 修改课程分数，用课程id和学生id作为条件
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

	//
	public String[] see_counum(String stu_id, String cou_id) {
		Connection con = getConnection();
		String sql = "select c.cou_id,c.cou_name,s.stu_id,s.stu_name,s.stu_sex,sc.cou_num from students s, score sc , courses c,teachers t where s.stu_id = sc.stu_id and sc.cou_id = c.cou_id and t.tea_id=c.tea_id and s.stu_id="
				+ stu_id + " and c.cou_id=" + cou_id + ";";
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

	// 用课程id查询学生成绩和课程信息
	public ArrayList<String[]> see_counum(String cou_id) {
		Connection con = getConnection();
		String sql = "select c.cou_id,c.cou_name,s.stu_id,s.stu_name,s.stu_class,sc.cou_num from students s, score sc , courses c,teachers t where s.stu_id = sc.stu_id and sc.cou_id = c.cou_id and t.tea_id=c.tea_id and c.cou_id="
				+ cou_id + ";";
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
