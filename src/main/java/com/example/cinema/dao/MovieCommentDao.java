package com.example.cinema.dao;

import com.example.cinema.entity.MovieComment;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * (MovieComment)表数据库访问层
 *
 * @author makejava
 * @since 2022-05-30 11:48:00
 */
@Mapper
@Repository
public interface MovieCommentDao {

    /**
     * 通过ID查询单条数据
     *
     * @param commentId 主键
     * @return 实例对象
     */
    MovieComment queryById(String commentId);

    /**
     * 查询指定行数据
     *
     * @param movieComment 查询条件
     * @param pageable         分页对象
     * @return 对象列表
     */
    List<MovieComment> queryAllByLimit(@Param("MovieCommentMap") MovieComment movieComment, @Param("pageable") Pageable pageable);

    /**
     * 统计总行数
     *
     * @param movieComment 查询条件
     * @return 总行数
     */
    long count(MovieComment movieComment);

    /**
     * 新增数据
     *
     * @param movieComment 实例对象
     * @return 影响行数
     */
    int insert(MovieComment movieComment);

    /**
     * 批量新增数据（MyBatis原生foreach方法）
     *
     * @param entities List<MovieComment> 实例对象列表
     * @return 影响行数
     */
    int insertBatch(@Param("entities") List<MovieComment> entities);

    /**
     * 批量新增或按主键更新数据（MyBatis原生foreach方法）
     *
     * @param entities List<MovieComment> 实例对象列表
     * @return 影响行数
     * @throws org.springframework.jdbc.BadSqlGrammarException 入参是空List的时候会抛SQL语句错误的异常，请自行校验入参
     */
    int insertOrUpdateBatch(@Param("entities") List<MovieComment> entities);

    /**
     * 修改数据
     *
     * @param movieComment 实例对象
     * @return 影响行数
     */
    int update(MovieComment movieComment);

    /**
     * 通过主键删除数据
     *
     * @param commentId 主键
     * @return 影响行数
     */
    int deleteById(String commentId);

}

