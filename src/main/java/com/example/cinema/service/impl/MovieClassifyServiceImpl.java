package com.example.cinema.service.impl;

import com.example.cinema.entity.MovieClassify;
import com.example.cinema.dao.MovieClassifyDao;
import com.example.cinema.service.MovieClassifyService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;

/**
 * (MovieClassify)表服务实现类
 *
 * @author makejava
 * @since 2022-05-30 11:48:00
 */
@Service("movieClassifyService")
public class MovieClassifyServiceImpl implements MovieClassifyService {
    @Resource
    private MovieClassifyDao movieClassifyDao;

    /**
     * 通过ID查询单条数据
     *
     * @param filmClassifyId 主键
     * @return 实例对象
     */
    @Override
    public MovieClassify queryById(String filmClassifyId) {
        return this.movieClassifyDao.queryById(filmClassifyId);
    }

    /**
     * 分页查询
     *
     * @param movieClassify 筛选条件
     * @param pageRequest      分页对象
     * @return 查询结果
     */
    @Override
    public Page<MovieClassify> queryByPage(MovieClassify movieClassify, PageRequest pageRequest) {
        long total = this.movieClassifyDao.count(movieClassify);
        return new PageImpl<>(this.movieClassifyDao.queryAllByLimit(movieClassify, pageRequest), pageRequest, total);
    }

    /**
     * 新增数据
     *
     * @param movieClassify 实例对象
     * @return 实例对象
     */
    @Override
    public MovieClassify insert(MovieClassify movieClassify) {
        this.movieClassifyDao.insert(movieClassify);
        return movieClassify;
    }

    /**
     * 修改数据
     *
     * @param movieClassify 实例对象
     * @return 实例对象
     */
    @Override
    public MovieClassify update(MovieClassify movieClassify) {
        this.movieClassifyDao.update(movieClassify);
        return this.queryById(movieClassify.getFilmClassifyId());
    }

    /**
     * 通过主键删除数据
     *
     * @param filmClassifyId 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(String filmClassifyId) {
        return this.movieClassifyDao.deleteById(filmClassifyId) > 0;
    }
}
