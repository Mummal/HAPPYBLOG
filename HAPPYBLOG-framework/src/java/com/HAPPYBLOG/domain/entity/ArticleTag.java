package com.HAPPYBLOG.domain.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * 文章标签关联表(ArticleTag)实体类
 *
 */
@TableName(value="sg_article_tag")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ArticleTag implements Serializable {
    private static final long serialVersionUID = 625337492348897098L;
    
    /**
    * 文章id
    */
    private Long articleId;
    /**
    * 标签id
    */
    private Long tagId;



}