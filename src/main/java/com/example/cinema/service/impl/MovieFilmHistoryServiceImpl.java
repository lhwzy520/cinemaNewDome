package com.example.cinema.service.impl;

import com.example.cinema.entity.MovieFilmHistory;
import com.example.cinema.dao.MovieFilmHistoryDao;
import com.example.cinema.service.MovieFilmHistoryService;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.PageRequest;

import javax.annotation.Resource;

/**
 * (MovieFilmHistory)表服务实现类
 *
 * @author makejava
 * @since 2022-05-30 11:48:01
 */
@Service("movieFilmHistoryService")
public class MovieFilmHistoryServiceImpl implements MovieFilmHistoryService {
    @Resource
    private MovieFilmHistoryDao movieFilmHistoryDao;

    /**
     * 通过ID查询单条数据
     *
     * @param historyId 主键
     * @return 实例对象
     */
    @Override
    public MovieFilmHistory queryById(String historyId) {
        return this.movieFilmHistoryDao.queryById(historyId);
    }

    /**
     * 分页查询
     *
     * @param movieFilmHistory 筛选条件
     * @param pageRequest      分页对象
     * @return 查询结果
     */
    @Override
    public Page<MovieFilmHistory> queryByPage(MovieFilmHistory movieFilmHistory, PageRequest pageRequest) {
        long total = this.movieFilmHistoryDao.count(movieFilmHistory);
        return new PageImpl<>(this.movieFilmHistoryDao.queryAllByLimit(movieFilmHistory, pageRequest), pageRequest, total);
    }

    /**
     * 新增数据
     *
     * @param movieFilmHistory 实例对象
     * @return 实例对象
     */
    @Override
    public MovieFilmHistory insert(MovieFilmHistory movieFilmHistory) {
        this.movieFilmHistoryDao.insert(movieFilmHistory);
        return movieFilmHistory;
    }

    /**
     * 修改数据
     *
     * @param movieFilmHistory 实例对象
     * @return 实例对象
     */
    @Override
    public MovieFilmHistory update(MovieFilmHistory movieFilmHistory) {
        this.movieFilmHistoryDao.update(movieFilmHistory);
        return this.queryById(movieFilmHistory.getHistoryId());
    }

    /**
     * 通过主键删除数据
     *
     * @param historyId 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(String historyId) {
        return this.movieFilmHistoryDao.deleteById(historyId) > 0;
    }
}
