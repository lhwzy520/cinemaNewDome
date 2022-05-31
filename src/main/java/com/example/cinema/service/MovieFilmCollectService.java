package com.example.cinema.service;

import com.example.cinema.entity.MovieFilmCollect;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;

/**
 * (MovieFilmCollect)表服务接口
 *
 * @author makejava
 * @since 2022-05-30 11:48:01
 */
public interface MovieFilmCollectService {

    /**
     * 通过ID查询单条数据
     *
     * @param collectId 主键
     * @return 实例对象
     */
    MovieFilmCollect queryById(String collectId);

    /**
     * 分页查询
     *
     * @param movieFilmCollect 筛选条件
     * @param pageRequest      分页对象
     * @return 查询结果
     */
    Page<MovieFilmCollect> queryByPage(MovieFilmCollect movieFilmCollect, PageRequest pageRequest);

    /**
     * 新增数据
     *
     * @param movieFilmCollect 实例对象
     * @return 实例对象
     */
    MovieFilmCollect insert(MovieFilmCollect movieFilmCollect);

    /**
     * 修改数据
     *
     * @param movieFilmCollect 实例对象
     * @return 实例对象
     */
    MovieFilmCollect update(MovieFilmCollect movieFilmCollect);

    /**
     * 通过主键删除数据
     *
     * @param collectId 主键
     * @return 是否成功
     */
    boolean deleteById(String collectId);

}
