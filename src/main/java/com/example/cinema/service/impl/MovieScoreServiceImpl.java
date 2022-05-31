package com.example.cinema.service.impl;

import com.example.cinema.entity.MovieScore;
import com.example.cinema.dao.MovieScoreDao;
import com.example.cinema.service.MovieScoreService;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.PageRequest;

import javax.annotation.Resource;

/**
 * (MovieScore)表服务实现类
 *
 * @author makejava
 * @since 2022-05-30 11:48:01
 */
@Service("movieScoreService")
public class MovieScoreServiceImpl implements MovieScoreService {
    @Resource
    private MovieScoreDao movieScoreDao;

    /**
     * 通过ID查询单条数据
     *
     * @param scoreId 主键
     * @return 实例对象
     */
    @Override
    public MovieScore queryById(String scoreId) {
        return this.movieScoreDao.queryById(scoreId);
    }

    /**
     * 分页查询
     *
     * @param movieScore 筛选条件
     * @param pageRequest      分页对象
     * @return 查询结果
     */
    @Override
    public Page<MovieScore> queryByPage(MovieScore movieScore, PageRequest pageRequest) {
        long total = this.movieScoreDao.count(movieScore);
        return new PageImpl<>(this.movieScoreDao.queryAllByLimit(movieScore, pageRequest), pageRequest, total);
    }

    /**
     * 新增数据
     *
     * @param movieScore 实例对象
     * @return 实例对象
     */
    @Override
    public MovieScore insert(MovieScore movieScore) {
        this.movieScoreDao.insert(movieScore);
        return movieScore;
    }

    /**
     * 修改数据
     *
     * @param movieScore 实例对象
     * @return 实例对象
     */
    @Override
    public MovieScore update(MovieScore movieScore) {
        this.movieScoreDao.update(movieScore);
        return this.queryById(movieScore.getScoreId());
    }

    /**
     * 通过主键删除数据
     *
     * @param scoreId 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(String scoreId) {
        return this.movieScoreDao.deleteById(scoreId) > 0;
    }
}
