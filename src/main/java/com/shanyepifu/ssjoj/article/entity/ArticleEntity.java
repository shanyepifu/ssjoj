package com.shanyepifu.ssjoj.article.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;

/**
 * @ClassName: ArticleEntity.java
 * @Package com.shanyepifu.jgeekblog.article.entity
 * @Description: 文章实体类
 * @author shanyepifu
 * @date 2016年7月8日 上午10:57:19
 */
@Entity
@Table(name="jgb_article")
public class ArticleEntity implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="article_id")
	private int articleId;
	@Column(name="article_title")
	private String articleTitle;
	@Column(name="author_id")
	private int authorId;
	@Column(name="catelog_id")
	private int catelogId;
	@Column(name="article_shortdes")
	private String articleShortdes;
	@Column(name="article_keywords")
	private String articleKeywords;
	@Column(name="article_content")
	@Lob
	private String articleContent;
	private int readers;
	private int upcount;
	private int downcount;
	private int status;
	@Column(name="publish_time")
	private Date publishTime;
	@Column(name="update_time")
	private Date updateTime;

	public int getArticleId() {
		return articleId;
	}

	public void setArticleId(int articleId) {
		this.articleId = articleId;
	}

	public String getArticleTitle() {
		return articleTitle;
	}

	public void setArticleTitle(String articleTitle) {
		this.articleTitle = articleTitle;
	}

	public int getAuthorId() {
		return authorId;
	}

	public void setAuthorId(int authorId) {
		this.authorId = authorId;
	}

	public int getCatelogId() {
		return catelogId;
	}

	public void setCatelogId(int catelogId) {
		this.catelogId = catelogId;
	}

	public String getArticleShortdes() {
		return articleShortdes;
	}

	public void setArticleShortdes(String articleShortdes) {
		this.articleShortdes = articleShortdes;
	}

	public String getArticleKeywords() {
		return articleKeywords;
	}

	public void setArticleKeywords(String articleKeywords) {
		this.articleKeywords = articleKeywords;
	}

	public String getArticleContent() {
		return articleContent;
	}

	public void setArticleContent(String articleContent) {
		this.articleContent = articleContent;
	}

	public int getReaders() {
		return readers;
	}

	public void setReaders(int readers) {
		this.readers = readers;
	}

	public int getUpcount() {
		return upcount;
	}

	public void setUpcount(int upcount) {
		this.upcount = upcount;
	}

	public int getDowncount() {
		return downcount;
	}

	public void setDowncount(int downcount) {
		this.downcount = downcount;
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	public Date getPublishTime() {
		return publishTime;
	}

	public void setPublishTime(Date publishTime) {
		this.publishTime = publishTime;
	}

	public Date getUpdateTime() {
		return updateTime;
	}

	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}

	@Override
	public String toString() {
		return "ArticleEntity [articleId=" + articleId + ", articleTitle=" + articleTitle + ", authorId=" + authorId
				+ ", catelogId=" + catelogId + ", articleShortdes=" + articleShortdes + ", articleKeywords="
				+ articleKeywords + ", articleContent=" + articleContent + ", readers=" + readers + ", upcount="
				+ upcount + ", downcount=" + downcount + ", status=" + status + ", publishTime=" + publishTime
				+ ", updateTime=" + updateTime + "]";
	}
}
