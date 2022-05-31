package com.example.cinema.service;

import com.example.cinema.entity.MovieFile;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.web.multipart.MultipartFile;

/**
 * (MovieFile)表服务接口
 *
 * @author makejava
 * @since 2022-05-30 11:48:01
 */
public interface MovieFileService {

    /**
     * 通过ID查询单条数据
     *
     * @param fileId 主键
     * @return 实例对象
     */
    MovieFile queryById(String fileId);

    /**
     * 分页查询
     *
     * @param movieFile 筛选条件
     * @param pageRequest      分页对象
     * @return 查询结果
     */
    Page<MovieFile> queryByPage(MovieFile movieFile, PageRequest pageRequest);

    /**
     * 新增数据
     *
     * @param movieFile 实例对象
     * @return 实例对象
     */
    MovieFile insert(MovieFile movieFile);

    /**
     * 修改数据
     *
     * @param movieFile 实例对象
     * @return 实例对象
     */
    MovieFile update(MovieFile movieFile);

    /**
     * 通过主键删除数据
     *
     * @param fileId 主键
     * @return 是否成功
     */
    boolean deleteById(String fileId);

}
