package com.example.cinema.dao;

import com.example.cinema.entity.MovieFile;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * (MovieFile)表数据库访问层
 *
 * @author makejava
 * @since 2022-05-30 11:48:01
 */
@Mapper
@Repository
public interface MovieFileDao {

    /**
     * 通过ID查询单条数据
     *
     * @param fileId 主键
     * @return 实例对象
     */
    MovieFile queryById(String fileId);

    /**
     * 查询指定行数据
     *
     * @param movieFile 查询条件
     * @param pageable         分页对象
     * @return 对象列表
     */
    List<MovieFile> queryAllByLimit(@Param("MovieFileMap") MovieFile movieFile, @Param("pageable") Pageable pageable);

    /**
     * 统计总行数
     *
     * @param movieFile 查询条件
     * @return 总行数
     */
    long count(MovieFile movieFile);

    /**
     * 新增数据
     *
     * @param movieFile 实例对象
     * @return 影响行数
     */
    int insert(MovieFile movieFile);

    /**
     * 批量新增数据（MyBatis原生foreach方法）
     *
     * @param entities List<MovieFile> 实例对象列表
     * @return 影响行数
     */
    int insertBatch(@Param("entities") List<MovieFile> entities);

    /**
     * 批量新增或按主键更新数据（MyBatis原生foreach方法）
     *
     * @param entities List<MovieFile> 实例对象列表
     * @return 影响行数
     * @throws org.springframework.jdbc.BadSqlGrammarException 入参是空List的时候会抛SQL语句错误的异常，请自行校验入参
     */
    int insertOrUpdateBatch(@Param("entities") List<MovieFile> entities);

    /**
     * 修改数据
     *
     * @param movieFile 实例对象
     * @return 影响行数
     */
    int update(MovieFile movieFile);

    /**
     * 通过主键删除数据
     *
     * @param fileId 主键
     * @return 影响行数
     */
    int deleteById(String fileId);

}

