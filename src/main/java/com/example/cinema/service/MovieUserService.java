package com.example.cinema.service;

import com.example.cinema.entity.MovieFilm;
import com.example.cinema.entity.MovieUser;
import org.apache.ibatis.annotations.Param;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;

import java.util.List;

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

    /**
     * 根据用户名称来搜索
     * @param value  用户名
     * @return
     */
    List<MovieUser> search(String value);


    /**
     * 用户登录 接口
     * @param userName 用户账户
     * @param password 用户密码
     * @return
     */
    MovieUser userLogin(String userName,String password);
}
