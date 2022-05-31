package com.example.cinema.service.impl;

import com.example.cinema.entity.MovieFile;
import com.example.cinema.dao.MovieFileDao;
import com.example.cinema.service.MovieFileService;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.PageRequest;

import javax.annotation.Resource;

/**
 * (MovieFile)表服务实现类
 *
 * @author makejava
 * @since 2022-05-30 11:48:01
 */
@Service("movieFileService")
public class MovieFileServiceImpl implements MovieFileService {
    @Resource
    private MovieFileDao movieFileDao;

    /**
     * 通过ID查询单条数据
     *
     * @param fileId 主键
     * @return 实例对象
     */
    @Override
    public MovieFile queryById(String fileId) {
        return this.movieFileDao.queryById(fileId);
    }

    /**
     * 分页查询
     *
     * @param movieFile 筛选条件
     * @param pageRequest      分页对象
     * @return 查询结果
     */
    @Override
    public Page<MovieFile> queryByPage(MovieFile movieFile, PageRequest pageRequest) {
        long total = this.movieFileDao.count(movieFile);
        return new PageImpl<>(this.movieFileDao.queryAllByLimit(movieFile, pageRequest), pageRequest, total);
    }

    /**
     * 新增数据
     *
     * @param movieFile 实例对象
     * @return 实例对象
     */
    @Override
    public MovieFile insert(MovieFile movieFile) {
        this.movieFileDao.insert(movieFile);
        return movieFile;
    }

    /**
     * 修改数据
     *
     * @param movieFile 实例对象
     * @return 实例对象
     */
    @Override
    public MovieFile update(MovieFile movieFile) {
        this.movieFileDao.update(movieFile);
        return this.queryById(movieFile.getFileId());
    }

    /**
     * 通过主键删除数据
     *
     * @param fileId 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(String fileId) {
        return this.movieFileDao.deleteById(fileId) > 0;
    }
}
