package com.shanyepifu.ssjoj.article.service.impl;

import com.shanyepifu.ssjoj.article.dao.ArticleEntityDao;
import com.shanyepifu.ssjoj.article.entity.ArticleEntity;
import com.shanyepifu.ssjoj.article.service.ArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @ClassName: ArticleServiceImpl.java 
 * @Package com.shanyepifu.jgeekblog.article.service
 * @Description: 文章操作的service实现类
 * @author shanyepifu
 * @date 2016年7月8日 上午11:09:03
 */
@Service
public class ArticleServiceImpl implements ArticleService {

	@Autowired
	private ArticleEntityDao articleEntityDao;
	
	@Override
	public ArticleEntity findArticleById(int id) {
		return articleEntityDao.findOne(id);
	}

}
