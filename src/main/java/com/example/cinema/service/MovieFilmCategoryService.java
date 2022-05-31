package com.example.cinema.service;

import com.example.cinema.entity.MovieFilmCategory;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;

/**
 * (MovieFilmCategory)表服务接口
 *
 * @author makejava
 * @since 2022-05-30 11:48:01
 */
public interface MovieFilmCategoryService {

    /**
     * 通过ID查询单条数据
     *
     * @param filmCategoryId 主键
     * @return 实例对象
     */
    MovieFilmCategory queryById(String filmCategoryId);

    /**
     * 分页查询
     *
     * @param movieFilmCategory 筛选条件
     * @param pageRequest      分页对象
     * @return 查询结果
     */
    Page<MovieFilmCategory> queryByPage(MovieFilmCategory movieFilmCategory, PageRequest pageRequest);

    /**
     * 新增数据
     *
     * @param movieFilmCategory 实例对象
     * @return 实例对象
     */
    MovieFilmCategory insert(MovieFilmCategory movieFilmCategory);

    /**
     * 修改数据
     *
     * @param movieFilmCategory 实例对象
     * @return 实例对象
     */
    MovieFilmCategory update(MovieFilmCategory movieFilmCategory);

    /**
     * 通过主键删除数据
     *
     * @param filmCategoryId 主键
     * @return 是否成功
     */
    boolean deleteById(String filmCategoryId);

}
