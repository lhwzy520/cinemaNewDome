package com.example.cinema.dao;

import com.example.cinema.entity.MovieFilmCollect;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * (MovieFilmCollect)表数据库访问层
 *
 * @author makejava
 * @since 2022-05-30 11:48:01
 */
@Mapper
@Repository
public interface MovieFilmCollectDao {

    /**
     * 通过ID查询单条数据
     *
     * @param collectId 主键
     * @return 实例对象
     */
    MovieFilmCollect queryById(String collectId);

    /**
     * 查询指定行数据
     *
     * @param movieFilmCollect 查询条件
     * @param pageable         分页对象
     * @return 对象列表
     */
    List<MovieFilmCollect> queryAllByLimit(@Param("MovieFilmCollectMap") MovieFilmCollect movieFilmCollect, @Param("pageable") Pageable pageable);

    /**
     * 统计总行数
     *
     * @param movieFilmCollect 查询条件
     * @return 总行数
     */
    long count(MovieFilmCollect movieFilmCollect);

    /**
     * 新增数据
     *
     * @param movieFilmCollect 实例对象
     * @return 影响行数
     */
    int insert(MovieFilmCollect movieFilmCollect);

    /**
     * 批量新增数据（MyBatis原生foreach方法）
     *
     * @param entities List<MovieFilmCollect> 实例对象列表
     * @return 影响行数
     */
    int insertBatch(@Param("entities") List<MovieFilmCollect> entities);

    /**
     * 批量新增或按主键更新数据（MyBatis原生foreach方法）
     *
     * @param entities List<MovieFilmCollect> 实例对象列表
     * @return 影响行数
     * @throws org.springframework.jdbc.BadSqlGrammarException 入参是空List的时候会抛SQL语句错误的异常，请自行校验入参
     */
    int insertOrUpdateBatch(@Param("entities") List<MovieFilmCollect> entities);

    /**
     * 修改数据
     *
     * @param movieFilmCollect 实例对象
     * @return 影响行数
     */
    int update(MovieFilmCollect movieFilmCollect);

    /**
     * 通过主键删除数据
     *
     * @param collectId 主键
     * @return 影响行数
     */
    int deleteById(String collectId);

}

