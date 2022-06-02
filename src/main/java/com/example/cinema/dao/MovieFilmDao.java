package com.example.cinema.dao;

import com.example.cinema.entity.MovieFilm;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * (MovieFilm)表数据库访问层
 *
 * @author makejava
 * @since 2022-05-30 11:48:01
 */
@Mapper
@Repository
public interface MovieFilmDao {

    /**
     * 通过ID查询单条数据
     *
     * @param filmId 主键
     * @return 实例对象
     */
    MovieFilm queryById(String filmId);

    /**
     * 查询指定行数据
     *
     * @param movieFilm 查询条件
     * @param pageable         分页对象
     * @return 对象列表
     */
    List<MovieFilm> queryAllByLimit(@Param("MovieFilmMap") MovieFilm movieFilm, @Param("pageable") Pageable pageable);

    /**
     * 统计总行数
     *
     * @param movieFilm 查询条件
     * @return 总行数
     */
    long count(MovieFilm movieFilm);

    /**
     * 新增数据
     *
     * @param movieFilm 实例对象
     * @return 影响行数
     */
    int insert(MovieFilm movieFilm);

    /**
     * 批量新增数据（MyBatis原生foreach方法）
     *
     * @param entities List<MovieFilm> 实例对象列表
     * @return 影响行数
     */
    int insertBatch(@Param("entities") List<MovieFilm> entities);

    /**
     * 批量新增或按主键更新数据（MyBatis原生foreach方法）
     *
     * @param entities List<MovieFilm> 实例对象列表
     * @return 影响行数
     * @throws org.springframework.jdbc.BadSqlGrammarException 入参是空List的时候会抛SQL语句错误的异常，请自行校验入参
     */
    int insertOrUpdateBatch(@Param("entities") List<MovieFilm> entities);

    /**
     * 修改数据
     *
     * @param movieFilm 实例对象
     * @return 影响行数
     */
    int update(MovieFilm movieFilm);

    /**
     * 通过主键删除数据
     *
     * @param filmId 主键
     * @return 影响行数
     */
    int deleteById(String filmId);

    /**
     * 根据影片名 来搜索
     * @param value  影片名
     * @return
     */
    List<MovieFilm> search(String value);
}

