/*
Navicat MySQL Data Transfer

Source Server         : ha
Source Server Version : 80003
Source Host           : localhost:3306
Source Database       : hdb

Target Server Type    : MYSQL
Target Server Version : 80003
File Encoding         : 65001

Date: 2018-09-04 21:28:35
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
-- Records of article
-- ----------------------------

-- ----------------------------
-- Table structure for audite
-- ----------------------------
DROP TABLE IF EXISTS `audite`;
CREATE TABLE `audite` (
  `a_id` int(11) NOT NULL AUTO_INCREMENT COMMENT '待审核项目id',
  `a_userid` int(11) NOT NULL COMMENT '借款人id',
  `a_amount` decimal(30,0) DEFAULT NULL COMMENT '项目金额',
  `a_dateline` int(11) DEFAULT NULL COMMENT '项目借款期限',
  `a_interest` varchar(10) DEFAULT NULL COMMENT '利息',
  `a_applytime` datetime DEFAULT NULL COMMENT '申请时间',
  `a_state` char(1) DEFAULT NULL COMMENT '0---待审核 1---筹资 2---还款 3---完成 4---审核未通过',
  PRIMARY KEY (`a_id`),
  KEY `a_userid` (`a_userid`),
  CONSTRAINT `a_userid` FOREIGN KEY (`a_userid`) REFERENCES `user` (`u_id`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=14 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of audite
-- ----------------------------
INSERT INTO `audite` VALUES ('1', '17', '3000', '39', null, '2018-09-01 20:27:43', '1');
INSERT INTO `audite` VALUES ('2', '17', '232', '23', null, '2018-09-01 20:54:29', '0');
INSERT INTO `audite` VALUES ('3', '17', '23', '23', '0.3', '2018-09-01 20:55:27', '0');
INSERT INTO `audite` VALUES ('4', '17', '23', '23', '0.3', '2018-09-01 20:55:46', '0');
INSERT INTO `audite` VALUES ('5', '17', '23', '23', '0.3', '2018-09-01 20:56:31', '0');
INSERT INTO `audite` VALUES ('6', '17', '23', '23', '0.3', '2018-09-01 21:07:52', '0');
INSERT INTO `audite` VALUES ('7', '17', '45', '45', '0.3', '2018-09-01 21:57:11', '0');
INSERT INTO `audite` VALUES ('8', '17', '12', '12', '0.3', '2018-09-01 22:23:02', '4');
INSERT INTO `audite` VALUES ('9', '18', '18', '18', '0.3', '2018-09-02 10:29:55', '1');
INSERT INTO `audite` VALUES ('10', '18', '18', '18', '0.3', '2018-09-02 10:55:15', '1');
INSERT INTO `audite` VALUES ('11', '18', '12', '1', '0.3', '2018-09-02 12:18:38', '1');
INSERT INTO `audite` VALUES ('12', '18', '12', '12', '0.3', '2018-09-02 17:22:45', '1');
INSERT INTO `audite` VALUES ('13', '18', '12', '12', '0.3', '2018-09-02 18:53:52', '1');

-- ----------------------------
-- Table structure for credit
-- ----------------------------
DROP TABLE IF EXISTS `credit`;
CREATE TABLE `credit` (
  `c_id` int(11) NOT NULL AUTO_INCREMENT COMMENT '银行卡id',
  `c_userid` int(11) DEFAULT NULL COMMENT '用户id',
  `c_province` varchar(20) CHARACTER SET utf8 COLLATE utf8_bin DEFAULT NULL COMMENT '开户省份/城市',
  `c_bankadress` varchar(100) CHARACTER SET utf8 COLLATE utf8_bin DEFAULT NULL COMMENT '开户支行地址',
  `c_bankname` varchar(20) CHARACTER SET utf8 COLLATE utf8_bin DEFAULT NULL COMMENT '开户行名称',
  `c_cardnum` varchar(50) CHARACTER SET utf8 COLLATE utf8_bin DEFAULT NULL COMMENT '卡号',
  `c_paypassword` varchar(20) CHARACTER SET utf8 COLLATE utf8_bin DEFAULT NULL COMMENT '支付密码',
  `c_phone` varchar(20) CHARACTER SET utf8 COLLATE utf8_bin DEFAULT NULL COMMENT '预留手机号',
  PRIMARY KEY (`c_id`),
  KEY `c_userid` (`c_userid`),
  CONSTRAINT `c_userid` FOREIGN KEY (`c_userid`) REFERENCES `user` (`u_id`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of credit
-- ----------------------------

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
-- Records of invest
-- ----------------------------

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
-- Records of manager
-- ----------------------------

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
  `p_state` char(1) DEFAULT NULL COMMENT '0--筹资  1--满标 2---还款（公司分红） 3--完成   4--待风险审核 5--风险审核不通过  ',
  `p_borrower_id` int(11) DEFAULT NULL COMMENT '个人借款项目Id',
  `p_rate` varchar(20) DEFAULT NULL COMMENT '利率',
  `p_auditor_id` int(20) DEFAULT NULL COMMENT '风险审核人id',
  `p_creator_id` int(20) DEFAULT NULL COMMENT '创建项目管理人员id',
  `p_examine_content` varchar(1000) CHARACTER SET utf8 COLLATE utf8_bin DEFAULT NULL COMMENT '审核意见',
  `p_content` varchar(1000) CHARACTER SET utf8 COLLATE utf8_bin DEFAULT NULL COMMENT '风险审核意见',
  `p_examine_date` datetime DEFAULT NULL COMMENT '项目审核时间',
  `p_addtime` datetime DEFAULT NULL COMMENT '项目添加时间',
  `p_dateline` int(11) NOT NULL COMMENT '借款期限',
  PRIMARY KEY (`p_id`)
) ENGINE=InnoDB AUTO_INCREMENT=30 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of project
-- ----------------------------
INSERT INTO `project` VALUES ('1', '测试项目', null, '3000000', null, '测试i项目', '5', null, '0.14', null, null, '不通过', '不通过', null, null, '0');
INSERT INTO `project` VALUES ('2', '测试项目', null, '3000000', null, '测试i项目', '0', null, '0.14', null, null, '通过', '通过', null, null, '0');
INSERT INTO `project` VALUES ('3', '测试项目2', null, '4000', null, '测试项目', '0', null, '0.2', null, '7', '通过', '通过', null, null, '0');
INSERT INTO `project` VALUES ('4', '测试3', null, '3000000', null, '测试项目，勿投资', '0', null, '0.14', null, '7', '通过', '通过', null, null, '0');
INSERT INTO `project` VALUES ('5', '测试项目3', null, '2000', null, '测试项目', '0', null, '0.1', null, '7', '通过', '通过', null, null, '0');
INSERT INTO `project` VALUES ('6', '测试项目审核', null, '30000000', null, '测试项目的审核', '0', null, '0.3', '11', '11', '通过', '通过', null, null, '0');
INSERT INTO `project` VALUES ('7', '测试项目审核人ID功能添加', null, '4000000', null, '测试项目审核人ID功能添加', '5', null, '0.5', null, '12', '通过', '通过', null, null, '0');
INSERT INTO `project` VALUES ('8', '测试项目审核不通过功能', null, '4000', null, '测试项目审核不通过功能', '5', null, '0.3', '12', '12', '不通过', '不通过', null, null, '0');
INSERT INTO `project` VALUES ('9', '测试项目审核不通过', null, '4000', null, '测试项目审核不通过', '5', null, '0.9', null, '12', '', '', null, null, '0');
INSERT INTO `project` VALUES ('10', '测试项目不通过', null, '4000', null, '测试项目不通过', '5', null, '0.9', '12', '12', '', '', null, null, '0');
INSERT INTO `project` VALUES ('11', 'AAA', null, '200', null, '存放', '5', null, '0.9', '12', '12', '', '', null, null, '0');
INSERT INTO `project` VALUES ('12', '测试项目审核时间', null, '200', null, '测试项目审核时间', '0', null, '0.1', '14', '14', '通过', '通过', '2018-09-01 16:47:02', null, '0');
INSERT INTO `project` VALUES ('13', '测试添加项目时间', null, '100', null, '测试添加项目时间', '0', null, '0.3', '15', '15', '通过', '通过', '2018-09-01 17:01:38', '2018-09-01 16:54:45', '0');
INSERT INTO `project` VALUES ('14', '测试项目创建时间', null, '1', null, '1', '0', null, '1', '15', '15', '通过', '经过审核该项目通过，允许筹资', '2018-09-01 17:05:11', '2018-09-01 17:04:20', '0');
INSERT INTO `project` VALUES ('15', '测试审核框', null, '1', null, '测试项目审核框', '0', null, '1', '15', '15', '', '', '2018-09-01 17:08:54', '2018-09-01 17:08:13', '0');
INSERT INTO `project` VALUES ('16', '测试项目审核框2', null, '1', null, '测试项目审核框', '5', null, '1', '15', '15', '', '', '2018-09-01 17:09:01', '2018-09-01 17:08:46', '0');
INSERT INTO `project` VALUES ('17', '测试项目截止期限', null, '3000000', null, '测试项目截止期限', '0', null, '0.3', '16', '16', '通过', '通过', '2018-09-01 19:05:45', '2018-09-01 19:02:06', '30');
INSERT INTO `project` VALUES ('18', '222', null, '222', null, '2', '0', null, '2', '17', '17', '通过', '通过', '2018-09-01 19:24:37', '2018-09-01 19:24:21', '222');
INSERT INTO `project` VALUES ('19', null, null, '18', null, null, '0', '10', '0.3', '18', '18', '同故宫', '通过', '2018-09-02 10:55:40', '2018-09-02 10:55:40', '18');
INSERT INTO `project` VALUES ('20', '个人借款', '0', '18', null, null, '0', '10', '0.3', '18', '18', '通过', '通过', '2018-09-02 10:59:07', '2018-09-02 10:59:07', '18');
INSERT INTO `project` VALUES ('21', '个人借款', '0', '18', null, null, '0', '10', '0.3', '18', '18', '通过', '通过', '2018-09-02 11:06:17', '2018-09-02 11:06:17', '18');
INSERT INTO `project` VALUES ('22', '个人借款', '0', '18', null, null, '0', '10', '0.3', '18', '18', '通过', '通过', '2018-09-02 11:12:58', '2018-09-02 11:12:58', '18');
INSERT INTO `project` VALUES ('23', '个人借款', '0', '18', null, null, '0', '9', '0.3', '18', '18', '通过', '通过', '2018-09-02 11:13:07', '2018-09-02 11:13:07', '18');
INSERT INTO `project` VALUES ('24', '个人借款', '0', '12', null, null, '5', '8', '0.3', '18', '18', '不通过', '不通过', '2018-09-02 11:26:26', '2018-09-02 11:26:26', '12');
INSERT INTO `project` VALUES ('25', '个人借款', '0', '3000', null, null, '0', '1', null, '18', '18', '同故宫', '通过', '2018-09-02 11:28:21', '2018-09-02 11:28:21', '39');
INSERT INTO `project` VALUES ('26', '个人借款', '0', '12', null, null, '0', '11', '0.3', '18', '18', '通过', '通过', '2018-09-02 12:18:53', '2018-09-02 12:18:53', '1');
INSERT INTO `project` VALUES ('27', '个人借款', '0', '12', null, null, '0', '12', '0.3', '18', '18', '通过', '通过', '2018-09-02 17:22:55', '2018-09-02 17:22:55', '12');
INSERT INTO `project` VALUES ('28', '个人借款', '0', '12', null, null, '0', '13', '0.3', '18', '18', '通过', '通过发', '2018-09-02 18:54:06', '2018-09-02 18:54:06', '12');
INSERT INTO `project` VALUES ('29', 'bobo测试项目', '1', '30', null, 'bobo测试项目', '0', null, '0.1', '20', '20', '通过', '通过', '2018-09-02 19:16:41', '2018-09-02 19:16:22', '1');

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
-- Records of stream
-- ----------------------------

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
  `u_balance` decimal(40,0) DEFAULT NULL COMMENT '账户余额',
  `u_principal` decimal(40,0) DEFAULT NULL COMMENT '待收本金',
  `u_interest` decimal(40,0) DEFAULT NULL COMMENT '待收利息',
  `u_address` varchar(100) CHARACTER SET utf8 COLLATE utf8_bin DEFAULT NULL COMMENT '现居地址',
  `u_idcard` varchar(100) CHARACTER SET utf8 COLLATE utf8_bin DEFAULT NULL COMMENT '身份证',
  `u_paypassword` varchar(20) CHARACTER SET utf8 COLLATE utf8_bin DEFAULT NULL COMMENT '支付密码',
  `u_creditworth` int(20) DEFAULT NULL COMMENT '信誉度',
  `u_realname` varchar(50) CHARACTER SET utf8 COLLATE utf8_bin DEFAULT NULL COMMENT '真实姓名',
  `u_sex` char(1) DEFAULT NULL COMMENT '0---男   1---女  2---未知',
  `u_realaddress` varchar(100) DEFAULT NULL COMMENT '户口所在地址',
  PRIMARY KEY (`u_id`)
) ENGINE=InnoDB AUTO_INCREMENT=21 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of user
-- ----------------------------
INSERT INTO `user` VALUES ('1', 'bobo', '12345', 'boubou', '17761700663', '2018-05-08 16:11:12', '2018-05-08 16:11:17', '0', '30000000', '10000', '5000', '南京', '122222222', '12345', '100', '胡波', '0', null);
INSERT INTO `user` VALUES ('2', 'huhu', null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null);
INSERT INTO `user` VALUES ('3', '短发短发的', '111', '打法大师傅', 'dfdf', '2018-08-17 22:01:39', '2018-08-17 22:01:39', null, null, null, null, 'dfdfd', null, null, null, null, '0', null);
INSERT INTO `user` VALUES ('4', 'hubo', 'ddd', 'dfdf', 'ddd', '2018-08-17 22:02:53', '2018-08-17 22:02:53', null, null, null, null, 'ddd', null, null, null, null, '0', null);
INSERT INTO `user` VALUES ('5', 'hu', 'qqq', 'dfdf', 'qqq', '2018-08-17 22:04:57', '2018-08-17 22:04:57', null, null, null, null, 'qqq', null, null, null, null, '0', null);
INSERT INTO `user` VALUES ('6', 'qq', 'qq', 'qq', 'qq', '2018-08-17 22:38:44', '2018-08-17 22:38:44', null, null, null, null, 'qq', null, null, null, null, '0', null);
INSERT INTO `user` VALUES ('7', 'HUBO', '222', 'bobo', '17761700664', '2018-08-17 22:56:14', '2018-08-17 22:56:14', null, null, null, null, '江苏南京', null, null, null, null, '0', null);
INSERT INTO `user` VALUES ('8', '的发达省份的', '111', '等等带', '多对多的', '2018-08-17 23:38:00', '2018-08-17 23:38:00', null, null, null, null, '等等带', null, null, null, null, '0', null);
INSERT INTO `user` VALUES ('9', '胡波', '516516', 'bobo', '17761700663', '2018-08-25 16:10:15', '2018-08-25 16:10:15', null, null, null, null, '江苏南京', null, null, null, null, '0', null);
INSERT INTO `user` VALUES ('10', 'dqj', '13550607841', 'dqj2', '18180980541', '2018-08-25 16:56:25', '2018-08-25 16:56:25', null, null, null, null, 'drtd', null, null, null, null, '0', null);
INSERT INTO `user` VALUES ('11', '111', '111', '111', '111', '2018-09-01 15:48:05', '2018-09-01 15:48:05', null, null, null, null, '111', null, null, null, null, '0', null);
INSERT INTO `user` VALUES ('12', '222', '222', '222', '222', '2018-09-01 16:13:08', '2018-09-01 16:13:08', null, null, null, null, '222', null, null, null, null, '0', null);
INSERT INTO `user` VALUES ('13', '333', '333', '333', '333', '2018-09-01 16:42:10', '2018-09-01 16:42:10', null, null, null, null, '333', null, null, null, null, '0', null);
INSERT INTO `user` VALUES ('14', '444', '444', '444', '444', '2018-09-01 16:46:09', '2018-09-01 16:46:09', null, null, null, null, '444', null, null, null, null, '0', null);
INSERT INTO `user` VALUES ('15', '5', '5', '5', '5', '2018-09-01 16:53:50', '2018-09-01 16:53:50', null, null, null, null, '5', null, null, null, null, '0', null);
INSERT INTO `user` VALUES ('16', '8', '8', '8', '8', '2018-09-01 18:38:07', '2018-09-01 18:38:07', null, null, null, null, '8', null, null, null, null, '0', null);
INSERT INTO `user` VALUES ('17', '2', '2', '2', '2', '2018-09-01 19:23:57', '2018-09-01 19:23:57', null, null, null, null, '2', null, null, null, null, '0', null);
INSERT INTO `user` VALUES ('18', '10', '1', '1', '1', '2018-09-02 10:26:34', '2018-09-02 10:26:34', null, null, null, null, '1', '516724199505164319', '516516', '10', '胡波', '0', '');
INSERT INTO `user` VALUES ('19', '1', '1', '1', '1', '2018-09-02 15:27:15', '2018-09-02 15:27:15', null, null, null, null, '1', null, null, '10', null, '0', null);
INSERT INTO `user` VALUES ('20', 'bobo1', '516516', 'hubo', '17761700663', '2018-09-02 19:15:18', '2018-09-02 19:15:18', null, null, null, null, '江苏南京', '510724199505164319', '516516', '10', '胡波', '0', '江苏南京');
