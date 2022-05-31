package com.example.cinema.service;

import com.example.cinema.entity.MovieFilm;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;

/**
 * (MovieFilm)表服务接口
 *
 * @author makejava
 * @since 2022-05-30 11:48:01
 */
public interface MovieFilmService {

    /**
     * 通过ID查询单条数据
     *
     * @param filmId 主键
     * @return 实例对象
     */
    MovieFilm queryById(String filmId);

    /**
     * 分页查询
     *
     * @param movieFilm 筛选条件
     * @param pageRequest      分页对象
     * @return 查询结果
     */
    Page<MovieFilm> queryByPage(MovieFilm movieFilm, PageRequest pageRequest);

    /**
     * 新增数据
     *
     * @param movieFilm 实例对象
     * @return 实例对象
     */
    MovieFilm insert(MovieFilm movieFilm);

    /**
     * 修改数据
     *
     * @param movieFilm 实例对象
     * @return 实例对象
     */
    MovieFilm update(MovieFilm movieFilm);

    /**
     * 通过主键删除数据
     *
     * @param filmId 主键
     * @return 是否成功
     */
    boolean deleteById(String filmId);

}
