package com.shanyepifu.ssjoj.article.service;

import com.shanyepifu.ssjoj.article.entity.ArticleEntity;

/**
 * @ClassName: ArticleService.java 
 * @Package com.shanyepifu.jgeekblog.article.service
 * @Description: 文章管理的service接口
 * @author shanyepifu
 * @date 2016年7月8日 上午11:08:01
 */
public interface ArticleService {
	
	ArticleEntity findArticleById(int id);
}
