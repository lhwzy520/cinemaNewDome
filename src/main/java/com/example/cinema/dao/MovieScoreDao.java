package com.example.cinema.dao;

import com.example.cinema.entity.MovieScore;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * (MovieScore)表数据库访问层
 *
 * @author makejava
 * @since 2022-05-30 11:48:01
 */
@Mapper
@Repository
public interface MovieScoreDao {

    /**
     * 通过ID查询单条数据
     *
     * @param scoreId 主键
     * @return 实例对象
     */
    MovieScore queryById(String scoreId);

    /**
     * 查询指定行数据
     *
     * @param movieScore 查询条件
     * @param pageable         分页对象
     * @return 对象列表
     */
    List<MovieScore> queryAllByLimit(@Param("MovieScoreMap") MovieScore movieScore, @Param("pageable") Pageable pageable);

    /**
     * 统计总行数
     *
     * @param movieScore 查询条件
     * @return 总行数
     */
    long count(MovieScore movieScore);

    /**
     * 新增数据
     *
     * @param movieScore 实例对象
     * @return 影响行数
     */
    int insert(MovieScore movieScore);

    /**
     * 批量新增数据（MyBatis原生foreach方法）
     *
     * @param entities List<MovieScore> 实例对象列表
     * @return 影响行数
     */
    int insertBatch(@Param("entities") List<MovieScore> entities);

    /**
     * 批量新增或按主键更新数据（MyBatis原生foreach方法）
     *
     * @param entities List<MovieScore> 实例对象列表
     * @return 影响行数
     * @throws org.springframework.jdbc.BadSqlGrammarException 入参是空List的时候会抛SQL语句错误的异常，请自行校验入参
     */
    int insertOrUpdateBatch(@Param("entities") List<MovieScore> entities);

    /**
     * 修改数据
     *
     * @param movieScore 实例对象
     * @return 影响行数
     */
    int update(MovieScore movieScore);

    /**
     * 通过主键删除数据
     *
     * @param scoreId 主键
     * @return 影响行数
     */
    int deleteById(String scoreId);

}

