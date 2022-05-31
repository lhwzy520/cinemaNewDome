package com.example.cinema.service;

import com.example.cinema.entity.MovieUser;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;

/**
 * (MovieUser)表服务接口
 *
 * @author makejava
 * @since 2022-05-30 11:48:01
 */
public interface MovieUserService {

    /**
     * 通过ID查询单条数据
     *
     * @param userId 主键
     * @return 实例对象
     */
    MovieUser queryById(String userId);

    /**
     * 分页查询
     *
     * @param movieUser 筛选条件
     * @param pageRequest      分页对象
     * @return 查询结果
     */
    Page<MovieUser> queryByPage(MovieUser movieUser, PageRequest pageRequest);

    /**
     * 新增数据
     *
     * @param movieUser 实例对象
     * @return 实例对象
     */
    MovieUser insert(MovieUser movieUser);

    /**
     * 修改数据
     *
     * @param movieUser 实例对象
     * @return 实例对象
     */
    MovieUser update(MovieUser movieUser);

    /**
     * 通过主键删除数据
     *
     * @param userId 主键
     * @return 是否成功
     */
    boolean deleteById(String userId);

}
