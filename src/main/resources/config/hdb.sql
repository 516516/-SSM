/*
Navicat MySQL Data Transfer

Source Server         : ha
Source Server Version : 80003
Source Host           : localhost:3306
Source Database       : hdb

Target Server Type    : MYSQL
Target Server Version : 80003
File Encoding         : 65001

Date: 2018-09-01 17:10:57
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for article
-- ----------------------------
DROP TABLE IF EXISTS `article`;
CREATE TABLE `article` (
  `atc_id` int(11) NOT NULL AUTO_INCREMENT COMMENT '文章表id',
  `atc_content` text CHARACTER SET utf8 COLLATE utf8_bin COMMENT '内容',
  `atc_type` char(1) DEFAULT NULL COMMENT '0---   1----   3---   4---',
  `atc_num1` int(100) DEFAULT NULL COMMENT '点赞人数',
  `atc_num2` int(100) DEFAULT NULL COMMENT '踩人数',
  `atc_publishtime` datetime DEFAULT NULL COMMENT '申请日期',
  `atc_introduction` text CHARACTER SET utf8 COLLATE utf8_bin COMMENT '简介',
  `atc_name` varchar(30) CHARACTER SET utf8 COLLATE utf8_bin DEFAULT NULL COMMENT '文章名',
  PRIMARY KEY (`atc_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for audite
-- ----------------------------
DROP TABLE IF EXISTS `audite`;
CREATE TABLE `audite` (
  `a_id` int(11) NOT NULL AUTO_INCREMENT COMMENT '待审核项目id',
  `a_userid` int(11) NOT NULL COMMENT '借款人id',
  `a_amount` decimal(10,0) DEFAULT NULL COMMENT '项目金额',
  `a_dateline` datetime DEFAULT NULL COMMENT '项目期限',
  `a_interest` decimal(10,0) DEFAULT NULL COMMENT '利息',
  `a_applytime` datetime DEFAULT NULL COMMENT '申请时间',
  `a_state` char(1) DEFAULT NULL,
  PRIMARY KEY (`a_id`),
  KEY `a_userid` (`a_userid`),
  CONSTRAINT `a_userid` FOREIGN KEY (`a_userid`) REFERENCES `user` (`u_id`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for credit
-- ----------------------------
DROP TABLE IF EXISTS `credit`;
CREATE TABLE `credit` (
  `c_id` int(11) NOT NULL AUTO_INCREMENT COMMENT '银行卡id',
  `c_cardnum` varchar(50) CHARACTER SET utf8 COLLATE utf8_bin DEFAULT NULL COMMENT '卡号',
  `c_userid` int(11) DEFAULT NULL COMMENT '用户id',
  `c_paypassword` varchar(20) CHARACTER SET utf8 COLLATE utf8_bin DEFAULT NULL COMMENT '支付密码',
  `c_bankname` varchar(20) CHARACTER SET utf8 COLLATE utf8_bin DEFAULT NULL COMMENT '开户行名称',
  `c_province` varchar(20) CHARACTER SET utf8 COLLATE utf8_bin DEFAULT NULL COMMENT '省份',
  `c_phone` varchar(20) CHARACTER SET utf8 COLLATE utf8_bin DEFAULT NULL COMMENT '预留手机号',
  `c_bankadress` varchar(100) CHARACTER SET utf8 COLLATE utf8_bin DEFAULT NULL COMMENT '开户行地址',
  PRIMARY KEY (`c_id`),
  KEY `c_userid` (`c_userid`),
  CONSTRAINT `c_userid` FOREIGN KEY (`c_userid`) REFERENCES `user` (`u_id`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for invest
-- ----------------------------
DROP TABLE IF EXISTS `invest`;
CREATE TABLE `invest` (
  `i_id` int(11) NOT NULL AUTO_INCREMENT COMMENT '投资id',
  `i_userid` int(11) NOT NULL COMMENT '用户id',
  `i_projectid` int(11) NOT NULL COMMENT '项目id',
  `i_datetime` datetime DEFAULT NULL COMMENT '投资日期',
  `i_amount` decimal(10,0) DEFAULT NULL COMMENT '投资金额',
  `i_state` char(1) DEFAULT NULL COMMENT '0--完成 1--进行',
  PRIMARY KEY (`i_id`),
  KEY `i_userid` (`i_userid`),
  KEY `i_projectid` (`i_projectid`),
  CONSTRAINT `i_projectid` FOREIGN KEY (`i_projectid`) REFERENCES `project` (`p_id`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `i_userid` FOREIGN KEY (`i_userid`) REFERENCES `user` (`u_id`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for manager
-- ----------------------------
DROP TABLE IF EXISTS `manager`;
CREATE TABLE `manager` (
  `m_id` int(11) NOT NULL AUTO_INCREMENT COMMENT '管理员id',
  `m_name` varchar(20) CHARACTER SET utf8 COLLATE utf8_bin DEFAULT NULL COMMENT '管理员姓名',
  `m_type` char(1) DEFAULT NULL COMMENT '0--文章管理 1--（公司 个人）项目管理  2---用户管理  3---项目状态 4--all',
  `m_password` varchar(20) CHARACTER SET utf8 COLLATE utf8_bin DEFAULT NULL COMMENT '密码',
  `m_phone` varchar(20) CHARACTER SET utf8 COLLATE utf8_bin DEFAULT NULL COMMENT '手机号',
  PRIMARY KEY (`m_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for project
-- ----------------------------
DROP TABLE IF EXISTS `project`;
CREATE TABLE `project` (
  `p_id` int(11) NOT NULL AUTO_INCREMENT COMMENT '项目id',
  `p_name` varchar(30) CHARACTER SET utf8 COLLATE utf8_bin DEFAULT NULL COMMENT '项目名',
  `p_type` char(1) DEFAULT NULL COMMENT '0---个人  1---公司',
  `p_amount` decimal(30,0) DEFAULT NULL COMMENT '项目所需总金额',
  `p_invest_amount` decimal(30,0) DEFAULT NULL COMMENT '项目已被投资的金额',
  `p_introduction` varchar(1000) DEFAULT NULL COMMENT '项目简介',
  `p_date_investfirst` datetime DEFAULT NULL COMMENT '筹款开始日期',
  `p_state` char(1) DEFAULT NULL COMMENT '0--筹资  1--满标 2---还款（公司分红） 3--完成   4--待风险审核 5--风险审核不通过  ',
  `p_date_investend` datetime DEFAULT NULL COMMENT '筹款截止日期',
  `p_dateline` datetime DEFAULT NULL COMMENT '项目结束期限，及分红的日期。',
  `p_borrower_id` int(11) DEFAULT NULL COMMENT '借款人',
  `p_rate` varchar(20) DEFAULT NULL COMMENT '利率',
  `p_auditor_id` int(20) DEFAULT NULL COMMENT '风险审核人id',
  `p_creator_id` int(20) DEFAULT NULL COMMENT '创建项目管理人员id',
  `p_examine_content` varchar(1000) CHARACTER SET utf8 COLLATE utf8_bin DEFAULT NULL COMMENT '审核意见',
  `p_content` varchar(1000) CHARACTER SET utf8 COLLATE utf8_bin DEFAULT NULL COMMENT '风险审核意见',
  `p_examine_date` datetime DEFAULT NULL COMMENT '项目审核时间',
  `p_addtime` datetime DEFAULT NULL COMMENT '项目添加时间',
  PRIMARY KEY (`p_id`)
) ENGINE=InnoDB AUTO_INCREMENT=17 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for stream
-- ----------------------------
DROP TABLE IF EXISTS `stream`;
CREATE TABLE `stream` (
  `s_id` int(11) NOT NULL AUTO_INCREMENT COMMENT '流水id',
  `s_projectid` int(11) NOT NULL COMMENT '项目id',
  `s_userid` int(11) NOT NULL COMMENT '用户id',
  `s_type` char(1) DEFAULT NULL COMMENT '0--分红  1--利息 2--本金 3--提现 4--充值 5--投资',
  `s_amount` decimal(10,0) DEFAULT NULL COMMENT '金额',
  `s_time` datetime DEFAULT NULL COMMENT '流水产生时间',
  `s_investid` int(11) NOT NULL COMMENT '投资表id',
  PRIMARY KEY (`s_id`),
  KEY `s_projectid` (`s_projectid`),
  KEY `s_userid` (`s_userid`),
  KEY `s_investid` (`s_investid`),
  CONSTRAINT `s_investid` FOREIGN KEY (`s_investid`) REFERENCES `invest` (`i_id`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `s_projectid` FOREIGN KEY (`s_projectid`) REFERENCES `project` (`p_id`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `s_userid` FOREIGN KEY (`s_userid`) REFERENCES `user` (`u_id`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for user
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user` (
  `u_id` int(100) NOT NULL AUTO_INCREMENT COMMENT '用户id',
  `u_name` varchar(50) CHARACTER SET utf8 COLLATE utf8_bin DEFAULT NULL COMMENT '用户名',
  `u_loginpassword` varchar(50) CHARACTER SET utf8 COLLATE utf8_bin DEFAULT NULL COMMENT '登录密码',
  `u_nickname` varchar(50) CHARACTER SET utf8 COLLATE utf8_bin DEFAULT NULL COMMENT '昵称',
  `u_phone` varchar(20) CHARACTER SET utf8 COLLATE utf8_bin DEFAULT NULL COMMENT '电话号码',
  `u_lastlogintime` datetime DEFAULT NULL COMMENT '最后登录时间',
  `u_registime` datetime DEFAULT NULL COMMENT '注册时间',
  `u_state` char(1) DEFAULT NULL COMMENT '0--可用   1--禁用（30min）',
  `u_balance` decimal(40,0) DEFAULT NULL COMMENT '余额',
  `u_principal` decimal(40,0) DEFAULT NULL COMMENT '待收本金',
  `u_interest` decimal(40,0) DEFAULT NULL COMMENT '待收利息',
  `u_address` varchar(100) CHARACTER SET utf8 COLLATE utf8_bin DEFAULT NULL COMMENT '地址',
  `u_idcard` varchar(100) CHARACTER SET utf8 COLLATE utf8_bin DEFAULT NULL COMMENT '身份证',
  `u_paypassword` varchar(20) CHARACTER SET utf8 COLLATE utf8_bin DEFAULT NULL COMMENT '支付密码',
  `u_creditworth` int(20) DEFAULT NULL COMMENT '信誉度',
  `u_realname` varchar(50) CHARACTER SET utf8 COLLATE utf8_bin DEFAULT NULL COMMENT '真实姓名',
  `u_sex` char(1) DEFAULT NULL COMMENT '0---男   1---女  2---未知',
  PRIMARY KEY (`u_id`)
) ENGINE=InnoDB AUTO_INCREMENT=16 DEFAULT CHARSET=utf8;
