-- MySQL dump 10.13  Distrib 8.0.19, for osx10.14 (x86_64)
--
-- Host: 127.0.0.1    Database: mybatis_db
-- ------------------------------------------------------
-- Server version	8.0.19-debug

SET @old_autocommit=@@autocommit;

DROP DATABASE IF EXISTS `mybatis_db`;
CREATE DATABASE IF NOT EXISTS `mybatis_db` DEFAULT CHARACTER SET utf8mb4;

USE `mybatis_db`;

DROP TABLE IF EXISTS `userinfo`;
create table IF NOT EXISTS `userinfo` (id char(5) NOT NULL PRIMARY KEY,
                        name varchar(255),
                        sex char(1)); 

INSERT INTO `userinfo` VALUES ('00001','来栖翔','男');
INSERT INTO `userinfo` VALUES ('00002','小野寺梓','女');
INSERT INTO `userinfo` VALUES ('00003','齋藤飛鳥','女');
commit;

SET autocommit=@old_autocommit;

-- Dump completed on 2020-01-22  9:58:16
