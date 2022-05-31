package com.example.cinema.service;

import com.example.cinema.entity.MovieClassify;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;

/**
 * (MovieClassify)表服务接口
 *
 * @author makejava
 * @since 2022-05-30 11:48:00
 */
public interface MovieClassifyService {

    /**
     * 通过ID查询单条数据
     *
     * @param filmClassifyId 主键
     * @return 实例对象
     */
    MovieClassify queryById(String filmClassifyId);

    /**
     * 分页查询
     *
     * @param movieClassify 筛选条件
     * @param pageRequest      分页对象
     * @return 查询结果
     */
    Page<MovieClassify> queryByPage(MovieClassify movieClassify, PageRequest pageRequest);

    /**
     * 新增数据
     *
     * @param movieClassify 实例对象
     * @return 实例对象
     */
    MovieClassify insert(MovieClassify movieClassify);

    /**
     * 修改数据
     *
     * @param movieClassify 实例对象
     * @return 实例对象
     */
    MovieClassify update(MovieClassify movieClassify);

    /**
     * 通过主键删除数据
     *
     * @param filmClassifyId 主键
     * @return 是否成功
     */
    boolean deleteById(String filmClassifyId);

}
