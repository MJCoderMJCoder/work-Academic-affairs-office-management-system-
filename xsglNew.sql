CREATE DATABASE  IF NOT EXISTS `xsgl` /*!40100 DEFAULT CHARACTER SET utf8 */;
USE `xsgl`;
-- MySQL dump 10.13  Distrib 5.7.17, for Win64 (x86_64)
--
-- Host: localhost    Database: xsgl
-- ------------------------------------------------------
-- Server version	5.7.21-log

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `admin`
--

DROP TABLE IF EXISTS `admin`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `admin` (
  `num` varchar(30) NOT NULL,
  `pw` varchar(30) NOT NULL,
  `name` varchar(20) NOT NULL,
  `sex` varchar(10) NOT NULL,
  `age` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `admin`
--

LOCK TABLES `admin` WRITE;
/*!40000 ALTER TABLE `admin` DISABLE KEYS */;
INSERT INTO `admin` VALUES ('1000','123123123','小姐你放肆了','男',20);
/*!40000 ALTER TABLE `admin` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `courses`
--

DROP TABLE IF EXISTS `courses`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `courses` (
  `tea_id` varchar(30) NOT NULL,
  `cou_id` int(11) NOT NULL,
  `cou_name` varchar(30) NOT NULL,
  `cou_time` varchar(20) NOT NULL,
  `cou_ctime` varchar(20) NOT NULL,
  `cou_fen` int(11) NOT NULL,
  `cou_snum` int(11) NOT NULL,
  `cou_lnum` int(11) NOT NULL,
  `state` varchar(10) DEFAULT NULL,
  PRIMARY KEY (`cou_id`),
  KEY `cou_tea_num` (`tea_id`),
  CONSTRAINT `tea_id` FOREIGN KEY (`tea_id`) REFERENCES `teachers` (`tea_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `courses`
--

LOCK TABLES `courses` WRITE;
/*!40000 ALTER TABLE `courses` DISABLE KEYS */;
INSERT INTO `courses` VALUES ('101',104,'大数据','1-18周','周四8-9节',5,110,1,'授课中'),('101',123,'jsp','1-18周','周四8-10节',3,100,3,'授课中'),('102',222,'c++','1-9周','周一12-13节',3,30,2,'授课中'),('101',223,'心理与健康','1-18周','周二4-5节',1,100,3,'授课中'),('101',333,'c','1-18周','周二4-5节',4,60,0,'授课中'),('101',1001,'java','9-18周','周三10-12节',3,30,0,'授课中'),('101',1008,'python','1-18周','周五8-9节',4,30,0,'授课中'),('101',1009,'html','1-18周','周三4-5节',2,50,0,'授课中'),('101',1010,'css','1-18周','周五1-2节',4,100,1,'授课中'),('101',1888,'老温驾驶课程','1-18周','周一8-9节',10,50,1,'授课中'),('102',6003,'测试','0-0周','周一0-0节',0,0,0,NULL);
/*!40000 ALTER TABLE `courses` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `score`
--

DROP TABLE IF EXISTS `score`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `score` (
  `cou_id` int(11) NOT NULL,
  `stu_id` int(11) NOT NULL,
  `cou_num` double DEFAULT NULL,
  PRIMARY KEY (`cou_id`,`stu_id`),
  KEY `stu_id` (`stu_id`),
  CONSTRAINT `cou_id` FOREIGN KEY (`cou_id`) REFERENCES `courses` (`cou_id`),
  CONSTRAINT `stu_id` FOREIGN KEY (`stu_id`) REFERENCES `students` (`stu_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `score`
--

LOCK TABLES `score` WRITE;
/*!40000 ALTER TABLE `score` DISABLE KEYS */;
INSERT INTO `score` VALUES (104,12312,NULL),(123,12312,NULL),(222,12312,NULL),(223,12312,12),(333,12312,12),(1001,12312,12),(1001,17018384,12),(1009,17018384,12),(1888,12312,NULL);
/*!40000 ALTER TABLE `score` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `students`
--

DROP TABLE IF EXISTS `students`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `students` (
  `stu_id` int(11) NOT NULL,
  `stu_pw` varchar(30) NOT NULL,
  `stu_name` varchar(20) NOT NULL,
  `stu_sex` varchar(5) NOT NULL,
  `stu_age` int(11) NOT NULL,
  `stu_major` varchar(50) NOT NULL,
  `stu_class` varchar(10) NOT NULL,
  PRIMARY KEY (`stu_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `students`
--

LOCK TABLES `students` WRITE;
/*!40000 ALTER TABLE `students` DISABLE KEYS */;
INSERT INTO `students` VALUES (12312,'123123','周1','女',60,'通信工程','8班'),(17018384,'123123','张2','男',20,'通信工程','8班'),(172018353,'123123','杨秋2','女',134,'通信工程','8班'),(172018434,'123123','周2','女',18,'test','2班');
/*!40000 ALTER TABLE `students` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `teachers`
--

DROP TABLE IF EXISTS `teachers`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `teachers` (
  `tea_id` varchar(30) NOT NULL,
  `tea_pw` varchar(30) NOT NULL,
  `tea_name` varchar(20) NOT NULL,
  `tea_sex` varchar(5) NOT NULL,
  `tea_age` int(11) NOT NULL,
  PRIMARY KEY (`tea_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `teachers`
--

LOCK TABLES `teachers` WRITE;
/*!40000 ALTER TABLE `teachers` DISABLE KEYS */;
INSERT INTO `teachers` VALUES ('101','123qwe','花花','男',30),('102','123123','温泉','女',30),('103','123123','周锦豪','男',20);
/*!40000 ALTER TABLE `teachers` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Dumping events for database 'xsgl'
--

--
-- Dumping routines for database 'xsgl'
--
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2018-07-18 20:11:20
