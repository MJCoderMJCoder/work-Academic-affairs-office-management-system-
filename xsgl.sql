/*
Navicat MySQL Data Transfer

Source Server         : localhost_3306
Source Server Version : 50018
Source Host           : localhost:3306
Source Database       : xsgl

Target Server Type    : MYSQL
Target Server Version : 50018
File Encoding         : 65001

Date: 2018-07-17 17:38:30
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for admin
-- ----------------------------
DROP TABLE IF EXISTS `admin`;
CREATE TABLE `admin` (
  `num` varchar(30) NOT NULL,
  `pw` varchar(30) NOT NULL,
  `name` varchar(20) NOT NULL,
  `sex` varchar(10) NOT NULL,
  `age` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of admin
-- ----------------------------
INSERT INTO `admin` VALUES ('1000', '123123123', '武当', '男', '20');

-- ----------------------------
-- Table structure for courses
-- ----------------------------
DROP TABLE IF EXISTS `courses`;
CREATE TABLE `courses` (
  `tea_id` varchar(30) NOT NULL,
  `cou_id` int(11) NOT NULL,
  `cou_name` varchar(30) NOT NULL,
  `cou_time` varchar(20) NOT NULL,
  `cou_ctime` varchar(20) NOT NULL,
  `cou_fen` int(11) NOT NULL,
  `cou_snum` int(11) NOT NULL,
  `cou_lnum` int(11) NOT NULL,
  `state` varchar(10) default NULL,
  PRIMARY KEY  (`cou_id`),
  KEY `cou_tea_num` (`tea_id`),
  CONSTRAINT `tea_id` FOREIGN KEY (`tea_id`) REFERENCES `teachers` (`tea_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of courses
-- ----------------------------
INSERT INTO `courses` VALUES ('101', '104', '大数据', '1-18周', '周四8-9节', '5', '110', '0', '授课中');
INSERT INTO `courses` VALUES ('101', '123', 'jsp', '1-18周', '周四8-10节', '3', '100', '3', '授课中');
INSERT INTO `courses` VALUES ('102', '222', 'c++', '1-9周', '周一12-13节', '3', '30', '1', '授课中');
INSERT INTO `courses` VALUES ('101', '223', '心理与健康', '1-18周', '周二4-5节', '1', '100', '3', '授课中');
INSERT INTO `courses` VALUES ('101', '333', 'c', '1-18周', '周二4-5节', '4', '60', '0', '授课中');
INSERT INTO `courses` VALUES ('101', '1001', 'java', '9-18周', '周三10-12节', '3', '30', '0', '授课中');
INSERT INTO `courses` VALUES ('101', '1008', 'python', '1-18周', '周五8-9节', '4', '30', '0', '授课中');
INSERT INTO `courses` VALUES ('101', '1009', 'html', '1-18周', '周三4-5节', '2', '50', '0', '授课中');
INSERT INTO `courses` VALUES ('101', '1010', 'css', '1-18周', '周五1-2节', '4', '100', '1', '授课中');
INSERT INTO `courses` VALUES ('101', '1888', '老温驾驶课程', '1-18周', '周一8-9节', '10', '50', '0', '授课中');

-- ----------------------------
-- Table structure for score
-- ----------------------------
DROP TABLE IF EXISTS `score`;
CREATE TABLE `score` (
  `cou_id` int(11) NOT NULL,
  `stu_id` int(11) NOT NULL,
  `cou_num` double default NULL,
  PRIMARY KEY  (`cou_id`,`stu_id`),
  KEY `stu_id` (`stu_id`),
  CONSTRAINT `cou_id` FOREIGN KEY (`cou_id`) REFERENCES `courses` (`cou_id`),
  CONSTRAINT `stu_id` FOREIGN KEY (`stu_id`) REFERENCES `students` (`stu_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of score
-- ----------------------------
INSERT INTO `score` VALUES ('123', '12312', null);
INSERT INTO `score` VALUES ('223', '12312', '12');
INSERT INTO `score` VALUES ('333', '12312', '12');
INSERT INTO `score` VALUES ('1001', '12312', '12');
INSERT INTO `score` VALUES ('1001', '17018384', '12');
INSERT INTO `score` VALUES ('1009', '17018384', '12');

-- ----------------------------
-- Table structure for students
-- ----------------------------
DROP TABLE IF EXISTS `students`;
CREATE TABLE `students` (
  `stu_id` int(11) NOT NULL,
  `stu_pw` varchar(30) NOT NULL,
  `stu_name` varchar(20) NOT NULL,
  `stu_sex` varchar(5) NOT NULL,
  `stu_age` int(11) NOT NULL,
  `stu_major` varchar(50) NOT NULL,
  `stu_class` varchar(10) NOT NULL,
  PRIMARY KEY  (`stu_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of students
-- ----------------------------
INSERT INTO `students` VALUES ('12312', '123123', '周1', '女', '60', '通信工程', '8班');
INSERT INTO `students` VALUES ('17018384', '123123', '张2', '男', '20', '通信工程', '8班');
INSERT INTO `students` VALUES ('172018353', '123123', '杨秋2', '女', '134', '通信工程', '8班');
INSERT INTO `students` VALUES ('172018434', '123123', '周2', '女', '18', 'test', '2班');

-- ----------------------------
-- Table structure for teachers
-- ----------------------------
DROP TABLE IF EXISTS `teachers`;
CREATE TABLE `teachers` (
  `tea_id` varchar(30) NOT NULL,
  `tea_pw` varchar(30) NOT NULL,
  `tea_name` varchar(20) NOT NULL,
  `tea_sex` varchar(5) NOT NULL,
  `tea_age` int(11) NOT NULL,
  PRIMARY KEY  (`tea_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of teachers
-- ----------------------------
INSERT INTO `teachers` VALUES ('101', '123qwe', '花花', '男', '30');
INSERT INTO `teachers` VALUES ('102', '123123', '温泉', '女', '30');
INSERT INTO `teachers` VALUES ('103', '123123', '周锦豪', '男', '20');
