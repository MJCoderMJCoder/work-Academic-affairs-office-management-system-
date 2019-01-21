/*
 * DL.java
 *
 * Created on __DATE__, __TIME__
 */

package swork;

import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import java.util.ArrayList;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

import com.Admin_cont;
import com.Cont;
import com.Stu_cont;
import com.Tea_cont;

/**
 *
 * @author __USER__
 */
public class DL extends javax.swing.JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/** Creates new form DL */
	Stu_cont student;
	Tea_cont teacher;
	Admin_cont admin;

	public DL() {
		initComponents();

	}

	// GEN-BEGIN:initComponents
	// <editor-fold defaultstate="collapsed" desc="Generated Code">
	private void initComponents() {

		buttonGroup1 = new javax.swing.ButtonGroup();
		login = new javax.swing.JPanel();
		jLabel1 = new javax.swing.JLabel();
		jLabel2 = new javax.swing.JLabel();
		jButton1 = new javax.swing.JButton();
		jButton2 = new javax.swing.JButton();
		jRadioButton1 = new javax.swing.JRadioButton();
		jRadioButton2 = new javax.swing.JRadioButton();
		jRadioButton3 = new javax.swing.JRadioButton();
		jTextField1 = new javax.swing.JTextField();
		jPasswordField10 = new javax.swing.JPasswordField();
		register = new javax.swing.JPanel();
		jLabel3 = new javax.swing.JLabel();
		jTextField3 = new javax.swing.JTextField();
		jLabel4 = new javax.swing.JLabel();
		jLabel5 = new javax.swing.JLabel();
		jLabel6 = new javax.swing.JLabel();
		jLabel7 = new javax.swing.JLabel();
		jLabel8 = new javax.swing.JLabel();
		Is = new javax.swing.JComboBox();
		jComboBox1 = new javax.swing.JComboBox();
		jTextField4 = new javax.swing.JTextField();
		jComboBox3 = new javax.swing.JComboBox();
		jLabel9 = new javax.swing.JLabel();
		jSpinner1 = new javax.swing.JSpinner();
		jPasswordField1 = new javax.swing.JPasswordField();
		jButton3 = new javax.swing.JButton();
		jButton4 = new javax.swing.JButton();
		stu = new javax.swing.JPanel();
		jLabel10 = new javax.swing.JLabel();
		jButton5 = new javax.swing.JButton();
		jButton6 = new javax.swing.JButton();
		jButton18 = new javax.swing.JButton();
		jButton32 = new javax.swing.JButton();
		tea = new javax.swing.JPanel();
		jLabel13 = new javax.swing.JLabel();
		jButton7 = new javax.swing.JButton();
		jButton8 = new javax.swing.JButton();
		jButton9 = new javax.swing.JButton();
		jButton10 = new javax.swing.JButton();
		jButton19 = new javax.swing.JButton();
		jButton29 = new javax.swing.JButton();
		jButton35 = new javax.swing.JButton();
		guanli = new javax.swing.JPanel();
		jLabel18 = new javax.swing.JLabel();
		jButton11 = new javax.swing.JButton();
		jButton13 = new javax.swing.JButton();
		jButton15 = new javax.swing.JButton();
		jButton17 = new javax.swing.JButton();
		jButton20 = new javax.swing.JButton();
		jButton44 = new javax.swing.JButton();
		jButton45 = new javax.swing.JButton();
		jButton73 = new javax.swing.JButton();
		jButton76 = new javax.swing.JButton();
		jButton57 = new javax.swing.JButton();
		jButton60 = new javax.swing.JButton();
		stu1 = new javax.swing.JPanel();
		jScrollPane1 = new javax.swing.JScrollPane();
		jTable1 = new javax.swing.JTable();
		jButton21 = new javax.swing.JButton();
		jButton22 = new javax.swing.JButton();
		jButton55 = new javax.swing.JButton();
		stu2 = new javax.swing.JPanel();
		jScrollPane2 = new javax.swing.JScrollPane();
		jTable2 = new javax.swing.JTable();
		jButton24 = new javax.swing.JButton();
		tea1 = new javax.swing.JPanel();
		jScrollPane3 = new javax.swing.JScrollPane();
		jTable3 = new javax.swing.JTable();
		jButton31 = new javax.swing.JButton();
		jButton90 = new javax.swing.JButton();
		tea2 = new javax.swing.JPanel();
		jLabel29 = new javax.swing.JLabel();
		jTextField5 = new javax.swing.JTextField();
		jLabel31 = new javax.swing.JLabel();
		jSpinner2 = new javax.swing.JSpinner();
		jLabel32 = new javax.swing.JLabel();
		jSpinner3 = new javax.swing.JSpinner();
		jLabel33 = new javax.swing.JLabel();
		jLabel34 = new javax.swing.JLabel();
		jSpinner4 = new javax.swing.JSpinner();
		jButton25 = new javax.swing.JButton();
		jButton26 = new javax.swing.JButton();
		jLabel37 = new javax.swing.JLabel();
		jComboBox4 = new javax.swing.JComboBox();
		jSpinner5 = new javax.swing.JSpinner();
		jLabel38 = new javax.swing.JLabel();
		jSpinner6 = new javax.swing.JSpinner();
		jLabel11 = new javax.swing.JLabel();
		jSpinner12 = new javax.swing.JSpinner();
		jLabel12 = new javax.swing.JLabel();
		jLabel14 = new javax.swing.JLabel();
		jTextField2 = new javax.swing.JTextField();
		jButton30 = new javax.swing.JButton();
		tea3 = new javax.swing.JPanel();
		jLabel35 = new javax.swing.JLabel();
		jTextField6 = new javax.swing.JTextField();
		jButton27 = new javax.swing.JButton();
		jButton28 = new javax.swing.JButton();
		stu3 = new javax.swing.JPanel();
		jLabel40 = new javax.swing.JLabel();
		jLabel41 = new javax.swing.JLabel();
		jLabel42 = new javax.swing.JLabel();
		jTextField7 = new javax.swing.JTextField();
		jPasswordField2 = new javax.swing.JPasswordField();
		jPasswordField3 = new javax.swing.JPasswordField();
		jButton33 = new javax.swing.JButton();
		jButton34 = new javax.swing.JButton();
		jButton81 = new javax.swing.JButton();
		tea5 = new javax.swing.JPanel();
		jLabel47 = new javax.swing.JLabel();
		jTextField9 = new javax.swing.JTextField();
		jButton38 = new javax.swing.JButton();
		jLabel48 = new javax.swing.JLabel();
		jTextField10 = new javax.swing.JTextField();
		jLabel49 = new javax.swing.JLabel();
		jTextField11 = new javax.swing.JTextField();
		jLabel50 = new javax.swing.JLabel();
		jTextField12 = new javax.swing.JTextField();
		jLabel51 = new javax.swing.JLabel();
		jTextField13 = new javax.swing.JTextField();
		jLabel52 = new javax.swing.JLabel();
		jLabel53 = new javax.swing.JLabel();
		jTextField15 = new javax.swing.JTextField();
		jButton39 = new javax.swing.JButton();
		jButton40 = new javax.swing.JButton();
		jLabel25 = new javax.swing.JLabel();
		jTextField26 = new javax.swing.JTextField();
		jLabel26 = new javax.swing.JLabel();
		jLabel27 = new javax.swing.JLabel();
		jLabel28 = new javax.swing.JLabel();
		jLabel30 = new javax.swing.JLabel();
		tea4 = new javax.swing.JPanel();
		jLabel77 = new javax.swing.JLabel();
		jTextField24 = new javax.swing.JTextField();
		jButton69 = new javax.swing.JButton();
		jScrollPane10 = new javax.swing.JScrollPane();
		jTable10 = new javax.swing.JTable();
		jButton70 = new javax.swing.JButton();
		jButton71 = new javax.swing.JButton();
		jButton83 = new javax.swing.JButton();
		tea6 = new javax.swing.JPanel();
		jLabel44 = new javax.swing.JLabel();
		jLabel45 = new javax.swing.JLabel();
		jLabel46 = new javax.swing.JLabel();
		jTextField8 = new javax.swing.JTextField();
		jPasswordField4 = new javax.swing.JPasswordField();
		jPasswordField5 = new javax.swing.JPasswordField();
		jButton36 = new javax.swing.JButton();
		jButton37 = new javax.swing.JButton();
		jButton41 = new javax.swing.JButton();
		guanli1 = new javax.swing.JPanel();
		jScrollPane4 = new javax.swing.JScrollPane();
		jTable4 = new javax.swing.JTable();
		jButton42 = new javax.swing.JButton();
		jButton43 = new javax.swing.JButton();
		jComboBox5 = new javax.swing.JComboBox();
		jButton48 = new javax.swing.JButton();
		jComboBox6 = new javax.swing.JComboBox();
		jButton84 = new javax.swing.JButton();
		jButton61 = new javax.swing.JButton();
		guanli8 = new javax.swing.JPanel();
		jLabel56 = new javax.swing.JLabel();
		jLabel57 = new javax.swing.JLabel();
		jLabel58 = new javax.swing.JLabel();
		jTextField14 = new javax.swing.JTextField();
		jPasswordField6 = new javax.swing.JPasswordField();
		jPasswordField7 = new javax.swing.JPasswordField();
		jButton46 = new javax.swing.JButton();
		jButton47 = new javax.swing.JButton();
		jButton89 = new javax.swing.JButton();
		guanli2 = new javax.swing.JPanel();
		jLabel59 = new javax.swing.JLabel();
		jTextField16 = new javax.swing.JTextField();
		jLabel93 = new javax.swing.JLabel();
		jTextField31 = new javax.swing.JTextField();
		jLabel94 = new javax.swing.JLabel();
		jComboBox12 = new javax.swing.JComboBox();
		jLabel95 = new javax.swing.JLabel();
		jSpinner14 = new javax.swing.JSpinner();
		jLabel96 = new javax.swing.JLabel();
		jPasswordField11 = new javax.swing.JPasswordField();
		jButton16 = new javax.swing.JButton();
		jButton49 = new javax.swing.JButton();
		jButton23 = new javax.swing.JButton();
		guanli9 = new javax.swing.JPanel();
		jLabel71 = new javax.swing.JLabel();
		jTextField21 = new javax.swing.JTextField();
		jButton66 = new javax.swing.JButton();
		jLabel72 = new javax.swing.JLabel();
		jTextField22 = new javax.swing.JTextField();
		jLabel73 = new javax.swing.JLabel();
		jTextField23 = new javax.swing.JTextField();
		jLabel74 = new javax.swing.JLabel();
		jPasswordField8 = new javax.swing.JPasswordField();
		jLabel75 = new javax.swing.JLabel();
		jLabel76 = new javax.swing.JLabel();
		jPasswordField9 = new javax.swing.JPasswordField();
		jButton67 = new javax.swing.JButton();
		jButton68 = new javax.swing.JButton();
		jButton88 = new javax.swing.JButton();
		guanli3 = new javax.swing.JPanel();
		jScrollPane6 = new javax.swing.JScrollPane();
		jTable6 = new javax.swing.JTable();
		jButton52 = new javax.swing.JButton();
		jButton53 = new javax.swing.JButton();
		jComboBox7 = new javax.swing.JComboBox();
		jButton54 = new javax.swing.JButton();
		jComboBox8 = new javax.swing.JComboBox();
		jButton85 = new javax.swing.JButton();
		guanli4 = new javax.swing.JPanel();
		jLabel60 = new javax.swing.JLabel();
		jTextField17 = new javax.swing.JTextField();
		jLabel97 = new javax.swing.JLabel();
		jLabel98 = new javax.swing.JLabel();
		jTextField32 = new javax.swing.JTextField();
		jLabel99 = new javax.swing.JLabel();
		jTextField33 = new javax.swing.JTextField();
		jButton50 = new javax.swing.JButton();
		jButton51 = new javax.swing.JButton();
		jLabel100 = new javax.swing.JLabel();
		jButton65 = new javax.swing.JButton();
		guanli5 = new javax.swing.JPanel();
		jLabel61 = new javax.swing.JLabel();
		jTextField18 = new javax.swing.JTextField();
		jLabel63 = new javax.swing.JLabel();
		jSpinner7 = new javax.swing.JSpinner();
		jLabel64 = new javax.swing.JLabel();
		jSpinner8 = new javax.swing.JSpinner();
		jLabel65 = new javax.swing.JLabel();
		jLabel66 = new javax.swing.JLabel();
		jSpinner9 = new javax.swing.JSpinner();
		jButton58 = new javax.swing.JButton();
		jButton59 = new javax.swing.JButton();
		jLabel67 = new javax.swing.JLabel();
		jComboBox9 = new javax.swing.JComboBox();
		jSpinner10 = new javax.swing.JSpinner();
		jLabel68 = new javax.swing.JLabel();
		jSpinner11 = new javax.swing.JSpinner();
		jLabel69 = new javax.swing.JLabel();
		jTextField19 = new javax.swing.JTextField();
		jLabel36 = new javax.swing.JLabel();
		jComboBox2 = new javax.swing.JComboBox();
		jLabel39 = new javax.swing.JLabel();
		jSpinner13 = new javax.swing.JSpinner();
		jLabel43 = new javax.swing.JLabel();
		jButton86 = new javax.swing.JButton();
		guanli6 = new javax.swing.JPanel();
		jScrollPane11 = new javax.swing.JScrollPane();
		jTable11 = new javax.swing.JTable();
		jButton72 = new javax.swing.JButton();
		jButton77 = new javax.swing.JButton();
		jLabel119 = new javax.swing.JLabel();
		jTextField34 = new javax.swing.JTextField();
		jButton78 = new javax.swing.JButton();
		jButton87 = new javax.swing.JButton();
		guanli7 = new javax.swing.JPanel();
		jScrollPane9 = new javax.swing.JScrollPane();
		jTable9 = new javax.swing.JTable();
		jButton63 = new javax.swing.JButton();
		jButton64 = new javax.swing.JButton();
		jButton12 = new javax.swing.JButton();
		tea3_ = new javax.swing.JPanel();
		jLabel15 = new javax.swing.JLabel();
		jLabel16 = new javax.swing.JLabel();
		jLabel17 = new javax.swing.JLabel();
		jTextField25 = new javax.swing.JTextField();
		jLabel20 = new javax.swing.JLabel();
		jTextField27 = new javax.swing.JTextField();
		jLabel21 = new javax.swing.JLabel();
		jTextField28 = new javax.swing.JTextField();
		jLabel22 = new javax.swing.JLabel();
		jTextField29 = new javax.swing.JTextField();
		jLabel23 = new javax.swing.JLabel();
		jTextField30 = new javax.swing.JTextField();
		jButton74 = new javax.swing.JButton();
		jButton75 = new javax.swing.JButton();
		jLabel19 = new javax.swing.JLabel();
		jLabel24 = new javax.swing.JLabel();
		jButton82 = new javax.swing.JButton();
		guanli7_ = new javax.swing.JPanel();
		jLabel54 = new javax.swing.JLabel();
		jLabel55 = new javax.swing.JLabel();
		jLabel62 = new javax.swing.JLabel();
		jLabel78 = new javax.swing.JLabel();
		jLabel79 = new javax.swing.JLabel();
		jLabel80 = new javax.swing.JLabel();
		jLabel81 = new javax.swing.JLabel();
		jLabel82 = new javax.swing.JLabel();
		jLabel83 = new javax.swing.JLabel();
		jLabel84 = new javax.swing.JLabel();
		jLabel85 = new javax.swing.JLabel();
		jLabel86 = new javax.swing.JLabel();
		jLabel87 = new javax.swing.JLabel();
		jLabel88 = new javax.swing.JLabel();
		jLabel89 = new javax.swing.JLabel();
		jLabel90 = new javax.swing.JLabel();
		jLabel91 = new javax.swing.JLabel();
		jLabel92 = new javax.swing.JLabel();
		jButton14 = new javax.swing.JButton();
		stu1_ = new javax.swing.JPanel();
		jLabel101 = new javax.swing.JLabel();
		jLabel102 = new javax.swing.JLabel();
		jLabel103 = new javax.swing.JLabel();
		jLabel104 = new javax.swing.JLabel();
		jLabel105 = new javax.swing.JLabel();
		jLabel106 = new javax.swing.JLabel();
		jLabel107 = new javax.swing.JLabel();
		jLabel108 = new javax.swing.JLabel();
		jLabel109 = new javax.swing.JLabel();
		jLabel110 = new javax.swing.JLabel();
		jLabel111 = new javax.swing.JLabel();
		jLabel112 = new javax.swing.JLabel();
		jLabel113 = new javax.swing.JLabel();
		jLabel114 = new javax.swing.JLabel();
		jLabel115 = new javax.swing.JLabel();
		jLabel116 = new javax.swing.JLabel();
		jLabel117 = new javax.swing.JLabel();
		jLabel118 = new javax.swing.JLabel();
		jButton56 = new javax.swing.JButton();
		guanli10 = new javax.swing.JPanel();
		jLabel70 = new javax.swing.JLabel();
		jLabel120 = new javax.swing.JLabel();
		jLabel121 = new javax.swing.JLabel();
		jLabel122 = new javax.swing.JLabel();
		jLabel123 = new javax.swing.JLabel();
		jLabel124 = new javax.swing.JLabel();
		jLabel125 = new javax.swing.JLabel();
		jTextField20 = new javax.swing.JTextField();
		jTextField35 = new javax.swing.JTextField();
		jButton62 = new javax.swing.JButton();
		jTextField36 = new javax.swing.JTextField();
		jTextField37 = new javax.swing.JTextField();
		jTextField38 = new javax.swing.JTextField();
		jButton79 = new javax.swing.JButton();
		jTextField39 = new javax.swing.JTextField();
		jButton80 = new javax.swing.JButton();
		jLabel126 = new javax.swing.JLabel();
		jTextField40 = new javax.swing.JTextField();
		jLabel127 = new javax.swing.JLabel();
		jLabel128 = new javax.swing.JLabel();
		jLabel129 = new javax.swing.JLabel();
		jLabel130 = new javax.swing.JLabel();
		guanli1_ = new javax.swing.JPanel();
		jLabel131 = new javax.swing.JLabel();
		jLabel132 = new javax.swing.JLabel();
		jLabel133 = new javax.swing.JLabel();
		jLabel134 = new javax.swing.JLabel();
		jLabel135 = new javax.swing.JLabel();
		jLabel136 = new javax.swing.JLabel();
		jLabel137 = new javax.swing.JLabel();
		jLabel138 = new javax.swing.JLabel();
		jLabel139 = new javax.swing.JLabel();
		jLabel140 = new javax.swing.JLabel();
		jLabel141 = new javax.swing.JLabel();
		jLabel142 = new javax.swing.JLabel();
		jButton92 = new javax.swing.JButton();
		tea1_ = new javax.swing.JPanel();
		jLabel143 = new javax.swing.JLabel();
		jLabel144 = new javax.swing.JLabel();
		jLabel145 = new javax.swing.JLabel();
		jLabel146 = new javax.swing.JLabel();
		jLabel147 = new javax.swing.JLabel();
		jLabel148 = new javax.swing.JLabel();
		jLabel149 = new javax.swing.JLabel();
		jLabel150 = new javax.swing.JLabel();
		jLabel151 = new javax.swing.JLabel();
		jLabel152 = new javax.swing.JLabel();
		jLabel153 = new javax.swing.JLabel();
		jLabel154 = new javax.swing.JLabel();
		jButton91 = new javax.swing.JButton();

		setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
		setTitle("\u767b\u9646\u754c\u9762");
		setBounds(new java.awt.Rectangle(0, 0, 0, 0));
		setLocationByPlatform(true);
		setResizable(false);
		getContentPane().setLayout(new java.awt.CardLayout());

		login.setRequestFocusEnabled(false);
		login.addKeyListener(new java.awt.event.KeyAdapter() {
			public void keyPressed(java.awt.event.KeyEvent evt) {
				loginKeyPressed(evt);
			}
		});

		jLabel1.setText("\u8d26\u53f7\uff1a");

		jLabel2.setText("\u5bc6\u7801\uff1a");

		jButton1.setText("\u767b\u9646");
		jButton1.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton1ActionPerformed(evt);
			}
		});

		jButton2.setText("\u6ce8\u518c");
		jButton2.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton2ActionPerformed(evt);
			}
		});

		buttonGroup1.add(jRadioButton1);
		jRadioButton1.setText("\u5b66\u751f");
		jRadioButton1.addKeyListener(new java.awt.event.KeyAdapter() {
			public void keyPressed(java.awt.event.KeyEvent evt) {
				jRadioButton1KeyPressed(evt);
			}
		});

		buttonGroup1.add(jRadioButton2);
		jRadioButton2.setText("\u8001\u5e08");
		jRadioButton2.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jRadioButton2ActionPerformed(evt);
			}
		});
		jRadioButton2.addKeyListener(new java.awt.event.KeyAdapter() {
			public void keyPressed(java.awt.event.KeyEvent evt) {
				jRadioButton2KeyPressed(evt);
			}
		});

		buttonGroup1.add(jRadioButton3);
		jRadioButton3.setText("\u7ba1\u7406");
		jRadioButton3.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jRadioButton3ActionPerformed(evt);
			}
		});
		jRadioButton3.addKeyListener(new java.awt.event.KeyAdapter() {
			public void keyPressed(java.awt.event.KeyEvent evt) {
				jRadioButton3KeyPressed(evt);
			}
		});

		jTextField1.addKeyListener(new java.awt.event.KeyAdapter() {
			public void keyPressed(java.awt.event.KeyEvent evt) {
				jTextField1KeyPressed(evt);
			}
		});

		jPasswordField10.addKeyListener(new java.awt.event.KeyAdapter() {
			public void keyPressed(java.awt.event.KeyEvent evt) {
				jPasswordField10KeyPressed(evt);
			}
		});

		javax.swing.GroupLayout loginLayout = new javax.swing.GroupLayout(login);
		login.setLayout(loginLayout);
		loginLayout.setHorizontalGroup(loginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(loginLayout.createSequentialGroup().addGap(153, 153, 153)
						.addGroup(loginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
								.addGroup(loginLayout.createSequentialGroup()
										.addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 119,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
										.addComponent(
												jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 119,
												javax.swing.GroupLayout.PREFERRED_SIZE))
								.addGroup(loginLayout.createSequentialGroup()
										.addGroup(loginLayout
												.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
												.addComponent(jRadioButton1)
												.addGroup(loginLayout
														.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
														.addComponent(jLabel1).addComponent(jLabel2)))
										.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
										.addGroup(loginLayout
												.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
												.addGroup(loginLayout
														.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING,
																false)
														.addGroup(loginLayout.createSequentialGroup().addPreferredGap(
																javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																.addComponent(jTextField1,
																		javax.swing.GroupLayout.DEFAULT_SIZE, 187,
																		Short.MAX_VALUE))
														.addGroup(loginLayout.createSequentialGroup().addGap(26, 26, 26)
																.addComponent(jRadioButton2).addGap(29, 29, 29)
																.addComponent(jRadioButton3)))
												.addComponent(jPasswordField10, javax.swing.GroupLayout.PREFERRED_SIZE,
														187, javax.swing.GroupLayout.PREFERRED_SIZE))))
						.addContainerGap(186, Short.MAX_VALUE)));
		loginLayout.setVerticalGroup(loginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(loginLayout.createSequentialGroup().addGap(143, 143, 143)
						.addGroup(loginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(jLabel1).addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
						.addGap(27, 27, 27)
						.addGroup(loginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(jLabel2)
								.addComponent(jPasswordField10, javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
						.addGap(36, 36, 36)
						.addGroup(loginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(jRadioButton1).addComponent(jRadioButton2).addComponent(jRadioButton3))
						.addGap(51, 51, 51)
						.addGroup(loginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 41,
										javax.swing.GroupLayout.PREFERRED_SIZE)
								.addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 41,
										javax.swing.GroupLayout.PREFERRED_SIZE))
						.addContainerGap(221, Short.MAX_VALUE)));

		getContentPane().add(login, "card2");

		jLabel3.setText("\u59d3\u540d\uff1a");

		jLabel4.setText("\u5b66\u53f7\uff1a");

		jLabel5.setText("\u73ed\u7ea7\uff1a");

		jLabel6.setText("\u4e13\u4e1a\uff1a");

		jLabel7.setText("\u6027\u522b\uff1a");

		jLabel8.setText("\u5e74\u9f84\uff1a");

		Is.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "计算机科学与技术", "通讯工程", "电气工程", "电子" }));
		Is.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				IsActionPerformed(evt);
			}
		});

		jComboBox1.setModel(
				new javax.swing.DefaultComboBoxModel(new String[] { "一班", "二班", "三班", "四班", "五班", "六班", "七班", "八班" }));

		jComboBox3.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "男", "女" }));

		jLabel9.setText("\u5bc6\u7801\uff1a");

		jSpinner1.setModel(
				new javax.swing.SpinnerNumberModel(Integer.valueOf(0), Integer.valueOf(0), null, Integer.valueOf(1)));

		jButton3.setText("\u6ce8\u518c");
		jButton3.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton3ActionPerformed(evt);
			}
		});

		jButton4.setText("\u8fd4\u56de\u9996\u9875");
		jButton4.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton4ActionPerformed(evt);
			}
		});

		javax.swing.GroupLayout registerLayout = new javax.swing.GroupLayout(register);
		register.setLayout(registerLayout);
		registerLayout.setHorizontalGroup(registerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(registerLayout.createSequentialGroup().addGap(174, 174, 174)
						.addGroup(registerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
								.addComponent(jButton4, javax.swing.GroupLayout.Alignment.LEADING,
										javax.swing.GroupLayout.DEFAULT_SIZE, 219, Short.MAX_VALUE)
								.addGroup(javax.swing.GroupLayout.Alignment.LEADING, registerLayout
										.createSequentialGroup().addGroup(registerLayout
												.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
												.addComponent(jLabel9).addComponent(jLabel5).addComponent(jLabel6)
												.addComponent(
														jLabel8)
												.addComponent(jLabel7).addComponent(jLabel4).addComponent(jLabel3))
										.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
										.addGroup(registerLayout
												.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
												.addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 178,
														javax.swing.GroupLayout.PREFERRED_SIZE)
												.addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 178,
														javax.swing.GroupLayout.PREFERRED_SIZE)
												.addComponent(Is, javax.swing.GroupLayout.PREFERRED_SIZE,
														javax.swing.GroupLayout.DEFAULT_SIZE,
														javax.swing.GroupLayout.PREFERRED_SIZE)
												.addComponent(
														jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 77,
														javax.swing.GroupLayout.PREFERRED_SIZE)
												.addComponent(jPasswordField1, javax.swing.GroupLayout.DEFAULT_SIZE,
														178, Short.MAX_VALUE)
												.addGroup(registerLayout
														.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING,
																false)
														.addComponent(jSpinner1,
																javax.swing.GroupLayout.Alignment.LEADING)
														.addComponent(jComboBox3,
																javax.swing.GroupLayout.Alignment.LEADING, 0, 64,
																Short.MAX_VALUE))))
								.addComponent(jButton3, javax.swing.GroupLayout.Alignment.LEADING,
										javax.swing.GroupLayout.DEFAULT_SIZE, 219, Short.MAX_VALUE))
						.addGap(200, 200, 200)));
		registerLayout.setVerticalGroup(registerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(registerLayout.createSequentialGroup().addGap(105, 105, 105)
						.addGroup(registerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
								.addComponent(jLabel3))
						.addGap(15, 15, 15)
						.addGroup(registerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
								.addComponent(jLabel4))
						.addGap(9, 9, 9)
						.addGroup(registerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(jComboBox3, javax.swing.GroupLayout.PREFERRED_SIZE, 23,
										javax.swing.GroupLayout.PREFERRED_SIZE)
								.addComponent(jLabel7))
						.addGap(9, 9, 9)
						.addGroup(registerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(jLabel8).addComponent(jSpinner1, javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
						.addGroup(registerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(Is, javax.swing.GroupLayout.PREFERRED_SIZE, 21,
										javax.swing.GroupLayout.PREFERRED_SIZE)
								.addComponent(jLabel6))
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
						.addGroup(registerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 21,
										javax.swing.GroupLayout.PREFERRED_SIZE)
								.addComponent(jLabel5))
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
						.addGroup(registerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(jPasswordField1, javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
								.addComponent(jLabel9))
						.addGap(34, 34, 34).addComponent(jButton3)
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addComponent(jButton4)
						.addContainerGap(180, Short.MAX_VALUE)));

		getContentPane().add(register, "card3");

		jLabel10.setText("\u67d0\u67d0\u540c\u5b66\uff0c\u6b22\u8fce\u4f60");

		jButton5.setText("\u9009\u8bfe");
		jButton5.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton5ActionPerformed(evt);
			}
		});

		jButton6.setText("\u67e5\u770b\u6210\u7ee9");
		jButton6.setMaximumSize(new java.awt.Dimension(63, 29));
		jButton6.setMinimumSize(new java.awt.Dimension(63, 29));
		jButton6.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton6ActionPerformed(evt);
			}
		});

		jButton18.setText("\u4fee\u6539\u5bc6\u7801");
		jButton18.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton18ActionPerformed(evt);
			}
		});

		jButton32.setText("\u9000\u51fa\u767b\u9646");
		jButton32.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton32ActionPerformed(evt);
			}
		});

		javax.swing.GroupLayout stuLayout = new javax.swing.GroupLayout(stu);
		stu.setLayout(stuLayout);
		stuLayout
				.setHorizontalGroup(
						stuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
								.addGroup(stuLayout
										.createSequentialGroup().addGap(224, 224, 224)
										.addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, 120,
												Short.MAX_VALUE)
										.addGap(240, 240, 240))
								.addGroup(
										stuLayout.createSequentialGroup().addGap(211, 211, 211)
												.addGroup(stuLayout
														.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
														.addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE,
																150, javax.swing.GroupLayout.PREFERRED_SIZE)
														.addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE,
																150, javax.swing.GroupLayout.PREFERRED_SIZE)
														.addComponent(jButton18, javax.swing.GroupLayout.PREFERRED_SIZE,
																150, javax.swing.GroupLayout.PREFERRED_SIZE)
														.addComponent(jButton32, javax.swing.GroupLayout.PREFERRED_SIZE,
																150, javax.swing.GroupLayout.PREFERRED_SIZE))
												.addContainerGap(223, Short.MAX_VALUE)));
		stuLayout
				.setVerticalGroup(
						stuLayout
								.createParallelGroup(
										javax.swing.GroupLayout.Alignment.LEADING)
								.addGroup(stuLayout.createSequentialGroup().addGap(58, 58, 58)
										.addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 41,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addGap(89, 89, 89)
										.addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 35,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
										.addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 35,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
										.addComponent(jButton18, javax.swing.GroupLayout.PREFERRED_SIZE, 35,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
										.addComponent(jButton32, javax.swing.GroupLayout.PREFERRED_SIZE, 35,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addContainerGap(236, Short.MAX_VALUE)));

		getContentPane().add(stu, "card4");

		jLabel13.setText("\u5434\u67f1\u8c6a\u8001\u5e08\uff0c\u6b22\u8fce\u4f60");

		jButton7.setText("\u67e5\u770b\u5b66\u751f");
		jButton7.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton7ActionPerformed(evt);
			}
		});

		jButton8.setText("\u6dfb\u52a0\u8bfe\u7a0b");
		jButton8.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton8ActionPerformed(evt);
			}
		});

		jButton9.setText("\u4fee\u6539\u8bfe\u7a0b");
		jButton9.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton9ActionPerformed(evt);
			}
		});

		jButton10.setText("\u6dfb\u52a0\u6210\u7ee9");
		jButton10.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton10ActionPerformed(evt);
			}
		});

		jButton19.setText("\u4fee\u6539\u5bc6\u7801");
		jButton19.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton19ActionPerformed(evt);
			}
		});

		jButton29.setText("\u4fee\u6539\u6210\u7ee9");
		jButton29.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton29ActionPerformed(evt);
			}
		});

		jButton35.setText("\u9000\u51fa\u767b\u9646");
		jButton35.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton35ActionPerformed(evt);
			}
		});

		javax.swing.GroupLayout teaLayout = new javax.swing.GroupLayout(tea);
		tea.setLayout(teaLayout);
		teaLayout.setHorizontalGroup(teaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(teaLayout.createSequentialGroup().addGap(205, 205, 205)
						.addGroup(teaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
								.addComponent(jButton35, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
								.addComponent(jButton19, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
								.addComponent(jButton29, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
								.addComponent(jButton10, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
								.addComponent(jButton9, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
								.addComponent(jButton8, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
								.addComponent(jButton7, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
								.addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
						.addContainerGap(229, Short.MAX_VALUE)));
		teaLayout
				.setVerticalGroup(
						teaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
								.addGroup(teaLayout.createSequentialGroup().addGap(94, 94, 94).addComponent(jLabel13)
										.addGap(52, 52, 52)
										.addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 35,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
										.addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 35,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
										.addComponent(jButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 35,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
										.addComponent(jButton10, javax.swing.GroupLayout.PREFERRED_SIZE, 35,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
										.addComponent(jButton29, javax.swing.GroupLayout.PREFERRED_SIZE, 35,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
										.addComponent(jButton19, javax.swing.GroupLayout.PREFERRED_SIZE, 35,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
										.addComponent(jButton35, javax.swing.GroupLayout.PREFERRED_SIZE, 35,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addContainerGap(132, Short.MAX_VALUE)));

		getContentPane().add(tea, "card5");

		jLabel18.setText("\u67d0\u67d0\uff0c\u6b22\u8fce\u4f60");

		jButton11.setText("\u67e5\u770b/\u5220\u9664\u5b66\u751f");
		jButton11.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton11ActionPerformed(evt);
			}
		});

		jButton13.setText("\u67e5\u770b/\u5220\u9664\u6559\u5e08");
		jButton13.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton13ActionPerformed(evt);
			}
		});

		jButton15.setText("\u6dfb\u52a0\u8bfe\u7a0b");
		jButton15.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton15ActionPerformed(evt);
			}
		});

		jButton17.setText("\u67e5\u770b/\u5220\u9664\u8bfe\u7a0b");
		jButton17.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton17ActionPerformed(evt);
			}
		});

		jButton20.setText("\u9000\u51fa\u767b\u9646");
		jButton20.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton20ActionPerformed(evt);
			}
		});

		jButton44.setText("\u4fee\u6539\u5bc6\u7801");
		jButton44.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton44ActionPerformed(evt);
			}
		});

		jButton45.setText("\u4fee\u6539\u6559\u5e08\u5bc6\u7801");
		jButton45.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton45ActionPerformed(evt);
			}
		});

		jButton73.setText("\u4fee\u6539\u4e2a\u4eba\u4fe1\u606f");
		jButton73.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton73ActionPerformed(evt);
			}
		});

		jButton76.setText("\u589e\u52a0\u8001\u5e08");
		jButton76.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton76ActionPerformed(evt);
			}
		});

		jButton57.setText("\u6dfb\u52a0\u6210\u7ee9");
		jButton57.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton57ActionPerformed(evt);
			}
		});

		jButton60.setText("\u4fee\u6539\u6210\u7ee9");
		jButton60.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton60ActionPerformed(evt);
			}
		});

		javax.swing.GroupLayout guanliLayout = new javax.swing.GroupLayout(guanli);
		guanli.setLayout(guanliLayout);
		guanliLayout.setHorizontalGroup(guanliLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(guanliLayout.createSequentialGroup().addGap(210, 210, 210).addGroup(guanliLayout
						.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
						.addComponent(jButton60, javax.swing.GroupLayout.PREFERRED_SIZE, 150,
								javax.swing.GroupLayout.PREFERRED_SIZE)
						.addComponent(jButton57, javax.swing.GroupLayout.PREFERRED_SIZE, 150,
								javax.swing.GroupLayout.PREFERRED_SIZE)
						.addComponent(jButton45, javax.swing.GroupLayout.PREFERRED_SIZE, 150,
								javax.swing.GroupLayout.PREFERRED_SIZE)
						.addComponent(jButton44, javax.swing.GroupLayout.PREFERRED_SIZE, 150,
								javax.swing.GroupLayout.PREFERRED_SIZE)
						.addComponent(jButton17, javax.swing.GroupLayout.PREFERRED_SIZE, 150,
								javax.swing.GroupLayout.PREFERRED_SIZE)
						.addComponent(jButton73, javax.swing.GroupLayout.PREFERRED_SIZE, 150,
								javax.swing.GroupLayout.PREFERRED_SIZE)
						.addComponent(jButton20, javax.swing.GroupLayout.PREFERRED_SIZE, 150,
								javax.swing.GroupLayout.PREFERRED_SIZE)
						.addComponent(jButton15, javax.swing.GroupLayout.PREFERRED_SIZE, 150,
								javax.swing.GroupLayout.PREFERRED_SIZE)
						.addGroup(guanliLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
								.addComponent(jButton76, javax.swing.GroupLayout.Alignment.TRAILING,
										javax.swing.GroupLayout.PREFERRED_SIZE, 150,
										javax.swing.GroupLayout.PREFERRED_SIZE)
								.addComponent(jButton13, javax.swing.GroupLayout.PREFERRED_SIZE, 150,
										javax.swing.GroupLayout.PREFERRED_SIZE))
						.addGroup(guanliLayout.createSequentialGroup().addGap(19, 19, 19).addComponent(jLabel18))
						.addComponent(jButton11, javax.swing.GroupLayout.PREFERRED_SIZE, 150,
								javax.swing.GroupLayout.PREFERRED_SIZE))
						.addContainerGap(224, Short.MAX_VALUE)));
		guanliLayout
				.setVerticalGroup(
						guanliLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
								.addGroup(guanliLayout.createSequentialGroup().addGap(45, 45, 45).addComponent(jLabel18)
										.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
										.addComponent(jButton11, javax.swing.GroupLayout.PREFERRED_SIZE, 30,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
										.addComponent(jButton76, javax.swing.GroupLayout.PREFERRED_SIZE, 35,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
										.addComponent(jButton13, javax.swing.GroupLayout.PREFERRED_SIZE, 35,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
										.addComponent(jButton15, javax.swing.GroupLayout.PREFERRED_SIZE, 35,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
										.addComponent(jButton57, javax.swing.GroupLayout.PREFERRED_SIZE, 35,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
										.addComponent(jButton60, javax.swing.GroupLayout.PREFERRED_SIZE, 35,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
										.addComponent(jButton17, javax.swing.GroupLayout.PREFERRED_SIZE, 35,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
										.addComponent(jButton44, javax.swing.GroupLayout.PREFERRED_SIZE, 35,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
										.addComponent(jButton45, javax.swing.GroupLayout.PREFERRED_SIZE, 35,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
										.addComponent(jButton73, javax.swing.GroupLayout.PREFERRED_SIZE, 35,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
										.addComponent(jButton20, javax.swing.GroupLayout.PREFERRED_SIZE, 35,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addContainerGap(58, Short.MAX_VALUE)));

		getContentPane().add(guanli, "card6");

		jTable1.setModel(new javax.swing.table.DefaultTableModel(new Object[][] {

		}, new String[] { "课程ID", "课程名称", "课程老师", "余量", "选择" }) {
			boolean[] canEdit = new boolean[] { false, false, false, false, false };

			public boolean isCellEditable(int rowIndex, int columnIndex) {
				return canEdit[columnIndex];
			}
		});
		jScrollPane1.setViewportView(jTable1);

		jButton21.setText("\u8be6\u60c5");
		jButton21.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton21ActionPerformed(evt);
			}
		});

		jButton22.setText("<-");
		jButton22.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton22ActionPerformed(evt);
			}
		});

		jButton55.setText("\u9009\u5b9a");
		jButton55.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton55ActionPerformed(evt);
			}
		});

		javax.swing.GroupLayout stu1Layout = new javax.swing.GroupLayout(stu1);
		stu1.setLayout(stu1Layout);
		stu1Layout.setHorizontalGroup(stu1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(stu1Layout.createSequentialGroup().addGap(65, 65, 65)
						.addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE,
								javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
						.addContainerGap(67, Short.MAX_VALUE))
				.addGroup(stu1Layout.createSequentialGroup().addGap(191, 191, 191)
						.addComponent(jButton55, javax.swing.GroupLayout.PREFERRED_SIZE, 82,
								javax.swing.GroupLayout.PREFERRED_SIZE)
						.addGap(35, 35, 35)
						.addComponent(jButton21, javax.swing.GroupLayout.PREFERRED_SIZE, 82,
								javax.swing.GroupLayout.PREFERRED_SIZE)
						.addContainerGap(194, Short.MAX_VALUE))
				.addGroup(javax.swing.GroupLayout.Alignment.TRAILING,
						stu1Layout.createSequentialGroup().addContainerGap(522, Short.MAX_VALUE).addComponent(jButton22,
								javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
								.addContainerGap()));
		stu1Layout.setVerticalGroup(stu1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(
				javax.swing.GroupLayout.Alignment.TRAILING,
				stu1Layout.createSequentialGroup().addContainerGap()
						.addComponent(jButton22, javax.swing.GroupLayout.PREFERRED_SIZE, 30,
								javax.swing.GroupLayout.PREFERRED_SIZE)
						.addGap(53, 53, 53)
						.addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 303,
								javax.swing.GroupLayout.PREFERRED_SIZE)
						.addGap(41, 41, 41)
						.addGroup(stu1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(jButton21, javax.swing.GroupLayout.PREFERRED_SIZE, 37,
										javax.swing.GroupLayout.PREFERRED_SIZE)
								.addComponent(jButton55, javax.swing.GroupLayout.PREFERRED_SIZE, 37,
										javax.swing.GroupLayout.PREFERRED_SIZE))
						.addGap(109, 109, 109)));

		getContentPane().add(stu1, "card7");

		jTable2.setModel(new javax.swing.table.DefaultTableModel(new Object[][] {

		}, new String[] { "课程", "时间", "学分", "老师", "成绩" }) {
			boolean[] canEdit = new boolean[] { false, false, false, false, false };

			public boolean isCellEditable(int rowIndex, int columnIndex) {
				return canEdit[columnIndex];
			}
		});
		jScrollPane2.setViewportView(jTable2);

		jButton24.setText("<-");
		jButton24.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton24ActionPerformed(evt);
			}
		});

		javax.swing.GroupLayout stu2Layout = new javax.swing.GroupLayout(stu2);
		stu2.setLayout(stu2Layout);
		stu2Layout.setHorizontalGroup(stu2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(javax.swing.GroupLayout.Alignment.TRAILING,
						stu2Layout.createSequentialGroup().addContainerGap(522, Short.MAX_VALUE)
								.addComponent(jButton24, javax.swing.GroupLayout.PREFERRED_SIZE, 50,
										javax.swing.GroupLayout.PREFERRED_SIZE)
								.addContainerGap())
				.addGroup(stu2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(stu2Layout.createSequentialGroup().addGap(0, 0, Short.MAX_VALUE)
								.addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
								.addGap(0, 0, Short.MAX_VALUE))));
		stu2Layout
				.setVerticalGroup(stu2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(stu2Layout.createSequentialGroup().addContainerGap()
								.addComponent(jButton24, javax.swing.GroupLayout.PREFERRED_SIZE, 30,
										javax.swing.GroupLayout.PREFERRED_SIZE)
								.addContainerGap(544, Short.MAX_VALUE))
						.addGroup(stu2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
								.addGroup(stu2Layout.createSequentialGroup().addGap(0, 0, Short.MAX_VALUE)
										.addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 303,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addGap(0, 0, Short.MAX_VALUE))));

		getContentPane().add(stu2, "card8");

		jTable3.setModel(new javax.swing.table.DefaultTableModel(new Object[][] {

		}, new String[] { "学号", "姓名", "性别", "课程名称" }));
		jScrollPane3.setViewportView(jTable3);

		jButton31.setText("<-");
		jButton31.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton31ActionPerformed(evt);
			}
		});

		jButton90.setText("\u67e5\u770b\u8d44\u6599");
		jButton90.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton90ActionPerformed(evt);
			}
		});

		javax.swing.GroupLayout tea1Layout = new javax.swing.GroupLayout(tea1);
		tea1.setLayout(tea1Layout);
		tea1Layout.setHorizontalGroup(tea1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(javax.swing.GroupLayout.Alignment.TRAILING,
						tea1Layout.createSequentialGroup().addContainerGap(522, Short.MAX_VALUE)
								.addComponent(jButton31, javax.swing.GroupLayout.PREFERRED_SIZE, 50,
										javax.swing.GroupLayout.PREFERRED_SIZE)
								.addContainerGap())
				.addGroup(tea1Layout.createSequentialGroup().addGap(235, 235, 235).addComponent(jButton90)
						.addContainerGap(268, Short.MAX_VALUE))
				.addGroup(tea1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(tea1Layout.createSequentialGroup().addGap(0, 0, Short.MAX_VALUE)
								.addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
								.addGap(0, 0, Short.MAX_VALUE))));
		tea1Layout.setVerticalGroup(tea1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(tea1Layout.createSequentialGroup().addContainerGap()
						.addComponent(jButton31, javax.swing.GroupLayout.PREFERRED_SIZE, 30,
								javax.swing.GroupLayout.PREFERRED_SIZE)
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 430, Short.MAX_VALUE)
						.addComponent(jButton90, javax.swing.GroupLayout.PREFERRED_SIZE, 37,
								javax.swing.GroupLayout.PREFERRED_SIZE)
						.addGap(77, 77, 77))
				.addGroup(
						tea1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
								.addGroup(tea1Layout.createSequentialGroup().addGap(0, 0, Short.MAX_VALUE)
										.addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 303,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addGap(0, 0, Short.MAX_VALUE))));

		getContentPane().add(tea1, "card9");

		jLabel29.setText("\u8bfe\u7a0b\u540d\u79f0\uff1a");

		jLabel31.setText("\u8bfe\u7a0b\u65f6\u95f4\uff1a");

		jSpinner2.setModel(
				new javax.swing.SpinnerNumberModel(Integer.valueOf(0), Integer.valueOf(0), null, Integer.valueOf(1)));

		jLabel32.setText("--");

		jSpinner3.setModel(
				new javax.swing.SpinnerNumberModel(Integer.valueOf(0), Integer.valueOf(0), null, Integer.valueOf(1)));

		jLabel33.setText("\u5468");

		jLabel34.setText("\u5b66\u5206\uff1a");

		jSpinner4.setModel(
				new javax.swing.SpinnerNumberModel(Integer.valueOf(0), Integer.valueOf(0), null, Integer.valueOf(1)));

		jButton25.setText("\u63d0\u4ea4");
		jButton25.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton25ActionPerformed(evt);
			}
		});

		jButton26.setText("<-返回");
		jButton26.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton26ActionPerformed(evt);
			}
		});

		jLabel37.setText("\u4e0a\u8bfe\u65f6\u95f4\uff1a");

		jComboBox4.setModel(
				new javax.swing.DefaultComboBoxModel(new String[] { "周一", "周二", "周三", "周四", "周五", "周六", "周日" }));

		jSpinner5.setModel(
				new javax.swing.SpinnerNumberModel(Integer.valueOf(0), Integer.valueOf(0), null, Integer.valueOf(1)));

		jLabel38.setText("--");

		jSpinner6.setModel(
				new javax.swing.SpinnerNumberModel(Integer.valueOf(0), Integer.valueOf(0), null, Integer.valueOf(1)));

		jLabel11.setText("\u4eba\u6570\uff1a");

		jSpinner12.setModel(
				new javax.swing.SpinnerNumberModel(Integer.valueOf(0), Integer.valueOf(0), null, Integer.valueOf(1)));

		jLabel12.setText("\u8282");

		jLabel14.setText("  \u8bfe\u7a0bID\uff1a");

		jButton30.setText("\u91cd\u7f6e");
		jButton30.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton30ActionPerformed(evt);
			}
		});

		javax.swing.GroupLayout tea2Layout = new javax.swing.GroupLayout(tea2);
		tea2.setLayout(tea2Layout);
		tea2Layout.setHorizontalGroup(tea2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(javax.swing.GroupLayout.Alignment.TRAILING, tea2Layout.createSequentialGroup()
						.addGap(142, 142, 142)
						.addGroup(tea2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
								.addGroup(tea2Layout.createSequentialGroup().addGap(10, 10, 10).addComponent(jLabel11)
										.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 208,
												javax.swing.GroupLayout.PREFERRED_SIZE))
								.addGroup(tea2Layout.createSequentialGroup().addGroup(tea2Layout
										.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
										.addGroup(tea2Layout.createSequentialGroup().addGroup(tea2Layout
												.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
												.addComponent(jLabel31)
												.addGroup(tea2Layout.createSequentialGroup().addGap(10, 10, 10)
														.addComponent(jLabel34))
												.addComponent(jLabel37))
												.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
												.addGroup(tea2Layout
														.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING,
																false)
														.addComponent(jComboBox4, 0,
																javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
														.addComponent(jSpinner4).addComponent(jSpinner2)
														.addComponent(jSpinner12)))
										.addComponent(jButton25, javax.swing.GroupLayout.PREFERRED_SIZE, 114,
												javax.swing.GroupLayout.PREFERRED_SIZE))
										.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
										.addGroup(tea2Layout
												.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
												.addGroup(tea2Layout
														.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING,
																false)
														.addGroup(tea2Layout.createSequentialGroup()
																.addComponent(jLabel32)
																.addPreferredGap(
																		javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																.addComponent(jSpinner3)
																.addPreferredGap(
																		javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
																.addComponent(jLabel33))
														.addGroup(javax.swing.GroupLayout.Alignment.LEADING, tea2Layout
																.createSequentialGroup()
																.addComponent(jSpinner5,
																		javax.swing.GroupLayout.PREFERRED_SIZE, 42,
																		javax.swing.GroupLayout.PREFERRED_SIZE)
																.addPreferredGap(
																		javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																.addComponent(jLabel38)
																.addPreferredGap(
																		javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																.addComponent(jSpinner6,
																		javax.swing.GroupLayout.PREFERRED_SIZE, 42,
																		javax.swing.GroupLayout.PREFERRED_SIZE)))
												.addComponent(jButton30, javax.swing.GroupLayout.PREFERRED_SIZE, 114,
														javax.swing.GroupLayout.PREFERRED_SIZE)))
								.addGroup(tea2Layout.createSequentialGroup()
										.addGroup(tea2Layout
												.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
												.addComponent(jLabel14).addComponent(jLabel29))
										.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
										.addGroup(tea2Layout
												.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
												.addComponent(jTextField5, javax.swing.GroupLayout.DEFAULT_SIZE, 189,
														Short.MAX_VALUE)
												.addComponent(jTextField2, javax.swing.GroupLayout.DEFAULT_SIZE, 189,
														Short.MAX_VALUE))))
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addComponent(jLabel12)
						.addGap(176, 176, 176))
				.addGroup(javax.swing.GroupLayout.Alignment.TRAILING,
						tea2Layout.createSequentialGroup().addContainerGap(522, Short.MAX_VALUE).addComponent(jButton26,
								javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
								.addContainerGap()));
		tea2Layout.setVerticalGroup(tea2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(tea2Layout.createSequentialGroup().addContainerGap()
						.addComponent(jButton26, javax.swing.GroupLayout.PREFERRED_SIZE, 30,
								javax.swing.GroupLayout.PREFERRED_SIZE)
						.addGap(94, 94, 94)
						.addGroup(tea2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(jLabel14).addComponent(jTextField2,
										javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE,
										javax.swing.GroupLayout.PREFERRED_SIZE))
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
						.addGroup(tea2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
								.addComponent(jLabel29).addComponent(jTextField5,
										javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE,
										javax.swing.GroupLayout.PREFERRED_SIZE))
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
						.addGroup(tea2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(jLabel31).addComponent(jLabel32)
								.addComponent(jSpinner2, javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
								.addComponent(jLabel33).addComponent(jSpinner3, javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
						.addGroup(tea2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(jLabel34).addComponent(jSpinner4, javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
						.addGroup(tea2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
								.addGroup(tea2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
										.addComponent(jSpinner5, javax.swing.GroupLayout.PREFERRED_SIZE,
												javax.swing.GroupLayout.DEFAULT_SIZE,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addComponent(jLabel38)
										.addComponent(jSpinner6, javax.swing.GroupLayout.PREFERRED_SIZE,
												javax.swing.GroupLayout.DEFAULT_SIZE,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addComponent(jLabel12))
								.addComponent(jLabel37).addComponent(jComboBox4, javax.swing.GroupLayout.PREFERRED_SIZE,
										25, javax.swing.GroupLayout.PREFERRED_SIZE))
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
						.addGroup(tea2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(jLabel11).addComponent(jSpinner12, javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
						.addGroup(tea2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(jButton25, javax.swing.GroupLayout.PREFERRED_SIZE, 40,
										javax.swing.GroupLayout.PREFERRED_SIZE)
								.addComponent(jButton30, javax.swing.GroupLayout.PREFERRED_SIZE, 40,
										javax.swing.GroupLayout.PREFERRED_SIZE))
						.addContainerGap(225, Short.MAX_VALUE)));

		getContentPane().add(tea2, "card10");

		jLabel35.setText("\u8bf7\u8f93\u5165\u8bfe\u7a0bID\uff1a");

		jButton27.setText("\u786e\u5b9a");
		jButton27.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton27ActionPerformed(evt);
			}
		});

		jButton28.setText("\u8fd4\u56de");
		jButton28.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton28ActionPerformed(evt);
			}
		});

		javax.swing.GroupLayout tea3Layout = new javax.swing.GroupLayout(tea3);
		tea3.setLayout(tea3Layout);
		tea3Layout.setHorizontalGroup(tea3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(tea3Layout.createSequentialGroup().addGap(117, 117, 117)
						.addGroup(tea3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
								.addGroup(tea3Layout.createSequentialGroup()
										.addComponent(jButton27, javax.swing.GroupLayout.PREFERRED_SIZE, 148,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
										.addComponent(jButton28, javax.swing.GroupLayout.PREFERRED_SIZE, 148,
												javax.swing.GroupLayout.PREFERRED_SIZE))
								.addGroup(tea3Layout.createSequentialGroup().addComponent(jLabel35)
										.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
										.addComponent(jTextField6)))
						.addContainerGap(164, Short.MAX_VALUE)));
		tea3Layout
				.setVerticalGroup(tea3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(tea3Layout.createSequentialGroup().addGap(220, 220, 220).addGroup(tea3Layout
								.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE).addComponent(jLabel35)
								.addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
								.addGap(74, 74, 74)
								.addGroup(tea3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
										.addComponent(jButton27, javax.swing.GroupLayout.PREFERRED_SIZE, 43,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addComponent(jButton28, javax.swing.GroupLayout.PREFERRED_SIZE, 43,
												javax.swing.GroupLayout.PREFERRED_SIZE))
								.addContainerGap(228, Short.MAX_VALUE)));

		getContentPane().add(tea3, "card11");

		jLabel40.setText("\u539f\u59cb\u5bc6\u7801\uff1a");

		jLabel41.setText("\u4fee\u6539\u5bc6\u7801\uff1a");

		jLabel42.setText("\u786e\u8ba4\u5bc6\u7801\uff1a");

		jButton33.setText("\u786e\u8ba4\u4fee\u6539");
		jButton33.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton33ActionPerformed(evt);
			}
		});

		jButton34.setText("<-");
		jButton34.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton34ActionPerformed(evt);
			}
		});

		jButton81.setText("\u91cd\u7f6e");
		jButton81.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton81ActionPerformed(evt);
			}
		});

		javax.swing.GroupLayout stu3Layout = new javax.swing.GroupLayout(stu3);
		stu3.setLayout(stu3Layout);
		stu3Layout.setHorizontalGroup(stu3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(stu3Layout.createSequentialGroup().addGap(170, 170, 170)
						.addGroup(stu3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
								.addGroup(stu3Layout.createSequentialGroup()
										.addComponent(jButton33, javax.swing.GroupLayout.PREFERRED_SIZE, 102,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED,
												javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
										.addComponent(
												jButton81, javax.swing.GroupLayout.PREFERRED_SIZE, 102,
												javax.swing.GroupLayout.PREFERRED_SIZE))
								.addGroup(stu3Layout.createSequentialGroup()
										.addGroup(stu3Layout
												.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
												.addComponent(jLabel42).addComponent(jLabel41).addComponent(jLabel40))
										.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
										.addGroup(stu3Layout
												.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
												.addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, 155,
														javax.swing.GroupLayout.PREFERRED_SIZE)
												.addComponent(jPasswordField2, javax.swing.GroupLayout.PREFERRED_SIZE,
														155, javax.swing.GroupLayout.PREFERRED_SIZE)
												.addComponent(jPasswordField3, javax.swing.GroupLayout.PREFERRED_SIZE,
														155, javax.swing.GroupLayout.PREFERRED_SIZE))))
						.addContainerGap(194, Short.MAX_VALUE))
				.addGroup(javax.swing.GroupLayout.Alignment.TRAILING,
						stu3Layout.createSequentialGroup().addContainerGap(522, Short.MAX_VALUE).addComponent(jButton34,
								javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
								.addContainerGap()));
		stu3Layout.setVerticalGroup(stu3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(stu3Layout.createSequentialGroup().addContainerGap()
						.addComponent(jButton34, javax.swing.GroupLayout.PREFERRED_SIZE, 30,
								javax.swing.GroupLayout.PREFERRED_SIZE)
						.addGap(122, 122, 122)
						.addGroup(stu3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(jLabel40).addComponent(jTextField7,
										javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE,
										javax.swing.GroupLayout.PREFERRED_SIZE))
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
						.addGroup(stu3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(jLabel41).addComponent(jPasswordField2,
										javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE,
										javax.swing.GroupLayout.PREFERRED_SIZE))
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
						.addGroup(stu3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(jLabel42)
								.addComponent(jPasswordField3, javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
						.addGap(37, 37, 37)
						.addGroup(stu3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(jButton33, javax.swing.GroupLayout.PREFERRED_SIZE, 29,
										javax.swing.GroupLayout.PREFERRED_SIZE)
								.addComponent(jButton81, javax.swing.GroupLayout.PREFERRED_SIZE, 29,
										javax.swing.GroupLayout.PREFERRED_SIZE))
						.addContainerGap(275, Short.MAX_VALUE)));

		getContentPane().add(stu3, "card12");

		jLabel47.setText("\u8bf7\u8f93\u5165\u5b66\u53f7\uff1a");

		jButton38.setText("\u786e\u5b9a");
		jButton38.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton38ActionPerformed(evt);
			}
		});

		jLabel48.setText("\u5b66\u53f7\uff1a");

		jTextField10.setEditable(false);

		jLabel49.setText("\u59d3\u540d\uff1a");

		jTextField11.setEditable(false);

		jLabel50.setText("\u6027\u522b\uff1a");

		jTextField12.setEditable(false);

		jLabel51.setText("\u539f\u6210\u7ee9\uff1a");

		jTextField13.setEditable(false);

		jLabel52.setText("\u4e0b\u9762\u8fdb\u884c\u6210\u7ee9\u4fee\u6539");

		jLabel53.setText("\u4fee\u6539\u540e\u6210\u7ee9\uff1a");

		jButton39.setText("\u786e\u5b9a");
		jButton39.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton39ActionPerformed(evt);
			}
		});

		jButton40.setText("<-");
		jButton40.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton40ActionPerformed(evt);
			}
		});

		jLabel25.setText("\u8bf7\u8f93\u5165\u8bfe\u7a0bID\uff1a");

		jLabel26.setText("\u8bfe\u7a0bID\uff1a");

		jLabel27.setText("---");

		jLabel28.setText("\u8bfe\u7a0b\u540d\u79f0\uff1a");

		jLabel30.setText("---");

		javax.swing.GroupLayout tea5Layout = new javax.swing.GroupLayout(tea5);
		tea5.setLayout(tea5Layout);
		tea5Layout.setHorizontalGroup(tea5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(tea5Layout.createSequentialGroup().addGroup(tea5Layout
						.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(tea5Layout.createSequentialGroup().addGap(156, 156, 156).addGroup(tea5Layout
								.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
								.addGroup(tea5Layout.createSequentialGroup().addGap(72, 72, 72).addComponent(jLabel52))
								.addGroup(tea5Layout.createSequentialGroup().addGroup(tea5Layout
										.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
										.addComponent(jLabel51).addComponent(jLabel50).addComponent(jLabel49)
										.addComponent(jLabel48)
										.addGroup(tea5Layout
												.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
												.addComponent(jLabel53).addComponent(jLabel47)))
										.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
										.addGroup(tea5Layout
												.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
												.addGroup(tea5Layout.createSequentialGroup().addGroup(tea5Layout
														.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING,
																false)
														.addComponent(jTextField10,
																javax.swing.GroupLayout.DEFAULT_SIZE, 130,
																Short.MAX_VALUE)
														.addComponent(jTextField9,
																javax.swing.GroupLayout.PREFERRED_SIZE, 130,
																javax.swing.GroupLayout.PREFERRED_SIZE))
														.addPreferredGap(
																javax.swing.LayoutStyle.ComponentPlacement.RELATED)
														.addComponent(jButton38, javax.swing.GroupLayout.PREFERRED_SIZE,
																84, javax.swing.GroupLayout.PREFERRED_SIZE))
												.addComponent(jTextField11, javax.swing.GroupLayout.PREFERRED_SIZE, 130,
														javax.swing.GroupLayout.PREFERRED_SIZE)
												.addComponent(jTextField12, javax.swing.GroupLayout.PREFERRED_SIZE, 130,
														javax.swing.GroupLayout.PREFERRED_SIZE)
												.addComponent(jTextField13, javax.swing.GroupLayout.PREFERRED_SIZE, 130,
														javax.swing.GroupLayout.PREFERRED_SIZE)
												.addGroup(tea5Layout.createSequentialGroup()
														.addComponent(jTextField15,
																javax.swing.GroupLayout.PREFERRED_SIZE, 130,
																javax.swing.GroupLayout.PREFERRED_SIZE)
														.addPreferredGap(
																javax.swing.LayoutStyle.ComponentPlacement.RELATED)
														.addComponent(jButton39, javax.swing.GroupLayout.PREFERRED_SIZE,
																84, javax.swing.GroupLayout.PREFERRED_SIZE))))))
						.addGroup(tea5Layout.createSequentialGroup().addGap(142, 142, 142).addComponent(jLabel25)
								.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
								.addComponent(jTextField26, javax.swing.GroupLayout.PREFERRED_SIZE, 130,
										javax.swing.GroupLayout.PREFERRED_SIZE))
						.addGroup(tea5Layout.createSequentialGroup().addGap(169, 169, 169).addComponent(jLabel26)
								.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
								.addComponent(jLabel27).addGap(51, 51, 51).addComponent(jLabel28)
								.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
								.addComponent(jLabel30)))
						.addContainerGap(130, Short.MAX_VALUE))
				.addGroup(javax.swing.GroupLayout.Alignment.TRAILING,
						tea5Layout.createSequentialGroup().addContainerGap(522, Short.MAX_VALUE).addComponent(jButton40,
								javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
								.addContainerGap()));
		tea5Layout.setVerticalGroup(tea5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(
				javax.swing.GroupLayout.Alignment.TRAILING,
				tea5Layout.createSequentialGroup().addContainerGap()
						.addComponent(jButton40, javax.swing.GroupLayout.PREFERRED_SIZE, 30,
								javax.swing.GroupLayout.PREFERRED_SIZE)
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 61, Short.MAX_VALUE)
						.addGroup(tea5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(jLabel25)
								.addComponent(jTextField26, javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
						.addGroup(tea5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(jLabel47)
								.addComponent(jTextField9, javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
								.addComponent(jButton38))
						.addGap(26, 26, 26)
						.addGroup(tea5Layout
								.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE).addComponent(jLabel26)
								.addComponent(jLabel27).addComponent(jLabel28).addComponent(jLabel30))
						.addGap(26, 26, 26)
						.addGroup(tea5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(jLabel48).addComponent(jTextField10,
										javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE,
										javax.swing.GroupLayout.PREFERRED_SIZE))
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
						.addGroup(tea5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(jLabel49)
								.addComponent(jTextField11, javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
						.addGroup(tea5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(jLabel50).addComponent(jTextField12,
										javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE,
										javax.swing.GroupLayout.PREFERRED_SIZE))
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
						.addGroup(tea5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(jLabel51).addComponent(jTextField13,
										javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE,
										javax.swing.GroupLayout.PREFERRED_SIZE))
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addComponent(jLabel52)
						.addGap(27, 27, 27)
						.addGroup(tea5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(jLabel53)
								.addComponent(jTextField15, javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
								.addComponent(jButton39))
						.addGap(165, 165, 165)));

		getContentPane().add(tea5, "card13");

		jLabel77.setText("\u8bf7\u8f93\u5165\u8bfe\u7a0bID\uff1a");

		jButton69.setText("\u786e\u5b9a");
		jButton69.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton69ActionPerformed(evt);
			}
		});

		jTable10.setModel(new javax.swing.table.DefaultTableModel(new Object[][] {

		}, new String[] { "课程ID", "课程名称", "学号", "姓名", "班级", "成绩" }) {
			Class[] types = new Class[] { java.lang.String.class, java.lang.String.class, java.lang.String.class,
					java.lang.String.class, java.lang.String.class, java.lang.String.class };
			boolean[] canEdit = new boolean[] { false, false, false, false, false, true };

			public Class getColumnClass(int columnIndex) {
				return types[columnIndex];
			}

			public boolean isCellEditable(int rowIndex, int columnIndex) {
				return canEdit[columnIndex];
			}
		});
		jScrollPane10.setViewportView(jTable10);

		jButton70.setText("\u6dfb\u52a0");
		jButton70.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton70ActionPerformed(evt);
			}
		});

		jButton71.setText("<-");
		jButton71.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton71ActionPerformed(evt);
			}
		});

		jButton83.setText("\u5237\u65b0");
		jButton83.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton83ActionPerformed(evt);
			}
		});

		javax.swing.GroupLayout tea4Layout = new javax.swing.GroupLayout(tea4);
		tea4.setLayout(tea4Layout);
		tea4Layout.setHorizontalGroup(tea4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(tea4Layout.createSequentialGroup()
						.addGroup(tea4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
								.addGroup(tea4Layout.createSequentialGroup().addGap(64, 64, 64).addComponent(
										jScrollPane10, javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
								.addGroup(tea4Layout.createSequentialGroup().addGap(141, 141, 141)
										.addComponent(jButton70, javax.swing.GroupLayout.PREFERRED_SIZE, 116,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addGap(37, 37, 37)
										.addComponent(jButton83, javax.swing.GroupLayout.PREFERRED_SIZE, 116,
												javax.swing.GroupLayout.PREFERRED_SIZE))
								.addGroup(
										tea4Layout.createSequentialGroup().addGap(107, 107, 107).addComponent(jLabel77)
												.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
												.addComponent(jTextField24, javax.swing.GroupLayout.PREFERRED_SIZE, 126,
														javax.swing.GroupLayout.PREFERRED_SIZE)
												.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
												.addComponent(jButton69, javax.swing.GroupLayout.PREFERRED_SIZE, 80,
														javax.swing.GroupLayout.PREFERRED_SIZE)))
						.addContainerGap(68, Short.MAX_VALUE))
				.addGroup(javax.swing.GroupLayout.Alignment.TRAILING,
						tea4Layout.createSequentialGroup().addContainerGap(522, Short.MAX_VALUE).addComponent(jButton71,
								javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
								.addContainerGap()));
		tea4Layout.setVerticalGroup(tea4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(tea4Layout.createSequentialGroup().addContainerGap()
						.addComponent(jButton71, javax.swing.GroupLayout.PREFERRED_SIZE, 30,
								javax.swing.GroupLayout.PREFERRED_SIZE)
						.addGap(58, 58, 58)
						.addGroup(tea4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(jLabel77)
								.addComponent(jTextField24, javax.swing.GroupLayout.PREFERRED_SIZE, 30,
										javax.swing.GroupLayout.PREFERRED_SIZE)
								.addComponent(jButton69, javax.swing.GroupLayout.PREFERRED_SIZE, 30,
										javax.swing.GroupLayout.PREFERRED_SIZE))
						.addGap(18, 18, 18)
						.addComponent(jScrollPane10, javax.swing.GroupLayout.PREFERRED_SIZE, 303,
								javax.swing.GroupLayout.PREFERRED_SIZE)
						.addGap(18, 18, 18)
						.addGroup(tea4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(jButton70).addComponent(jButton83))
						.addContainerGap(91, Short.MAX_VALUE)));

		getContentPane().add(tea4, "card14");

		jLabel44.setText("\u539f\u59cb\u5bc6\u7801\uff1a");

		jLabel45.setText("\u4fee\u6539\u5bc6\u7801\uff1a");

		jLabel46.setText("\u786e\u8ba4\u5bc6\u7801\uff1a");

		jButton36.setText("\u786e\u8ba4\u4fee\u6539");
		jButton36.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton36ActionPerformed(evt);
			}
		});

		jButton37.setText("<-");
		jButton37.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton37ActionPerformed(evt);
			}
		});

		jButton41.setText("\u91cd\u7f6e");
		jButton41.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton41ActionPerformed(evt);
			}
		});

		javax.swing.GroupLayout tea6Layout = new javax.swing.GroupLayout(tea6);
		tea6.setLayout(tea6Layout);
		tea6Layout.setHorizontalGroup(tea6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(tea6Layout.createSequentialGroup().addContainerGap(522, Short.MAX_VALUE)
						.addComponent(jButton37, javax.swing.GroupLayout.PREFERRED_SIZE, 50,
								javax.swing.GroupLayout.PREFERRED_SIZE)
						.addContainerGap())
				.addGroup(tea6Layout.createSequentialGroup().addGap(172, 172, 172)
						.addGroup(tea6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
								.addGroup(tea6Layout.createSequentialGroup()
										.addComponent(jButton36, javax.swing.GroupLayout.PREFERRED_SIZE, 102,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED,
												javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
										.addComponent(
												jButton41, javax.swing.GroupLayout.PREFERRED_SIZE, 102,
												javax.swing.GroupLayout.PREFERRED_SIZE))
								.addGroup(tea6Layout.createSequentialGroup().addGroup(
										tea6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
												.addComponent(jLabel46).addComponent(jLabel45).addComponent(jLabel44))
										.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
										.addGroup(tea6Layout
												.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
												.addComponent(jTextField8, javax.swing.GroupLayout.PREFERRED_SIZE, 155,
														javax.swing.GroupLayout.PREFERRED_SIZE)
												.addComponent(jPasswordField4, javax.swing.GroupLayout.PREFERRED_SIZE,
														155, javax.swing.GroupLayout.PREFERRED_SIZE)
												.addComponent(jPasswordField5, javax.swing.GroupLayout.PREFERRED_SIZE,
														155, javax.swing.GroupLayout.PREFERRED_SIZE))))
						.addContainerGap(192, Short.MAX_VALUE)));
		tea6Layout.setVerticalGroup(tea6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(tea6Layout.createSequentialGroup().addContainerGap()
						.addComponent(jButton37, javax.swing.GroupLayout.PREFERRED_SIZE, 30,
								javax.swing.GroupLayout.PREFERRED_SIZE)
						.addGap(118, 118, 118)
						.addGroup(tea6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(jLabel44).addComponent(jTextField8,
										javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE,
										javax.swing.GroupLayout.PREFERRED_SIZE))
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
						.addGroup(tea6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(jLabel45).addComponent(jPasswordField4,
										javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE,
										javax.swing.GroupLayout.PREFERRED_SIZE))
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
						.addGroup(tea6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(jLabel46)
								.addComponent(jPasswordField5, javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
						.addGap(37, 37, 37)
						.addGroup(tea6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(jButton36, javax.swing.GroupLayout.PREFERRED_SIZE, 29,
										javax.swing.GroupLayout.PREFERRED_SIZE)
								.addComponent(jButton41, javax.swing.GroupLayout.PREFERRED_SIZE, 29,
										javax.swing.GroupLayout.PREFERRED_SIZE))
						.addContainerGap(279, Short.MAX_VALUE)));

		getContentPane().add(tea6, "card12");

		jTable4.setModel(new javax.swing.table.DefaultTableModel(new Object[][] {

		}, new String[] { "学号", "姓名", "性别" }) {
			boolean[] canEdit = new boolean[] { false, false, false };

			public boolean isCellEditable(int rowIndex, int columnIndex) {
				return canEdit[columnIndex];
			}
		});
		jScrollPane4.setViewportView(jTable4);

		jButton42.setText("\u5220\u9664");
		jButton42.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton42ActionPerformed(evt);
			}
		});

		jButton43.setText("<-");
		jButton43.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton43ActionPerformed(evt);
			}
		});

		jComboBox5.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "", "性别", "专业", "班级" }));
		jComboBox5.addItemListener(new java.awt.event.ItemListener() {
			public void itemStateChanged(java.awt.event.ItemEvent evt) {
				jComboBox5ItemStateChanged(evt);
			}
		});
		jComboBox5.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jComboBox5ActionPerformed(evt);
			}
		});

		jButton48.setText("\u786e\u5b9a");
		jButton48.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton48ActionPerformed(evt);
			}
		});

		jComboBox6.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "" }));

		jButton84.setText("\u5237\u65b0");
		jButton84.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton84ActionPerformed(evt);
			}
		});

		jButton61.setText("\u67e5\u770b\u8d44\u6599");
		jButton61.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton61ActionPerformed(evt);
			}
		});

		javax.swing.GroupLayout guanli1Layout = new javax.swing.GroupLayout(guanli1);
		guanli1.setLayout(guanli1Layout);
		guanli1Layout.setHorizontalGroup(guanli1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(guanli1Layout.createSequentialGroup().addContainerGap(121, Short.MAX_VALUE)
						.addGroup(guanli1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
								.addGroup(javax.swing.GroupLayout.Alignment.TRAILING,
										guanli1Layout.createSequentialGroup()
												.addComponent(jButton43, javax.swing.GroupLayout.PREFERRED_SIZE, 50,
														javax.swing.GroupLayout.PREFERRED_SIZE)
												.addContainerGap())
								.addGroup(javax.swing.GroupLayout.Alignment.TRAILING,
										guanli1Layout.createSequentialGroup()
												.addComponent(jComboBox5, javax.swing.GroupLayout.PREFERRED_SIZE, 79,
														javax.swing.GroupLayout.PREFERRED_SIZE)
												.addGap(28, 28, 28)
												.addComponent(jComboBox6, javax.swing.GroupLayout.PREFERRED_SIZE, 170,
														javax.swing.GroupLayout.PREFERRED_SIZE)
												.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
												.addComponent(jButton48, javax.swing.GroupLayout.PREFERRED_SIZE, 84,
														javax.swing.GroupLayout.PREFERRED_SIZE)
												.addGap(95, 95, 95))))
				.addGroup(guanli1Layout.createSequentialGroup().addGap(145, 145, 145)
						.addComponent(jButton42, javax.swing.GroupLayout.PREFERRED_SIZE, 82,
								javax.swing.GroupLayout.PREFERRED_SIZE)
						.addGap(25, 25, 25).addComponent(jButton61)
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
						.addComponent(jButton84, javax.swing.GroupLayout.PREFERRED_SIZE, 82,
								javax.swing.GroupLayout.PREFERRED_SIZE)
						.addContainerGap(162, Short.MAX_VALUE))
				.addGroup(guanli1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(guanli1Layout.createSequentialGroup().addGap(0, 0, Short.MAX_VALUE)
								.addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
								.addGap(0, 0, Short.MAX_VALUE))));
		guanli1Layout.setVerticalGroup(guanli1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(guanli1Layout.createSequentialGroup().addContainerGap()
						.addComponent(jButton43, javax.swing.GroupLayout.PREFERRED_SIZE, 30,
								javax.swing.GroupLayout.PREFERRED_SIZE)
						.addGap(27, 27, 27)
						.addGroup(guanli1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(jComboBox5, javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
								.addComponent(jButton48).addComponent(jComboBox6,
										javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE,
										javax.swing.GroupLayout.PREFERRED_SIZE))
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 373, Short.MAX_VALUE)
						.addGroup(guanli1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(jButton42, javax.swing.GroupLayout.PREFERRED_SIZE, 37,
										javax.swing.GroupLayout.PREFERRED_SIZE)
								.addComponent(jButton61, javax.swing.GroupLayout.PREFERRED_SIZE, 37,
										javax.swing.GroupLayout.PREFERRED_SIZE)
								.addComponent(jButton84, javax.swing.GroupLayout.PREFERRED_SIZE, 37,
										javax.swing.GroupLayout.PREFERRED_SIZE))
						.addGap(82, 82, 82))
				.addGroup(
						guanli1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
								.addGroup(guanli1Layout.createSequentialGroup().addGap(0, 0, Short.MAX_VALUE)
										.addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 303,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addGap(0, 0, Short.MAX_VALUE))));

		getContentPane().add(guanli1, "card9");

		jLabel56.setText("\u539f\u59cb\u5bc6\u7801\uff1a");

		jLabel57.setText("\u4fee\u6539\u5bc6\u7801\uff1a");

		jLabel58.setText("\u786e\u8ba4\u5bc6\u7801\uff1a");

		jButton46.setText("\u786e\u8ba4\u4fee\u6539");
		jButton46.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton46ActionPerformed(evt);
			}
		});

		jButton47.setText("<-");
		jButton47.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton47ActionPerformed(evt);
			}
		});

		jButton89.setText("\u91cd\u7f6e");
		jButton89.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton89ActionPerformed(evt);
			}
		});

		javax.swing.GroupLayout guanli8Layout = new javax.swing.GroupLayout(guanli8);
		guanli8.setLayout(guanli8Layout);
		guanli8Layout.setHorizontalGroup(guanli8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(guanli8Layout.createSequentialGroup().addGap(167, 167, 167)
						.addGroup(guanli8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
								.addGroup(guanli8Layout.createSequentialGroup()
										.addComponent(jButton46, javax.swing.GroupLayout.PREFERRED_SIZE, 102,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED,
												javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
										.addComponent(
												jButton89, javax.swing.GroupLayout.PREFERRED_SIZE, 102,
												javax.swing.GroupLayout.PREFERRED_SIZE))
								.addGroup(guanli8Layout.createSequentialGroup()
										.addGroup(guanli8Layout
												.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
												.addComponent(jLabel58).addComponent(jLabel57).addComponent(jLabel56))
										.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
										.addGroup(guanli8Layout
												.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
												.addComponent(jTextField14, javax.swing.GroupLayout.PREFERRED_SIZE, 155,
														javax.swing.GroupLayout.PREFERRED_SIZE)
												.addComponent(jPasswordField6, javax.swing.GroupLayout.PREFERRED_SIZE,
														155, javax.swing.GroupLayout.PREFERRED_SIZE)
												.addComponent(jPasswordField7, javax.swing.GroupLayout.PREFERRED_SIZE,
														155, javax.swing.GroupLayout.PREFERRED_SIZE))))
						.addContainerGap(197, Short.MAX_VALUE))
				.addGroup(javax.swing.GroupLayout.Alignment.TRAILING, guanli8Layout.createSequentialGroup()
						.addContainerGap(522, Short.MAX_VALUE).addComponent(jButton47,
								javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
						.addContainerGap()));
		guanli8Layout.setVerticalGroup(guanli8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(guanli8Layout.createSequentialGroup().addContainerGap()
						.addComponent(jButton47, javax.swing.GroupLayout.PREFERRED_SIZE, 30,
								javax.swing.GroupLayout.PREFERRED_SIZE)
						.addGap(151, 151, 151)
						.addGroup(guanli8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(jLabel56).addComponent(jTextField14,
										javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE,
										javax.swing.GroupLayout.PREFERRED_SIZE))
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
						.addGroup(guanli8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(jLabel57).addComponent(jPasswordField6,
										javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE,
										javax.swing.GroupLayout.PREFERRED_SIZE))
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
						.addGroup(guanli8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(jLabel58)
								.addComponent(jPasswordField7, javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
						.addGap(37, 37, 37)
						.addGroup(guanli8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(jButton46, javax.swing.GroupLayout.PREFERRED_SIZE, 29,
										javax.swing.GroupLayout.PREFERRED_SIZE)
								.addComponent(jButton89, javax.swing.GroupLayout.PREFERRED_SIZE, 29,
										javax.swing.GroupLayout.PREFERRED_SIZE))
						.addContainerGap(246, Short.MAX_VALUE)));

		getContentPane().add(guanli8, "card17");

		jLabel59.setText("ID\uff1a");

		jLabel93.setText("\u59d3\u540d\uff1a");

		jLabel94.setText("\u6027\u522b\uff1a");

		jComboBox12.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "男", "女" }));

		jLabel95.setText("\u5e74\u9f84\uff1a");

		jSpinner14.setModel(
				new javax.swing.SpinnerNumberModel(Integer.valueOf(0), Integer.valueOf(0), null, Integer.valueOf(1)));

		jLabel96.setText("\u5bc6\u7801\uff1a");

		jButton16.setText("\u786e\u5b9a");
		jButton16.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton16ActionPerformed(evt);
			}
		});

		jButton49.setText("<-");
		jButton49.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton49ActionPerformed(evt);
			}
		});

		jButton23.setText("\u91cd\u7f6e");
		jButton23.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton23ActionPerformed(evt);
			}
		});

		javax.swing.GroupLayout guanli2Layout = new javax.swing.GroupLayout(guanli2);
		guanli2.setLayout(guanli2Layout);
		guanli2Layout.setHorizontalGroup(guanli2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(guanli2Layout.createSequentialGroup().addContainerGap(179, Short.MAX_VALUE)
						.addGroup(guanli2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(
								javax.swing.GroupLayout.Alignment.TRAILING,
								guanli2Layout.createSequentialGroup()
										.addGroup(guanli2Layout
												.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
												.addComponent(jLabel95, javax.swing.GroupLayout.Alignment.TRAILING)
												.addComponent(jLabel94, javax.swing.GroupLayout.Alignment.TRAILING)
												.addComponent(jLabel59, javax.swing.GroupLayout.Alignment.TRAILING)
												.addComponent(jLabel93, javax.swing.GroupLayout.Alignment.TRAILING)
												.addComponent(jLabel96, javax.swing.GroupLayout.Alignment.TRAILING))
										.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
										.addGroup(guanli2Layout
												.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
												.addComponent(jTextField16, javax.swing.GroupLayout.PREFERRED_SIZE, 150,
														javax.swing.GroupLayout.PREFERRED_SIZE)
												.addComponent(jTextField31, javax.swing.GroupLayout.PREFERRED_SIZE, 150,
														javax.swing.GroupLayout.PREFERRED_SIZE)
												.addGroup(guanli2Layout
														.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING,
																false)
														.addComponent(jSpinner14,
																javax.swing.GroupLayout.Alignment.LEADING)
														.addComponent(jComboBox12,
																javax.swing.GroupLayout.Alignment.LEADING,
																javax.swing.GroupLayout.PREFERRED_SIZE, 72,
																javax.swing.GroupLayout.PREFERRED_SIZE))
												.addGroup(guanli2Layout
														.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
														.addComponent(jButton23, javax.swing.GroupLayout.PREFERRED_SIZE,
																108, javax.swing.GroupLayout.PREFERRED_SIZE)
														.addComponent(jPasswordField11,
																javax.swing.GroupLayout.PREFERRED_SIZE, 150,
																javax.swing.GroupLayout.PREFERRED_SIZE)))
										.addGap(186, 186, 186))
								.addGroup(javax.swing.GroupLayout.Alignment.TRAILING,
										guanli2Layout.createSequentialGroup()
												.addComponent(jButton16, javax.swing.GroupLayout.PREFERRED_SIZE, 108,
														javax.swing.GroupLayout.PREFERRED_SIZE)
												.addGap(297, 297, 297))
								.addGroup(javax.swing.GroupLayout.Alignment.TRAILING,
										guanli2Layout.createSequentialGroup()
												.addComponent(jButton49, javax.swing.GroupLayout.PREFERRED_SIZE, 50,
														javax.swing.GroupLayout.PREFERRED_SIZE)
												.addContainerGap()))));
		guanli2Layout.setVerticalGroup(guanli2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(guanli2Layout.createSequentialGroup().addContainerGap()
						.addComponent(jButton49, javax.swing.GroupLayout.PREFERRED_SIZE, 30,
								javax.swing.GroupLayout.PREFERRED_SIZE)
						.addGap(102, 102, 102)
						.addGroup(guanli2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(jLabel59).addComponent(jTextField16,
										javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE,
										javax.swing.GroupLayout.PREFERRED_SIZE))
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
						.addGroup(guanli2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(jTextField31, javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
								.addComponent(jLabel93))
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
						.addGroup(guanli2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(jLabel94).addComponent(jComboBox12,
										javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE,
										javax.swing.GroupLayout.PREFERRED_SIZE))
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
						.addGroup(guanli2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(jLabel95).addComponent(jSpinner14, javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
						.addGroup(guanli2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(jPasswordField11, javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
								.addComponent(jLabel96))
						.addGap(48, 48, 48)
						.addGroup(guanli2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(jButton16, javax.swing.GroupLayout.PREFERRED_SIZE, 39,
										javax.swing.GroupLayout.PREFERRED_SIZE)
								.addComponent(jButton23, javax.swing.GroupLayout.PREFERRED_SIZE, 39,
										javax.swing.GroupLayout.PREFERRED_SIZE))
						.addContainerGap(211, Short.MAX_VALUE)));

		getContentPane().add(guanli2, "card18");

		jLabel71.setText("\u8f93\u5165\u6559\u5e08ID\uff1a");

		jButton66.setText("\u786e\u5b9a");
		jButton66.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton66ActionPerformed(evt);
			}
		});

		jLabel72.setText("\u8d26\u53f7\uff1a");

		jTextField22.setEditable(false);

		jLabel73.setText("\u59d3\u540d\uff1a");

		jTextField23.setEditable(false);

		jLabel74.setText("\u5728\u4e0b\u9762\u8fdb\u884c\u4fee\u6539\u5bc6\u7801");

		jLabel75.setText("\u4fee\u6539\u540e\u7684\u5bc6\u7801\uff1a");

		jLabel76.setText("\u786e\u8ba4\u5bc6\u7801\uff1a");

		jButton67.setText("\u786e\u8ba4\u4fee\u6539");
		jButton67.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton67ActionPerformed(evt);
			}
		});

		jButton68.setText("<-");
		jButton68.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton68ActionPerformed(evt);
			}
		});

		jButton88.setText("\u91cd\u7f6e");
		jButton88.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton88ActionPerformed(evt);
			}
		});

		javax.swing.GroupLayout guanli9Layout = new javax.swing.GroupLayout(guanli9);
		guanli9.setLayout(guanli9Layout);
		guanli9Layout.setHorizontalGroup(guanli9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(guanli9Layout.createSequentialGroup().addContainerGap(140, Short.MAX_VALUE)
						.addGroup(guanli9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(
								javax.swing.GroupLayout.Alignment.TRAILING,
								guanli9Layout.createSequentialGroup().addGroup(guanli9Layout
										.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
										.addGroup(guanli9Layout.createSequentialGroup().addGroup(guanli9Layout
												.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
												.addComponent(jLabel71).addComponent(jLabel73).addComponent(jLabel72)
												.addGroup(guanli9Layout
														.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
														.addComponent(jLabel75).addComponent(jLabel76,
																javax.swing.GroupLayout.Alignment.TRAILING)))
												.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
												.addGroup(guanli9Layout
														.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
														.addGroup(guanli9Layout.createSequentialGroup()
																.addComponent(jTextField21,
																		javax.swing.GroupLayout.PREFERRED_SIZE, 151,
																		javax.swing.GroupLayout.PREFERRED_SIZE)
																.addPreferredGap(
																		javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																.addComponent(jButton66,
																		javax.swing.GroupLayout.PREFERRED_SIZE, 83,
																		javax.swing.GroupLayout.PREFERRED_SIZE))
														.addGroup(guanli9Layout
																.createParallelGroup(
																		javax.swing.GroupLayout.Alignment.TRAILING,
																		false)
																.addComponent(jPasswordField8,
																		javax.swing.GroupLayout.Alignment.LEADING,
																		javax.swing.GroupLayout.DEFAULT_SIZE, 150,
																		Short.MAX_VALUE)
																.addComponent(jTextField23,
																		javax.swing.GroupLayout.Alignment.LEADING)
																.addComponent(jTextField22,
																		javax.swing.GroupLayout.Alignment.LEADING,
																		javax.swing.GroupLayout.DEFAULT_SIZE, 156,
																		Short.MAX_VALUE)
																.addComponent(jPasswordField9))))
										.addGroup(guanli9Layout.createSequentialGroup().addGap(102, 102, 102)
												.addComponent(jLabel74))
										.addGroup(guanli9Layout.createSequentialGroup().addGap(47, 47, 47)
												.addComponent(jButton67, javax.swing.GroupLayout.PREFERRED_SIZE, 100,
														javax.swing.GroupLayout.PREFERRED_SIZE)
												.addGap(18, 18, 18).addComponent(jButton88,
														javax.swing.GroupLayout.PREFERRED_SIZE, 100,
														javax.swing.GroupLayout.PREFERRED_SIZE)))
										.addGap(114, 114, 114))
								.addGroup(javax.swing.GroupLayout.Alignment.TRAILING,
										guanli9Layout.createSequentialGroup()
												.addComponent(jButton68, javax.swing.GroupLayout.PREFERRED_SIZE, 50,
														javax.swing.GroupLayout.PREFERRED_SIZE)
												.addContainerGap()))));
		guanli9Layout.setVerticalGroup(guanli9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(guanli9Layout.createSequentialGroup().addContainerGap()
						.addComponent(jButton68, javax.swing.GroupLayout.PREFERRED_SIZE, 30,
								javax.swing.GroupLayout.PREFERRED_SIZE)
						.addGap(77, 77, 77)
						.addGroup(guanli9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(jButton66, javax.swing.GroupLayout.PREFERRED_SIZE, 30,
										javax.swing.GroupLayout.PREFERRED_SIZE)
								.addComponent(jTextField21, javax.swing.GroupLayout.PREFERRED_SIZE, 30,
										javax.swing.GroupLayout.PREFERRED_SIZE)
								.addComponent(jLabel71))
						.addGap(58, 58, 58)
						.addGroup(guanli9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(jLabel72).addComponent(jTextField22,
										javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE,
										javax.swing.GroupLayout.PREFERRED_SIZE))
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
						.addGroup(guanli9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(jLabel73).addComponent(jTextField23,
										javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE,
										javax.swing.GroupLayout.PREFERRED_SIZE))
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addComponent(jLabel74)
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
						.addGroup(guanli9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(jLabel75).addComponent(jPasswordField8,
										javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE,
										javax.swing.GroupLayout.PREFERRED_SIZE))
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
						.addGroup(guanli9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(jLabel76)
								.addComponent(jPasswordField9, javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
						.addGap(30, 30, 30)
						.addGroup(guanli9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(jButton67, javax.swing.GroupLayout.PREFERRED_SIZE, 37,
										javax.swing.GroupLayout.PREFERRED_SIZE)
								.addComponent(jButton88, javax.swing.GroupLayout.PREFERRED_SIZE, 37,
										javax.swing.GroupLayout.PREFERRED_SIZE))
						.addContainerGap(174, Short.MAX_VALUE)));

		getContentPane().add(guanli9, "card24");

		jTable6.setModel(new javax.swing.table.DefaultTableModel(new Object[][] {

		}, new String[] { "账号", "姓名", "性别", "年龄" }) {
			boolean[] canEdit = new boolean[] { false, false, false, false };

			public boolean isCellEditable(int rowIndex, int columnIndex) {
				return canEdit[columnIndex];
			}
		});
		jScrollPane6.setViewportView(jTable6);

		jButton52.setText("\u5220\u9664");
		jButton52.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton52ActionPerformed(evt);
			}
		});

		jButton53.setText("<-");
		jButton53.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton53ActionPerformed(evt);
			}
		});

		jComboBox7.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "", "性别" }));
		jComboBox7.addItemListener(new java.awt.event.ItemListener() {
			public void itemStateChanged(java.awt.event.ItemEvent evt) {
				jComboBox7ItemStateChanged(evt);
			}
		});

		jButton54.setText("\u786e\u5b9a");
		jButton54.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton54ActionPerformed(evt);
			}
		});

		jComboBox8.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "" }));

		jButton85.setText("\u5237\u65b0");
		jButton85.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton85ActionPerformed(evt);
			}
		});

		javax.swing.GroupLayout guanli3Layout = new javax.swing.GroupLayout(guanli3);
		guanli3.setLayout(guanli3Layout);
		guanli3Layout.setHorizontalGroup(guanli3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(guanli3Layout.createSequentialGroup().addGap(163, 163, 163)
						.addComponent(jButton52, javax.swing.GroupLayout.PREFERRED_SIZE, 82,
								javax.swing.GroupLayout.PREFERRED_SIZE)
						.addGap(57, 57, 57)
						.addComponent(jButton85, javax.swing.GroupLayout.PREFERRED_SIZE, 82,
								javax.swing.GroupLayout.PREFERRED_SIZE)
						.addGap(200, 200, 200))
				.addGroup(javax.swing.GroupLayout.Alignment.TRAILING,
						guanli3Layout.createSequentialGroup().addContainerGap(133, Short.MAX_VALUE)
								.addComponent(jComboBox7, javax.swing.GroupLayout.PREFERRED_SIZE, 99,
										javax.swing.GroupLayout.PREFERRED_SIZE)
								.addGap(28, 28, 28)
								.addComponent(jComboBox8, javax.swing.GroupLayout.PREFERRED_SIZE, 75,
										javax.swing.GroupLayout.PREFERRED_SIZE)
								.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
								.addComponent(jButton54, javax.swing.GroupLayout.PREFERRED_SIZE, 84,
										javax.swing.GroupLayout.PREFERRED_SIZE)
								.addGap(158, 158, 158))
				.addGroup(javax.swing.GroupLayout.Alignment.TRAILING,
						guanli3Layout.createSequentialGroup().addContainerGap(522, Short.MAX_VALUE)
								.addComponent(jButton53, javax.swing.GroupLayout.PREFERRED_SIZE, 50,
										javax.swing.GroupLayout.PREFERRED_SIZE)
								.addContainerGap())
				.addGroup(guanli3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(guanli3Layout.createSequentialGroup().addGap(0, 0, Short.MAX_VALUE)
								.addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
								.addGap(0, 0, Short.MAX_VALUE))));
		guanli3Layout.setVerticalGroup(guanli3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(javax.swing.GroupLayout.Alignment.TRAILING, guanli3Layout.createSequentialGroup()
						.addContainerGap()
						.addComponent(jButton53, javax.swing.GroupLayout.PREFERRED_SIZE, 30,
								javax.swing.GroupLayout.PREFERRED_SIZE)
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
						.addGroup(guanli3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(jButton54)
								.addComponent(jComboBox8, javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
								.addComponent(jComboBox7, javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 400, Short.MAX_VALUE)
						.addGroup(guanli3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(jButton52, javax.swing.GroupLayout.PREFERRED_SIZE, 37,
										javax.swing.GroupLayout.PREFERRED_SIZE)
								.addComponent(jButton85, javax.swing.GroupLayout.PREFERRED_SIZE, 37,
										javax.swing.GroupLayout.PREFERRED_SIZE))
						.addGap(68, 68, 68))
				.addGroup(
						guanli3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
								.addGroup(guanli3Layout.createSequentialGroup().addGap(0, 0, Short.MAX_VALUE)
										.addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 303,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addGap(0, 0, Short.MAX_VALUE))));

		getContentPane().add(guanli3, "card9");

		jLabel60.setText("\u8d26\u53f7\uff1a");

		jLabel97.setText("\u59d3\u540d\uff1a");

		jLabel98.setText("\u6027\u522b\uff1a");

		jLabel99.setText("\u5e74\u9f84\uff1a");

		jButton50.setText("\u4fee\u6539");
		jButton50.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton50ActionPerformed(evt);
			}
		});

		jButton51.setText("<-");
		jButton51.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton51ActionPerformed(evt);
			}
		});

		jLabel100.setText("---");

		jButton65.setText("\u91cd\u7f6e");
		jButton65.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton65ActionPerformed(evt);
			}
		});

		javax.swing.GroupLayout guanli4Layout = new javax.swing.GroupLayout(guanli4);
		guanli4.setLayout(guanli4Layout);
		guanli4Layout.setHorizontalGroup(guanli4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(javax.swing.GroupLayout.Alignment.TRAILING,
						guanli4Layout.createSequentialGroup().addContainerGap(522, Short.MAX_VALUE)
								.addComponent(jButton51, javax.swing.GroupLayout.PREFERRED_SIZE, 50,
										javax.swing.GroupLayout.PREFERRED_SIZE)
								.addContainerGap())
				.addGroup(guanli4Layout.createSequentialGroup().addGap(179, 179, 179).addGroup(guanli4Layout
						.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
						.addComponent(jButton50, javax.swing.GroupLayout.PREFERRED_SIZE, 90,
								javax.swing.GroupLayout.PREFERRED_SIZE)
						.addGroup(guanli4Layout.createSequentialGroup()
								.addGroup(guanli4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
										.addComponent(jLabel99).addComponent(jLabel98).addComponent(jLabel97)
										.addComponent(jLabel60))
								.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
								.addGroup(guanli4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
										.addComponent(jTextField17, javax.swing.GroupLayout.PREFERRED_SIZE, 150,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addComponent(jTextField32, javax.swing.GroupLayout.PREFERRED_SIZE, 150,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addComponent(jLabel100)
										.addGroup(guanli4Layout
												.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
												.addComponent(jButton65, javax.swing.GroupLayout.PREFERRED_SIZE, 90,
														javax.swing.GroupLayout.PREFERRED_SIZE)
												.addComponent(jTextField33, javax.swing.GroupLayout.PREFERRED_SIZE, 150,
														javax.swing.GroupLayout.PREFERRED_SIZE)))))
						.addContainerGap(212, Short.MAX_VALUE)));
		guanli4Layout.setVerticalGroup(guanli4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(guanli4Layout.createSequentialGroup().addContainerGap()
						.addComponent(jButton51, javax.swing.GroupLayout.PREFERRED_SIZE, 30,
								javax.swing.GroupLayout.PREFERRED_SIZE)
						.addGap(100, 100, 100)
						.addGroup(guanli4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(jLabel60).addComponent(jLabel100))
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
						.addGroup(guanli4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(jLabel97).addComponent(jTextField17,
										javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE,
										javax.swing.GroupLayout.PREFERRED_SIZE))
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
						.addGroup(guanli4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(jLabel98).addComponent(jTextField32,
										javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE,
										javax.swing.GroupLayout.PREFERRED_SIZE))
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
						.addGroup(guanli4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(jLabel99)
								.addComponent(jTextField33, javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
						.addGap(29, 29, 29)
						.addGroup(guanli4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(jButton50, javax.swing.GroupLayout.PREFERRED_SIZE, 38,
										javax.swing.GroupLayout.PREFERRED_SIZE)
								.addComponent(jButton65, javax.swing.GroupLayout.PREFERRED_SIZE, 38,
										javax.swing.GroupLayout.PREFERRED_SIZE))
						.addContainerGap(267, Short.MAX_VALUE)));

		getContentPane().add(guanli4, "card18");

		jLabel61.setText("\u8bfe\u7a0b\u540d\u79f0\uff1a");

		jLabel63.setText("\u8bfe\u7a0b\u65f6\u95f4\uff1a");

		jSpinner7.setModel(
				new javax.swing.SpinnerNumberModel(Integer.valueOf(0), Integer.valueOf(0), null, Integer.valueOf(1)));

		jLabel64.setText("\u5468-");

		jSpinner8.setModel(
				new javax.swing.SpinnerNumberModel(Integer.valueOf(0), Integer.valueOf(0), null, Integer.valueOf(1)));

		jLabel65.setText("\u5468");

		jLabel66.setText("\u5b66\u5206\uff1a");

		jSpinner9.setModel(
				new javax.swing.SpinnerNumberModel(Integer.valueOf(0), Integer.valueOf(0), null, Integer.valueOf(1)));

		jButton58.setText("\u63d0\u4ea4");
		jButton58.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton58ActionPerformed(evt);
			}
		});

		jButton59.setText("<-");
		jButton59.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton59ActionPerformed(evt);
			}
		});

		jLabel67.setText("\u4e0a\u8bfe\u65f6\u95f4\uff1a");

		jComboBox9.setModel(
				new javax.swing.DefaultComboBoxModel(new String[] { "周一", "周二", "周三", "周四", "周五", "周六", "周日" }));

		jSpinner10.setModel(
				new javax.swing.SpinnerNumberModel(Integer.valueOf(0), Integer.valueOf(0), null, Integer.valueOf(1)));

		jLabel68.setText("--");

		jSpinner11.setModel(
				new javax.swing.SpinnerNumberModel(Integer.valueOf(0), Integer.valueOf(0), null, Integer.valueOf(1)));

		jLabel69.setText("\u8bfe\u7a0bID\uff1a");

		jLabel36.setText("\u9009\u62e9\u6559\u5e08\uff1a");

		jComboBox2.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "" }));

		jLabel39.setText("\u4eba\u6570\u4e0a\u9650\uff1a");

		jSpinner13.setModel(
				new javax.swing.SpinnerNumberModel(Integer.valueOf(0), Integer.valueOf(0), null, Integer.valueOf(1)));

		jLabel43.setText("\u8282");

		jButton86.setText("\u91cd\u7f6e");
		jButton86.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton86ActionPerformed(evt);
			}
		});

		javax.swing.GroupLayout guanli5Layout = new javax.swing.GroupLayout(guanli5);
		guanli5.setLayout(guanli5Layout);
		guanli5Layout.setHorizontalGroup(guanli5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(javax.swing.GroupLayout.Alignment.TRAILING,
						guanli5Layout.createSequentialGroup().addGap(153, 153, 153).addGroup(guanli5Layout
								.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addComponent(jLabel39)
								.addGroup(guanli5Layout.createSequentialGroup().addGroup(guanli5Layout
										.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
										.addGroup(guanli5Layout.createSequentialGroup().addGroup(guanli5Layout
												.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
												.addComponent(jLabel61).addComponent(jLabel69).addComponent(jLabel36))
												.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
												.addGroup(guanli5Layout
														.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
														.addComponent(jComboBox2, 0, 217, Short.MAX_VALUE)
														.addComponent(jTextField19,
																javax.swing.GroupLayout.DEFAULT_SIZE, 217,
																Short.MAX_VALUE)
														.addComponent(jTextField18,
																javax.swing.GroupLayout.DEFAULT_SIZE, 217,
																Short.MAX_VALUE)))
										.addGroup(guanli5Layout.createSequentialGroup().addGroup(guanli5Layout
												.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
												.addComponent(jLabel63)
												.addGroup(guanli5Layout.createSequentialGroup().addGap(10, 10, 10)
														.addComponent(jLabel66))
												.addComponent(jLabel67))
												.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
												.addGroup(guanli5Layout
														.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
														.addComponent(jComboBox9, 0, 81, Short.MAX_VALUE)
														.addComponent(jSpinner9, javax.swing.GroupLayout.DEFAULT_SIZE,
																81, Short.MAX_VALUE)
														.addComponent(jSpinner7, javax.swing.GroupLayout.DEFAULT_SIZE,
																81, Short.MAX_VALUE)
														.addComponent(jSpinner13, javax.swing.GroupLayout.DEFAULT_SIZE,
																81, Short.MAX_VALUE))
												.addGroup(guanli5Layout
														.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
														.addGroup(guanli5Layout.createSequentialGroup()
																.addGap(21, 21, 21).addComponent(jLabel64)
																.addPreferredGap(
																		javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																.addComponent(jSpinner8,
																		javax.swing.GroupLayout.PREFERRED_SIZE, 57,
																		javax.swing.GroupLayout.PREFERRED_SIZE)
																.addPreferredGap(
																		javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																.addComponent(jLabel65))
														.addGroup(guanli5Layout.createSequentialGroup()
																.addGap(15, 15, 15)
																.addComponent(jSpinner10,
																		javax.swing.GroupLayout.PREFERRED_SIZE, 42,
																		javax.swing.GroupLayout.PREFERRED_SIZE)
																.addPreferredGap(
																		javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																.addComponent(jLabel68)
																.addPreferredGap(
																		javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																.addComponent(jSpinner11,
																		javax.swing.GroupLayout.PREFERRED_SIZE, 42,
																		javax.swing.GroupLayout.PREFERRED_SIZE)
																.addPreferredGap(
																		javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																.addComponent(jLabel43)))))
										.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
								.addGroup(guanli5Layout.createSequentialGroup()
										.addComponent(jButton58, javax.swing.GroupLayout.PREFERRED_SIZE, 135,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
										.addComponent(jButton86, javax.swing.GroupLayout.PREFERRED_SIZE, 135,
												javax.swing.GroupLayout.PREFERRED_SIZE)))
								.addGap(149, 149, 149))
				.addGroup(javax.swing.GroupLayout.Alignment.TRAILING, guanli5Layout.createSequentialGroup()
						.addContainerGap(522, Short.MAX_VALUE).addComponent(jButton59,
								javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
						.addContainerGap()));
		guanli5Layout.setVerticalGroup(guanli5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(guanli5Layout.createSequentialGroup().addContainerGap().addComponent(jButton59)
						.addGap(82, 82, 82)
						.addGroup(guanli5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(jTextField19, javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
								.addComponent(jLabel69))
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
						.addGroup(guanli5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(jLabel61).addComponent(jTextField18,
										javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE,
										javax.swing.GroupLayout.PREFERRED_SIZE))
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
						.addGroup(guanli5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(jLabel36).addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
						.addGroup(guanli5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(jLabel63).addComponent(jLabel64)
								.addComponent(jSpinner7, javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
								.addComponent(jLabel65).addComponent(jSpinner8, javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
						.addGroup(guanli5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(jLabel66).addComponent(jSpinner9, javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
						.addGroup(guanli5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
								.addComponent(jLabel67)
								.addGroup(guanli5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
										.addComponent(jComboBox9, javax.swing.GroupLayout.PREFERRED_SIZE,
												javax.swing.GroupLayout.DEFAULT_SIZE,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addComponent(jSpinner10, javax.swing.GroupLayout.PREFERRED_SIZE,
												javax.swing.GroupLayout.DEFAULT_SIZE,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addComponent(jLabel68)
										.addComponent(jSpinner11, javax.swing.GroupLayout.PREFERRED_SIZE,
												javax.swing.GroupLayout.DEFAULT_SIZE,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addComponent(jLabel43)))
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
						.addGroup(guanli5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(jLabel39).addComponent(jSpinner13, javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
						.addGap(32, 32, 32)
						.addGroup(guanli5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(jButton58, javax.swing.GroupLayout.PREFERRED_SIZE, 40,
										javax.swing.GroupLayout.PREFERRED_SIZE)
								.addComponent(jButton86, javax.swing.GroupLayout.PREFERRED_SIZE, 40,
										javax.swing.GroupLayout.PREFERRED_SIZE))
						.addContainerGap(189, Short.MAX_VALUE)));

		getContentPane().add(guanli5, "card10");

		jTable11.setModel(new javax.swing.table.DefaultTableModel(new Object[][] {

		}, new String[] { "课程ID", "课程名称", "学号", "姓名", "班级", "成绩" }) {
			Class[] types = new Class[] { java.lang.String.class, java.lang.String.class, java.lang.String.class,
					java.lang.String.class, java.lang.String.class, java.lang.String.class };
			boolean[] canEdit = new boolean[] { false, false, false, false, false, true };

			public Class getColumnClass(int columnIndex) {
				return types[columnIndex];
			}

			public boolean isCellEditable(int rowIndex, int columnIndex) {
				return canEdit[columnIndex];
			}
		});
		jScrollPane11.setViewportView(jTable11);

		jButton72.setText("\u6dfb\u52a0");
		jButton72.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton72ActionPerformed(evt);
			}
		});

		jButton77.setText("<-");
		jButton77.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton77ActionPerformed(evt);
			}
		});

		jLabel119.setText("\u8bf7\u8f93\u5165\u8bfe\u7a0bID\uff1a");

		jButton78.setText("\u786e\u5b9a");
		jButton78.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton78ActionPerformed(evt);
			}
		});

		jButton87.setText("\u5237\u65b0");
		jButton87.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton87ActionPerformed(evt);
			}
		});

		javax.swing.GroupLayout guanli6Layout = new javax.swing.GroupLayout(guanli6);
		guanli6.setLayout(guanli6Layout);
		guanli6Layout.setHorizontalGroup(guanli6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(guanli6Layout.createSequentialGroup()
						.addGroup(guanli6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
								.addGroup(guanli6Layout.createSequentialGroup().addGap(64, 64, 64).addComponent(
										jScrollPane11, javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
								.addGroup(guanli6Layout.createSequentialGroup().addGap(141, 141, 141)
										.addComponent(jButton72, javax.swing.GroupLayout.PREFERRED_SIZE, 116,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addGap(46, 46, 46)
										.addComponent(jButton87, javax.swing.GroupLayout.PREFERRED_SIZE, 116,
												javax.swing.GroupLayout.PREFERRED_SIZE))
								.addGroup(guanli6Layout.createSequentialGroup().addGap(107, 107, 107)
										.addComponent(jLabel119)
										.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
										.addComponent(jTextField34, javax.swing.GroupLayout.PREFERRED_SIZE, 126,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
										.addComponent(jButton78, javax.swing.GroupLayout.PREFERRED_SIZE, 80,
												javax.swing.GroupLayout.PREFERRED_SIZE)))
						.addContainerGap(68, Short.MAX_VALUE))
				.addGroup(javax.swing.GroupLayout.Alignment.TRAILING, guanli6Layout.createSequentialGroup()
						.addContainerGap(522, Short.MAX_VALUE).addComponent(jButton77,
								javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
						.addContainerGap()));
		guanli6Layout.setVerticalGroup(guanli6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(guanli6Layout.createSequentialGroup().addContainerGap()
						.addComponent(jButton77, javax.swing.GroupLayout.PREFERRED_SIZE, 30,
								javax.swing.GroupLayout.PREFERRED_SIZE)
						.addGap(58, 58, 58)
						.addGroup(guanli6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(jLabel119)
								.addComponent(jTextField34, javax.swing.GroupLayout.PREFERRED_SIZE, 30,
										javax.swing.GroupLayout.PREFERRED_SIZE)
								.addComponent(jButton78, javax.swing.GroupLayout.PREFERRED_SIZE, 30,
										javax.swing.GroupLayout.PREFERRED_SIZE))
						.addGap(18, 18, 18)
						.addComponent(jScrollPane11, javax.swing.GroupLayout.PREFERRED_SIZE, 303,
								javax.swing.GroupLayout.PREFERRED_SIZE)
						.addGap(18, 18, 18)
						.addGroup(guanli6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(jButton72).addComponent(jButton87))
						.addContainerGap(91, Short.MAX_VALUE)));

		getContentPane().add(guanli6, "card11");

		jTable9.setModel(new javax.swing.table.DefaultTableModel(new Object[][] {

		}, new String[] { "课程ID", "课程名称", "课程教师" }) {
			boolean[] canEdit = new boolean[] { false, false, false };

			public boolean isCellEditable(int rowIndex, int columnIndex) {
				return canEdit[columnIndex];
			}
		});
		jScrollPane9.setViewportView(jTable9);

		jButton63.setText("\u5220\u9664");
		jButton63.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton63ActionPerformed(evt);
			}
		});

		jButton64.setText("<-");
		jButton64.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton64ActionPerformed(evt);
			}
		});

		jButton12.setText("\u8be6\u60c5");
		jButton12.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton12ActionPerformed(evt);
			}
		});

		javax.swing.GroupLayout guanli7Layout = new javax.swing.GroupLayout(guanli7);
		guanli7.setLayout(guanli7Layout);
		guanli7Layout.setHorizontalGroup(guanli7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(guanli7Layout.createSequentialGroup().addContainerGap(522, Short.MAX_VALUE)
						.addComponent(jButton64, javax.swing.GroupLayout.PREFERRED_SIZE, 50,
								javax.swing.GroupLayout.PREFERRED_SIZE)
						.addContainerGap())
				.addGroup(guanli7Layout.createSequentialGroup().addGap(198, 198, 198)
						.addComponent(jButton63, javax.swing.GroupLayout.PREFERRED_SIZE, 82,
								javax.swing.GroupLayout.PREFERRED_SIZE)
						.addGap(23, 23, 23)
						.addComponent(jButton12, javax.swing.GroupLayout.PREFERRED_SIZE, 82,
								javax.swing.GroupLayout.PREFERRED_SIZE)
						.addContainerGap(199, Short.MAX_VALUE))
				.addGroup(guanli7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(guanli7Layout.createSequentialGroup().addGap(0, 0, Short.MAX_VALUE)
								.addComponent(jScrollPane9, javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
								.addGap(0, 0, Short.MAX_VALUE))));
		guanli7Layout.setVerticalGroup(guanli7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(guanli7Layout.createSequentialGroup().addContainerGap()
						.addComponent(jButton64, javax.swing.GroupLayout.PREFERRED_SIZE, 30,
								javax.swing.GroupLayout.PREFERRED_SIZE)
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 435, Short.MAX_VALUE)
						.addGroup(guanli7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(jButton63, javax.swing.GroupLayout.PREFERRED_SIZE, 37,
										javax.swing.GroupLayout.PREFERRED_SIZE)
								.addComponent(jButton12, javax.swing.GroupLayout.PREFERRED_SIZE, 37,
										javax.swing.GroupLayout.PREFERRED_SIZE))
						.addGap(72, 72, 72))
				.addGroup(
						guanli7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
								.addGroup(guanli7Layout.createSequentialGroup().addGap(0, 0, Short.MAX_VALUE)
										.addComponent(jScrollPane9, javax.swing.GroupLayout.PREFERRED_SIZE, 303,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addGap(0, 0, Short.MAX_VALUE))));

		getContentPane().add(guanli7, "card9");

		jLabel15.setText("\u8bfe\u7a0bID\uff1a");

		jLabel16.setText("1008");

		jLabel17.setText("\u8bfe\u7a0b\u540d\u79f0\uff1a");

		jLabel20.setText("\u8bfe\u7a0b\u65f6\u95f4\uff1a");

		jLabel21.setText("\u4e0a\u8bfe\u65f6\u95f4\uff1a");

		jLabel22.setText("\u5b66\u5206\uff1a");

		jTextField29.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jTextField29ActionPerformed(evt);
			}
		});

		jLabel23.setText("\u4eba\u6570\u4e0a\u9650\uff1a");

		jButton74.setText("\u4fee\u6539");
		jButton74.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton74ActionPerformed(evt);
			}
		});

		jButton75.setText("<-");
		jButton75.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton75ActionPerformed(evt);
			}
		});

		jLabel19.setText("\u5df2\u9009\u4eba\u6570\uff1a");

		jLabel24.setText("0");

		jButton82.setText("\u5237\u65b0");
		jButton82.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton82ActionPerformed(evt);
			}
		});

		javax.swing.GroupLayout tea3_Layout = new javax.swing.GroupLayout(tea3_);
		tea3_.setLayout(tea3_Layout);
		tea3_Layout.setHorizontalGroup(tea3_Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(tea3_Layout.createSequentialGroup().addGap(163, 163, 163)
						.addGroup(tea3_Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
								.addGroup(tea3_Layout.createSequentialGroup()
										.addComponent(jButton74, javax.swing.GroupLayout.PREFERRED_SIZE, 110,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
										.addComponent(
												jButton82, javax.swing.GroupLayout.PREFERRED_SIZE, 110,
												javax.swing.GroupLayout.PREFERRED_SIZE))
								.addGroup(tea3_Layout.createSequentialGroup()
										.addGroup(tea3_Layout
												.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
												.addComponent(jLabel17).addComponent(jLabel15))
										.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
										.addGroup(tea3_Layout
												.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
												.addComponent(jTextField25, javax.swing.GroupLayout.PREFERRED_SIZE, 146,
														javax.swing.GroupLayout.PREFERRED_SIZE)
												.addComponent(jLabel16)))
								.addGroup(tea3_Layout
										.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
										.addGroup(javax.swing.GroupLayout.Alignment.LEADING,
												tea3_Layout.createSequentialGroup().addGap(18, 18, 18)
														.addComponent(jLabel22).addPreferredGap(
																javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
														.addComponent(jTextField29))
										.addGroup(javax.swing.GroupLayout.Alignment.LEADING, tea3_Layout
												.createSequentialGroup()
												.addGroup(tea3_Layout
														.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
														.addComponent(jLabel21).addComponent(jLabel20)
														.addComponent(jLabel23).addComponent(jLabel19))
												.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
												.addGroup(tea3_Layout
														.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
														.addComponent(jTextField27,
																javax.swing.GroupLayout.PREFERRED_SIZE, 146,
																javax.swing.GroupLayout.PREFERRED_SIZE)
														.addComponent(jTextField28,
																javax.swing.GroupLayout.PREFERRED_SIZE, 146,
																javax.swing.GroupLayout.PREFERRED_SIZE)
														.addComponent(jTextField30,
																javax.swing.GroupLayout.PREFERRED_SIZE, 146,
																javax.swing.GroupLayout.PREFERRED_SIZE)
														.addComponent(jLabel24)))))
						.addGap(198, 198, 198))
				.addGroup(javax.swing.GroupLayout.Alignment.TRAILING, tea3_Layout.createSequentialGroup()
						.addContainerGap(526, Short.MAX_VALUE).addComponent(jButton75,
								javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
						.addContainerGap()));
		tea3_Layout.setVerticalGroup(tea3_Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(tea3_Layout.createSequentialGroup().addContainerGap()
						.addComponent(jButton75, javax.swing.GroupLayout.PREFERRED_SIZE, 30,
								javax.swing.GroupLayout.PREFERRED_SIZE)
						.addGap(84, 84, 84)
						.addGroup(tea3_Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(jLabel15).addComponent(jLabel16))
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
						.addGroup(tea3_Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
								.addComponent(jLabel17).addComponent(jTextField25,
										javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE,
										javax.swing.GroupLayout.PREFERRED_SIZE))
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
						.addGroup(tea3_Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
								.addComponent(jLabel20).addComponent(jTextField27,
										javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE,
										javax.swing.GroupLayout.PREFERRED_SIZE))
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
						.addGroup(tea3_Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(jLabel21).addComponent(jTextField28,
										javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE,
										javax.swing.GroupLayout.PREFERRED_SIZE))
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
						.addGroup(tea3_Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(jLabel22).addComponent(jTextField29,
										javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE,
										javax.swing.GroupLayout.PREFERRED_SIZE))
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
						.addGroup(tea3_Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(jLabel23).addComponent(jTextField30,
										javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE,
										javax.swing.GroupLayout.PREFERRED_SIZE))
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
						.addGroup(tea3_Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(jLabel19).addComponent(jLabel24))
						.addGap(36, 36, 36)
						.addGroup(tea3_Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(jButton74, javax.swing.GroupLayout.PREFERRED_SIZE, 38,
										javax.swing.GroupLayout.PREFERRED_SIZE)
								.addComponent(jButton82, javax.swing.GroupLayout.PREFERRED_SIZE, 38,
										javax.swing.GroupLayout.PREFERRED_SIZE))
						.addContainerGap(189, Short.MAX_VALUE)));

		getContentPane().add(tea3_, "card25");

		jLabel54.setText("\u8bfe\u7a0bID\uff1a");

		jLabel55.setText("\u8bfe\u7a0b\u540d\u79f0\uff1a");

		jLabel62.setText("\u6559\u5e08ID\uff1a");

		jLabel78.setText("\u6559\u5e08\u59d3\u540d\uff1a");

		jLabel79.setText("\u8bfe\u7a0b\u65f6\u95f4\uff1a");

		jLabel80.setText("\u4e0a\u8bfe\u65f6\u95f4\uff1a");

		jLabel81.setText("\u603b\u4eba\u6570\uff1a");

		jLabel82.setText("\u5df2\u9009\u4eba\u6570\uff1a");

		jLabel83.setText("---");

		jLabel84.setText("---");

		jLabel85.setText("---");

		jLabel86.setText("---");

		jLabel87.setText("---");

		jLabel88.setText("---");

		jLabel89.setText("---");

		jLabel90.setText("---");

		jLabel91.setText("\u5b66\u5206\uff1a");

		jLabel92.setText("---");

		jButton14.setText("<-");
		jButton14.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton14ActionPerformed(evt);
			}
		});

		javax.swing.GroupLayout guanli7_Layout = new javax.swing.GroupLayout(guanli7_);
		guanli7_.setLayout(guanli7_Layout);
		guanli7_Layout
				.setHorizontalGroup(guanli7_Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(guanli7_Layout.createSequentialGroup().addGap(134, 134, 134)
								.addGroup(guanli7_Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
										.addComponent(jLabel62).addComponent(jLabel54).addComponent(jLabel79)
										.addComponent(jLabel81).addComponent(jLabel91))
								.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
								.addGroup(guanli7_Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
										.addGroup(guanli7_Layout.createSequentialGroup()
												.addGroup(guanli7_Layout
														.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
														.addComponent(jLabel83).addComponent(jLabel90)
														.addComponent(jLabel88).addComponent(jLabel87))
												.addGap(81, 81, 81)
												.addGroup(guanli7_Layout
														.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
														.addComponent(jLabel55).addComponent(jLabel78)
														.addComponent(jLabel80).addComponent(jLabel82))
												.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
												.addGroup(guanli7_Layout
														.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
														.addComponent(jLabel85).addComponent(jLabel89)
														.addComponent(jLabel86).addComponent(jLabel84)))
										.addComponent(jLabel92))
								.addContainerGap(205, Short.MAX_VALUE))
						.addGroup(javax.swing.GroupLayout.Alignment.TRAILING, guanli7_Layout.createSequentialGroup()
								.addContainerGap(525, Short.MAX_VALUE).addComponent(jButton14).addContainerGap()));
		guanli7_Layout
				.setVerticalGroup(guanli7_Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(guanli7_Layout.createSequentialGroup().addContainerGap().addComponent(jButton14)
								.addGap(102, 102, 102)
								.addGroup(guanli7_Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
										.addGroup(guanli7_Layout.createSequentialGroup()
												.addGroup(guanli7_Layout
														.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
														.addComponent(jLabel54).addComponent(jLabel83))
												.addGap(43, 43, 43)
												.addGroup(guanli7_Layout
														.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
														.addComponent(jLabel62).addComponent(jLabel87))
												.addGap(35, 35, 35)
												.addGroup(guanli7_Layout
														.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
														.addComponent(jLabel79).addComponent(jLabel88))
												.addGap(34, 34, 34)
												.addGroup(guanli7_Layout
														.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
														.addComponent(jLabel90).addComponent(jLabel81)))
										.addGroup(guanli7_Layout.createSequentialGroup().addGap(2, 2, 2)
												.addGroup(guanli7_Layout
														.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
														.addComponent(jLabel55).addComponent(jLabel84))
												.addGap(43, 43, 43)
												.addGroup(guanli7_Layout
														.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
														.addComponent(jLabel78).addComponent(jLabel86))
												.addGap(35, 35, 35)
												.addGroup(guanli7_Layout
														.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
														.addComponent(jLabel85).addComponent(jLabel80))
												.addGap(34, 34, 34)
												.addGroup(guanli7_Layout
														.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
														.addComponent(jLabel89).addComponent(jLabel82))))
								.addGap(26, 26, 26)
								.addGroup(guanli7_Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
										.addComponent(jLabel92).addComponent(jLabel91))
								.addContainerGap(222, Short.MAX_VALUE)));

		getContentPane().add(guanli7_, "card26");

		jLabel101.setText("\u6559\u5e08ID\uff1a");

		jLabel102.setText("\u8bfe\u7a0bID\uff1a");

		jLabel103.setText("\u8bfe\u7a0b\u65f6\u95f4\uff1a");

		jLabel104.setText("\u603b\u4eba\u6570\uff1a");

		jLabel105.setText("\u5b66\u5206\uff1a");

		jLabel106.setText("---");

		jLabel107.setText("---");

		jLabel108.setText("---");

		jLabel109.setText("---");

		jLabel110.setText("\u8bfe\u7a0b\u540d\u79f0\uff1a");

		jLabel111.setText("\u6559\u5e08\u59d3\u540d\uff1a");

		jLabel112.setText("\u4e0a\u8bfe\u65f6\u95f4\uff1a");

		jLabel113.setText("\u5df2\u9009\u4eba\u6570\uff1a");

		jLabel114.setText("---");

		jLabel115.setText("---");

		jLabel116.setText("---");

		jLabel117.setText("---");

		jLabel118.setText("---");

		jButton56.setText("<-");
		jButton56.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton56ActionPerformed(evt);
			}
		});

		javax.swing.GroupLayout stu1_Layout = new javax.swing.GroupLayout(stu1_);
		stu1_.setLayout(stu1_Layout);
		stu1_Layout
				.setHorizontalGroup(stu1_Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(stu1_Layout.createSequentialGroup().addGap(144, 144, 144)
								.addGroup(stu1_Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
										.addComponent(jLabel101).addComponent(jLabel102).addComponent(jLabel103)
										.addComponent(jLabel104).addComponent(jLabel105))
								.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
								.addGroup(stu1_Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
										.addGroup(stu1_Layout.createSequentialGroup()
												.addGroup(stu1_Layout
														.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
														.addComponent(jLabel106).addComponent(jLabel107)
														.addComponent(jLabel108).addComponent(jLabel109))
												.addGap(81, 81, 81)
												.addGroup(stu1_Layout
														.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
														.addComponent(jLabel110).addComponent(jLabel111)
														.addComponent(jLabel112).addComponent(jLabel113))
												.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
												.addGroup(stu1_Layout
														.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
														.addComponent(jLabel114).addComponent(jLabel115)
														.addComponent(jLabel116).addComponent(jLabel117)))
										.addComponent(jLabel118))
								.addContainerGap(195, Short.MAX_VALUE))
						.addGroup(javax.swing.GroupLayout.Alignment.TRAILING,
								stu1_Layout.createSequentialGroup().addContainerGap(522, Short.MAX_VALUE)
										.addComponent(jButton56, javax.swing.GroupLayout.PREFERRED_SIZE, 50,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addContainerGap()));
		stu1_Layout.setVerticalGroup(stu1_Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(stu1_Layout.createSequentialGroup().addContainerGap()
						.addComponent(jButton56, javax.swing.GroupLayout.PREFERRED_SIZE, 30,
								javax.swing.GroupLayout.PREFERRED_SIZE)
						.addGap(106, 106, 106)
						.addGroup(stu1_Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
								.addGroup(stu1_Layout.createSequentialGroup()
										.addGroup(stu1_Layout
												.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
												.addComponent(jLabel102).addComponent(jLabel106))
										.addGap(43, 43, 43)
										.addGroup(stu1_Layout
												.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
												.addComponent(jLabel101).addComponent(jLabel109))
										.addGap(35, 35, 35)
										.addGroup(stu1_Layout
												.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
												.addComponent(jLabel103).addComponent(jLabel108))
										.addGap(34, 34, 34)
										.addGroup(stu1_Layout
												.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
												.addComponent(jLabel107).addComponent(jLabel104)))
								.addGroup(
										stu1_Layout.createSequentialGroup().addGap(2, 2, 2)
												.addGroup(stu1_Layout
														.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
														.addComponent(jLabel110).addComponent(jLabel117))
												.addGap(43, 43, 43)
												.addGroup(stu1_Layout
														.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
														.addComponent(jLabel111).addComponent(jLabel116))
												.addGap(35, 35, 35)
												.addGroup(stu1_Layout
														.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
														.addComponent(jLabel114).addComponent(jLabel112))
												.addGap(34, 34, 34)
												.addGroup(stu1_Layout
														.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
														.addComponent(jLabel115).addComponent(jLabel113))))
						.addGap(26, 26, 26)
						.addGroup(stu1_Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(jLabel118).addComponent(jLabel105))
						.addContainerGap(213, Short.MAX_VALUE)));

		getContentPane().add(stu1_, "card27");

		jLabel70.setText("\u4e0b\u9762\u8fdb\u884c\u6210\u7ee9\u4fee\u6539");

		jLabel120.setText("\u539f\u6210\u7ee9\uff1a");

		jLabel121.setText("\u6027\u522b\uff1a");

		jLabel122.setText("\u59d3\u540d\uff1a");

		jLabel123.setText("\u5b66\u53f7\uff1a");

		jLabel124.setText("\u4fee\u6539\u540e\u6210\u7ee9\uff1a");

		jLabel125.setText("\u8bf7\u8f93\u5165\u5b66\u53f7\uff1a");

		jTextField20.setEditable(false);

		jButton62.setText("\u786e\u5b9a");
		jButton62.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton62ActionPerformed(evt);
			}
		});

		jTextField36.setEditable(false);

		jTextField37.setEditable(false);

		jTextField38.setEditable(false);

		jButton79.setText("<-");
		jButton79.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton79ActionPerformed(evt);
			}
		});

		jButton80.setText("\u786e\u5b9a");
		jButton80.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton80ActionPerformed(evt);
			}
		});

		jLabel126.setText("\u8bf7\u8f93\u5165\u8bfe\u7a0bID\uff1a");

		jLabel127.setText("\u8bfe\u7a0bID\uff1a");

		jLabel128.setText("---");

		jLabel129.setText("\u8bfe\u7a0b\u540d\u79f0\uff1a");

		jLabel130.setText("---");

		javax.swing.GroupLayout guanli10Layout = new javax.swing.GroupLayout(guanli10);
		guanli10.setLayout(guanli10Layout);
		guanli10Layout.setHorizontalGroup(guanli10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(guanli10Layout.createSequentialGroup().addContainerGap(166, Short.MAX_VALUE)
						.addGroup(guanli10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
								.addGroup(javax.swing.GroupLayout.Alignment.TRAILING,
										guanli10Layout.createSequentialGroup()
												.addComponent(jButton79, javax.swing.GroupLayout.PREFERRED_SIZE, 50,
														javax.swing.GroupLayout.PREFERRED_SIZE)
												.addContainerGap())
								.addGroup(javax.swing.GroupLayout.Alignment.TRAILING,
										guanli10Layout.createSequentialGroup().addGroup(guanli10Layout
												.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
												.addGroup(guanli10Layout.createSequentialGroup().addGap(14, 14, 14)
														.addGroup(guanli10Layout
																.createParallelGroup(
																		javax.swing.GroupLayout.Alignment.LEADING)
																.addGroup(guanli10Layout.createSequentialGroup()
																		.addGap(72, 72, 72).addComponent(jLabel70))
																.addGroup(guanli10Layout.createSequentialGroup()
																		.addGroup(guanli10Layout.createParallelGroup(
																				javax.swing.GroupLayout.Alignment.TRAILING)
																				.addComponent(jLabel120)
																				.addComponent(jLabel121)
																				.addComponent(jLabel122)
																				.addComponent(jLabel123)
																				.addGroup(guanli10Layout
																						.createParallelGroup(
																								javax.swing.GroupLayout.Alignment.LEADING)
																						.addComponent(jLabel124)
																						.addComponent(jLabel125)))
																		.addPreferredGap(
																				javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																		.addGroup(guanli10Layout.createParallelGroup(
																				javax.swing.GroupLayout.Alignment.LEADING)
																				.addGroup(guanli10Layout
																						.createSequentialGroup()
																						.addGroup(guanli10Layout
																								.createParallelGroup(
																										javax.swing.GroupLayout.Alignment.LEADING,
																										false)
																								.addComponent(
																										jTextField20,
																										javax.swing.GroupLayout.DEFAULT_SIZE,
																										130,
																										Short.MAX_VALUE)
																								.addComponent(
																										jTextField35,
																										javax.swing.GroupLayout.PREFERRED_SIZE,
																										130,
																										javax.swing.GroupLayout.PREFERRED_SIZE))
																						.addPreferredGap(
																								javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																						.addComponent(jButton62,
																								javax.swing.GroupLayout.PREFERRED_SIZE,
																								84,
																								javax.swing.GroupLayout.PREFERRED_SIZE))
																				.addComponent(jTextField36,
																						javax.swing.GroupLayout.PREFERRED_SIZE,
																						130,
																						javax.swing.GroupLayout.PREFERRED_SIZE)
																				.addComponent(jTextField37,
																						javax.swing.GroupLayout.PREFERRED_SIZE,
																						130,
																						javax.swing.GroupLayout.PREFERRED_SIZE)
																				.addComponent(jTextField38,
																						javax.swing.GroupLayout.PREFERRED_SIZE,
																						130,
																						javax.swing.GroupLayout.PREFERRED_SIZE)
																				.addGroup(guanli10Layout
																						.createSequentialGroup()
																						.addComponent(jTextField39,
																								javax.swing.GroupLayout.PREFERRED_SIZE,
																								130,
																								javax.swing.GroupLayout.PREFERRED_SIZE)
																						.addPreferredGap(
																								javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																						.addComponent(jButton80,
																								javax.swing.GroupLayout.PREFERRED_SIZE,
																								84,
																								javax.swing.GroupLayout.PREFERRED_SIZE))))))
												.addGroup(guanli10Layout.createSequentialGroup().addComponent(jLabel126)
														.addPreferredGap(
																javax.swing.LayoutStyle.ComponentPlacement.RELATED)
														.addComponent(jTextField40,
																javax.swing.GroupLayout.PREFERRED_SIZE, 130,
																javax.swing.GroupLayout.PREFERRED_SIZE))
												.addGroup(guanli10Layout.createSequentialGroup().addGap(27, 27, 27)
														.addComponent(jLabel127)
														.addPreferredGap(
																javax.swing.LayoutStyle.ComponentPlacement.RELATED)
														.addComponent(jLabel128).addGap(51, 51, 51)
														.addComponent(jLabel129)
														.addPreferredGap(
																javax.swing.LayoutStyle.ComponentPlacement.RELATED)
														.addComponent(jLabel130)))
												.addGap(106, 106, 106)))));
		guanli10Layout.setVerticalGroup(guanli10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(guanli10Layout.createSequentialGroup().addContainerGap()
						.addComponent(jButton79, javax.swing.GroupLayout.PREFERRED_SIZE, 30,
								javax.swing.GroupLayout.PREFERRED_SIZE)
						.addGap(37, 37, 37)
						.addGroup(guanli10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(jLabel126)
								.addComponent(jTextField40, javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
						.addGroup(guanli10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(jLabel125)
								.addComponent(jTextField35, javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
								.addComponent(jButton62))
						.addGap(26, 26, 26)
						.addGroup(guanli10Layout
								.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE).addComponent(jLabel127)
								.addComponent(jLabel128).addComponent(jLabel129).addComponent(jLabel130))
						.addGap(26, 26, 26)
						.addGroup(guanli10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(jLabel123).addComponent(jTextField20,
										javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE,
										javax.swing.GroupLayout.PREFERRED_SIZE))
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
						.addGroup(guanli10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(jLabel122)
								.addComponent(jTextField36, javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
						.addGroup(guanli10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(jLabel121).addComponent(jTextField37,
										javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE,
										javax.swing.GroupLayout.PREFERRED_SIZE))
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
						.addGroup(guanli10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(jLabel120).addComponent(jTextField38,
										javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE,
										javax.swing.GroupLayout.PREFERRED_SIZE))
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addComponent(jLabel70)
						.addGap(27, 27, 27)
						.addGroup(guanli10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(jLabel124)
								.addComponent(jTextField39, javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
								.addComponent(jButton80))
						.addContainerGap(189, Short.MAX_VALUE)));

		getContentPane().add(guanli10, "card28");

		jLabel131.setText("\u5b66\u53f7\uff1a");

		jLabel132.setText("\u59d3\u540d\uff1a");

		jLabel133.setText("\u6027\u522b\uff1a");

		jLabel134.setText("\u5e74\u9f84\uff1a");

		jLabel135.setText("\u4e13\u4e1a\uff1a");

		jLabel136.setText("\u73ed\u7ea7\uff1a");

		jLabel137.setText("---");

		jLabel138.setText("---");

		jLabel139.setText("---");

		jLabel140.setText("---");

		jLabel141.setText("---");

		jLabel142.setText("---");

		jButton92.setText("<-");
		jButton92.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton92ActionPerformed(evt);
			}
		});

		javax.swing.GroupLayout guanli1_Layout = new javax.swing.GroupLayout(guanli1_);
		guanli1_.setLayout(guanli1_Layout);
		guanli1_Layout.setHorizontalGroup(guanli1_Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(guanli1_Layout.createSequentialGroup().addGap(121, 121, 121)
						.addGroup(guanli1_Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
								.addGroup(guanli1_Layout.createSequentialGroup().addComponent(jLabel135)
										.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
										.addComponent(jLabel141))
								.addGroup(guanli1_Layout.createSequentialGroup().addComponent(jLabel131)
										.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
										.addComponent(jLabel137))
								.addGroup(guanli1_Layout.createSequentialGroup().addComponent(jLabel134)
										.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
										.addComponent(jLabel140)))
						.addGap(103, 103, 103)
						.addGroup(guanli1_Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
								.addGroup(guanli1_Layout.createSequentialGroup().addComponent(jLabel136)
										.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
										.addComponent(jLabel142))
								.addGroup(guanli1_Layout.createSequentialGroup().addComponent(jLabel132)
										.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
										.addComponent(jLabel138))
								.addGroup(guanli1_Layout.createSequentialGroup().addComponent(jLabel133)
										.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
										.addComponent(jLabel139)))
						.addContainerGap(244, Short.MAX_VALUE))
				.addGroup(javax.swing.GroupLayout.Alignment.TRAILING, guanli1_Layout.createSequentialGroup()
						.addContainerGap(522, Short.MAX_VALUE).addComponent(jButton92,
								javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
						.addContainerGap()));
		guanli1_Layout.setVerticalGroup(guanli1_Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(guanli1_Layout.createSequentialGroup().addContainerGap()
						.addComponent(jButton92, javax.swing.GroupLayout.PREFERRED_SIZE, 30,
								javax.swing.GroupLayout.PREFERRED_SIZE)
						.addGap(148, 148, 148)
						.addGroup(guanli1_Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
								.addGroup(guanli1_Layout.createSequentialGroup().addGap(1, 1, 1).addGroup(guanli1_Layout
										.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
										.addGroup(guanli1_Layout.createSequentialGroup().addGap(2, 2, 2)
												.addGroup(guanli1_Layout
														.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
														.addComponent(jLabel131).addComponent(jLabel137))
												.addGap(93, 93, 93)
												.addGroup(guanli1_Layout
														.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
														.addComponent(jLabel135).addComponent(jLabel141)))
										.addGroup(guanli1_Layout.createSequentialGroup().addGap(55, 55, 55)
												.addGroup(guanli1_Layout
														.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
														.addComponent(jLabel134).addComponent(jLabel140)))))
								.addGroup(guanli1_Layout.createSequentialGroup()
										.addGroup(guanli1_Layout
												.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
												.addComponent(jLabel132).addComponent(jLabel138))
										.addGap(35, 35, 35)
										.addGroup(guanli1_Layout
												.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
												.addComponent(jLabel133).addComponent(jLabel139))
										.addGap(38, 38, 38)
										.addGroup(guanli1_Layout
												.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
												.addComponent(jLabel136).addComponent(jLabel142))))
						.addContainerGap(266, Short.MAX_VALUE)));

		getContentPane().add(guanli1_, "card29");

		jLabel143.setText("\u5b66\u53f7\uff1a");

		jLabel144.setText("\u59d3\u540d\uff1a");

		jLabel145.setText("\u6027\u522b\uff1a");

		jLabel146.setText("\u5e74\u9f84\uff1a");

		jLabel147.setText("\u4e13\u4e1a\uff1a");

		jLabel148.setText("\u73ed\u7ea7\uff1a");

		jLabel149.setText("---");

		jLabel150.setText("---");

		jLabel151.setText("---");

		jLabel152.setText("---");

		jLabel153.setText("---");

		jLabel154.setText("---");

		jButton91.setText("<-");
		jButton91.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton91ActionPerformed(evt);
			}
		});

		javax.swing.GroupLayout tea1_Layout = new javax.swing.GroupLayout(tea1_);
		tea1_.setLayout(tea1_Layout);
		tea1_Layout.setHorizontalGroup(tea1_Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(tea1_Layout.createSequentialGroup().addGap(149, 149, 149)
						.addGroup(tea1_Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
								.addComponent(jLabel143, javax.swing.GroupLayout.Alignment.TRAILING)
								.addComponent(jLabel145, javax.swing.GroupLayout.Alignment.TRAILING)
								.addComponent(jLabel147, javax.swing.GroupLayout.Alignment.TRAILING))
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
						.addGroup(tea1_Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
								.addComponent(jLabel149).addComponent(jLabel151).addComponent(jLabel153))
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 152, Short.MAX_VALUE)
						.addGroup(tea1_Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
								.addComponent(jLabel144, javax.swing.GroupLayout.Alignment.TRAILING)
								.addComponent(jLabel146, javax.swing.GroupLayout.Alignment.TRAILING)
								.addComponent(jLabel148, javax.swing.GroupLayout.Alignment.TRAILING))
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
						.addGroup(tea1_Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
								.addComponent(jLabel150).addComponent(jLabel152).addComponent(jLabel154))
						.addGap(167, 167, 167))
				.addGroup(javax.swing.GroupLayout.Alignment.TRAILING, tea1_Layout.createSequentialGroup()
						.addContainerGap(522, Short.MAX_VALUE).addComponent(jButton91,
								javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
						.addContainerGap()));
		tea1_Layout.setVerticalGroup(tea1_Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(tea1_Layout.createSequentialGroup().addContainerGap()
						.addComponent(jButton91, javax.swing.GroupLayout.PREFERRED_SIZE, 30,
								javax.swing.GroupLayout.PREFERRED_SIZE)
						.addGap(165, 165, 165)
						.addGroup(tea1_Layout
								.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE).addComponent(jLabel143)
								.addComponent(jLabel144).addComponent(jLabel149).addComponent(jLabel150))
						.addGap(23, 23, 23)
						.addGroup(tea1_Layout
								.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE).addComponent(jLabel145)
								.addComponent(jLabel146).addComponent(jLabel151).addComponent(jLabel152))
						.addGap(28, 28, 28)
						.addGroup(tea1_Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(jLabel148).addComponent(jLabel147).addComponent(jLabel153)
								.addComponent(jLabel154))
						.addContainerGap(277, Short.MAX_VALUE)));

		getContentPane().add(tea1_, "card30");

		pack();
	}// </editor-fold>
		// GEN-END:initComponents

	private void jButton92ActionPerformed(java.awt.event.ActionEvent evt) {
		jLabel137.setText(null);
		jLabel138.setText(null);
		jLabel139.setText(null);
		jLabel140.setText(null);
		jLabel141.setText(null);
		jLabel142.setText(null);
		guanli1_.setVisible(false);
		guanli1.setVisible(true);
	}

	private void jButton91ActionPerformed(java.awt.event.ActionEvent evt) {
		jLabel149.setText(null);
		jLabel150.setText(null);
		jLabel151.setText(null);
		jLabel152.setText(null);
		jLabel153.setText(null);
		jLabel154.setText(null);
		tea1_.setVisible(false);
		tea1.setVisible(true);
	}

	private void jButton90ActionPerformed(java.awt.event.ActionEvent evt) {
		int row[] = jTable3.getSelectedRows();
		String stu_id = "";
		ArrayList<String[]> stu = new ArrayList<String[]>();
		if (row.length == 0) {
			JOptionPane tip = new JOptionPane();
			JOptionPane.showMessageDialog(this, "没有指定学生！");
			tip.setVisible(true);
		} else if (row.length == 1) {
			stu_id = (String) jTable3.getValueAt(row[0], 0);
			stu = teacher.see_stu(stu_id);
			jLabel149.setText(stu.get(0)[0]);
			jLabel150.setText(stu.get(0)[1]);
			jLabel151.setText(stu.get(0)[2]);
			jLabel152.setText(stu.get(0)[3]);
			jLabel153.setText(stu.get(0)[4]);
			jLabel154.setText(stu.get(0)[5]);
			tea1.setVisible(false);
			tea1_.setVisible(true);
		} else {
			JOptionPane tip = new JOptionPane();
			JOptionPane.showMessageDialog(this, "该功能不支持多选！");
			tip.setVisible(true);
		}
	}

	private void jButton61ActionPerformed(java.awt.event.ActionEvent evt) {
		String type = "stu_id";
		int row[] = jTable4.getSelectedRows();
		String stu_id = "";
		ArrayList<String[]> stu = new ArrayList<String[]>();
		if (row.length == 0) {
			JOptionPane tip = new JOptionPane();
			JOptionPane.showMessageDialog(this, "没有指定学生！");
			tip.setVisible(true);
		} else if (row.length == 1) {
			stu_id = (String) jTable4.getValueAt(row[0], 0);
			stu = admin.see_stu(type, stu_id);
			System.out.println(stu.get(0)[0]);
			jLabel137.setText(stu.get(0)[0]);
			jLabel138.setText(stu.get(0)[1]);
			jLabel139.setText(stu.get(0)[2]);
			jLabel140.setText(stu.get(0)[3]);
			jLabel141.setText(stu.get(0)[4]);
			jLabel142.setText(stu.get(0)[5]);
			guanli1.setVisible(false);
			guanli1_.setVisible(true);
		} else {
			JOptionPane tip = new JOptionPane();
			JOptionPane.showMessageDialog(this, "该功能不支持多选！");
			tip.setVisible(true);
		}
	}

	private void jTextField1KeyPressed(java.awt.event.KeyEvent evt) {
		if (evt.getKeyChar() == KeyEvent.VK_ENTER) {
			jButton1.doClick();
		}
	}

	private void jRadioButton2KeyPressed(java.awt.event.KeyEvent evt) {
		if (evt.getKeyChar() == KeyEvent.VK_ENTER) {
			jButton1.doClick();
		}
	}

	private void jRadioButton1KeyPressed(java.awt.event.KeyEvent evt) {
		if (evt.getKeyChar() == KeyEvent.VK_ENTER) {
			jButton1.doClick();
		}
	}

	private void jRadioButton3KeyPressed(java.awt.event.KeyEvent evt) {
		if (evt.getKeyChar() == KeyEvent.VK_ENTER) {
			jButton1.doClick();
		}
	}

	private void jPasswordField10KeyPressed(java.awt.event.KeyEvent evt) {
		if (evt.getKeyChar() == KeyEvent.VK_ENTER) {
			jButton1.doClick();
		}
	}

	private void loginKeyPressed(java.awt.event.KeyEvent evt) {
		if (evt.getKeyChar() == KeyEvent.VK_ENTER) {
			jButton1.doClick();
		}
	}

	private void jButton89ActionPerformed(java.awt.event.ActionEvent evt) {
		jTextField14.setText(null);
		jPasswordField6.setText(null);
		jPasswordField7.setText(null);
	}

	private void jButton88ActionPerformed(java.awt.event.ActionEvent evt) {
		jPasswordField8.setText(null);
		jPasswordField9.setText(null);
	}

	private void jButton65ActionPerformed(java.awt.event.ActionEvent evt) {
		jLabel100.setText(admin.getNum());
		jTextField17.setText(admin.getName());
		jTextField32.setText(admin.getSex());
		jTextField33.setText(String.valueOf(admin.getAge()));
	}

	private void jButton87ActionPerformed(java.awt.event.ActionEvent evt) {
		ArrayList<String[]> stu_cou = admin.see_counum();
		DefaultTableModel tableModel = (DefaultTableModel) jTable11.getModel();
		tableModel.setRowCount(0);
		if (stu_cou != null) {
			for (int i = 0; i < stu_cou.size(); i++) {
				tableModel.addRow(new Object[] { null, null, null, null, null, null, null });
			}
		}
		for (int i = 0; i < stu_cou.size(); i++) {
			for (int j = 0; j < 6; j++) {
				jTable11.setValueAt(stu_cou.get(i)[j], i, j);
			}
		}
	}

	private void jButton86ActionPerformed(java.awt.event.ActionEvent evt) {
		jTextField19.setText(null);
		jTextField18.setText(null);
		ArrayList<String[]> tea = admin.see_tea();
		jComboBox2.removeAllItems();
		for (int i = 0; i < tea.size(); i++) {
			jComboBox2.addItem(tea.get(i)[0] + "  " + tea.get(i)[1]);
		}
		jSpinner7.setValue(0);
		jSpinner8.setValue(0);
		jSpinner9.setValue(0);
		jSpinner10.setValue(0);
		jSpinner11.setValue(0);
		jSpinner12.setValue(0);
		jSpinner13.setValue(0);
		jComboBox9.setSelectedIndex(0);
	}

	private void jButton85ActionPerformed(java.awt.event.ActionEvent evt) {
		DefaultTableModel tableModel = (DefaultTableModel) jTable6.getModel();
		tableModel.setRowCount(0);
		jComboBox7.setSelectedIndex(0);
		jComboBox8.removeAllItems();
		ArrayList<String[]> tea = admin.see_tea();
		if (tea != null) {
			for (int i = 0; i < tea.size(); i++) {
				tableModel.addRow(new Object[] { tea.get(i)[0], tea.get(i)[1], tea.get(i)[2], tea.get(i)[3] });
			}
		}
	}

	private void jButton49ActionPerformed(java.awt.event.ActionEvent evt) {
		jTextField16.setText(null);
		jTextField31.setText(null);
		jComboBox12.setSelectedIndex(0);
		jSpinner14.setValue(0);
		jPasswordField11.setText(null);
		guanli2.setVisible(false);
		guanli.setVisible(true);
	}

	private void jButton23ActionPerformed(java.awt.event.ActionEvent evt) {
		jTextField16.setText(null);
		jTextField31.setText(null);
		jComboBox12.setSelectedIndex(0);
		jSpinner14.setValue(0);
		jPasswordField11.setText(null);
	}

	private void jButton84ActionPerformed(java.awt.event.ActionEvent evt) {
		DefaultTableModel tableModel = (DefaultTableModel) jTable4.getModel();
		tableModel.setRowCount(0);
		jComboBox5.setSelectedIndex(0);
		jComboBox6.removeAllItems();
		ArrayList<String[]> stu = admin.see_stu();
		for (int i = 0; i < stu.size(); i++) {
			tableModel.addRow(new Object[] { stu.get(i)[0], stu.get(i)[1], stu.get(i)[2], stu.get(i)[3], stu.get(i)[4],
					stu.get(i)[5] });
		}
	}

	private void jButton41ActionPerformed(java.awt.event.ActionEvent evt) {
		jTextField8.setText(null);
		jPasswordField4.setText(null);
		jPasswordField5.setText(null);
	}

	private void jButton83ActionPerformed(java.awt.event.ActionEvent evt) {
		DefaultTableModel tableModel = (DefaultTableModel) jTable10.getModel();
		tableModel.setRowCount(0);
		ArrayList<String[]> stu_cou = teacher.see_counum();
		int row = stu_cou.size() - jTable10.getRowCount();
		if (row > 0) {
			for (int i = 0; i < row; i++) {
				tableModel.addRow(new Object[] { null, null, null, null, null, null, null });
			}
		}
		for (int i = 0; i < stu_cou.size(); i++) {
			for (int j = 0; j < 6; j++) {
				jTable10.setValueAt(stu_cou.get(i)[j], i, j);
			}
		}
	}

	private void jButton82ActionPerformed(java.awt.event.ActionEvent evt) {
		String cou_id = jLabel16.getText();
		String[] cou_one = teacher.see_cou_one(cou_id);
		jLabel16.setText(cou_one[0]);
		jTextField25.setText(cou_one[1]);
		jTextField27.setText(cou_one[2]);
		jTextField28.setText(cou_one[3]);
		jTextField29.setText(cou_one[4]);
		jTextField30.setText(cou_one[5]);
		jLabel24.setText(cou_one[6]);
		jTextField6.setText(null);
	}

	private void jButton30ActionPerformed(java.awt.event.ActionEvent evt) {
		jTextField2.setText(null);
		jTextField5.setText(null);
		jSpinner2.setValue(0);
		jSpinner3.setValue(0);
		jSpinner4.setValue(0);
		jSpinner5.setValue(0);
		jSpinner6.setValue(0);
		jSpinner12.setValue(0);
		jComboBox4.setSelectedIndex(0);
	}

	private void jButton81ActionPerformed(java.awt.event.ActionEvent evt) {
		jTextField7.setText(null);
		jPasswordField2.setText(null);
		jPasswordField3.setText(null);
	}

	private void jButton80ActionPerformed(java.awt.event.ActionEvent evt) {
		String cou_id = jLabel128.getText();
		String stu_id = jTextField20.getText();
		String cou_num = jTextField39.getText();
		if (cou_num.isEmpty()) {
			JOptionPane tip = new JOptionPane();
			JOptionPane.showMessageDialog(this, "成绩不能为空！");
			tip.setVisible(true);
		} else if (cou_num.matches("\\d*\\.?\\d*") && Double.parseDouble(cou_num) >= 0
				&& Double.parseDouble(cou_num) <= 100) {
			if (admin.set_counum(cou_id, stu_id, cou_num)) {
				JOptionPane tip = new JOptionPane();
				JOptionPane.showMessageDialog(this, "修改成功！");
				tip.setVisible(true);
			} else {
				JOptionPane tip = new JOptionPane();
				JOptionPane.showMessageDialog(this, "失败！");
				tip.setVisible(true);
			}
		} else {
			JOptionPane tip = new JOptionPane();
			JOptionPane.showMessageDialog(this, "成绩要在0-100之间");
			tip.setVisible(true);
		}
	}

	private void jButton79ActionPerformed(java.awt.event.ActionEvent evt) {
		jTextField40.setText(null);
		jTextField35.setText(null);
		jLabel128.setText("---");
		jLabel130.setText("---");
		jTextField20.setText(null);
		jTextField36.setText(null);
		jTextField37.setText(null);
		jTextField38.setText(null);
		jTextField39.setText(null);
		guanli10.setVisible(false);
		guanli.setVisible(true);
	}

	private void jButton62ActionPerformed(java.awt.event.ActionEvent evt) {
		String cou_id = jTextField40.getText();
		String stu_id = jTextField35.getText();
		if (cou_id.isEmpty()) {
			JOptionPane tip = new JOptionPane();
			JOptionPane.showMessageDialog(this, "课程ID不能为空！");
			tip.setVisible(true);
		} else if (stu_id.isEmpty()) {
			JOptionPane tip = new JOptionPane();
			JOptionPane.showMessageDialog(this, "学号不能为空！");
			tip.setVisible(true);
		} else if (admin.see_counum(stu_id, cou_id) == null) {
			JOptionPane tip = new JOptionPane();
			JOptionPane.showMessageDialog(this, "查找失败！请检查教程ID和学号的正确性");
			tip.setVisible(true);
		} else {
			String[] counum = admin.see_counum(stu_id, cou_id);
			jLabel128.setText(counum[0]);
			jLabel130.setText(counum[1]);
			jTextField20.setText(counum[2]);
			jTextField36.setText(counum[3]);
			jTextField37.setText(counum[4]);
			jTextField38.setText(counum[5]);
			jTextField39.setText(null);
		}
	}

	private void jButton60ActionPerformed(java.awt.event.ActionEvent evt) {
		guanli.setVisible(false);
		guanli10.setVisible(true);
	}

	private void jButton57ActionPerformed(java.awt.event.ActionEvent evt) {
		ArrayList<String[]> stu_cou = admin.see_counum();
		int row = stu_cou.size() - jTable11.getRowCount();
		DefaultTableModel tableModel = (DefaultTableModel) jTable11.getModel();
		if (row > 0) {
			for (int i = 0; i < row; i++) {
				tableModel.addRow(new Object[] { null, null, null, null, null, null, null });
			}
		}
		for (int i = 0; i < stu_cou.size(); i++) {
			for (int j = 0; j < 6; j++) {
				jTable11.setValueAt(stu_cou.get(i)[j], i, j);
			}
		}
		guanli.setVisible(false);
		guanli6.setVisible(true);
	}

	private void jButton78ActionPerformed(java.awt.event.ActionEvent evt) {
		String cou_id = jTextField34.getText();
		if (cou_id.isEmpty()) {
			JOptionPane tip = new JOptionPane();
			JOptionPane.showMessageDialog(this, "课程ID不能为空！");
			tip.setVisible(true);
		} else if (admin.see_counum(cou_id) == null) {
			JOptionPane tip = new JOptionPane();
			JOptionPane.showMessageDialog(this, "查找失败！请检查课程ID是否正确");
			tip.setVisible(true);
		} else {
			ArrayList<String[]> cou_stu = admin.see_counum(cou_id);
			DefaultTableModel tableModel = (DefaultTableModel) jTable11.getModel();
			tableModel.setRowCount(0);
			for (int i = 0; i < cou_stu.size(); i++) {
				tableModel.addRow(new Object[] { cou_stu.get(i)[0], cou_stu.get(i)[1], cou_stu.get(i)[2],
						cou_stu.get(i)[3], cou_stu.get(i)[4], cou_stu.get(i)[5] });
			}
		}
	}

	private void jButton77ActionPerformed(java.awt.event.ActionEvent evt) {
		DefaultTableModel tableModel = (DefaultTableModel) jTable11.getModel();
		tableModel.setRowCount(0);
		guanli6.setVisible(false);
		guanli.setVisible(true);
	}

	private void jButton72ActionPerformed(java.awt.event.ActionEvent evt) {
		String tips = "";
		for (int j = 0; j < jTable11.getRowCount(); j++) {
			if (jTable11.getValueAt(j, 5) == null || jTable11.getValueAt(j, 5).toString().length() == 0) {

			} else if (Double.parseDouble(jTable11.getValueAt(j, 5).toString()) > 100
					|| Double.parseDouble(jTable11.getValueAt(j, 5).toString()) < 0) {
				tips = tips.concat(" 第" + j + "");
			}
		}
		if (tips.isEmpty()) {
			for (int i = 0; i < jTable11.getRowCount(); i++) {
				if (jTable11.getValueAt(i, 5) == null || jTable11.getValueAt(i, 5).toString().length() == 0) {
					admin.set_counum(jTable11.getValueAt(i, 0).toString(), jTable11.getValueAt(i, 2).toString(),
							"null");
				} else {
					admin.set_counum(jTable11.getValueAt(i, 0).toString(), jTable11.getValueAt(i, 2).toString(),
							jTable11.getValueAt(i, 5).toString());
				}
			}
			JOptionPane tip = new JOptionPane();
			JOptionPane.showMessageDialog(this, "添加成功！");
			tip.setVisible(true);
		} else {
			JOptionPane tip = new JOptionPane();
			JOptionPane.showMessageDialog(this, "" + tips + "行成绩不在0-100之间！");
			tip.setVisible(true);
		}
	}

	private void jButton56ActionPerformed(java.awt.event.ActionEvent evt) {
		jLabel106.setText(null);
		jLabel117.setText(null);
		jLabel109.setText(null);
		jLabel116.setText(null);
		jLabel108.setText(null);
		jLabel114.setText(null);
		jLabel107.setText(null);
		jLabel115.setText(null);
		jLabel118.setText(null);
		stu1_.setVisible(false);
		stu1.setVisible(true);
	}

	private void jButton55ActionPerformed(java.awt.event.ActionEvent evt) {
		int row[] = jTable1.getSelectedRows();
		String ch = "";
		String cou_id = "";
		String num = "";
		if (row.length == 0) {
			JOptionPane tip = new JOptionPane();
			JOptionPane.showMessageDialog(this, "没有选中课程！");
			tip.setVisible(true);
		} else if (row.length == 1) {
			ch = jTable1.getValueAt(row[0], 4).toString();
			cou_id = jTable1.getValueAt(row[0], 0).toString();
			num = jTable1.getValueAt(row[0], 3).toString();
			if (ch.equals("已选")) {
				JOptionPane tip = new JOptionPane();
				JOptionPane.showMessageDialog(this, "课程已选定，不能重复选定！");
				tip.setVisible(true);
			} else if (Integer.parseInt(num) <= 0) {
				JOptionPane tip = new JOptionPane();
				JOptionPane.showMessageDialog(this, "人数已达到上限！");
				tip.setVisible(true);
			} else if (student.set_sc(cou_id)) {
				JOptionPane tip = new JOptionPane();
				JOptionPane.showMessageDialog(this, "选定成功！");
				tip.setVisible(true);
			} else {
				JOptionPane tip = new JOptionPane();
				JOptionPane.showMessageDialog(this, "选定失败！");
				tip.setVisible(true);
			}
		}
	}

	private void jButton51ActionPerformed(java.awt.event.ActionEvent evt) {
		jLabel100.setText(null);
		jTextField17.setText(null);
		jTextField32.setText(null);
		jTextField33.setText(null);
		guanli4.setVisible(false);
		guanli.setVisible(true);
	}

	private void jButton50ActionPerformed(java.awt.event.ActionEvent evt) {
		String name = jTextField17.getText();
		String sex = jTextField32.getText();
		String age = jTextField33.getText();
		if (name.isEmpty()) {
			JOptionPane tip = new JOptionPane();
			JOptionPane.showMessageDialog(this, "姓名不能为空！");
			tip.setVisible(true);
		} else if (sex.isEmpty()) {
			JOptionPane tip = new JOptionPane();
			JOptionPane.showMessageDialog(this, "性别不能为空！");
			tip.setVisible(true);
		} else if (age.isEmpty()) {
			JOptionPane tip = new JOptionPane();
			JOptionPane.showMessageDialog(this, "年龄不能为空！");
			tip.setVisible(true);
		} else if (!(sex.equals("男") || sex.equals("女"))) {
			JOptionPane tip = new JOptionPane();
			JOptionPane.showMessageDialog(this, "请输入男或者女！");
			tip.setVisible(true);
		} else if (!(age.matches("\\d*"))) {
			JOptionPane tip = new JOptionPane();
			JOptionPane.showMessageDialog(this, "年龄要为正整数！");
			tip.setVisible(true);
		} else if (admin.set_admin(name, sex, age)) {
			JOptionPane tip = new JOptionPane();
			JOptionPane.showMessageDialog(this, "修改成功！请重新登陆");
			tip.setVisible(true);
			admin = null;
			guanli4.setVisible(false);
			login.setVisible(true);
		} else {
			JOptionPane tip = new JOptionPane();
			JOptionPane.showMessageDialog(this, "修改失败！");
			tip.setVisible(true);
		}
	}

	private void jButton73ActionPerformed(java.awt.event.ActionEvent evt) {
		jLabel100.setText(admin.getNum());
		jTextField17.setText(admin.getName());
		jTextField32.setText(admin.getSex());
		jTextField33.setText(String.valueOf(admin.getAge()));
		guanli.setVisible(false);
		guanli4.setVisible(true);
	}

	@SuppressWarnings("deprecation")
	private void jButton16ActionPerformed(java.awt.event.ActionEvent evt) {
		String tea_id = jTextField16.getText();
		String tea_name = jTextField31.getText();
		String tea_sex = jComboBox12.getSelectedItem().toString();
		String tea_age = jSpinner14.getValue().toString();
		String tea_pw = jPasswordField11.getText();
		if (tea_id.isEmpty()) {
			JOptionPane tip = new JOptionPane();
			JOptionPane.showMessageDialog(this, "ID不能为空！");
			tip.setVisible(true);
		} else if (tea_name.isEmpty()) {
			JOptionPane tip = new JOptionPane();
			JOptionPane.showMessageDialog(this, "姓名不能为空！");
			tip.setVisible(true);
		} else if (tea_pw.isEmpty()) {
			JOptionPane tip = new JOptionPane();
			JOptionPane.showMessageDialog(this, "密码不能为空！");
			tip.setVisible(true);
		} else if (admin.add_tea(tea_id, tea_name, tea_pw, tea_sex, tea_age)) {
			JOptionPane tip = new JOptionPane();
			JOptionPane.showMessageDialog(this, "添加成功！");
			tip.setVisible(true);
		} else {
			JOptionPane tip = new JOptionPane();
			JOptionPane.showMessageDialog(this, "添加失败，账号可能已存在！");
			tip.setVisible(true);
		}
	}

	private void jButton14ActionPerformed(java.awt.event.ActionEvent evt) {
		guanli7_.setVisible(false);
		guanli7.setVisible(true);
	}

	private void jButton12ActionPerformed(java.awt.event.ActionEvent evt) {
		int row[] = jTable9.getSelectedRows();
		String cou_id;
		if (row.length == 0) {
			JOptionPane tip = new JOptionPane();
			JOptionPane.showMessageDialog(this, "没有选中课程！");
			tip.setVisible(true);
		} else if (row.length == 1) {
			cou_id = jTable9.getValueAt(row[0], 0).toString();
			String cou[] = admin.see_cou(cou_id);
			jLabel83.setText(cou[0]);
			jLabel84.setText(cou[1]);
			jLabel87.setText(cou[7]);
			jLabel86.setText(cou[8]);
			jLabel88.setText(cou[2]);
			jLabel85.setText(cou[3]);
			jLabel90.setText(cou[4]);
			jLabel89.setText(cou[5]);
			jLabel92.setText(cou[6]);
			guanli7.setVisible(false);
			guanli7_.setVisible(true);
		} else {
			JOptionPane tip = new JOptionPane();
			JOptionPane.showMessageDialog(this, "该功能不支持多选！");
			tip.setVisible(true);
		}
	}

	@SuppressWarnings("deprecation")
	private void jButton67ActionPerformed(java.awt.event.ActionEvent evt) {
		String newpw = jPasswordField8.getText();
		String newpw1 = jPasswordField9.getText();
		String tea_id = jTextField22.getText();
		if (newpw.isEmpty() || newpw1.isEmpty()) {
			JOptionPane tip = new JOptionPane();
			JOptionPane.showMessageDialog(this, "密码不能为空！");
			tip.setVisible(true);
		} else if (!newpw.equals(newpw1)) {
			JOptionPane tip = new JOptionPane();
			JOptionPane.showMessageDialog(this, "两次密码不相同！");
			tip.setVisible(true);
		} else if (admin.set_teapw(tea_id, newpw)) {
			jPasswordField8.setText(null);
			jPasswordField9.setText(null);
			JOptionPane tip = new JOptionPane();
			JOptionPane.showMessageDialog(this, "修改成功！");
			tip.setVisible(true);
		} else {
			JOptionPane tip = new JOptionPane();
			JOptionPane.showMessageDialog(this, "修改失败！");
			tip.setVisible(true);
		}
	}

	private void jButton66ActionPerformed(java.awt.event.ActionEvent evt) {
		String tea_id = jTextField21.getText();
		String[] tea;
		if (tea_id.isEmpty()) {
			JOptionPane tip = new JOptionPane();
			JOptionPane.showMessageDialog(this, "教师ID不能为空！");
			tip.setVisible(true);
		} else {
			jTextField22.setText(null);
			jTextField23.setText(null);
			jPasswordField8.setText(null);
			jPasswordField9.setText(null);
			tea = admin.see_tea(tea_id);
			if (tea == null) {
				JOptionPane tip = new JOptionPane();
				JOptionPane.showMessageDialog(this, "教师ID不存在！");
				tip.setVisible(true);
			} else {
				jTextField22.setText(tea[0]);
				jTextField23.setText(tea[1]);
			}
		}
	}

	@SuppressWarnings("deprecation")
	private void jButton46ActionPerformed(java.awt.event.ActionEvent evt) {
		String pw = jTextField14.getText();
		String newpw = jPasswordField6.getText();
		String newpw1 = jPasswordField7.getText();
		if (pw.isEmpty()) {
			JOptionPane tip = new JOptionPane();
			JOptionPane.showMessageDialog(this, "原始密码不能为空！");
			tip.setVisible(true);
		} else if (newpw.isEmpty()) {
			JOptionPane tip = new JOptionPane();
			JOptionPane.showMessageDialog(this, "新密码不能空！");
			tip.setVisible(true);
		} else if (newpw1.isEmpty()) {
			JOptionPane tip = new JOptionPane();
			JOptionPane.showMessageDialog(this, "新密码不能空！");
			tip.setVisible(true);
		} else if (newpw.equals(newpw1)) {
			if (admin.setpw(pw, newpw)) {
				JOptionPane tip = new JOptionPane();
				JOptionPane.showMessageDialog(this, "修改成功，请重新登陆！");
				tip.setVisible(true);
				jTextField14.setText(null);
				jPasswordField6.setText(null);
				jPasswordField7.setText(null);
				admin = null;
				guanli8.setVisible(false);
				login.setVisible(true);
			} else {
				JOptionPane tip = new JOptionPane();
				JOptionPane.showMessageDialog(this, "密码错误！");
				tip.setVisible(true);
			}
		}
	}

	private void jButton58ActionPerformed(java.awt.event.ActionEvent evt) {
		String cou_id = jTextField19.getText();
		String cou_name = jTextField18.getText();
		String tea_id = jComboBox2.getSelectedItem().toString().split("  ")[0];
		String cou_time = jSpinner7.getValue().toString() + "-" + jSpinner8.getValue().toString() + "周";
		String cou_ctime = jComboBox9.getSelectedItem() + jSpinner10.getValue().toString() + "-"
				+ jSpinner11.getValue().toString() + "节";
		String cou_fen = jSpinner9.getValue().toString();
		String cou_snum = jSpinner13.getValue().toString();
		if (cou_id.isEmpty()) {
			JOptionPane tip = new JOptionPane();
			JOptionPane.showMessageDialog(this, "课程ID不能空！");
			tip.setVisible(true);
		} else if (cou_name.isEmpty()) {
			JOptionPane tip = new JOptionPane();
			JOptionPane.showMessageDialog(this, "课程名称不能空！");
			tip.setVisible(true);
		} else if (admin.add_cou(tea_id, cou_id, cou_name, cou_time, cou_ctime, cou_fen, cou_snum)) {
			JOptionPane tip = new JOptionPane();
			JOptionPane.showMessageDialog(this, "添加成功！");
			tip.setVisible(true);
		} else {
			JOptionPane tip = new JOptionPane();
			JOptionPane.showMessageDialog(this, "课程ID已存在！");
			tip.setVisible(true);
		}
	}

	private void jButton59ActionPerformed(java.awt.event.ActionEvent evt) {
		jTextField19.setText(null);
		jTextField18.setText(null);
		jSpinner7.setValue(0);
		jSpinner8.setValue(0);
		jSpinner9.setValue(0);
		jSpinner10.setValue(0);
		jSpinner11.setValue(0);
		jSpinner12.setValue(0);
		jSpinner13.setValue(0);
		jComboBox9.setSelectedIndex(0);
		guanli5.setVisible(false);
		guanli.setVisible(true);
	}

	private void jButton54ActionPerformed(java.awt.event.ActionEvent evt) {
		String content = jComboBox8.getSelectedItem().toString();
		String type;
		ArrayList<String[]> tea;
		if (jComboBox7.getSelectedItem().equals("性别")) {
			type = "tea_sex";
			tea = admin.see_tea(type, content);
		} else {
			tea = null;
			JOptionPane tip = new JOptionPane();
			JOptionPane.showMessageDialog(this, "请选择查找条件！");
			tip.setVisible(true);
		}
		if (tea != null) {
			DefaultTableModel tableModel = (DefaultTableModel) jTable6.getModel();
			tableModel.setRowCount(0);
			for (int i = 0; i < tea.size(); i++) {
				tableModel.addRow(new Object[] { tea.get(i)[0], tea.get(i)[1], tea.get(i)[2], tea.get(i)[3] });
			}
		}
	}

	private void jComboBox7ItemStateChanged(java.awt.event.ItemEvent evt) {
		if (jComboBox7.getSelectedItem().equals("性别")) {
			jComboBox8.removeAllItems();
			jComboBox8.setModel(new DefaultComboBoxModel(new String[] { "男", "女" }));
		} else if (jComboBox7.getSelectedItem().equals("")) {
			jComboBox8.removeAllItems();
		}
	}

	private void jButton48ActionPerformed(java.awt.event.ActionEvent evt) {
		String content = jComboBox6.getSelectedItem().toString();
		String type;
		ArrayList<String[]> stu;
		if (jComboBox5.getSelectedItem().equals("性别")) {
			type = "stu_sex";
			stu = admin.see_stu(type, content);
		} else if (jComboBox5.getSelectedItem().equals("专业")) {
			type = "stu_major";
			stu = admin.see_stu(type, content);
		} else if (jComboBox5.getSelectedItem().equals("班级")) {
			type = "stu_class";
			stu = admin.see_stu(type, content);
		} else {
			stu = null;
			JOptionPane tip = new JOptionPane();
			JOptionPane.showMessageDialog(this, "请选择查找条件！");
			tip.setVisible(true);
		}
		if (stu != null) {
			DefaultTableModel tableModel = (DefaultTableModel) jTable4.getModel();
			tableModel.setRowCount(0);
			for (int i = 0; i < stu.size(); i++) {
				tableModel.addRow(new Object[] { stu.get(i)[0], stu.get(i)[1], stu.get(i)[2], stu.get(i)[3],
						stu.get(i)[4], stu.get(i)[5] });
			}
		}
	}

	private void jComboBox5ActionPerformed(java.awt.event.ActionEvent evt) {
		// TODO add your handling code here:
	}

	private void jComboBox5ItemStateChanged(java.awt.event.ItemEvent evt) {
		if (jComboBox5.getSelectedItem().equals("性别")) {
			jComboBox6.removeAllItems();
			jComboBox6.setModel(new DefaultComboBoxModel(new String[] { "男", "女" }));
		} else if (jComboBox5.getSelectedItem().equals("专业")) {
			jComboBox6.removeAllItems();
			jComboBox6.setModel(new DefaultComboBoxModel(new String[] { "计算机科学与技术", "通讯工程", "电气工程", "电子" }));
		} else if (jComboBox5.getSelectedItem().equals("班级")) {
			jComboBox6.removeAllItems();
			jComboBox6.setModel(
					new DefaultComboBoxModel(new String[] { "一班", "二班", "三班", "四班", "五班", "六班", "七班", "八班" }));

		} else if (jComboBox5.getSelectedItem().equals("")) {
			jComboBox6.removeAllItems();
		}
	}

	private void jButton76ActionPerformed(java.awt.event.ActionEvent evt) {
		guanli.setVisible(false);
		guanli2.setVisible(true);
	}

	private void jButton39ActionPerformed(java.awt.event.ActionEvent evt) {
		String cou_id = jLabel27.getText();
		String stu_id = jTextField10.getText();
		String cou_num = jTextField15.getText();
		if (cou_num.isEmpty()) {
			JOptionPane tip = new JOptionPane();
			JOptionPane.showMessageDialog(this, "成绩不能为空！");
			tip.setVisible(true);
		} else if (cou_num.matches("\\d*\\.?\\d*") && Double.parseDouble(cou_num) >= 0
				&& Double.parseDouble(cou_num) <= 100) {
			if (teacher.set_counum(cou_id, stu_id, cou_num)) {
				JOptionPane tip = new JOptionPane();
				JOptionPane.showMessageDialog(this, "修改成功！");
				tip.setVisible(true);
			} else {
				JOptionPane tip = new JOptionPane();
				JOptionPane.showMessageDialog(this, "失败！");
				tip.setVisible(true);
			}
		} else {
			JOptionPane tip = new JOptionPane();
			JOptionPane.showMessageDialog(this, "成绩要在0-100之间");
			tip.setVisible(true);
		}
	}

	private void jButton38ActionPerformed(java.awt.event.ActionEvent evt) {
		String cou_id = jTextField26.getText();
		String stu_id = jTextField9.getText();
		if (cou_id.isEmpty()) {
			JOptionPane tip = new JOptionPane();
			JOptionPane.showMessageDialog(this, "课程ID不能为空！");
			tip.setVisible(true);
		} else if (stu_id.isEmpty()) {
			JOptionPane tip = new JOptionPane();
			JOptionPane.showMessageDialog(this, "学号不能为空！");
			tip.setVisible(true);
		} else if (teacher.see_counum(stu_id, cou_id) == null) {
			JOptionPane tip = new JOptionPane();
			JOptionPane.showMessageDialog(this, "查找失败！请检查教程ID和学号的正确性");
			tip.setVisible(true);
		} else {
			String[] counum = teacher.see_counum(stu_id, cou_id);
			jLabel27.setText(counum[0]);
			jLabel30.setText(counum[1]);
			jTextField10.setText(counum[2]);
			jTextField11.setText(counum[3]);
			jTextField12.setText(counum[4]);
			jTextField13.setText(counum[5]);
			jTextField15.setText(null);
		}
	}

	@SuppressWarnings("deprecation")
	private void jButton36ActionPerformed(java.awt.event.ActionEvent evt) {
		String stu_pw = jTextField8.getText();
		String newpw1 = jPasswordField4.getText();
		String newpw2 = jPasswordField5.getText();
		if (newpw1.equals(newpw2)) {
			if (teacher.setpw(stu_pw, newpw1)) {
				JOptionPane tip = new JOptionPane();
				JOptionPane.showMessageDialog(this, "修改成功！请重新登陆");
				tip.setVisible(true);
				teacher = null;
				jTextField8.setText(null);
				jPasswordField4.setText(null);
				jPasswordField5.setText(null);
				login.setVisible(true);
				stu3.setVisible(false);
			} else {
				JOptionPane tip = new JOptionPane();
				JOptionPane.showMessageDialog(this, "密码错误！");
				tip.setVisible(true);
			}
		} else {
			JOptionPane tip = new JOptionPane();
			JOptionPane.showMessageDialog(this, "前后密码不相同！");
			tip.setVisible(true);
		}
	}

	private void jButton69ActionPerformed(java.awt.event.ActionEvent evt) {
		String cou_id = jTextField24.getText();
		if (cou_id.isEmpty()) {
			JOptionPane tip = new JOptionPane();
			JOptionPane.showMessageDialog(this, "课程ID不能为空！");
			tip.setVisible(true);
		} else if (teacher.see_counum(cou_id) == null) {
			JOptionPane tip = new JOptionPane();
			JOptionPane.showMessageDialog(this, "查找失败！请检查课程ID是否正确");
			tip.setVisible(true);
		} else {
			ArrayList<String[]> cou_stu = teacher.see_counum(cou_id);
			DefaultTableModel tableModel = (DefaultTableModel) jTable10.getModel();
			tableModel.setRowCount(0);
			for (int i = 0; i < cou_stu.size(); i++) {
				tableModel.addRow(new Object[] { cou_stu.get(i)[0], cou_stu.get(i)[1], cou_stu.get(i)[2],
						cou_stu.get(i)[3], cou_stu.get(i)[4], cou_stu.get(i)[5] });
			}
		}
	}

	private void jButton70ActionPerformed(java.awt.event.ActionEvent evt) {
		String tips = "";
		for (int j = 0; j < jTable10.getRowCount(); j++) {
			if (jTable10.getValueAt(j, 5) == null || jTable10.getValueAt(j, 5).toString().length() == 0) {

			} else if (Double.parseDouble(jTable10.getValueAt(j, 5).toString()) > 100
					|| Double.parseDouble(jTable10.getValueAt(j, 5).toString()) < 0) {
				tips = tips.concat(" 第" + j + "");
			}
		}
		if (tips.isEmpty()) {
			for (int i = 0; i < jTable10.getRowCount(); i++) {
				if (jTable10.getValueAt(i, 5) == null || jTable10.getValueAt(i, 5).toString().length() == 0) {
					teacher.set_counum(jTable10.getValueAt(i, 0).toString(), jTable10.getValueAt(i, 2).toString(),
							"null");
				} else {
					teacher.set_counum(jTable10.getValueAt(i, 0).toString(), jTable10.getValueAt(i, 2).toString(),
							jTable10.getValueAt(i, 5).toString());
				}
			}
			JOptionPane tip = new JOptionPane();
			JOptionPane.showMessageDialog(this, "添加成功！");
			tip.setVisible(true);
		} else {
			JOptionPane tip = new JOptionPane();
			JOptionPane.showMessageDialog(this, "" + tips + "行成绩不在0-100之间！");
			tip.setVisible(true);
		}
	}

	private void jButton75ActionPerformed(java.awt.event.ActionEvent evt) {
		jLabel16.setText(null);
		jTextField25.setText(null);
		jTextField27.setText(null);
		jTextField28.setText(null);
		jTextField29.setText(null);
		jTextField30.setText(null);
		jLabel24.setText(null);
		tea3_.setVisible(false);
		tea.setVisible(true);
	}

	private void jButton74ActionPerformed(java.awt.event.ActionEvent evt) {
		String cou_id = jLabel16.getText();
		String cou_name = jTextField25.getText();
		String cou_time = jTextField27.getText();
		String cou_ctime = jTextField28.getText();
		String cou_fen = jTextField29.getText();
		String cou_snum = jTextField30.getText();
		String cou_lnum = jLabel24.getText();
		if (cou_name.isEmpty()) {
			JOptionPane tip = new JOptionPane();
			JOptionPane.showMessageDialog(this, "课程名称不能为空！");
			tip.setVisible(true);
		} else if (cou_time.isEmpty()) {
			JOptionPane tip = new JOptionPane();
			JOptionPane.showMessageDialog(this, "课程时间不能为空！");
			tip.setVisible(true);
		} else if (cou_ctime.isEmpty()) {
			JOptionPane tip = new JOptionPane();
			JOptionPane.showMessageDialog(this, "上课时间不能为空！");
			tip.setVisible(true);
		} else if (cou_fen.isEmpty()) {
			JOptionPane tip = new JOptionPane();
			JOptionPane.showMessageDialog(this, "学分不能为空！");
			tip.setVisible(true);
		} else if (cou_snum.isEmpty()) {
			JOptionPane tip = new JOptionPane();
			JOptionPane.showMessageDialog(this, "人数上限不能为空！");
			tip.setVisible(true);
		} else if (!(cou_snum.matches("\\d*"))) {
			JOptionPane tip = new JOptionPane();
			JOptionPane.showMessageDialog(this, "人数上限要为正整数！");
			tip.setVisible(true);
		} else if (Integer.parseInt(cou_snum) < Integer.parseInt(cou_lnum)) {
			JOptionPane tip = new JOptionPane();
			JOptionPane.showMessageDialog(this, "人数上限要大于已选人数！");
			tip.setVisible(true);
		} else if (teacher.set_cou(cou_id, cou_name, cou_time, cou_ctime, cou_fen, cou_snum)) {
			JOptionPane tip = new JOptionPane();
			JOptionPane.showMessageDialog(this, "修改成功！");
			tip.setVisible(true);
		} else {
			JOptionPane tip = new JOptionPane();
			JOptionPane.showMessageDialog(this, "修改失败！");
			tip.setVisible(true);
		}
	}

	protected void jTextField29ActionPerformed(ActionEvent evt) {
		// TODO Auto-generated method stub

	}

	private void jButton27ActionPerformed(java.awt.event.ActionEvent evt) {
		String cou_id = jTextField6.getText();
		String[] cou_one = teacher.see_cou_one(cou_id);
		if (cou_id.isEmpty()) {
			JOptionPane tip = new JOptionPane();
			JOptionPane.showMessageDialog(this, "课程id不能为空！");
			tip.setVisible(true);
		} else if (cou_one == null) {
			JOptionPane tip = new JOptionPane();
			JOptionPane.showMessageDialog(this, "课程id不存在你的您的课程！");
			tip.setVisible(true);
		} else {
			jLabel16.setText(cou_one[0]);
			jTextField25.setText(cou_one[1]);
			jTextField27.setText(cou_one[2]);
			jTextField28.setText(cou_one[3]);
			jTextField29.setText(cou_one[4]);
			jTextField30.setText(cou_one[5]);
			jLabel24.setText(cou_one[6]);
			jTextField6.setText(null);
			tea3.setVisible(false);
			tea3_.setVisible(true);
		}
	}

	private void jButton25ActionPerformed(java.awt.event.ActionEvent evt) {
		String cou_id = jTextField2.getText();
		String cou_name = jTextField5.getText();
		String cou_time = jSpinner2.getValue().toString() + "-" + jSpinner3.getValue().toString() + "周";
		String cou_fen = jSpinner4.getValue().toString();
		String cou_ctime = jComboBox4.getSelectedItem().toString() + jSpinner5.getValue().toString() + "-"
				+ jSpinner6.getValue().toString() + "节";
		String cou_snum = jSpinner12.getValue().toString();
		if (cou_id.length() == 0) {
			JOptionPane tip = new JOptionPane();
			JOptionPane.showMessageDialog(this, "课程id不能为空！");
			tip.setVisible(true);
		} else if (cou_name.length() == 0) {
			JOptionPane tip = new JOptionPane();
			JOptionPane.showMessageDialog(this, "课程名称不能为空！");
			tip.setVisible(true);
		} else if (teacher.add_cou(cou_id, cou_name, cou_time, cou_ctime, cou_fen, cou_snum)) {
			JOptionPane tip = new JOptionPane();
			JOptionPane.showMessageDialog(this, "添加成功！");
			tip.setVisible(true);
		} else {
			JOptionPane tip = new JOptionPane();
			JOptionPane.showMessageDialog(this, "课程id已存在！");
			tip.setVisible(true);
		}
	}

	@SuppressWarnings("deprecation")
	private void jButton33ActionPerformed(java.awt.event.ActionEvent evt) {
		String stu_pw = jTextField7.getText();
		String newpw1 = jPasswordField2.getText();
		String newpw2 = jPasswordField3.getText();
		if (stu_pw.isEmpty()) {
			JOptionPane tip = new JOptionPane();
			JOptionPane.showMessageDialog(this, "密码不能为空！");
			tip.setVisible(true);
		} else if (newpw1.isEmpty() || newpw2.isEmpty()) {
			JOptionPane tip = new JOptionPane();
			JOptionPane.showMessageDialog(this, "新密码不能为空！");
			tip.setVisible(true);
		} else if (newpw1.equals(newpw2)) {
			if (student.setpw(stu_pw, newpw1)) {
				JOptionPane tip = new JOptionPane();
				JOptionPane.showMessageDialog(this, "修改成功！请重新登陆");
				tip.setVisible(true);
				student = null;
				login.repaint();
				login.setVisible(true);
				stu3.setVisible(false);
			} else {
				JOptionPane tip = new JOptionPane();
				JOptionPane.showMessageDialog(this, "密码错误！");
				tip.setVisible(true);
			}
		} else {
			JOptionPane tip = new JOptionPane();
			JOptionPane.showMessageDialog(this, "前后密码不相同！");
			tip.setVisible(true);
		}
	}

	private void jButton71ActionPerformed(java.awt.event.ActionEvent evt) {
		DefaultTableModel tableModel = (DefaultTableModel) jTable10.getModel();
		tableModel.setRowCount(0);
		tea4.setVisible(false);
		tea.setVisible(true);
	}

	private void jButton68ActionPerformed(java.awt.event.ActionEvent evt) {
		jPasswordField8.setText(null);
		jPasswordField9.setText(null);
		jTextField22.setText(null);
		jTextField22.setText(null);
		jTextField23.setText(null);
		guanli9.setVisible(false);
		guanli.setVisible(true);
	}

	private void jButton64ActionPerformed(java.awt.event.ActionEvent evt) {
		DefaultTableModel tableModel = (DefaultTableModel) jTable9.getModel();
		tableModel.setRowCount(0);
		guanli7.setVisible(false);
		guanli.setVisible(true);
	}

	private void jButton63ActionPerformed(java.awt.event.ActionEvent evt) {
		int row[] = jTable9.getSelectedRows();
		String cou_id;
		String num = "";
		if (row.length == 0) {
			JOptionPane tip = new JOptionPane();
			JOptionPane.showMessageDialog(this, "没有指定课程！");
			tip.setVisible(true);
		} else {
			for (int i = 0; i < row.length; i++) {
				cou_id = (String) jTable9.getValueAt(row[i], 0);
				if (!(admin.del_cou(cou_id))) {
					num += "第" + i + " ";
				}
			}
			if (num.isEmpty()) {
				JOptionPane tip = new JOptionPane();
				JOptionPane.showMessageDialog(this, "删除成功！");
				tip.setVisible(true);
			} else {
				JOptionPane tip = new JOptionPane();
				JOptionPane.showMessageDialog(this, "" + num + "删除失败！");
				tip.setVisible(true);
			}
		}
		// String cou_id;
		// if(row==-1){
		// JOptionPane tip = new JOptionPane();
		// JOptionPane.showMessageDialog(this, "没有指定老师！");
		// tip.setVisible(true);
		// }
		// else{
		// cou_id = (String) jTable6.getValueAt(row, 0);
		// if (admin.del_cou(cou_id)) {
		// JOptionPane tip = new JOptionPane();
		// JOptionPane.showMessageDialog(this, "删除成功！");
		// tip.setVisible(true);
		// } else {
		// JOptionPane tip = new JOptionPane();
		// JOptionPane.showMessageDialog(this, "删除失败！");
		// tip.setVisible(true);
		// }
		// }
	}

	private void jButton47ActionPerformed(java.awt.event.ActionEvent evt) {
		jTextField14.setText(null);
		jPasswordField6.setText(null);
		jPasswordField7.setText(null);
		guanli8.setVisible(false);
		guanli.setVisible(true);
	}

	private void jButton37ActionPerformed(java.awt.event.ActionEvent evt) {
		jTextField8.setText(null);
		jPasswordField4.setText(null);
		jPasswordField5.setText(null);
		tea6.setVisible(false);
		tea.setVisible(true);
	}

	private void jButton34ActionPerformed(java.awt.event.ActionEvent evt) {
		jTextField7.setText(null);
		jPasswordField2.setText(null);
		jPasswordField3.setText(null);
		stu3.setVisible(false);
		stu.setVisible(true);
	}

	private void jButton53ActionPerformed(java.awt.event.ActionEvent evt) {
		DefaultTableModel tableModel = (DefaultTableModel) jTable6.getModel();
		tableModel.setRowCount(0);
		jComboBox7.setSelectedIndex(0);
		jComboBox8.removeAllItems();
		guanli3.setVisible(false);
		guanli.setVisible(true);
	}

	private void jButton52ActionPerformed(java.awt.event.ActionEvent evt) {
		int row = jTable6.getSelectedRow();
		String tea_id;
		if (row == -1) {
			JOptionPane tip = new JOptionPane();
			JOptionPane.showMessageDialog(this, "没有指定老师！");
			tip.setVisible(true);
		} else {
			tea_id = (String) jTable6.getValueAt(row, 0);
			if (admin.del_tea(tea_id)) {
				JOptionPane tip = new JOptionPane();
				JOptionPane.showMessageDialog(this, "删除成功！");
				tip.setVisible(true);
			} else {
				JOptionPane tip = new JOptionPane();
				JOptionPane.showMessageDialog(this, "删除失败！");
				tip.setVisible(true);
			}
		}
	}

	private void jButton45ActionPerformed(java.awt.event.ActionEvent evt) {
		guanli.setVisible(false);
		guanli9.setVisible(true);
	}

	private void jButton17ActionPerformed(java.awt.event.ActionEvent evt) {
		ArrayList<String[]> cou = admin.see_cou();
		if (cou != null) {
			DefaultTableModel tableModel = (DefaultTableModel) jTable9.getModel();
			for (int i = 0; i < cou.size(); i++) {
				tableModel.addRow(new Object[] { cou.get(i)[0], cou.get(i)[1], cou.get(i)[2] });
			}
		}
		guanli.setVisible(false);
		guanli7.setVisible(true);
	}

	private void jButton15ActionPerformed(java.awt.event.ActionEvent evt) {
		ArrayList<String[]> tea = admin.see_tea();
		jComboBox2.removeAllItems();
		for (int i = 0; i < tea.size(); i++) {
			jComboBox2.addItem(tea.get(i)[0] + "  " + tea.get(i)[1]);
		}
		guanli.setVisible(false);
		guanli5.setVisible(true);
	}

	private void jButton13ActionPerformed(java.awt.event.ActionEvent evt) {
		ArrayList<String[]> tea = admin.see_tea();
		if (tea != null) {
			DefaultTableModel tableModel = (DefaultTableModel) jTable6.getModel();
			for (int i = 0; i < tea.size(); i++) {
				tableModel.addRow(new Object[] { tea.get(i)[0], tea.get(i)[1], tea.get(i)[2], tea.get(i)[3] });
			}
		}
		guanli.setVisible(false);
		guanli3.setVisible(true);
	}

	private void jButton44ActionPerformed(java.awt.event.ActionEvent evt) {
		guanli.setVisible(false);
		guanli8.setVisible(true);
	}

	private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {
		ArrayList<String[]> stu = admin.see_stu();
		DefaultTableModel tableModel = (DefaultTableModel) jTable4.getModel();
		for (int i = 0; i < stu.size(); i++) {
			tableModel.addRow(new Object[] { stu.get(i)[0], stu.get(i)[1], stu.get(i)[2] });
		}
		guanli.setVisible(false);
		guanli1.setVisible(true);
	}

	private void jButton43ActionPerformed(java.awt.event.ActionEvent evt) {
		DefaultTableModel tableModel = (DefaultTableModel) jTable4.getModel();
		tableModel.setRowCount(0);
		jComboBox5.setSelectedIndex(0);
		jComboBox6.removeAllItems();
		guanli1.setVisible(false);
		guanli.setVisible(true);
	}

	private void jButton42ActionPerformed(java.awt.event.ActionEvent evt) {
		int row = jTable4.getSelectedRow();
		String stu_id;
		if (row == -1) {
			JOptionPane tip = new JOptionPane();
			JOptionPane.showMessageDialog(this, "没有指定学生！");
			tip.setVisible(true);
		} else {
			stu_id = (String) jTable4.getValueAt(row, 0);
			if (admin.del_stu(stu_id)) {
				JOptionPane tip = new JOptionPane();
				JOptionPane.showMessageDialog(this, "删除成功！");
				tip.setVisible(true);
			} else {
				JOptionPane tip = new JOptionPane();
				JOptionPane.showMessageDialog(this, "删除失败！");
				tip.setVisible(true);
			}
		}
	}

	private void jButton40ActionPerformed(java.awt.event.ActionEvent evt) {
		jTextField26.setText(null);
		jTextField9.setText(null);
		jLabel27.setText("---");
		jLabel30.setText("---");
		jTextField10.setText(null);
		jTextField11.setText(null);
		jTextField12.setText(null);
		jTextField13.setText(null);
		jTextField15.setText(null);
		tea5.setVisible(false);
		tea.setVisible(true);
	}

	private void jButton35ActionPerformed(java.awt.event.ActionEvent evt) {
		teacher = null;
		tea.setVisible(false);
		login.setVisible(true);
		this.setTitle("登陆界面");
	}

	private void jButton32ActionPerformed(java.awt.event.ActionEvent evt) {
		student = null;
		login.setVisible(true);
		stu.setVisible(false);
		this.setTitle("登陆界面");
	}

	private void jButton24ActionPerformed(java.awt.event.ActionEvent evt) {
		DefaultTableModel tableModel = (DefaultTableModel) jTable2.getModel();
		tableModel.setRowCount(0);
		stu2.setVisible(false);
		stu.setVisible(true);
	}

	private void jButton31ActionPerformed(java.awt.event.ActionEvent evt) {
		DefaultTableModel tableModel = (DefaultTableModel) jTable3.getModel();
		tableModel.setRowCount(0);
		tea1.setVisible(false);
		tea.setVisible(true);
	}

	private void jButton29ActionPerformed(java.awt.event.ActionEvent evt) {
		tea.setVisible(false);
		tea5.setVisible(true);
	}

	private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {
		ArrayList<String[]> stu_cou = teacher.see_counum();
		int row = stu_cou.size() - jTable10.getRowCount();
		DefaultTableModel tableModel = (DefaultTableModel) jTable10.getModel();
		if (row > 0) {
			for (int i = 0; i < row; i++) {
				tableModel.addRow(new Object[] { null, null, null, null, null, null, null });
			}
		}
		for (int i = 0; i < stu_cou.size(); i++) {
			for (int j = 0; j < 6; j++) {
				jTable10.setValueAt(stu_cou.get(i)[j], i, j);
			}
		}
		tea.setVisible(false);
		tea4.setVisible(true);
	}

	private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {
		tea.setVisible(false);
		tea3.setVisible(true);
	}

	private void jButton28ActionPerformed(java.awt.event.ActionEvent evt) {
		jTextField6.setText(null);
		tea3.setVisible(false);
		tea.setVisible(true);
	}

	private void jButton26ActionPerformed(java.awt.event.ActionEvent evt) {
		jTextField2.setText(null);
		jTextField5.setText(null);
		jSpinner2.setValue(0);
		jSpinner3.setValue(0);
		jSpinner4.setValue(0);
		jSpinner5.setValue(0);
		jSpinner6.setValue(0);
		jSpinner12.setValue(0);
		jComboBox4.setSelectedIndex(0);
		tea2.setVisible(false);
		tea.setVisible(true);
	}

	private void jButton22ActionPerformed(java.awt.event.ActionEvent evt) {
		DefaultTableModel tableModel = (DefaultTableModel) jTable1.getModel();
		tableModel.setRowCount(0);
		stu1.setVisible(false);
		stu.setVisible(true);
	}

	private void jButton21ActionPerformed(java.awt.event.ActionEvent evt) {
		int row[] = jTable1.getSelectedRows();
		String cou_id = "";
		if (row.length == 0) {
			JOptionPane tip = new JOptionPane();
			JOptionPane.showMessageDialog(this, "没有选中课程！");
			tip.setVisible(true);
		} else if (row.length == 1) {
			cou_id = jTable1.getValueAt(row[0], 0).toString();
			String[] cou = student.see_cou(cou_id);
			jLabel106.setText(cou[0]);
			jLabel117.setText(cou[1]);
			jLabel109.setText(cou[7]);
			jLabel116.setText(cou[8]);
			jLabel108.setText(cou[2]);
			jLabel114.setText(cou[3]);
			jLabel107.setText(cou[4]);
			jLabel115.setText(cou[5]);
			jLabel118.setText(cou[6]);
			stu1.setVisible(false);
			stu1_.setVisible(true);
		} else {
			JOptionPane tip = new JOptionPane();
			JOptionPane.showMessageDialog(this, "该功能不支持多选！");
			tip.setVisible(true);
		}
	}

	private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {
		tea.setVisible(false);
		tea2.setVisible(true);
	}

	private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {
		ArrayList<String[]> stu = teacher.see_stu();
		DefaultTableModel tableModel = (DefaultTableModel) jTable3.getModel();
		if (stu != null) {
			for (int i = 0; i < stu.size(); i++) {
				tableModel.addRow(new Object[] { stu.get(i)[0], stu.get(i)[1], stu.get(i)[2], stu.get(i)[6] });
			}
		}
		tea.setVisible(false);
		tea1.setVisible(true);
		this.setTitle("系统");
	}

	private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {
		ArrayList<String[]> cou = student.getnumber();
		DefaultTableModel tableModel = (DefaultTableModel) jTable2.getModel();
		for (int i = 0; i < cou.size(); i++) {
			tableModel
					.addRow(new Object[] { cou.get(i)[0], cou.get(i)[1], cou.get(i)[2], cou.get(i)[3], cou.get(i)[4] });
		}
		stu.setVisible(false);
		stu2.setVisible(true);
		this.setTitle("系统");
	}

	private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {
		ArrayList<String[]> cou = student.see_cou();
		DefaultTableModel tableModel = (DefaultTableModel) jTable1.getModel();
		for (int i = 0; i < cou.size(); i++) {
			tableModel
					.addRow(new Object[] { cou.get(i)[0], cou.get(i)[1], cou.get(i)[2], cou.get(i)[3], cou.get(i)[4] });
		}
		stu.setVisible(false);
		stu1.setVisible(true);
		this.setTitle("系统");
	}

	private void jButton20ActionPerformed(java.awt.event.ActionEvent evt) {
		login.setVisible(true);
		register.setVisible(false);
		stu.setVisible(false);
		tea.setVisible(false);
		guanli.setVisible(false);
		this.setTitle("登陆界面");
	}

	private void jButton19ActionPerformed(java.awt.event.ActionEvent evt) {
		tea.setVisible(false);
		tea6.setVisible(true);

	}

	private void jButton18ActionPerformed(java.awt.event.ActionEvent evt) {
		stu.setVisible(false);
		stu3.setVisible(true);
	}

	@SuppressWarnings("deprecation")
	private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {
		String id = jTextField1.getText();
		String pw = jPasswordField10.getText();
		if (jRadioButton1.isSelected()) {
			if (id.length() == 0) {
				JOptionPane tip = new JOptionPane();
				JOptionPane.showMessageDialog(this, "账号不能为空！");
				tip.setVisible(true);
			} else if (pw.length() == 0) {
				JOptionPane tip = new JOptionPane();
				JOptionPane.showMessageDialog(this, "密码不能为空！");
				tip.setVisible(true);
			} else {
				student = Cont.login(id, pw);
				if (student.getStu_name().equals("账号不存在") || student.getStu_name().equals("密码错误")) {
					JOptionPane tip = new JOptionPane();
					JOptionPane.showMessageDialog(this, Cont.login(id, pw).getStu_name());
					tip.setVisible(true);
				} else {
					jPasswordField10.setText(null);
					student = Cont.login(id, pw);
					login.setVisible(false);
					stu.setVisible(true);
					this.setTitle("");
					jLabel10.setText("" + student.getStu_name() + "同学，欢迎你");
				}
			}
		} else if (jRadioButton2.isSelected()) {
			if (id.isEmpty()) {
				JOptionPane tip = new JOptionPane();
				JOptionPane.showMessageDialog(this, "账号不能为空！");
				tip.setVisible(true);
			} else if (pw.isEmpty()) {
				JOptionPane tip = new JOptionPane();
				JOptionPane.showMessageDialog(this, "密码不能为空！");
				tip.setVisible(true);
			} else {
				teacher = Cont.tea_login(id, pw);
				if (teacher.getTea_name().equals("账号不存在") || teacher.getTea_name().equals("密码错误")) {
					JOptionPane tip = new JOptionPane();
					JOptionPane.showMessageDialog(this, Cont.tea_login(id, pw).getTea_name());
					tip.setVisible(true);
				} else {
					jPasswordField10.setText(null);
					login.setVisible(false);
					tea.setVisible(true);
					this.setTitle("");
					jLabel13.setText("" + teacher.getTea_name() + "老师，欢迎你");
				}
			}

		} else if (jRadioButton3.isSelected()) {
			if (id.isEmpty()) {
				JOptionPane tip = new JOptionPane();
				JOptionPane.showMessageDialog(this, "账号不能为空！");
				tip.setVisible(true);
			} else if (pw.isEmpty()) {
				JOptionPane tip = new JOptionPane();
				JOptionPane.showMessageDialog(this, "密码不能为空！");
				tip.setVisible(true);
			} else {
				admin = Cont.admin_login(id, pw);
				if (admin.getName().equals("账号不存在") || admin.getName().equals("密码错误")) {
					JOptionPane tip = new JOptionPane();
					JOptionPane.showMessageDialog(this, admin.getName());
					tip.setVisible(true);
				} else {
					jPasswordField10.setText(null);
					login.setVisible(false);
					guanli.setVisible(true);
					this.setTitle("");
					jLabel18.setText("" + admin.getName() + "，欢迎你");
				}
			}
		} else {
			JOptionPane tip = new JOptionPane();
			JOptionPane.showMessageDialog(this, "请选择身份！");
			tip.setVisible(true);
		}
	}

	private void jRadioButton3ActionPerformed(java.awt.event.ActionEvent evt) {
		// TODO add your handling code here:
	}

	@SuppressWarnings("deprecation")
	private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {
		String stu_name = jTextField3.getText();
		String stu_id = jTextField4.getText();
		String stu_pw = jPasswordField1.getText();
		String stu_sex = jComboBox3.getSelectedItem().toString();
		String stu_major = Is.getSelectedItem().toString();
		String stu_class = jComboBox1.getSelectedItem().toString();
		String stu_age = jSpinner1.getValue().toString();
		if (stu_name.length() == 0) {
			JOptionPane tip = new JOptionPane();
			JOptionPane.showMessageDialog(this, "姓名不能为空！");
			tip.setVisible(true);
		} else if (stu_id.length() == 0) {
			JOptionPane tip = new JOptionPane();
			JOptionPane.showMessageDialog(this, "学号不能为空！");
			tip.setVisible(true);
		} else if (stu_pw.length() == 0) {
			JOptionPane tip = new JOptionPane();
			JOptionPane.showMessageDialog(this, "密码不能为空！");
			tip.setVisible(true);
		} else if (stu_id.matches("\\d{9}") && Integer.parseInt(stu_id) >= 120000000
				&& Integer.parseInt(stu_id) <= 169999999) {
			if (Cont.stuof(stu_id)) {
				JOptionPane tip = new JOptionPane();
				JOptionPane.showMessageDialog(this, "学号已存在！");
				tip.setVisible(true);
			} else {
				if (Cont.register(stu_name, stu_id, stu_pw, stu_sex, stu_age, stu_major, stu_class)) {
					JOptionPane tip = new JOptionPane();
					JOptionPane.showMessageDialog(this, "注册成功！");
					tip.setVisible(true);
				} else {
					JOptionPane tip = new JOptionPane();
					JOptionPane.showMessageDialog(this, "注册失败！");
					tip.setVisible(true);
				}
			}
		} else {
			JOptionPane tip = new JOptionPane();
			JOptionPane.showMessageDialog(this, "学号非法！");
			tip.setVisible(true);
		}
	}

	private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {
		jTextField3.setText(null);
		jTextField4.setText(null);
		jComboBox3.setSelectedIndex(0);
		Is.setSelectedIndex(0);
		jComboBox1.setSelectedIndex(0);
		jSpinner1.setValue(0);
		jPasswordField1.setText(null);
		login.setVisible(true);
		register.setVisible(false);
		this.setTitle("登陆界面");
	}

	private void IsActionPerformed(java.awt.event.ActionEvent evt) {
		// TODO add your handling code here:
	}

	private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {
		register.setVisible(true);
		login.setVisible(false);
		this.setTitle("注册界面");
	}

	private void jRadioButton2ActionPerformed(java.awt.event.ActionEvent evt) {
		// TODO add your handling code here:
	}

	/**
	 * @param args
	 *            the command line arguments
	 */
	public static void main(String args[]) {
		java.awt.EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					org.jb2011.lnf.beautyeye.BeautyEyeLNFHelper.launchBeautyEyeLNF();

				} catch (Exception e) {

				}
				new DL().setVisible(true);
			}
		});
	}

	// GEN-BEGIN:variables
	// Variables declaration - do not modify
	private javax.swing.JComboBox Is;
	private javax.swing.ButtonGroup buttonGroup1;
	private javax.swing.JPanel guanli;
	private javax.swing.JPanel guanli1;
	private javax.swing.JPanel guanli10;
	private javax.swing.JPanel guanli1_;
	private javax.swing.JPanel guanli2;
	private javax.swing.JPanel guanli3;
	private javax.swing.JPanel guanli4;
	private javax.swing.JPanel guanli5;
	private javax.swing.JPanel guanli6;
	private javax.swing.JPanel guanli7;
	private javax.swing.JPanel guanli7_;
	private javax.swing.JPanel guanli8;
	private javax.swing.JPanel guanli9;
	private javax.swing.JButton jButton1;
	private javax.swing.JButton jButton10;
	private javax.swing.JButton jButton11;
	private javax.swing.JButton jButton12;
	private javax.swing.JButton jButton13;
	private javax.swing.JButton jButton14;
	private javax.swing.JButton jButton15;
	private javax.swing.JButton jButton16;
	private javax.swing.JButton jButton17;
	private javax.swing.JButton jButton18;
	private javax.swing.JButton jButton19;
	private javax.swing.JButton jButton2;
	private javax.swing.JButton jButton20;
	private javax.swing.JButton jButton21;
	private javax.swing.JButton jButton22;
	private javax.swing.JButton jButton23;
	private javax.swing.JButton jButton24;
	private javax.swing.JButton jButton25;
	private javax.swing.JButton jButton26;
	private javax.swing.JButton jButton27;
	private javax.swing.JButton jButton28;
	private javax.swing.JButton jButton29;
	private javax.swing.JButton jButton3;
	private javax.swing.JButton jButton30;
	private javax.swing.JButton jButton31;
	private javax.swing.JButton jButton32;
	private javax.swing.JButton jButton33;
	private javax.swing.JButton jButton34;
	private javax.swing.JButton jButton35;
	private javax.swing.JButton jButton36;
	private javax.swing.JButton jButton37;
	private javax.swing.JButton jButton38;
	private javax.swing.JButton jButton39;
	private javax.swing.JButton jButton4;
	private javax.swing.JButton jButton40;
	private javax.swing.JButton jButton41;
	private javax.swing.JButton jButton42;
	private javax.swing.JButton jButton43;
	private javax.swing.JButton jButton44;
	private javax.swing.JButton jButton45;
	private javax.swing.JButton jButton46;
	private javax.swing.JButton jButton47;
	private javax.swing.JButton jButton48;
	private javax.swing.JButton jButton49;
	private javax.swing.JButton jButton5;
	private javax.swing.JButton jButton50;
	private javax.swing.JButton jButton51;
	private javax.swing.JButton jButton52;
	private javax.swing.JButton jButton53;
	private javax.swing.JButton jButton54;
	private javax.swing.JButton jButton55;
	private javax.swing.JButton jButton56;
	private javax.swing.JButton jButton57;
	private javax.swing.JButton jButton58;
	private javax.swing.JButton jButton59;
	private javax.swing.JButton jButton6;
	private javax.swing.JButton jButton60;
	private javax.swing.JButton jButton61;
	private javax.swing.JButton jButton62;
	private javax.swing.JButton jButton63;
	private javax.swing.JButton jButton64;
	private javax.swing.JButton jButton65;
	private javax.swing.JButton jButton66;
	private javax.swing.JButton jButton67;
	private javax.swing.JButton jButton68;
	private javax.swing.JButton jButton69;
	private javax.swing.JButton jButton7;
	private javax.swing.JButton jButton70;
	private javax.swing.JButton jButton71;
	private javax.swing.JButton jButton72;
	private javax.swing.JButton jButton73;
	private javax.swing.JButton jButton74;
	private javax.swing.JButton jButton75;
	private javax.swing.JButton jButton76;
	private javax.swing.JButton jButton77;
	private javax.swing.JButton jButton78;
	private javax.swing.JButton jButton79;
	private javax.swing.JButton jButton8;
	private javax.swing.JButton jButton80;
	private javax.swing.JButton jButton81;
	private javax.swing.JButton jButton82;
	private javax.swing.JButton jButton83;
	private javax.swing.JButton jButton84;
	private javax.swing.JButton jButton85;
	private javax.swing.JButton jButton86;
	private javax.swing.JButton jButton87;
	private javax.swing.JButton jButton88;
	private javax.swing.JButton jButton89;
	private javax.swing.JButton jButton9;
	private javax.swing.JButton jButton90;
	private javax.swing.JButton jButton91;
	private javax.swing.JButton jButton92;
	private javax.swing.JComboBox jComboBox1;
	private javax.swing.JComboBox jComboBox12;
	private javax.swing.JComboBox jComboBox2;
	private javax.swing.JComboBox jComboBox3;
	private javax.swing.JComboBox jComboBox4;
	private javax.swing.JComboBox jComboBox5;
	private javax.swing.JComboBox jComboBox6;
	private javax.swing.JComboBox jComboBox7;
	private javax.swing.JComboBox jComboBox8;
	private javax.swing.JComboBox jComboBox9;
	private javax.swing.JLabel jLabel1;
	private javax.swing.JLabel jLabel10;
	private javax.swing.JLabel jLabel100;
	private javax.swing.JLabel jLabel101;
	private javax.swing.JLabel jLabel102;
	private javax.swing.JLabel jLabel103;
	private javax.swing.JLabel jLabel104;
	private javax.swing.JLabel jLabel105;
	private javax.swing.JLabel jLabel106;
	private javax.swing.JLabel jLabel107;
	private javax.swing.JLabel jLabel108;
	private javax.swing.JLabel jLabel109;
	private javax.swing.JLabel jLabel11;
	private javax.swing.JLabel jLabel110;
	private javax.swing.JLabel jLabel111;
	private javax.swing.JLabel jLabel112;
	private javax.swing.JLabel jLabel113;
	private javax.swing.JLabel jLabel114;
	private javax.swing.JLabel jLabel115;
	private javax.swing.JLabel jLabel116;
	private javax.swing.JLabel jLabel117;
	private javax.swing.JLabel jLabel118;
	private javax.swing.JLabel jLabel119;
	private javax.swing.JLabel jLabel12;
	private javax.swing.JLabel jLabel120;
	private javax.swing.JLabel jLabel121;
	private javax.swing.JLabel jLabel122;
	private javax.swing.JLabel jLabel123;
	private javax.swing.JLabel jLabel124;
	private javax.swing.JLabel jLabel125;
	private javax.swing.JLabel jLabel126;
	private javax.swing.JLabel jLabel127;
	private javax.swing.JLabel jLabel128;
	private javax.swing.JLabel jLabel129;
	private javax.swing.JLabel jLabel13;
	private javax.swing.JLabel jLabel130;
	private javax.swing.JLabel jLabel131;
	private javax.swing.JLabel jLabel132;
	private javax.swing.JLabel jLabel133;
	private javax.swing.JLabel jLabel134;
	private javax.swing.JLabel jLabel135;
	private javax.swing.JLabel jLabel136;
	private javax.swing.JLabel jLabel137;
	private javax.swing.JLabel jLabel138;
	private javax.swing.JLabel jLabel139;
	private javax.swing.JLabel jLabel14;
	private javax.swing.JLabel jLabel140;
	private javax.swing.JLabel jLabel141;
	private javax.swing.JLabel jLabel142;
	private javax.swing.JLabel jLabel143;
	private javax.swing.JLabel jLabel144;
	private javax.swing.JLabel jLabel145;
	private javax.swing.JLabel jLabel146;
	private javax.swing.JLabel jLabel147;
	private javax.swing.JLabel jLabel148;
	private javax.swing.JLabel jLabel149;
	private javax.swing.JLabel jLabel15;
	private javax.swing.JLabel jLabel150;
	private javax.swing.JLabel jLabel151;
	private javax.swing.JLabel jLabel152;
	private javax.swing.JLabel jLabel153;
	private javax.swing.JLabel jLabel154;
	private javax.swing.JLabel jLabel16;
	private javax.swing.JLabel jLabel17;
	private javax.swing.JLabel jLabel18;
	private javax.swing.JLabel jLabel19;
	private javax.swing.JLabel jLabel2;
	private javax.swing.JLabel jLabel20;
	private javax.swing.JLabel jLabel21;
	private javax.swing.JLabel jLabel22;
	private javax.swing.JLabel jLabel23;
	private javax.swing.JLabel jLabel24;
	private javax.swing.JLabel jLabel25;
	private javax.swing.JLabel jLabel26;
	private javax.swing.JLabel jLabel27;
	private javax.swing.JLabel jLabel28;
	private javax.swing.JLabel jLabel29;
	private javax.swing.JLabel jLabel3;
	private javax.swing.JLabel jLabel30;
	private javax.swing.JLabel jLabel31;
	private javax.swing.JLabel jLabel32;
	private javax.swing.JLabel jLabel33;
	private javax.swing.JLabel jLabel34;
	private javax.swing.JLabel jLabel35;
	private javax.swing.JLabel jLabel36;
	private javax.swing.JLabel jLabel37;
	private javax.swing.JLabel jLabel38;
	private javax.swing.JLabel jLabel39;
	private javax.swing.JLabel jLabel4;
	private javax.swing.JLabel jLabel40;
	private javax.swing.JLabel jLabel41;
	private javax.swing.JLabel jLabel42;
	private javax.swing.JLabel jLabel43;
	private javax.swing.JLabel jLabel44;
	private javax.swing.JLabel jLabel45;
	private javax.swing.JLabel jLabel46;
	private javax.swing.JLabel jLabel47;
	private javax.swing.JLabel jLabel48;
	private javax.swing.JLabel jLabel49;
	private javax.swing.JLabel jLabel5;
	private javax.swing.JLabel jLabel50;
	private javax.swing.JLabel jLabel51;
	private javax.swing.JLabel jLabel52;
	private javax.swing.JLabel jLabel53;
	private javax.swing.JLabel jLabel54;
	private javax.swing.JLabel jLabel55;
	private javax.swing.JLabel jLabel56;
	private javax.swing.JLabel jLabel57;
	private javax.swing.JLabel jLabel58;
	private javax.swing.JLabel jLabel59;
	private javax.swing.JLabel jLabel6;
	private javax.swing.JLabel jLabel60;
	private javax.swing.JLabel jLabel61;
	private javax.swing.JLabel jLabel62;
	private javax.swing.JLabel jLabel63;
	private javax.swing.JLabel jLabel64;
	private javax.swing.JLabel jLabel65;
	private javax.swing.JLabel jLabel66;
	private javax.swing.JLabel jLabel67;
	private javax.swing.JLabel jLabel68;
	private javax.swing.JLabel jLabel69;
	private javax.swing.JLabel jLabel7;
	private javax.swing.JLabel jLabel70;
	private javax.swing.JLabel jLabel71;
	private javax.swing.JLabel jLabel72;
	private javax.swing.JLabel jLabel73;
	private javax.swing.JLabel jLabel74;
	private javax.swing.JLabel jLabel75;
	private javax.swing.JLabel jLabel76;
	private javax.swing.JLabel jLabel77;
	private javax.swing.JLabel jLabel78;
	private javax.swing.JLabel jLabel79;
	private javax.swing.JLabel jLabel8;
	private javax.swing.JLabel jLabel80;
	private javax.swing.JLabel jLabel81;
	private javax.swing.JLabel jLabel82;
	private javax.swing.JLabel jLabel83;
	private javax.swing.JLabel jLabel84;
	private javax.swing.JLabel jLabel85;
	private javax.swing.JLabel jLabel86;
	private javax.swing.JLabel jLabel87;
	private javax.swing.JLabel jLabel88;
	private javax.swing.JLabel jLabel89;
	private javax.swing.JLabel jLabel9;
	private javax.swing.JLabel jLabel90;
	private javax.swing.JLabel jLabel91;
	private javax.swing.JLabel jLabel92;
	private javax.swing.JLabel jLabel93;
	private javax.swing.JLabel jLabel94;
	private javax.swing.JLabel jLabel95;
	private javax.swing.JLabel jLabel96;
	private javax.swing.JLabel jLabel97;
	private javax.swing.JLabel jLabel98;
	private javax.swing.JLabel jLabel99;
	private javax.swing.JPasswordField jPasswordField1;
	private javax.swing.JPasswordField jPasswordField10;
	private javax.swing.JPasswordField jPasswordField11;
	private javax.swing.JPasswordField jPasswordField2;
	private javax.swing.JPasswordField jPasswordField3;
	private javax.swing.JPasswordField jPasswordField4;
	private javax.swing.JPasswordField jPasswordField5;
	private javax.swing.JPasswordField jPasswordField6;
	private javax.swing.JPasswordField jPasswordField7;
	private javax.swing.JPasswordField jPasswordField8;
	private javax.swing.JPasswordField jPasswordField9;
	private javax.swing.JRadioButton jRadioButton1;
	private javax.swing.JRadioButton jRadioButton2;
	private javax.swing.JRadioButton jRadioButton3;
	private javax.swing.JScrollPane jScrollPane1;
	private javax.swing.JScrollPane jScrollPane10;
	private javax.swing.JScrollPane jScrollPane11;
	private javax.swing.JScrollPane jScrollPane2;
	private javax.swing.JScrollPane jScrollPane3;
	private javax.swing.JScrollPane jScrollPane4;
	private javax.swing.JScrollPane jScrollPane6;
	private javax.swing.JScrollPane jScrollPane9;
	private javax.swing.JSpinner jSpinner1;
	private javax.swing.JSpinner jSpinner10;
	private javax.swing.JSpinner jSpinner11;
	private javax.swing.JSpinner jSpinner12;
	private javax.swing.JSpinner jSpinner13;
	private javax.swing.JSpinner jSpinner14;
	private javax.swing.JSpinner jSpinner2;
	private javax.swing.JSpinner jSpinner3;
	private javax.swing.JSpinner jSpinner4;
	private javax.swing.JSpinner jSpinner5;
	private javax.swing.JSpinner jSpinner6;
	private javax.swing.JSpinner jSpinner7;
	private javax.swing.JSpinner jSpinner8;
	private javax.swing.JSpinner jSpinner9;
	private javax.swing.JTable jTable1;
	private javax.swing.JTable jTable10;
	private javax.swing.JTable jTable11;
	private javax.swing.JTable jTable2;
	private javax.swing.JTable jTable3;
	private javax.swing.JTable jTable4;
	private javax.swing.JTable jTable6;
	private javax.swing.JTable jTable9;
	private javax.swing.JTextField jTextField1;
	private javax.swing.JTextField jTextField10;
	private javax.swing.JTextField jTextField11;
	private javax.swing.JTextField jTextField12;
	private javax.swing.JTextField jTextField13;
	private javax.swing.JTextField jTextField14;
	private javax.swing.JTextField jTextField15;
	private javax.swing.JTextField jTextField16;
	private javax.swing.JTextField jTextField17;
	private javax.swing.JTextField jTextField18;
	private javax.swing.JTextField jTextField19;
	private javax.swing.JTextField jTextField2;
	private javax.swing.JTextField jTextField20;
	private javax.swing.JTextField jTextField21;
	private javax.swing.JTextField jTextField22;
	private javax.swing.JTextField jTextField23;
	private javax.swing.JTextField jTextField24;
	private javax.swing.JTextField jTextField25;
	private javax.swing.JTextField jTextField26;
	private javax.swing.JTextField jTextField27;
	private javax.swing.JTextField jTextField28;
	private javax.swing.JTextField jTextField29;
	private javax.swing.JTextField jTextField3;
	private javax.swing.JTextField jTextField30;
	private javax.swing.JTextField jTextField31;
	private javax.swing.JTextField jTextField32;
	private javax.swing.JTextField jTextField33;
	private javax.swing.JTextField jTextField34;
	private javax.swing.JTextField jTextField35;
	private javax.swing.JTextField jTextField36;
	private javax.swing.JTextField jTextField37;
	private javax.swing.JTextField jTextField38;
	private javax.swing.JTextField jTextField39;
	private javax.swing.JTextField jTextField4;
	private javax.swing.JTextField jTextField40;
	private javax.swing.JTextField jTextField5;
	private javax.swing.JTextField jTextField6;
	private javax.swing.JTextField jTextField7;
	private javax.swing.JTextField jTextField8;
	private javax.swing.JTextField jTextField9;
	private javax.swing.JPanel login;
	private javax.swing.JPanel register;
	private javax.swing.JPanel stu;
	private javax.swing.JPanel stu1;
	private javax.swing.JPanel stu1_;
	private javax.swing.JPanel stu2;
	private javax.swing.JPanel stu3;
	private javax.swing.JPanel tea;
	private javax.swing.JPanel tea1;
	private javax.swing.JPanel tea1_;
	private javax.swing.JPanel tea2;
	private javax.swing.JPanel tea3;
	private javax.swing.JPanel tea3_;
	private javax.swing.JPanel tea4;
	private javax.swing.JPanel tea5;
	private javax.swing.JPanel tea6;
	// End of variables declaration//GEN-END:variables

}