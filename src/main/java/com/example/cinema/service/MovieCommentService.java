package com.example.cinema.service;

import com.example.cinema.entity.MovieComment;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;

/**
 * (MovieComment)表服务接口
 *
 * @author makejava
 * @since 2022-05-30 11:48:00
 */
public interface MovieCommentService {

    /**
     * 通过ID查询单条数据
     *
     * @param commentId 主键
     * @return 实例对象
     */
    MovieComment queryById(String commentId);

    /**
     * 分页查询
     *
     * @param movieComment 筛选条件
     * @param pageRequest      分页对象
     * @return 查询结果
     */
    Page<MovieComment> queryByPage(MovieComment movieComment, PageRequest pageRequest);

    /**
     * 新增数据
     *
     * @param movieComment 实例对象
     * @return 实例对象
     */
    MovieComment insert(MovieComment movieComment);

    /**
     * 修改数据
     *
     * @param movieComment 实例对象
     * @return 实例对象
     */
    MovieComment update(MovieComment movieComment);

    /**
     * 通过主键删除数据
     *
     * @param commentId 主键
     * @return 是否成功
     */
    boolean deleteById(String commentId);

}
