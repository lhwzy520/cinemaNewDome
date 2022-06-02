package com.example.cinema.controller;

import com.example.cinema.entity.MovieFilm;
import com.example.cinema.entity.MovieUser;
import com.example.cinema.service.MovieUserService;
import com.example.cinema.toolkit.R;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
 * (MovieUser)表控制层
 *
 * @author makejava
 * @since 2022-05-30 11:48:01
 */
@RestController
@CrossOrigin
@RequestMapping("movieUser")
public class MovieUserController {
    /**
     * 服务对象
     */
    @Resource
    private MovieUserService movieUserService;

    /**
     * 分页查询
     *
     * @param movieUser 筛选条件
     * @return 查询结果
     */
    @GetMapping("/queryByPage")
    public ResponseEntity<Page<MovieUser>> queryByPage(MovieUser movieUser,String page,String size) {
        Sort sort = Sort.by(Sort.Direction.DESC,"rexx");
        PageRequest pageRequest = PageRequest.of(Integer.parseInt(page),Integer.parseInt(size), sort);
        return ResponseEntity.ok(this.movieUserService.queryByPage(movieUser, pageRequest));
    }

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("/queryById/{id}")
    public ResponseEntity<MovieUser> queryById(@PathVariable("id") String id) {
        return ResponseEntity.ok(this.movieUserService.queryById(id));
    }

    /**
     * 新增数据
     *
     * @param movieUser 实体
     * @return 新增结果
     */
    @PostMapping("/add")
    public ResponseEntity<MovieUser> add(MovieUser movieUser) {
        return ResponseEntity.ok(this.movieUserService.insert(movieUser));
    }

    /**
     * 编辑数据
     *
     * @param movieUser 实体
     * @return 编辑结果
     */
    @PutMapping("/edit")
    public ResponseEntity<MovieUser> edit(MovieUser movieUser) {
        return ResponseEntity.ok(this.movieUserService.update(movieUser));
    }

    /**
     * 删除数据
     *
     * @param id 主键
     * @return 删除是否成功
     */
    @DeleteMapping("/deleteById")
    public ResponseEntity<Boolean> deleteById(String id) {
        return ResponseEntity.ok(this.movieUserService.deleteById(id));
    }
    /**
     * 根据用户昵称 来搜索
     * @param value  用户昵称
     * @return
     */
    @GetMapping("/search")
    public ResponseEntity<List<MovieUser>> search(String value) {
        return ResponseEntity.ok(this.movieUserService.search(value));
    }


    /**
     * 用户登录
     * @param userName  用户账户
     * @param password  用户密码
     * @return
     */
    @PostMapping("/login")
    public R userLogin(String userName,String password) {
        System.out.println("参数介绍" + userName + ":"  + password);
        try {
            MovieUser user = this.movieUserService.userLogin(userName, password);
            System.out.println("用户的显示" + user);
            if (user.getUserId() != null){
                return R.ok().data("data", user);
            } else {
                return R.error().message("登录失败,请检查账号和密码是否正确！");
            }
        } catch (Exception e) {
            return R.error().message("登录失败,请检查账号和密码是否正确！");
        }
    }
}

