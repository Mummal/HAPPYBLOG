package com.HAPPYBLOG.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.sangeng.domain.ResponseResult;
import com.sangeng.domain.entity.Category;
import com.sangeng.domain.vo.CategoryVo;
import com.sangeng.domain.vo.PageVo;

import java.util.List;


/**
 * 分类表(Category)表服务接口
 *
 */
public interface CategoryService extends IService<Category> {


    ResponseResult getCategoryList();

    List<CategoryVo> listAllCategory();

    PageVo selectCategoryPage(Category category, Integer pageNum, Integer pageSize);
}

