# SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for user
-- ----------------------------
# DROP TABLE IF EXISTS `user`;
# CREATE TABLE `user` (
#   `id` bigint(20) NOT NULL AUTO_INCREMENT,
#   `job_number` varchar(32) NOT NULL,
#   `nick_name` varchar(32) NOT NULL,
#   PRIMARY KEY (`id`)
# ) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for tool
-- ----------------------------
DROP TABLE IF EXISTS `tool`;
CREATE TABLE `tool` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `name` varchar(64) DEFAULT NULL,
  `type` varchar(255) DEFAULT NULL,
  `developer` varchar(64) DEFAULT NULL,
  `description` varchar(255) DEFAULT NULL,
  `download_num` int(5) DEFAULT NULL,
  `love_num` int(5) DEFAULT NULL,
  `upload_date` datetime DEFAULT NULL,
  `link` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8;
