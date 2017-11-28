/*
SQLyog Ultimate v12.09 (64 bit)
MySQL - 5.7.12-log : Database - hczp
*********************************************************************
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;
CREATE DATABASE /*!32312 IF NOT EXISTS*/`hczp` /*!40100 DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci */;

USE `hczp`;

/*Table structure for table `admin` */

DROP TABLE IF EXISTS `admin`;

CREATE TABLE `admin` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(100) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `password` varchar(100) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `create_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

/*Data for the table `admin` */

insert  into `admin`(`id`,`name`,`password`,`create_time`) values (1,'admin','123456','2017-04-19 16:06:21');

/*Table structure for table `category` */

DROP TABLE IF EXISTS `category`;

CREATE TABLE `category` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `create_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `name` varchar(100) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `p_id` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=18 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

/*Data for the table `category` */

insert  into `category`(`id`,`create_time`,`name`,`p_id`) values (4,'2017-04-18 10:47:04','宝马',0),(5,'2017-04-18 10:47:07','奔驰',0),(6,'2017-04-18 10:47:11','福特',0),(7,'2017-04-18 10:47:21','法拉利',0),(8,'2017-04-18 10:47:25','凯迪拉克',0),(9,'2017-04-24 13:36:50','雷克萨斯',0),(16,'2017-04-18 18:11:28','ds',15),(17,'2017-04-24 13:37:02','大众',0);

/*Table structure for table `comment` */

DROP TABLE IF EXISTS `comment`;

CREATE TABLE `comment` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `create_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `content` varchar(255) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `u_id` int(11) DEFAULT NULL,
  `u_phone` varchar(100) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

/*Data for the table `comment` */

insert  into `comment`(`id`,`create_time`,`content`,`u_id`,`u_phone`) values (4,'2017-04-24 13:41:12','呢故不能简单萨克斯',8,'13247780000');

/*Table structure for table `news` */

DROP TABLE IF EXISTS `news`;

CREATE TABLE `news` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `content` text COLLATE utf8mb4_unicode_ci,
  `title` varchar(255) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `create_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

/*Data for the table `news` */

insert  into `news`(`id`,`content`,`title`,`create_time`) values (1,'<span style=\"font-family:微软雅黑;color:#3e3e3e;\"><span style=\"font-size: 16px; white-space: pre-wrap;\">第三方第三方第三方的佛挡杀佛是</span></span>','婚车资讯','2017-04-24 13:42:17'),(2,'<div class=\"f18\" style=\"padding: 0px; margin: 0px; font-size: 18px; color: rgb(102, 102, 102); font-family: \" microsoft=\"\" yahei=\"\" arial=\"\" widows:=\"\" 1=\"\"><h5 style=\"padding: 0px; margin: 20px 0px 0px;font-size:undefined;\">公园毕业后我发你的搜房莫莫省得麻烦颠倒是非水电费 发送</h5></div>','关于我们','2017-04-24 13:42:30');

/*Table structure for table `orders` */

DROP TABLE IF EXISTS `orders`;

CREATE TABLE `orders` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `create_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `name` varchar(100) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `phone` varchar(100) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `use_time` timestamp NULL DEFAULT '0000-00-00 00:00:00',
  `content` varchar(255) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `p_id` int(11) DEFAULT NULL,
  `u_id` int(11) DEFAULT NULL,
  `p_name` varchar(100) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `status` int(1) DEFAULT NULL COMMENT '0预约中 1预约成功 2预约失败',
  `p_Img` varchar(100) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

/*Data for the table `orders` */

insert  into `orders`(`id`,`create_time`,`name`,`phone`,`use_time`,`content`,`p_id`,`u_id`,`p_name`,`status`,`p_Img`) values (1,'2017-04-19 15:07:56','张三','1571314461','2017-04-19 15:07:39','能不能准时到',1,1,'宝马',99,'upload//1.jpg'),(2,'2017-04-24 10:46:10','213123','21321',NULL,'321321321',1,NULL,'宝马的',2,'upload//1.jpg'),(3,'2017-04-24 10:59:38','21313','213213','2017-04-18 10:59:32','123123',1,NULL,'宝马的',1,'upload//1.jpg'),(4,'2017-04-24 11:02:20','213123','21323','2017-04-11 11:02:15','12321321',1,1,'宝马的',0,'upload//1.jpg'),(5,'2017-04-24 13:32:09','张三','13247780223','2017-04-11 01:31:56','尽快安排',1,8,'宝马的',99,'upload//1.jpg'),(6,'2017-04-24 13:41:36','张三','13247780223','2017-04-19 01:41:20','尽快安排',5,8,'大众CC',1,'upload//1493012320594.jpg');

/*Table structure for table `product` */

DROP TABLE IF EXISTS `product`;

CREATE TABLE `product` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `img` varchar(100) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `name` varchar(100) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `content` text COLLATE utf8mb4_unicode_ci,
  `zuowei` int(2) DEFAULT NULL,
  `amount` int(6) DEFAULT NULL,
  `c_id` int(11) DEFAULT NULL,
  `create_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `cp_id` int(11) DEFAULT NULL,
  `color` varchar(100) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `chepai` varchar(200) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

