package com.juliy.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.juliy.entity.Article;
import com.juliy.model.dto.ConditionDTO;
import com.juliy.model.vo.ArticleAdminVO;
import com.juliy.model.vo.ArticleInfoVO;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 文章mapper
 * @author juliy
 * @date 2023/3/25 10:00
 */
@Mapper
public interface ArticleMapper extends BaseMapper<Article> {

    /**
     * 查询后台文章数量
     * @param condition 查询条件
     * @return 文章数量
     */
    Long countArticlesAdmin(@Param("condition") ConditionDTO condition);

    /**
     * 查询后台文章列表
     * @param limit     页码
     * @param size      数量
     * @param condition 查询条件
     * @return 后台文章列表
     */
    List<ArticleAdminVO> selectArticlesAdmin(@Param("limit") Long limit, @Param("size") Long size, @Param("condition") ConditionDTO condition);

    /**
     * 根据id查询文章信息
     * @param articleId 文章id
     * @return 文章信息
     */
    ArticleInfoVO selectArticleInfoById(@Param("articleId") Integer articleId);


}