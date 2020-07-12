/*
Navicat MySQL Data Transfer

Source Server         : localhost
Source Server Version : 50720
Source Host           : localhost:3306
Source Database       : book

Target Server Type    : MYSQL
Target Server Version : 50720
File Encoding         : 65001

Date: 2020-06-30 18:53:17
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for book
-- ----------------------------
DROP TABLE IF EXISTS `book`;
CREATE TABLE `book` (
  `bid` int(10) NOT NULL,
  `bname` varchar(50) DEFAULT NULL,
  `cid` int(1) DEFAULT NULL,
  `bimg` varchar(200) DEFAULT NULL,
  `writer` varchar(32) DEFAULT NULL,
  `publishing` varchar(32) DEFAULT NULL,
  `currentnumber` int(1) DEFAULT NULL,
  `description` varchar(200) DEFAULT NULL,
  PRIMARY KEY (`bid`),
  KEY `book_category` (`cid`),
  CONSTRAINT `book_category` FOREIGN KEY (`cid`) REFERENCES `category` (`cid`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of book
-- ----------------------------
INSERT INTO `book` VALUES ('1', '墨菲定律', '1', '../imgs/001.jpg', '宋犀壁', '北京出版社', '2', '解读心理密秘，拓展自我认知，不可不知的心理学效应和生存定律');
INSERT INTO `book` VALUES ('2', '边城', '1', '../imgs/002.jpg', '沈从文', '北京出版社', '3', '一本值得多读几遍的中国著作');
INSERT INTO `book` VALUES ('3', '追风筝的人', '1', '../imgs/003.jpg', '胡赛尼', '美国出版社', '2', '一本外国小说，值得拥有');
INSERT INTO `book` VALUES ('4', '活着', '1', '../imgs/004.jpg', '余华', '作家出版社', '2', '本书荣获意大利格林扎纳~卡佛文学奖');
INSERT INTO `book` VALUES ('5', '高情商聊天术', '1', '../imgs/005.jpg', '郑剑鑫', '广东出版社', '2', '郑剑鑫出品，必属精品，学习如何避免尬聊');
INSERT INTO `book` VALUES ('6', '城南旧事', '1', '../imgs/006.jpg', '林海音', '作家出版社', '1', '林海音具影响力的经典之作，入选亚洲周刊');
INSERT INTO `book` VALUES ('7', '所有的努力只为遇见更好的自己', '1', '../imgs/007.jpg', '木槿', '台湾出版社', '1', '更好的自己意味着足够强大和淡定');
INSERT INTO `book` VALUES ('8', '没伞的孩子，必须努力奔跑', '1', '../imgs/008.jpg', '张敏', '作家出版社', '2', '每天叫醒你的不是闹钟，而是梦想');
INSERT INTO `book` VALUES ('9', '舍与得', '1', '../imgs/009.jpg', '赵旭永', '新华出版社', '2', '智慧人生，品味舍得，舍是一种智慧，得是一种勇气');
INSERT INTO `book` VALUES ('10', '人际关系心理学', '1', '../imgs/010.jpg', '郭婷', '作家出版社', '1', '你还在为自己的人际关系发愁吗？快来提高自己的人际交流方式');
INSERT INTO `book` VALUES ('11', '感谢自己的不完美', '1', '../imgs/011.jpg', '武志红', '中国华侨出版社', '2', '一切的不完美，你可以坦然面对');
INSERT INTO `book` VALUES ('12', '人间失格', '1', '../imgs/012.jpg', '太宰治', '日本出版社', '3', '胆小鬼连幸福都会害怕，碰到棉花都会受伤');
INSERT INTO `book` VALUES ('13', '自卑与超越', '1', '../imgs/013.jpg', '彭梓祥', '中国人民出版社', '1', '彭梓祥出品，必属精品，学习如何克服自卑');
INSERT INTO `book` VALUES ('14', '人性的弱点', '1', '../imgs/014.jpg', '卡耐基', '美国出版社', '1', '38篇手稿真实还原，1937年第一版');
INSERT INTO `book` VALUES ('15', '月亮与六便士', '1', '../imgs/015.jpg', '毛姆', '英国出版社', '2', '潦倒与伟大，卑微与善良，仇恨与热爱可以毫不排斥的共享于一颗心中');
INSERT INTO `book` VALUES ('16', '新手学电脑从入门到精通', '2', '../imgs/016.jpg', '李靖', '广东出版社', '2', '一步到位，一目了然，一网打尽，适合新手的书籍');
INSERT INTO `book` VALUES ('17', 'word，ppt,excel从入门到精通', '2', '../imgs/017.jpg', '郑鑫涛', '广东出版社', '3', '一本书帮你搞定ppt，word，excel三大神器');
INSERT INTO `book` VALUES ('18', 'javaweb从入门到精通', '2', '../imgs/018.jpg', '叶问', '清华大学出版社', '1', '循序渐进，基础知识，核心技术，高级应用，项目实战应有尽有');
INSERT INTO `book` VALUES ('19', 'python编程从入门到实践', '2', '../imgs/019.jpg', '武志红', '中国人民出版社', '1', '入门级书籍，从基础概念到完整项目开发');
INSERT INTO `book` VALUES ('20', 'java从入门到精通', '2', '../imgs/020.jpg', '郑妙玲', '清华大学出版社', '1', '循序渐进，基础知识，核心技术，高级应用，项目实战应有尽有');
INSERT INTO `book` VALUES ('21', 'c++从入门到精通', '2', '../imgs/021.jpg', '吴洪涛', '清华大学出版社', '3', '循序渐进，基础知识，核心技术，高级应用，项目实战应有尽有');
INSERT INTO `book` VALUES ('22', 'c++Primer Plus', '2', '../imgs/022.jpg', '张海龙', '人民邮电出版社', '1', '经久不息的c++经典教程');
INSERT INTO `book` VALUES ('23', '计算机应用基础', '2', '../imgs/023.jpg', '郭风', '北京出版社', '1', 'windows7+office 2010,教你学会计算机基本知识');
INSERT INTO `book` VALUES ('24', '程序员的英语', '2', '../imgs/024.jpg', '朴载浒', '中国工信出版社', '1', '程序员提高自己的英语水平很重要');
INSERT INTO `book` VALUES ('25', 'jsp程序设计教程', '2', '../imgs/025.jpg', '莫冰', '广东出版社', '1', '计算机专业基础知识，十二五规划教程');
INSERT INTO `book` VALUES ('26', '数据结构c语言版', '2', '../imgs/026.jpg', '吴伟民', '清华大学出版社', '1', '清华大学计算机系列教材，累计发行400万册');
INSERT INTO `book` VALUES ('27', '码农翻身', '2', '../imgs/027.jpg', '刘欣', '中国工信出版社', '1', '好玩又有趣的编程知识，阅读量近1000万次的技术故事');
INSERT INTO `book` VALUES ('28', 'Zookeeper分布式过程协同技术详解', '2', '../imgs/028.jpg', '谢超', '机械工业出版社', '1', '教你如何使用zookeeper');
INSERT INTO `book` VALUES ('29', 'linux就该这么学', '2', '../imgs/029.jpg', '刘揣', '中国工信出版社', '1', '日均访问量10000次的同名电子书，通俗易懂，简单好学');
INSERT INTO `book` VALUES ('30', '数据结构（python语言描述）', '2', '../imgs/030.jpg', '李军', '人民邮电出版社', '1', '了解python语言的入门书籍，新手必备');
INSERT INTO `book` VALUES ('31', '算法图解', '2', '../imgs/031.jpg', '袁明忠', '清华大学出版社', '1', '图文并茂，算法入门，易学易懂');
INSERT INTO `book` VALUES ('32', 'python3网络爬虫与开发实战', '2', '../imgs/032.jpg', '崔庆才', '人民邮电出版社', '1', '图灵原创，内容丰富，从入门到实战');
INSERT INTO `book` VALUES ('33', '深入理解计算机系统', '2', '../imgs/033.jpg', '布莱恩特', '机械工业出版社', '1', '计算机科学系列丛书，内容丰富，适合有一定基础的人群');
INSERT INTO `book` VALUES ('34', '疯狂java讲义', '2', '../imgs/034.jpg', '李刚', '清华大学出版社', '1', '附带光盘，1700分钟视频，源码课件面试题应有尽有');
INSERT INTO `book` VALUES ('35', '深入浅出Vue.js', '2', '../imgs/035.jpg', '李松峰', '中国工信出版社', '1', '深入剖析Vue.js源码');
INSERT INTO `book` VALUES ('36', '鸟哥的Linux私房菜', '2', '../imgs/036.jpg', '老鸟', '清华大学出版社', '1', '经久不衰的Linux经典教程，linux图书销售榜首');
INSERT INTO `book` VALUES ('37', '计算机组成与体系结构', '2', '../imgs/037.jpg', '纳尔', '机械工业出版社', '1', '计算机科学丛书');
INSERT INTO `book` VALUES ('38', 'javascript权威指南', '2', '../imgs/038.jpg', '冰鸟', '机械工业出版社', '1', '冰鸟出版，实属权威，覆盖70%javascript知识');
INSERT INTO `book` VALUES ('39', 'Lua设计与实现', '2', '../imgs/039.jpg', 'codedump', '清华大学出版社', '2', '一本解释Luau原理的书，一线开发人员倾力打造');

-- ----------------------------
-- Table structure for borrowitems
-- ----------------------------
DROP TABLE IF EXISTS `borrowitems`;
CREATE TABLE `borrowitems` (
  `uid` bigint(10) NOT NULL,
  `bid` int(10) NOT NULL,
  `borrowtime` datetime NOT NULL,
  `returntime` datetime DEFAULT NULL,
  KEY `uid` (`uid`),
  KEY `bid` (`bid`),
  CONSTRAINT `borrowitems_ibfk_1` FOREIGN KEY (`uid`) REFERENCES `users` (`uid`),
  CONSTRAINT `borrowitems_ibfk_2` FOREIGN KEY (`bid`) REFERENCES `book` (`bid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of borrowitems
-- ----------------------------
INSERT INTO `borrowitems` VALUES ('3117004812', '10', '2020-06-23 00:49:45', null);
INSERT INTO `borrowitems` VALUES ('3117004814', '3', '2020-06-23 16:59:29', '2020-06-23 19:13:47');
INSERT INTO `borrowitems` VALUES ('3117004814', '3', '2020-06-23 16:59:29', '2020-06-23 19:13:47');
INSERT INTO `borrowitems` VALUES ('3117004814', '3', '2020-06-23 16:59:29', '2020-06-23 19:13:47');
INSERT INTO `borrowitems` VALUES ('3117004814', '3', '2020-06-23 16:59:29', '2020-06-23 19:13:47');
INSERT INTO `borrowitems` VALUES ('3117004814', '3', '2020-06-23 16:59:29', '2020-06-23 19:13:47');
INSERT INTO `borrowitems` VALUES ('3117004814', '3', '2020-06-23 16:59:29', '2020-06-23 19:13:47');
INSERT INTO `borrowitems` VALUES ('3117004814', '3', '2020-06-23 16:59:29', '2020-06-23 19:13:47');
INSERT INTO `borrowitems` VALUES ('3117004814', '2', '2020-06-23 17:13:08', '2020-06-23 19:12:53');
INSERT INTO `borrowitems` VALUES ('3117004814', '2', '2020-06-23 17:13:08', '2020-06-23 19:12:53');
INSERT INTO `borrowitems` VALUES ('3117004814', '6', '2020-06-23 22:37:48', '2020-06-23 22:46:36');
INSERT INTO `borrowitems` VALUES ('3117004814', '6', '2020-06-23 22:37:48', '2020-06-23 22:46:36');
INSERT INTO `borrowitems` VALUES ('3117004812', '10', '2020-06-23 22:47:07', null);
INSERT INTO `borrowitems` VALUES ('3117004812', '13', '2020-06-23 22:47:17', '2020-06-23 22:47:34');

-- ----------------------------
-- Table structure for category
-- ----------------------------
DROP TABLE IF EXISTS `category`;
CREATE TABLE `category` (
  `cid` int(1) NOT NULL,
  `cname` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`cid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of category
-- ----------------------------
INSERT INTO `category` VALUES ('1', '文学哲理');
INSERT INTO `category` VALUES ('2', '计算机科学');
INSERT INTO `category` VALUES ('3', '悬疑故事');
INSERT INTO `category` VALUES ('4', '生活百科');

-- ----------------------------
-- Table structure for users
-- ----------------------------
DROP TABLE IF EXISTS `users`;
CREATE TABLE `users` (
  `uid` bigint(10) NOT NULL,
  `uname` varchar(20) DEFAULT NULL,
  `upassword` varchar(20) DEFAULT NULL,
  `usex` varchar(1) DEFAULT NULL,
  `academy` varchar(20) DEFAULT NULL,
  `major` varchar(20) DEFAULT NULL,
  `phone` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`uid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of users
-- ----------------------------
INSERT INTO `users` VALUES ('3117004802', '彭梓祥', 'A123456', '男', '计算机学院', '软件工程', '1889876543');
INSERT INTO `users` VALUES ('3117004803', '涛', 'AA123456-&', '男', '计算机学院', '商务英语', '18898765432');
INSERT INTO `users` VALUES ('3117004805', '吴洪涛', 'a123456', '男', '计算机学院', '软件工程', '1889876543');
INSERT INTO `users` VALUES ('3117004812', '张柱健', '123456', '男', '计算机学院', '软件工程', '19876543210');
INSERT INTO `users` VALUES ('3117004813', '甄浩霖', '123456', '男', '计算机学院', '软件工程', '19876543211');
INSERT INTO `users` VALUES ('3117004814', '郑剑鑫', '123456', '男', '计算机学院', '软件工程', '19876543212');
INSERT INTO `users` VALUES ('3117004815', '郑凯琳', '123456', '男', '计算机学院', '软件工程', '19876543213');
