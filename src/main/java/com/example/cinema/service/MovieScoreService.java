package com.example.cinema.service;

import com.example.cinema.entity.MovieScore;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;

/**
 * (MovieScore)表服务接口
 *
 * @author makejava
 * @since 2022-05-30 11:48:01
 */
public interface MovieScoreService {

    /**
     * 通过ID查询单条数据
     *
     * @param scoreId 主键
     * @return 实例对象
     */
    MovieScore queryById(String scoreId);

    /**
     * 分页查询
     *
     * @param movieScore 筛选条件
     * @param pageRequest      分页对象
     * @return 查询结果
     */
    Page<MovieScore> queryByPage(MovieScore movieScore, PageRequest pageRequest);

    /**
     * 新增数据
     *
     * @param movieScore 实例对象
     * @return 实例对象
     */
    MovieScore insert(MovieScore movieScore);

    /**
     * 修改数据
     *
     * @param movieScore 实例对象
     * @return 实例对象
     */
    MovieScore update(MovieScore movieScore);

    /**
     * 通过主键删除数据
     *
     * @param scoreId 主键
     * @return 是否成功
     */
    boolean deleteById(String scoreId);

}
