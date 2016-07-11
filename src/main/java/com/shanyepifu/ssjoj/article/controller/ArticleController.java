package com.shanyepifu.ssjoj.article.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.shanyepifu.ssjoj.article.service.ArticleService;

/**
 * @ClassName: ArticleController.java 
 * @Package com.shanyepifu.jgeekblog.article.controller
 * @Description: TODO
 * @author shanyepifu
 * @date 2016年7月8日 上午11:23:57
 */
@Controller
@RequestMapping("/article")
public class ArticleController {

	@Autowired
	private ArticleService articleService;
	
	
	@RequestMapping("/find")
	@ResponseBody
	public Object findArticle(int id){
		return articleService.findArticleById(id);
	}
}
