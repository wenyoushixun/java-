/*
 Navicat Premium Data Transfer

 Source Server         : localhost
 Source Server Type    : MySQL
 Source Server Version : 50719
 Source Host           : localhost:3306
 Source Schema         : cims

 Target Server Type    : MySQL
 Target Server Version : 50719
 File Encoding         : 65001

 Date: 22/01/2018 14:07:29
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for admin
-- ----------------------------
DROP TABLE IF EXISTS `admin`;
CREATE TABLE `admin` (
  `admin_id` int(11) NOT NULL AUTO_INCREMENT,
  `admin_name` varchar(50) DEFAULT NULL,
  `pwd` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`admin_id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of admin
-- ----------------------------
BEGIN;
INSERT INTO `admin` VALUES (2, 'admin', '1234');
COMMIT;

-- ----------------------------
-- Table structure for checkin
-- ----------------------------
DROP TABLE IF EXISTS `checkin`;
CREATE TABLE `checkin` (
  `checkin_id` int(11) NOT NULL AUTO_INCREMENT,
  `checkdate` date DEFAULT NULL,
  `student` int(11) DEFAULT NULL,
  `type` int(1) DEFAULT NULL,
  PRIMARY KEY (`checkin_id`),
  KEY `student` (`student`),
  CONSTRAINT `checkin_ibfk_1` FOREIGN KEY (`student`) REFERENCES `student` (`student_id`) ON DELETE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=12 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of checkin
-- ----------------------------
BEGIN;
INSERT INTO `checkin` VALUES (1, '2013-05-14', 2, 1);
INSERT INTO `checkin` VALUES (2, '2013-05-21', 1, 0);
INSERT INTO `checkin` VALUES (3, '2013-05-21', 4, 3);
INSERT INTO `checkin` VALUES (4, '2013-05-30', 1, 1);
INSERT INTO `checkin` VALUES (5, '2013-05-30', 1, 0);
INSERT INTO `checkin` VALUES (6, '2013-05-30', 2, 0);
INSERT INTO `checkin` VALUES (7, '2013-05-29', 1, 0);
INSERT INTO `checkin` VALUES (8, '2013-05-29', 2, 1);
INSERT INTO `checkin` VALUES (9, '2013-05-29', 4, 3);
INSERT INTO `checkin` VALUES (10, '2013-05-29', 5, 0);
INSERT INTO `checkin` VALUES (11, '2013-05-29', 6, 0);
COMMIT;

-- ----------------------------
-- Table structure for fund
-- ----------------------------
DROP TABLE IF EXISTS `fund`;
CREATE TABLE `fund` (
  `fund_id` int(11) NOT NULL AUTO_INCREMENT,
  `type` int(1) DEFAULT NULL,
  `count` double DEFAULT NULL,
  `describ` varchar(255) DEFAULT NULL,
  `occur_date` date DEFAULT NULL,
  `balance` double DEFAULT NULL,
  PRIMARY KEY (`fund_id`)
) ENGINE=InnoDB AUTO_INCREMENT=15 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of fund
-- ----------------------------
BEGIN;
INSERT INTO `fund` VALUES (1, 1, 920, '新学期，共收班费900圆整', '2013-02-28', NULL);
INSERT INTO `fund` VALUES (2, -1, 79.6, '主题班会，购买气球与零食', '2013-03-15', 820.4);
INSERT INTO `fund` VALUES (3, -1, 19.5, '复印班级文件', '2013-03-22', 800.9);
INSERT INTO `fund` VALUES (7, 1, 500, '学院发放补助', '2013-05-10', 974.9000000000001);
INSERT INTO `fund` VALUES (11, 1, 250, '爱心义卖', '2013-04-30', NULL);
INSERT INTO `fund` VALUES (12, -1, 270, '班级聚餐', '2013-05-01', NULL);
INSERT INTO `fund` VALUES (14, -1, 100, '篮球赛买饮料', '2013-05-09', NULL);
COMMIT;

-- ----------------------------
-- Table structure for notice
-- ----------------------------
DROP TABLE IF EXISTS `notice`;
CREATE TABLE `notice` (
  `notice_id` int(11) NOT NULL AUTO_INCREMENT,
  `title` varchar(255) DEFAULT NULL,
  `content` text,
  `publish_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  `publisher` int(11) DEFAULT NULL,
  `publisher_role` int(1) DEFAULT NULL,
  `publisher_name` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`notice_id`)
) ENGINE=InnoDB AUTO_INCREMENT=12 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of notice
-- ----------------------------
BEGIN;
INSERT INTO `notice` VALUES (1, '调课通知', '6月3日上午的《管理学原理》课，因任课老师有事，调到周五下午2点钟教学楼409上，请相互告知。', '2013-05-29 10:27:47', 2, 0, '管理员');
INSERT INTO `notice` VALUES (3, '献血活动通知', '6月2日（星期日），校红十字爱心协会将组织献血活动，地点：教学楼底。有意献血的同学请前往参加。', '2013-05-29 11:53:32', 2, 0, '管理员');
INSERT INTO `notice` VALUES (9, '端午假期拼车', '端午假期间，本人将租一辆本田飞度，前往大雁山，求有兴趣的同学一起拼车，租车费、油费按六四成摊分', '2013-05-29 13:02:02', 2, 2, '刘意');
INSERT INTO `notice` VALUES (10, '下周三进行体能测试', '下周三下午3点开始，请全体同学到体育馆参加体能测试，若不参加将会影响体艺学分，请相互通知！', '2013-05-29 13:07:24', 4, 2, '卢阿文');
INSERT INTO `notice` VALUES (11, '补考通知2', '高数与英语需要补考的同学，本周五之前到教务处找黄老师交纳补考费用，考试时间另行通知！', '2013-05-29 16:16:26', 5, 2, '张嘉影');
COMMIT;

-- ----------------------------
-- Table structure for options
-- ----------------------------
DROP TABLE IF EXISTS `options`;
CREATE TABLE `options` (
  `option_id` int(11) NOT NULL AUTO_INCREMENT,
  `no` int(11) DEFAULT NULL,
  `content` varchar(255) DEFAULT NULL,
  `question` int(11) DEFAULT NULL,
  PRIMARY KEY (`option_id`),
  KEY `question` (`question`),
  CONSTRAINT `options_ibfk_1` FOREIGN KEY (`question`) REFERENCES `question` (`question_id`) ON DELETE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=35 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of options
-- ----------------------------
BEGIN;
INSERT INTO `options` VALUES (14, 1, '自己开车', 11);
INSERT INTO `options` VALUES (15, 6, '自行车', 11);
INSERT INTO `options` VALUES (16, 2, '公交+地铁', 11);
INSERT INTO `options` VALUES (17, 3, '公交', 11);
INSERT INTO `options` VALUES (18, 4, '地铁', 11);
INSERT INTO `options` VALUES (19, 5, '步行', 11);
INSERT INTO `options` VALUES (20, 1, '7:30', 12);
INSERT INTO `options` VALUES (21, 2, '7:00', 12);
INSERT INTO `options` VALUES (22, 3, '8:30', 12);
INSERT INTO `options` VALUES (23, 2, '8:00', 12);
INSERT INTO `options` VALUES (24, 3, '超过半年一次', 13);
INSERT INTO `options` VALUES (25, 0, '每周', 13);
INSERT INTO `options` VALUES (26, 2, '半年一次', 13);
INSERT INTO `options` VALUES (27, 1, '一个月一次', 13);
INSERT INTO `options` VALUES (28, 1, '没有', 14);
INSERT INTO `options` VALUES (29, 2, '让别人帮忙网购过', 14);
INSERT INTO `options` VALUES (30, 0, '有', 14);
INSERT INTO `options` VALUES (31, 3, '无所谓，哪个都行', 15);
INSERT INTO `options` VALUES (32, 0, '莲花山森林公园骑单车', 15);
INSERT INTO `options` VALUES (33, 2, '钟村山庄农家乐', 15);
INSERT INTO `options` VALUES (34, 1, '万亩果园烧烤', 15);
COMMIT;

-- ----------------------------
-- Table structure for question
-- ----------------------------
DROP TABLE IF EXISTS `question`;
CREATE TABLE `question` (
  `question_id` int(11) NOT NULL AUTO_INCREMENT,
  `content` varchar(255) DEFAULT NULL,
  `vote` int(11) DEFAULT NULL,
  PRIMARY KEY (`question_id`),
  KEY `vote` (`vote`),
  CONSTRAINT `question_ibfk_1` FOREIGN KEY (`vote`) REFERENCES `vote` (`vote_id`) ON DELETE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=16 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of question
-- ----------------------------
BEGIN;
INSERT INTO `question` VALUES (11, '你的交通工具是？', 7);
INSERT INTO `question` VALUES (12, '你一般几点出门上班', 7);
INSERT INTO `question` VALUES (13, '你一般多久网购一次', 8);
INSERT INTO `question` VALUES (14, '你有网购的经历吗', 8);
INSERT INTO `question` VALUES (15, '你觉得哪个活动方案好？', 9);
COMMIT;

-- ----------------------------
-- Table structure for score
-- ----------------------------
DROP TABLE IF EXISTS `score`;
CREATE TABLE `score` (
  `score_id` int(11) NOT NULL AUTO_INCREMENT,
  `score_name` varchar(50) DEFAULT NULL,
  `score` int(3) DEFAULT NULL,
  `credit` int(2) DEFAULT NULL,
  `teacher` varchar(25) DEFAULT NULL,
  `student` int(11) DEFAULT NULL,
  PRIMARY KEY (`score_id`),
  KEY `student` (`student`),
  CONSTRAINT `score_ibfk_1` FOREIGN KEY (`student`) REFERENCES `student` (`student_id`) ON DELETE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of score
-- ----------------------------
BEGIN;
INSERT INTO `score` VALUES (1, '信管管理与信息系统概论', 83, 3, '成波', 2);
INSERT INTO `score` VALUES (2, '信管管理与信息系统概论', 77, 3, '成波', 1);
INSERT INTO `score` VALUES (4, '高等数学', 49, 5, '郭富城', 4);
COMMIT;

-- ----------------------------
-- Table structure for sharefile
-- ----------------------------
DROP TABLE IF EXISTS `sharefile`;
CREATE TABLE `sharefile` (
  `file_id` int(11) NOT NULL AUTO_INCREMENT,
  `file_name` varchar(255) DEFAULT NULL,
  `title` varchar(255) DEFAULT NULL,
  `describ` text,
  `student` int(11) DEFAULT NULL,
  `publish_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  PRIMARY KEY (`file_id`),
  KEY `student` (`student`),
  CONSTRAINT `sharefile_ibfk_1` FOREIGN KEY (`student`) REFERENCES `student` (`student_id`) ON DELETE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of sharefile
-- ----------------------------
BEGIN;
INSERT INTO `sharefile` VALUES (3, '441765_毕业设计要求说明书.doc', '毕业设计需求', '说明书', NULL, '2013-05-29 14:54:01');
INSERT INTO `sharefile` VALUES (4, '846093_需求分析.txt.bak', '需求文档备份', '备份', NULL, '2013-05-29 15:00:46');
INSERT INTO `sharefile` VALUES (5, '928812_数据表.xls', '数据表', '分析表', NULL, '2013-05-29 15:02:08');
INSERT INTO `sharefile` VALUES (6, '909328_JAVA_1339班级内部事务管理系统.zip', '学委的论文2', '可以参考可以参考可以参考可以参考', 5, '2013-05-29 15:16:50');
COMMIT;

-- ----------------------------
-- Table structure for student
-- ----------------------------
DROP TABLE IF EXISTS `student`;
CREATE TABLE `student` (
  `student_id` int(11) NOT NULL AUTO_INCREMENT,
  `student_no` varchar(25) DEFAULT NULL,
  `real_name` varchar(25) DEFAULT NULL,
  `pwd` varchar(25) DEFAULT NULL,
  `genger` char(2) DEFAULT NULL,
  `age` int(3) DEFAULT NULL,
  `role` int(2) DEFAULT NULL,
  PRIMARY KEY (`student_id`)
) ENGINE=InnoDB AUTO_INCREMENT=9 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of student
-- ----------------------------
BEGIN;
INSERT INTO `student` VALUES (1, '201010334301', '张小丫', '1234', 'F', 22, 0);
INSERT INTO `student` VALUES (2, '201010334302', '刘意', '1234', 'F', 21, 0);
INSERT INTO `student` VALUES (4, '201010334304', '卢阿文', '1234', 'F', 23, 1);
INSERT INTO `student` VALUES (5, '201010334305', '张嘉影', '1234', 'F', 20, 2);
INSERT INTO `student` VALUES (6, '201010334306', '罗大辉', 'abcd', 'M', 20, 0);
INSERT INTO `student` VALUES (7, '201010334318', '刘坤', '1234', 'M', 21, 0);
INSERT INTO `student` VALUES (8, '201010334310', '黄晶晶', '1234', 'F', 21, 3);
COMMIT;

-- ----------------------------
-- Table structure for teacher
-- ----------------------------
DROP TABLE IF EXISTS `teacher`;
CREATE TABLE `teacher` (
  `teacher_id` int(11) NOT NULL AUTO_INCREMENT,
  `teacher_no` varchar(25) DEFAULT NULL,
  `real_name` varchar(50) DEFAULT NULL,
  `pwd` varchar(50) DEFAULT NULL,
  `genger` char(2) DEFAULT NULL,
  `age` int(3) DEFAULT NULL,
  PRIMARY KEY (`teacher_id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of teacher
-- ----------------------------
BEGIN;
INSERT INTO `teacher` VALUES (1, '1001', '王俊红', '1234', 'F', 34);
COMMIT;

-- ----------------------------
-- Table structure for vote
-- ----------------------------
DROP TABLE IF EXISTS `vote`;
CREATE TABLE `vote` (
  `vote_id` int(11) NOT NULL AUTO_INCREMENT,
  `title` varchar(255) DEFAULT NULL,
  `describ` text,
  `student` int(11) DEFAULT NULL,
  `publish_date` date DEFAULT NULL,
  `end_date` date DEFAULT NULL,
  PRIMARY KEY (`vote_id`),
  KEY `student` (`student`),
  CONSTRAINT `vote_ibfk_1` FOREIGN KEY (`student`) REFERENCES `student` (`student_id`) ON DELETE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=10 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of vote
-- ----------------------------
BEGIN;
INSERT INTO `vote` VALUES (7, '程序员生活状况调查', '苦逼的程序员', 2, '2013-05-28', '2013-06-20');
INSERT INTO `vote` VALUES (8, '大学生网购消费调查', '社会实践：大学生网购消费调查', 1, '2013-05-30', '2013-06-10');
INSERT INTO `vote` VALUES (9, '关于本周末班级活动内容的投票', '下周末我们班将举行集体活动，目前有多个方案，决定通过投票来选择，请大家认真对待。', 2, '2013-05-30', '2013-06-07');
COMMIT;

-- ----------------------------
-- Table structure for voting
-- ----------------------------
DROP TABLE IF EXISTS `voting`;
CREATE TABLE `voting` (
  `voting_id` int(11) NOT NULL AUTO_INCREMENT,
  `opt` int(11) DEFAULT NULL,
  `student` int(11) DEFAULT NULL,
  `question` int(11) DEFAULT NULL,
  PRIMARY KEY (`voting_id`),
  KEY `opt` (`opt`),
  KEY `student` (`student`),
  KEY `question` (`question`),
  CONSTRAINT `voting_ibfk_1` FOREIGN KEY (`opt`) REFERENCES `options` (`option_id`) ON DELETE CASCADE,
  CONSTRAINT `voting_ibfk_2` FOREIGN KEY (`student`) REFERENCES `student` (`student_id`) ON DELETE CASCADE,
  CONSTRAINT `voting_ibfk_4` FOREIGN KEY (`question`) REFERENCES `question` (`question_id`) ON DELETE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=20 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of voting
-- ----------------------------
BEGIN;
INSERT INTO `voting` VALUES (1, 16, 5, 11);
INSERT INTO `voting` VALUES (2, 21, 5, 12);
INSERT INTO `voting` VALUES (3, 23, 4, 12);
INSERT INTO `voting` VALUES (4, 15, 4, 11);
INSERT INTO `voting` VALUES (5, 19, 7, 11);
INSERT INTO `voting` VALUES (6, 22, 7, 12);
INSERT INTO `voting` VALUES (7, 19, 1, 11);
INSERT INTO `voting` VALUES (8, 22, 1, 12);
INSERT INTO `voting` VALUES (9, 30, 4, 14);
INSERT INTO `voting` VALUES (10, 25, 4, 13);
INSERT INTO `voting` VALUES (11, 25, 2, 13);
INSERT INTO `voting` VALUES (12, 30, 2, 14);
INSERT INTO `voting` VALUES (13, 30, 8, 14);
INSERT INTO `voting` VALUES (14, 27, 8, 13);
INSERT INTO `voting` VALUES (15, 32, 2, 15);
INSERT INTO `voting` VALUES (16, 32, 4, 15);
INSERT INTO `voting` VALUES (17, 34, 5, 15);
INSERT INTO `voting` VALUES (18, 31, 8, 15);
INSERT INTO `voting` VALUES (19, 32, 1, 15);
COMMIT;

SET FOREIGN_KEY_CHECKS = 1;
