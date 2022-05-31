package com.example.cinema.service.impl;

import com.example.cinema.entity.MovieFilmCategory;
import com.example.cinema.dao.MovieFilmCategoryDao;
import com.example.cinema.service.MovieFilmCategoryService;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.PageRequest;

import javax.annotation.Resource;

/**
 * (MovieFilmCategory)表服务实现类
 *
 * @author makejava
 * @since 2022-05-30 11:48:01
 */
@Service("movieFilmCategoryService")
public class MovieFilmCategoryServiceImpl implements MovieFilmCategoryService {
    @Resource
    private MovieFilmCategoryDao movieFilmCategoryDao;

    /**
     * 通过ID查询单条数据
     *
     * @param filmCategoryId 主键
     * @return 实例对象
     */
    @Override
    public MovieFilmCategory queryById(String filmCategoryId) {
        return this.movieFilmCategoryDao.queryById(filmCategoryId);
    }

    /**
     * 分页查询
     *
     * @param movieFilmCategory 筛选条件
     * @param pageRequest      分页对象
     * @return 查询结果
     */
    @Override
    public Page<MovieFilmCategory> queryByPage(MovieFilmCategory movieFilmCategory, PageRequest pageRequest) {
        long total = this.movieFilmCategoryDao.count(movieFilmCategory);
        return new PageImpl<>(this.movieFilmCategoryDao.queryAllByLimit(movieFilmCategory, pageRequest), pageRequest, total);
    }

    /**
     * 新增数据
     *
     * @param movieFilmCategory 实例对象
     * @return 实例对象
     */
    @Override
    public MovieFilmCategory insert(MovieFilmCategory movieFilmCategory) {
        this.movieFilmCategoryDao.insert(movieFilmCategory);
        return movieFilmCategory;
    }

    /**
     * 修改数据
     *
     * @param movieFilmCategory 实例对象
     * @return 实例对象
     */
    @Override
    public MovieFilmCategory update(MovieFilmCategory movieFilmCategory) {
        this.movieFilmCategoryDao.update(movieFilmCategory);
        return this.queryById(movieFilmCategory.getFilmCategoryId());
    }

    /**
     * 通过主键删除数据
     *
     * @param filmCategoryId 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(String filmCategoryId) {
        return this.movieFilmCategoryDao.deleteById(filmCategoryId) > 0;
    }
}
