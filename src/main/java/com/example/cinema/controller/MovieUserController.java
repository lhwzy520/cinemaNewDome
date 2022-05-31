package com.example.cinema.controller;

import com.example.cinema.entity.MovieUser;
import com.example.cinema.service.MovieUserService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * (MovieUser)表控制层
 *
 * @author makejava
 * @since 2022-05-30 11:48:01
 */
@RestController
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

}

