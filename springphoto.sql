/*
 Navicat Premium Data Transfer

 Source Server         : demo
 Source Server Type    : MySQL
 Source Server Version : 50730
 Source Host           : localhost:3306
 Source Schema         : springphoto

 Target Server Type    : MySQL
 Target Server Version : 50730
 File Encoding         : 65001

 Date: 23/06/2023 17:03:37
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for admin
-- ----------------------------
DROP TABLE IF EXISTS `admin`;
CREATE TABLE `admin`  (
  `id` int(11) NOT NULL,
  `admin` varchar(255) CHARACTER SET latin1 COLLATE latin1_swedish_ci NULL DEFAULT NULL,
  `password` varchar(255) CHARACTER SET latin1 COLLATE latin1_swedish_ci NULL DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = latin1 COLLATE = latin1_swedish_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of admin
-- ----------------------------
INSERT INTO `admin` VALUES (1, 'admin', '123456');

-- ----------------------------
-- Table structure for getphoto
-- ----------------------------
DROP TABLE IF EXISTS `getphoto`;
CREATE TABLE `getphoto`  (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `photoname` varchar(255) CHARACTER SET latin1 COLLATE latin1_swedish_ci NULL DEFAULT NULL,
  `url` varchar(255) CHARACTER SET latin1 COLLATE latin1_swedish_ci NULL DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 55 CHARACTER SET = latin1 COLLATE = latin1_swedish_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of getphoto
-- ----------------------------
INSERT INTO `getphoto` VALUES (47, 'h.jpg', 'http://localhost:8081/images/h.jpg');
INSERT INTO `getphoto` VALUES (49, 'dd.jpg', 'http://localhost:8081/images/dd.jpg');

-- ----------------------------
-- Table structure for setphoto
-- ----------------------------
DROP TABLE IF EXISTS `setphoto`;
CREATE TABLE `setphoto`  (
  `id` int(11) NOT NULL,
  `photoname` varchar(255) CHARACTER SET latin1 COLLATE latin1_swedish_ci NULL DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = latin1 COLLATE = latin1_swedish_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of setphoto
-- ----------------------------
INSERT INTO `setphoto` VALUES (1, 'w.jpg');

-- ----------------------------
-- Table structure for upphoto
-- ----------------------------
DROP TABLE IF EXISTS `upphoto`;
CREATE TABLE `upphoto`  (
  `id` int(11) NOT NULL,
  `photoadress` varchar(255) CHARACTER SET latin1 COLLATE latin1_swedish_ci NULL DEFAULT NULL,
  `photoname` varchar(255) CHARACTER SET latin1 COLLATE latin1_swedish_ci NULL DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = latin1 COLLATE = latin1_swedish_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of upphoto
-- ----------------------------
INSERT INTO `upphoto` VALUES (1, 'http://localhost:8081/images/w.jpg', 'w');

-- ----------------------------
-- Table structure for user
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user`  (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `username` varchar(255) CHARACTER SET latin1 COLLATE latin1_swedish_ci NULL DEFAULT NULL,
  `password` varchar(255) CHARACTER SET latin1 COLLATE latin1_swedish_ci NULL DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 10 CHARACTER SET = latin1 COLLATE = latin1_swedish_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of user
-- ----------------------------
INSERT INTO `user` VALUES (1, 'a', '123456');
INSERT INTO `user` VALUES (2, 'b', '123');
INSERT INTO `user` VALUES (3, 'c', '123');
INSERT INTO `user` VALUES (4, 'a', '123');
INSERT INTO `user` VALUES (5, 'aaaa', '123');
INSERT INTO `user` VALUES (6, 'bcbc', '123');
INSERT INTO `user` VALUES (7, 'kkda', '123');
INSERT INTO `user` VALUES (8, 'QWE', '123');
INSERT INTO `user` VALUES (9, 'ccc', '123');

SET FOREIGN_KEY_CHECKS = 1;
