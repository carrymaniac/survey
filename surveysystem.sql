/*
 Navicat Premium Data Transfer

 Source Server         : mysql
 Source Server Type    : MySQL
 Source Server Version : 50723
 Source Host           : localhost:3306
 Source Schema         : surveysystem

 Target Server Type    : MySQL
 Target Server Version : 50723
 File Encoding         : 65001

 Date: 24/02/2019 12:54:13
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for tb_admin
-- ----------------------------
DROP TABLE IF EXISTS `tb_admin`;
CREATE TABLE `tb_admin`  (
  `admin_name` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `id` bigint(11) NOT NULL AUTO_INCREMENT,
  `password` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `admin_token` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 2 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of tb_admin
-- ----------------------------
INSERT INTO `tb_admin` VALUES ('admin', 1, '21232f297a57a5a743894a0e4a801fc3', '795ff8f8dbb5ca5141df9fc7c049f64a');

-- ----------------------------
-- Table structure for tb_user
-- ----------------------------
DROP TABLE IF EXISTS `tb_user`;
CREATE TABLE `tb_user`  (
  `user_id` bigint(11) NOT NULL AUTO_INCREMENT,
  `user_name` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `user_q7` varchar(10) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `user_q1` varchar(10) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `user_q2` varchar(10) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `user_q3` varchar(10) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `user_q4` varchar(10) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `user_q5` varchar(10) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `user_q6` varchar(10) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `creat_time` datetime(0) NOT NULL,
  `user_tel` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  PRIMARY KEY (`user_id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 3 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of tb_user
-- ----------------------------
INSERT INTO `tb_user` VALUES (1, '测试数据1', 'B', 'D', 'A', 'C', 'AD', 'A', 'D', '2019-02-21 14:52:23', '15992537886');
INSERT INTO `tb_user` VALUES (2, '测试数据2', 'A', 'D', 'A', 'A', 'A', 'A', 'A', '2019-02-22 12:52:24', '15992537886');

SET FOREIGN_KEY_CHECKS = 1;
