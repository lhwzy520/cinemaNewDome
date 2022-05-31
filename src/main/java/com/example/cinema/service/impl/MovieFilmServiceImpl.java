package com.example.cinema.service.impl;

import com.example.cinema.entity.MovieFilm;
import com.example.cinema.dao.MovieFilmDao;
import com.example.cinema.service.MovieFilmService;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.PageRequest;

import javax.annotation.Resource;

/**
 * (MovieFilm)表服务实现类
 *
 * @author makejava
 * @since 2022-05-30 11:48:01
 */
@Service("movieFilmService")
public class MovieFilmServiceImpl implements MovieFilmService {
    @Resource
    private MovieFilmDao movieFilmDao;

    /**
     * 通过ID查询单条数据
     *
     * @param filmId 主键
     * @return 实例对象
     */
    @Override
    public MovieFilm queryById(String filmId) {
        return this.movieFilmDao.queryById(filmId);
    }

    /**
     * 分页查询
     *
     * @param movieFilm 筛选条件
     * @param pageRequest      分页对象
     * @return 查询结果
     */
    @Override
    public Page<MovieFilm> queryByPage(MovieFilm movieFilm, PageRequest pageRequest) {
        long total = this.movieFilmDao.count(movieFilm);
        return new PageImpl<>(this.movieFilmDao.queryAllByLimit(movieFilm, pageRequest), pageRequest, total);
    }

    /**
     * 新增数据
     *
     * @param movieFilm 实例对象
     * @return 实例对象
     */
    @Override
    public MovieFilm insert(MovieFilm movieFilm) {
        this.movieFilmDao.insert(movieFilm);
        return movieFilm;
    }

    /**
     * 修改数据
     *
     * @param movieFilm 实例对象
     * @return 实例对象
     */
    @Override
    public MovieFilm update(MovieFilm movieFilm) {
        this.movieFilmDao.update(movieFilm);
        return this.queryById(movieFilm.getFilmId());
    }

    /**
     * 通过主键删除数据
     *
     * @param filmId 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(String filmId) {
        return this.movieFilmDao.deleteById(filmId) > 0;
    }
}
