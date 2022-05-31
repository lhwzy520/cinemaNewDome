package com.example.cinema.service.impl;

import com.example.cinema.entity.MovieComment;
import com.example.cinema.dao.MovieCommentDao;
import com.example.cinema.service.MovieCommentService;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.PageRequest;

import javax.annotation.Resource;

/**
 * (MovieComment)表服务实现类
 *
 * @author makejava
 * @since 2022-05-30 11:48:01
 */
@Service("movieCommentService")
public class MovieCommentServiceImpl implements MovieCommentService {
    @Resource
    private MovieCommentDao movieCommentDao;

    /**
     * 通过ID查询单条数据
     *
     * @param commentId 主键
     * @return 实例对象
     */
    @Override
    public MovieComment queryById(String commentId) {
        return this.movieCommentDao.queryById(commentId);
    }

    /**
     * 分页查询
     *
     * @param movieComment 筛选条件
     * @param pageRequest      分页对象
     * @return 查询结果
     */
    @Override
    public Page<MovieComment> queryByPage(MovieComment movieComment, PageRequest pageRequest) {
        long total = this.movieCommentDao.count(movieComment);
        return new PageImpl<>(this.movieCommentDao.queryAllByLimit(movieComment, pageRequest), pageRequest, total);
    }

    /**
     * 新增数据
     *
     * @param movieComment 实例对象
     * @return 实例对象
     */
    @Override
    public MovieComment insert(MovieComment movieComment) {
        this.movieCommentDao.insert(movieComment);
        return movieComment;
    }

    /**
     * 修改数据
     *
     * @param movieComment 实例对象
     * @return 实例对象
     */
    @Override
    public MovieComment update(MovieComment movieComment) {
        this.movieCommentDao.update(movieComment);
        return this.queryById(movieComment.getCommentId());
    }

    /**
     * 通过主键删除数据
     *
     * @param commentId 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(String commentId) {
        return this.movieCommentDao.deleteById(commentId) > 0;
    }
}
