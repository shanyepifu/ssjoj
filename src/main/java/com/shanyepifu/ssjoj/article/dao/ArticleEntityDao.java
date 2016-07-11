package com.shanyepifu.ssjoj.article.dao;

import com.shanyepifu.ssjoj.article.entity.ArticleEntity;
import org.springframework.data.repository.CrudRepository;

/**
 * @ClassName: ArticleEntityDao.java
 * @Package com.shanyepifu.jgeekblog.article.dao
 * @Description: 文章查询的Dao
 * @author shanyepifu
 * @date 2016年7月8日 上午10:51:36
 */
public interface ArticleEntityDao extends CrudRepository<ArticleEntity, Integer> {
	@Override
//	@Query("select ae from ArticleEntity ae where ae.articleId = ?1")
	ArticleEntity findOne(Integer id);

}
