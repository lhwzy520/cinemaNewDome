package com.example.cinema.service.impl;

import com.example.cinema.entity.MovieFilm;
import com.example.cinema.entity.MovieUser;
import com.example.cinema.dao.MovieUserDao;
import com.example.cinema.service.MovieUserService;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.PageRequest;

import javax.annotation.Resource;
import java.text.SimpleDateFormat;
import java.util.List;

/**
 * (MovieUser)表服务实现类
 *
 * @author makejava
 * @since 2022-05-30 11:48:01
 */
@Service("movieUserService")
public class MovieUserServiceImpl implements MovieUserService {
    @Resource
    private MovieUserDao movieUserDao;

    /**
     * 通过ID查询单条数据
     *
     * @param userId 主键
     * @return 实例对象
     */
    @Override
    public MovieUser queryById(String userId) {
        return this.movieUserDao.queryById(userId);
    }

    /**
     * 分页查询
     *
     * @param movieUser   筛选条件
     * @param pageRequest 分页对象
     * @return 查询结果
     */
    @Override
    public Page<MovieUser> queryByPage(MovieUser movieUser, PageRequest pageRequest) {
        long total = this.movieUserDao.count(movieUser);
        return new PageImpl<>(this.movieUserDao.queryAllByLimit(movieUser, pageRequest), pageRequest, total);
    }

    /**
     * 新增数据
     *
     * @param movieUser 实例对象
     * @return 实例对象
     */
    @Override
    public MovieUser insert(MovieUser movieUser) {
        //设置默认注册时间
        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        movieUser.setUserRegistrationTime(df.format(System.currentTimeMillis()));
        this.movieUserDao.insert(movieUser);
        return movieUser;
    }

    /**
     * 修改数据
     *
     * @param movieUser 实例对象
     * @return 实例对象
     */
    @Override
    public MovieUser update(MovieUser movieUser) {
        this.movieUserDao.update(movieUser);
        return this.queryById(movieUser.getUserId());
    }

    /**
     * 通过主键删除数据
     *
     * @param userId 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(String userId) {
        return this.movieUserDao.deleteById(userId) > 0;
    }

    /**
     * 根据用户昵称 来搜索
     * @param value  用户昵称
     * @return 返回搜索的集合
     */
    @Override
    public List<MovieUser> search(String value) {
        return this.movieUserDao.search(value);
    }
    /**
     * 用户登录 接口
     * @param userName 用户账户
     * @param password 用户密码
     * @return
     */
    @Override
    public MovieUser userLogin(String userName, String password) {
        return this.movieUserDao.userLogin(userName,password);
    }
}
