package com.example.cinema.service;

import com.example.cinema.entity.MovieFilmHistory;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;

/**
 * (MovieFilmHistory)表服务接口
 *
 * @author makejava
 * @since 2022-05-30 11:48:01
 */
public interface MovieFilmHistoryService {

    /**
     * 通过ID查询单条数据
     *
     * @param historyId 主键
     * @return 实例对象
     */
    MovieFilmHistory queryById(String historyId);

    /**
     * 分页查询
     *
     * @param movieFilmHistory 筛选条件
     * @param pageRequest      分页对象
     * @return 查询结果
     */
    Page<MovieFilmHistory> queryByPage(MovieFilmHistory movieFilmHistory, PageRequest pageRequest);

    /**
     * 新增数据
     *
     * @param movieFilmHistory 实例对象
     * @return 实例对象
     */
    MovieFilmHistory insert(MovieFilmHistory movieFilmHistory);

    /**
     * 修改数据
     *
     * @param movieFilmHistory 实例对象
     * @return 实例对象
     */
    MovieFilmHistory update(MovieFilmHistory movieFilmHistory);

    /**
     * 通过主键删除数据
     *
     * @param historyId 主键
     * @return 是否成功
     */
    boolean deleteById(String historyId);

}
