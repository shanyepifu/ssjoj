# ssjoj
Spring Spring JPA OpenJPA 框架整合 (纯净版)

## 本项目的建表SQL

```
    CREATE TABLE `jgb_article` (
      `article_id` int(11) NOT NULL AUTO_INCREMENT COMMENT '文章ID',
      `author_id` int(11) DEFAULT NULL COMMENT '作者ID',
      `catelog_id` int(11) DEFAULT NULL COMMENT '分类Id',
      `article_content` longtext COMMENT '文章内容',
      `readers` int(11) DEFAULT NULL COMMENT '阅读数',
      `upcount` int(11) DEFAULT NULL COMMENT '点赞数',
      `downcount` int(11) DEFAULT NULL COMMENT '点踩数',
      `status` int(11) DEFAULT NULL COMMENT '文章状态 1-发布 2-草稿 3-垃圾箱',
      `publish_time` datetime DEFAULT NULL COMMENT '发布时间',
      `update_time` datetime DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP COMMENT '修改时间',
      `article_keywords` varchar(255) DEFAULT NULL,
      `article_shortdes` varchar(255) DEFAULT NULL,
      `article_title` varchar(255) DEFAULT NULL,
      PRIMARY KEY (`article_id`)
    ) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8 COMMENT='文章表'
    
```

