DROP TABLE IF EXISTS `userdemo`;
CREATE TABLE `userdemo` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `username` varchar(20) DEFAULT NULL,
  `passwd` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=latin1;

-- ----------------------------
-- Records of userdemo
-- ----------------------------
INSERT INTO `userdemo` VALUES ('1', 'shenchen', 'abc');
INSERT INTO `userdemo` VALUES ('2', 'shenlei', 'def');
