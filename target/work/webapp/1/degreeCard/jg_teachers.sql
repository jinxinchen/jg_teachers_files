/*
Navicat MySQL Data Transfer

Source Server         : zhouliang
Source Server Version : 50719
Source Host           : localhost:3306
Source Database       : jg_teachers

Target Server Type    : MYSQL
Target Server Version : 50719
File Encoding         : 65001

Date: 2017-11-22 15:54:22
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for `t_ability_project`
-- ----------------------------
DROP TABLE IF EXISTS `t_ability_project`;
CREATE TABLE `t_ability_project` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `prize_details` varchar(255) DEFAULT NULL,
  `prize_evidence_src` varchar(255) DEFAULT NULL,
  `status` int(1) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_ability_project
-- ----------------------------

-- ----------------------------
-- Table structure for `t_abroads`
-- ----------------------------
DROP TABLE IF EXISTS `t_abroads`;
CREATE TABLE `t_abroads` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `user_id` int(11) DEFAULT NULL,
  `country` varchar(255) DEFAULT NULL,
  `college` varchar(255) DEFAULT NULL,
  `details` varchar(255) DEFAULT NULL,
  `abroad_evidence_src` varchar(255) DEFAULT NULL,
  `status` int(1) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_abroads
-- ----------------------------

-- ----------------------------
-- Table structure for `t_article`
-- ----------------------------
DROP TABLE IF EXISTS `t_article`;
CREATE TABLE `t_article` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `user_id` int(11) DEFAULT NULL,
  `article_name` varchar(255) DEFAULT NULL COMMENT '论文名字',
  `level` int(11) DEFAULT NULL COMMENT '论文第几作者，1为第一作者',
  `post_time` datetime DEFAULT NULL COMMENT '发表时间',
  `publication_name` varchar(255) DEFAULT NULL COMMENT '刊物名称',
  `publication_level` varchar(255) DEFAULT NULL COMMENT '刊物级别',
  `is_call` int(1) DEFAULT NULL COMMENT '是否通讯作者',
  `article_src` varchar(255) DEFAULT NULL COMMENT '附件上传src',
  `article_level` varchar(255) DEFAULT NULL COMMENT '排名',
  `status` int(1) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_article
-- ----------------------------

-- ----------------------------
-- Table structure for `t_educate_degree`
-- ----------------------------
DROP TABLE IF EXISTS `t_educate_degree`;
CREATE TABLE `t_educate_degree` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `user_id` int(11) DEFAULT NULL,
  `educate_degree_name` varchar(255) DEFAULT NULL COMMENT '职称名',
  `educate_degree_time` datetime DEFAULT NULL COMMENT '职称获得时间',
  `educate_degree_src` varchar(255) DEFAULT NULL COMMENT '职称资格上传路径',
  `educate_time` datetime DEFAULT NULL COMMENT '入职时间',
  `is_mentor` int(1) DEFAULT NULL COMMENT '是否具有导师资格',
  `mentor_evidence_src` varchar(255) DEFAULT NULL COMMENT '资格上传',
  `status` int(1) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_educate_degree
-- ----------------------------

-- ----------------------------
-- Table structure for `t_educate_scientific`
-- ----------------------------
DROP TABLE IF EXISTS `t_educate_scientific`;
CREATE TABLE `t_educate_scientific` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `user_id` int(11) DEFAULT NULL,
  `prize_name` varchar(255) DEFAULT NULL COMMENT '获奖名字',
  `educate_scientific_name` varchar(255) DEFAULT NULL COMMENT '科研名字',
  `prize_level` varchar(255) DEFAULT NULL COMMENT '获奖级别',
  `type` varchar(255) DEFAULT NULL COMMENT '获奖类型',
  `prize_time` varchar(255) DEFAULT NULL COMMENT '获奖时间',
  `the_unit` varchar(255) DEFAULT NULL COMMENT '获奖单位',
  `school_name` varchar(255) DEFAULT NULL COMMENT '学校署名',
  `author` varchar(255) DEFAULT NULL,
  `members_list` varchar(255) DEFAULT NULL COMMENT '成员名单，以逗号隔开',
  `others` varchar(255) DEFAULT NULL,
  `evidence_path` varchar(255) DEFAULT NULL,
  `status` varchar(40) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=11 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_educate_scientific
-- ----------------------------
INSERT INTO `t_educate_scientific` VALUES ('1', '1', '国家级奖学金', 'aa', '国家级', '奖学金', '2015-10-02', '教育部', '华侨大学', '小王', 'wu', '11', null, '通过');
INSERT INTO `t_educate_scientific` VALUES ('2', '2', '国家级奖学金', 'bb', '国家级', '奖学金', '2015-10-02 ', '教育部', '华侨大学', '小明', 'wu', '22', null, '通过');
INSERT INTO `t_educate_scientific` VALUES ('3', '3', '校级奖学金', 'cc', '校级', '奖学金', '2015-10-03', '华侨大学', '清华大学', '小刚', 'wu', '33', null, '未通过');
INSERT INTO `t_educate_scientific` VALUES ('4', '1', '院级奖学金', 'dd', '院级', '奖学金', '2015-10-04', '计算机学院', '华侨大学', '小红', 'wu', '44', null, '已通过');
INSERT INTO `t_educate_scientific` VALUES ('10', '1', '校级奖学金', 'ee', '校级', '奖学金', '2016-10-07', '华侨大学', '北京大学', '小天', '无', '55', null, '未通过');

-- ----------------------------
-- Table structure for `t_education_experience`
-- ----------------------------
DROP TABLE IF EXISTS `t_education_experience`;
CREATE TABLE `t_education_experience` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `school` varchar(255) DEFAULT NULL,
  `major` varchar(255) DEFAULT NULL COMMENT '专业',
  `education` varchar(255) DEFAULT NULL,
  `graduationYear` varchar(255) DEFAULT NULL,
  `user_id` int(1) DEFAULT NULL,
  `status` int(1) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_education_experience
-- ----------------------------

-- ----------------------------
-- Table structure for `t_functions`
-- ----------------------------
DROP TABLE IF EXISTS `t_functions`;
CREATE TABLE `t_functions` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `module_id` int(11) NOT NULL COMMENT '关联模块id',
  `name` varchar(255) DEFAULT NULL COMMENT '功能名称',
  `url` varchar(255) DEFAULT NULL COMMENT '功能对应页面',
  `status` int(1) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_functions
-- ----------------------------

-- ----------------------------
-- Table structure for `t_graduate_school`
-- ----------------------------
DROP TABLE IF EXISTS `t_graduate_school`;
CREATE TABLE `t_graduate_school` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `user_id` int(11) DEFAULT NULL,
  `school_major` varchar(255) DEFAULT NULL COMMENT '专业',
  `graduate_card_src` varchar(255) DEFAULT NULL COMMENT '毕业证',
  `degree_card_src` varchar(255) DEFAULT NULL COMMENT '学位证',
  `status` int(1) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_graduate_school
-- ----------------------------

-- ----------------------------
-- Table structure for `t_modules`
-- ----------------------------
DROP TABLE IF EXISTS `t_modules`;
CREATE TABLE `t_modules` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `code` int(11) DEFAULT NULL,
  `name` varchar(255) DEFAULT NULL,
  `father_id` int(11) DEFAULT NULL,
  `level` int(11) DEFAULT NULL,
  `sequence` int(11) DEFAULT NULL,
  `is_default` int(1) DEFAULT NULL,
  `url` varchar(255) DEFAULT NULL,
  `status` int(1) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_modules
-- ----------------------------
INSERT INTO `t_modules` VALUES ('1', '1', '基本信息', null, '1', '1', '0', 'teachers/baseInfo.html', '1');
INSERT INTO `t_modules` VALUES ('2', '2', '出国记录', null, '1', '1', '0', 'teachers/abroad.html', '1');
INSERT INTO `t_modules` VALUES ('3', '3', '交流与培训', null, '1', '1', '0', 'teachers/communicationAndTraining.html', '1');

-- ----------------------------
-- Table structure for `t_more_language`
-- ----------------------------
DROP TABLE IF EXISTS `t_more_language`;
CREATE TABLE `t_more_language` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `user_id` int(11) DEFAULT NULL,
  `languages` varchar(255) DEFAULT NULL,
  `get_time` datetime DEFAULT NULL,
  `language_evidence_src` varchar(255) DEFAULT NULL,
  `status` int(1) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_more_language
-- ----------------------------

-- ----------------------------
-- Table structure for `t_roles`
-- ----------------------------
DROP TABLE IF EXISTS `t_roles`;
CREATE TABLE `t_roles` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `role` varchar(255) NOT NULL COMMENT '角色名字',
  `is_default` int(1) DEFAULT NULL,
  `status` int(1) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_roles
-- ----------------------------
INSERT INTO `t_roles` VALUES ('1', '专任老师', '0', '1');
INSERT INTO `t_roles` VALUES ('2', '党政人员', '0', '1');
INSERT INTO `t_roles` VALUES ('3', '辅导员', '0', '1');
INSERT INTO `t_roles` VALUES ('4', '实验员', '0', '1');
INSERT INTO `t_roles` VALUES ('5', '管理员', '0', '1');

-- ----------------------------
-- Table structure for `t_role_functions`
-- ----------------------------
DROP TABLE IF EXISTS `t_role_functions`;
CREATE TABLE `t_role_functions` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `function_id` int(11) DEFAULT NULL,
  `role_id` int(11) DEFAULT NULL,
  `status` int(1) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_role_functions
-- ----------------------------

-- ----------------------------
-- Table structure for `t_role_modules`
-- ----------------------------
DROP TABLE IF EXISTS `t_role_modules`;
CREATE TABLE `t_role_modules` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `module_id` int(11) DEFAULT NULL,
  `role_id` int(11) DEFAULT NULL,
  `status` int(1) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `module_id` (`module_id`),
  KEY `role_id` (`role_id`),
  CONSTRAINT `t_role_modules_ibfk_1` FOREIGN KEY (`module_id`) REFERENCES `t_modules` (`id`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `t_role_modules_ibfk_2` FOREIGN KEY (`role_id`) REFERENCES `t_roles` (`id`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_role_modules
-- ----------------------------
INSERT INTO `t_role_modules` VALUES ('1', '1', '1', '1');
INSERT INTO `t_role_modules` VALUES ('2', '2', '1', '1');

-- ----------------------------
-- Table structure for `t_scientific`
-- ----------------------------
DROP TABLE IF EXISTS `t_scientific`;
CREATE TABLE `t_scientific` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `user_id` int(11) DEFAULT NULL,
  `scientific_id` int(11) DEFAULT NULL COMMENT '项目编号',
  `scientific_name` varchar(255) DEFAULT NULL COMMENT '项目名字',
  `scientific_source` varchar(255) DEFAULT NULL COMMENT '项目来源',
  `level` int(11) DEFAULT NULL COMMENT '项目第几负责人，1为负责人',
  `create_time` varchar(255) DEFAULT NULL COMMENT '立项时间',
  `end_time` varchar(255) DEFAULT NULL COMMENT '结项时间',
  `grants` int(11) DEFAULT NULL COMMENT '资助经费',
  `is_complete` int(1) DEFAULT NULL COMMENT '是否到账',
  `create_scientific_evidence_src` varchar(255) DEFAULT NULL COMMENT '立项书上传',
  `end_scientific_evidence_src` varchar(255) DEFAULT NULL COMMENT '结项书上传',
  `scientific_prize_src` varchar(255) DEFAULT NULL COMMENT '获奖证书上传',
  `others` varchar(255) DEFAULT NULL,
  `status` varchar(40) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_scientific
-- ----------------------------
INSERT INTO `t_scientific` VALUES ('1', '1', '1', '教师管理', '经济管理学院', '1', '2017-11-01 16:33:24', '2017-11-30 16:33:29', '100000', '0', null, null, null, null, null);
INSERT INTO `t_scientific` VALUES ('2', '2', '1', '教师管理', '经济管理学院', '2', '2017-11-01 16:33:24', '2017-11-30 16:33:29', '100000', '0', null, null, null, null, null);
INSERT INTO `t_scientific` VALUES ('4', null, '2222', '1', '1', '1', '2001-01-01', '2001-01-01', '1', '1', '11', '22', '33', '1', '未审核');

-- ----------------------------
-- Table structure for `t_student`
-- ----------------------------
DROP TABLE IF EXISTS `t_student`;
CREATE TABLE `t_student` (
  `number` int(11) NOT NULL,
  `class` varchar(15) DEFAULT NULL,
  `student_name` varchar(8) DEFAULT NULL,
  PRIMARY KEY (`number`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_student
-- ----------------------------
INSERT INTO `t_student` VALUES ('1525122001', '15软件工程 2班', '张三');
INSERT INTO `t_student` VALUES ('1525122002', '15软件工程 2班', '小明');
INSERT INTO `t_student` VALUES ('1525122003', '15软件工程 2班', '刘三');
INSERT INTO `t_student` VALUES ('1525122004', '15软件工程 2班', '王五');
INSERT INTO `t_student` VALUES ('1525122046', '15软件工程 2班', '周亮');

-- ----------------------------
-- Table structure for `t_teacher_activity`
-- ----------------------------
DROP TABLE IF EXISTS `t_teacher_activity`;
CREATE TABLE `t_teacher_activity` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `user_id` int(11) DEFAULT NULL,
  `activity_name` varchar(255) DEFAULT NULL,
  `activity_location` varchar(255) DEFAULT NULL,
  `activity_time` varchar(255) DEFAULT NULL,
  `activity_organizers` varchar(255) DEFAULT NULL,
  `others` varchar(255) DEFAULT NULL,
  `status` varchar(40) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `user_id` (`user_id`)
) ENGINE=InnoDB AUTO_INCREMENT=10 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_teacher_activity
-- ----------------------------
INSERT INTO `t_teacher_activity` VALUES ('1', '1', 'bb', 'cc', '2015-10-12', 'dd', 'cc', '通过');
INSERT INTO `t_teacher_activity` VALUES ('2', '1', 'dd', 'ee', '2015-10-24', 'dd', 'ee', '通过');
INSERT INTO `t_teacher_activity` VALUES ('3', '3', '123456', 'cc', '2015-10-12', 'dd', 'cc', '通过');
INSERT INTO `t_teacher_activity` VALUES ('4', '3', 'dd', 'ee', '2015-10-24', 'dd', 'dd', '通过');
INSERT INTO `t_teacher_activity` VALUES ('5', '3', '1', '1', '2015-11-04', '1', '1', '通过');
INSERT INTO `t_teacher_activity` VALUES ('7', '1', '2', '3', '2016-11-01', '4', '5', '通过');
INSERT INTO `t_teacher_activity` VALUES ('8', '1', 'abcd', 'b', '2015-10-04', 'd', 'e', '未通过');
INSERT INTO `t_teacher_activity` VALUES ('9', '1', 'A', 'B', '2015-10-4', 'C', 'D', '通过');

-- ----------------------------
-- Table structure for `t_teacher_baseinfo`
-- ----------------------------
DROP TABLE IF EXISTS `t_teacher_baseinfo`;
CREATE TABLE `t_teacher_baseinfo` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `user_id` int(11) NOT NULL,
  `name` varchar(255) DEFAULT NULL,
  `gender` varchar(255) DEFAULT NULL,
  `birthday` varchar(255) DEFAULT NULL,
  `email` varchar(255) DEFAULT NULL,
  `identityNum` varchar(255) DEFAULT NULL COMMENT '身份证',
  `picture` varchar(255) DEFAULT NULL COMMENT '教师图片src',
  `create_time` datetime DEFAULT NULL COMMENT '创建时间',
  `address` varchar(255) DEFAULT NULL,
  `phoneNum` int(11) DEFAULT NULL COMMENT '手机号',
  `is_car` int(1) DEFAULT NULL COMMENT '是否具有机动车驾驶 1：具有',
  `car_evidence_src` varchar(255) DEFAULT NULL COMMENT '机动车作证上传路径',
  `is_more_langue` int(1) DEFAULT NULL,
  `major` varchar(255) DEFAULT NULL COMMENT '所属系',
  `is_tutor` int(1) DEFAULT NULL COMMENT '是否为班主任',
  `for_class` varchar(255) DEFAULT NULL COMMENT '任职班级',
  `research` varchar(255) DEFAULT NULL COMMENT '研究方向',
  `status` int(1) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_teacher_baseinfo
-- ----------------------------
INSERT INTO `t_teacher_baseinfo` VALUES ('1', '1', '陈金鑫呀', '男', '2017-10-13 00:00:00', null, '331082', 'http://', null, null, '1317825905', '1', 'http://', '1', '软件工程', '1', '2班', 'web', '1');
INSERT INTO `t_teacher_baseinfo` VALUES ('2', '2', '管理员', '男', null, null, null, null, null, null, null, null, null, '1', '软件工程', '1', '2班', null, '1');
INSERT INTO `t_teacher_baseinfo` VALUES ('3', '3', '老师', '女', null, null, null, null, null, null, null, null, null, null, null, null, null, null, null);

-- ----------------------------
-- Table structure for `t_users`
-- ----------------------------
DROP TABLE IF EXISTS `t_users`;
CREATE TABLE `t_users` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `account` varchar(255) NOT NULL,
  `password` varchar(255) NOT NULL,
  `create_time` datetime DEFAULT NULL COMMENT '账号创建时间',
  `last_login_time` datetime DEFAULT NULL COMMENT '上一次登录的时间',
  `status` int(1) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_users
-- ----------------------------
INSERT INTO `t_users` VALUES ('1', 'test', 'test', '2017-10-09 21:15:40', '2017-10-09 21:15:42', '1');
INSERT INTO `t_users` VALUES ('2', 'admin', '1234', '2017-11-12 16:31:36', '2017-11-12 16:31:30', '1');
INSERT INTO `t_users` VALUES ('3', 'teacher', '1234', '2017-11-12 16:36:10', '2017-11-12 16:36:14', '1');

-- ----------------------------
-- Table structure for `t_users_role`
-- ----------------------------
DROP TABLE IF EXISTS `t_users_role`;
CREATE TABLE `t_users_role` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `role_id` int(11) NOT NULL,
  `user_id` int(11) NOT NULL,
  `status` int(1) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `role_id` (`role_id`),
  KEY `user_id` (`user_id`),
  CONSTRAINT `t_users_role_ibfk_1` FOREIGN KEY (`role_id`) REFERENCES `t_roles` (`id`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `t_users_role_ibfk_2` FOREIGN KEY (`user_id`) REFERENCES `t_users` (`id`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_users_role
-- ----------------------------
INSERT INTO `t_users_role` VALUES ('1', '1', '1', '1');
INSERT INTO `t_users_role` VALUES ('2', '5', '1', '1');

-- ----------------------------
-- View structure for `v_student_prize`
-- ----------------------------
DROP VIEW IF EXISTS `v_student_prize`;
CREATE ALGORITHM=UNDEFINED DEFINER=`root`@`localhost` SQL SECURITY DEFINER VIEW `v_student_prize` AS select `t_educate_scientific`.`id` AS `id`,`t_educate_scientific`.`user_id` AS `user_id`,`t_educate_scientific`.`educate_scientific_name` AS `educate_scientific_name`,`t_educate_scientific`.`prize_name` AS `prize_name`,`t_educate_scientific`.`prize_level` AS `prize_level`,`t_educate_scientific`.`prize_time` AS `prize_time`,`t_educate_scientific`.`the_unit` AS `the_unit`,`t_educate_scientific`.`school_name` AS `school_name`,`t_educate_scientific`.`user_name` AS `user_name`,`t_educate_scientific`.`members_list` AS `members_list`,`t_educate_scientific`.`type` AS `type`,`t_educate_scientific`.`status` AS `status`,`t_educate_scientific`.`student_number` AS `student_number`,`t_student`.`number` AS `number`,`t_student`.`class` AS `class`,`t_student`.`student_name` AS `student_name` from (`t_educate_scientific` join `t_student`) where (`t_educate_scientific`.`student_number` = `t_student`.`number`) ;

-- ----------------------------
-- View structure for `v_teachers_activity_check`
-- ----------------------------
DROP VIEW IF EXISTS `v_teachers_activity_check`;
CREATE ALGORITHM=UNDEFINED DEFINER=`root`@`localhost` SQL SECURITY DEFINER VIEW `v_teachers_activity_check` AS select `t_teacher_activity`.`id` AS `id`,`t_teacher_activity`.`user_id` AS `user_id`,`t_teacher_activity`.`activity_name` AS `activity_name`,`t_teacher_activity`.`activity_location` AS `activity_location`,`t_teacher_activity`.`activity_time` AS `activity_time`,`t_teacher_activity`.`activity_organizers` AS `activity_organizers`,`t_teacher_activity`.`others` AS `others`,`t_teacher_activity`.`status` AS `status`,`t_teacher_baseinfo`.`name` AS `teacher_name`,`t_teacher_baseinfo`.`user_id` AS `baseinfo_userid` from (`t_teacher_activity` join `t_teacher_baseinfo`) where (`t_teacher_activity`.`user_id` = `t_teacher_baseinfo`.`user_id`) ;

-- ----------------------------
-- View structure for `v_teachers_prize_check`
-- ----------------------------
DROP VIEW IF EXISTS `v_teachers_prize_check`;
CREATE ALGORITHM=UNDEFINED DEFINER=`root`@`localhost` SQL SECURITY DEFINER VIEW `v_teachers_prize_check` AS select `t_educate_scientific`.`id` AS `id`,`t_educate_scientific`.`user_id` AS `user_id`,`t_educate_scientific`.`prize_name` AS `prize_name`,`t_educate_scientific`.`educate_scientific_name` AS `educate_scientific_name`,`t_educate_scientific`.`prize_level` AS `prize_level`,`t_educate_scientific`.`type` AS `type`,`t_educate_scientific`.`prize_time` AS `prize_time`,`t_educate_scientific`.`the_unit` AS `the_unit`,`t_educate_scientific`.`school_name` AS `school_name`,`t_educate_scientific`.`author` AS `author`,`t_educate_scientific`.`members_list` AS `members_list`,`t_educate_scientific`.`others` AS `others`,`t_educate_scientific`.`evidence_path` AS `evidence_path`,`t_educate_scientific`.`status` AS `status`,`t_teacher_baseinfo`.`name` AS `name` from (`t_educate_scientific` join `t_teacher_baseinfo`) where (`t_educate_scientific`.`user_id` = `t_teacher_baseinfo`.`user_id`) ;

-- ----------------------------
-- View structure for `v_user_modules`
-- ----------------------------
DROP VIEW IF EXISTS `v_user_modules`;
CREATE ALGORITHM=UNDEFINED DEFINER=`root`@`localhost` SQL SECURITY DEFINER VIEW `v_user_modules` AS select `t_users`.`id` AS `user_id`,`t_users_role`.`id` AS `users_role_id`,`t_role_modules`.`id` AS `role_module_id`,`t_users`.`account` AS `user_account`,`t_modules`.`id` AS `module_id`,`t_modules`.`name` AS `module_name`,`t_modules`.`father_id` AS `module_father_id`,`t_modules`.`level` AS `module_level`,`t_modules`.`sequence` AS `module_sequence`,`t_modules`.`is_default` AS `module_is_default`,`t_modules`.`url` AS `module_url`,`t_modules`.`status` AS `module_status` from ((((`t_users` join `t_users_role` on((`t_users_role`.`user_id` = `t_users`.`id`))) join `t_roles` on((`t_users_role`.`role_id` = `t_roles`.`id`))) join `t_role_modules` on((`t_role_modules`.`role_id` = `t_roles`.`id`))) join `t_modules` on((`t_role_modules`.`module_id` = `t_modules`.`id`))) ;
