package com.example.cinema.service.impl;

import com.example.cinema.entity.MovieFilmCollect;
import com.example.cinema.dao.MovieFilmCollectDao;
import com.example.cinema.service.MovieFilmCollectService;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.PageRequest;

import javax.annotation.Resource;

/**
 * (MovieFilmCollect)表服务实现类
 *
 * @author makejava
 * @since 2022-05-30 11:48:01
 */
@Service("movieFilmCollectService")
public class MovieFilmCollectServiceImpl implements MovieFilmCollectService {
    @Resource
    private MovieFilmCollectDao movieFilmCollectDao;

    /**
     * 通过ID查询单条数据
     *
     * @param collectId 主键
     * @return 实例对象
     */
    @Override
    public MovieFilmCollect queryById(String collectId) {
        return this.movieFilmCollectDao.queryById(collectId);
    }

    /**
     * 分页查询
     *
     * @param movieFilmCollect 筛选条件
     * @param pageRequest      分页对象
     * @return 查询结果
     */
    @Override
    public Page<MovieFilmCollect> queryByPage(MovieFilmCollect movieFilmCollect, PageRequest pageRequest) {
        long total = this.movieFilmCollectDao.count(movieFilmCollect);
        return new PageImpl<>(this.movieFilmCollectDao.queryAllByLimit(movieFilmCollect, pageRequest), pageRequest, total);
    }

    /**
     * 新增数据
     *
     * @param movieFilmCollect 实例对象
     * @return 实例对象
     */
    @Override
    public MovieFilmCollect insert(MovieFilmCollect movieFilmCollect) {
        this.movieFilmCollectDao.insert(movieFilmCollect);
        return movieFilmCollect;
    }

    /**
     * 修改数据
     *
     * @param movieFilmCollect 实例对象
     * @return 实例对象
     */
    @Override
    public MovieFilmCollect update(MovieFilmCollect movieFilmCollect) {
        this.movieFilmCollectDao.update(movieFilmCollect);
        return this.queryById(movieFilmCollect.getCollectId());
    }

    /**
     * 通过主键删除数据
     *
     * @param collectId 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(String collectId) {
        return this.movieFilmCollectDao.deleteById(collectId) > 0;
    }
}