/*Data for the table `product` */

insert  into `product`(`id`,`img`,`name`,`content`,`zuowei`,`amount`,`c_id`,`create_time`,`cp_id`,`color`,`chepai`) values (1,'upload//1.jpg','宝马的','',5,3000,4,'2017-04-24 13:06:48',0,'黑','赣123131'),(2,'upload//1.jpg','奔驰的','',5,2000,4,'2017-04-24 13:07:24',0,'黑','粤123567'),(4,'upload//1.jpg','213213','<table style=\"padding: 0px; margin: 16px 0px 0px; width: 825px; border-collapse: collapse; font-size: 13px; border: 1px solid rgb(226, 226, 226); color: rgb(85, 85, 85); font-family: \" microsoft=\"\" yahei=\"\" arial=\"\" line-height:=\"\" normal=\"\" widows:=\"\" 1=\"\"><tbody style=\"padding: 0px; margin: 0px;\"><tr style=\"padding: 0px; margin: 0px;\"><td style=\"padding: 10px; margin: 0px; border: 1px solid rgb(226, 226, 226); line-height: 1.8;\">品牌车型： 宾利-飞驰</td><td style=\"padding: 10px; margin: 0px; border: 1px solid rgb(226, 226, 226); line-height: 1.8;\">新 车 价： 520万</td></tr><tr style=\"padding: 0px; margin: 0px;\"><td style=\"padding: 10px; margin: 0px; border: 1px solid rgb(226, 226, 226); line-height: 1.8;\">车 牌 号：&nbsp;<span class=\"plate\" style=\"padding: 0px; margin: 0px; text-transform: uppercase;\">京Q***17</span></td><td style=\"padding: 10px; margin: 0px; border: 1px solid rgb(226, 226, 226); line-height: 1.8;\">车身颜色： 黑</td></tr><tr style=\"padding: 0px; margin: 0px;\"><td style=\"padding: 10px; margin: 0px; border: 1px solid rgb(226, 226, 226); line-height: 1.8;\">车载人数： 4人</td><td style=\"padding: 10px; margin: 0px; border: 1px solid rgb(226, 226, 226); line-height: 1.8;\">新旧程度： 参考上方车辆实拍图</td></tr></tbody></table>',5,1000,4,'2017-04-24 13:07:37',0,'黑','苏231223'),(5,'upload//1493012320594.jpg','大众CC','大众简介啊',5,213,17,'2017-04-24 13:38:40',0,'黑色','赣123131');

/*Table structure for table `user` */

DROP TABLE IF EXISTS `user`;

CREATE TABLE `user` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `phone` varchar(100) DEFAULT NULL COMMENT '用户名',
  `password` varchar(100) DEFAULT NULL COMMENT '密码',
  `name` varchar(100) DEFAULT NULL COMMENT '姓名',
  `create_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  PRIMARY KEY (`id`),
  UNIQUE KEY `phone` (`phone`)
) ENGINE=InnoDB AUTO_INCREMENT=9 DEFAULT CHARSET=utf8;

/*Data for the table `user` */

insert  into `user`(`id`,`phone`,`password`,`name`,`create_time`) values (8,'13247780000','000000','张三','2017-04-24 13:22:33');

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
