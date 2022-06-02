package com.example.cinema.controller;

import com.example.cinema.entity.MovieClassify;
import com.example.cinema.service.MovieClassifyService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * (MovieClassify)表控制层
 *
 * @author makejava
 * @since 2022-05-30 11:48:00
 */
@RestController
@CrossOrigin
@RequestMapping("movieClassify")
public class MovieClassifyController {
    /**
     * 服务对象
     */
    @Resource
    private MovieClassifyService movieClassifyService;

    /**
     * 分页查询
     *
     * @param movieClassify
     * @return 查询结果
     * @param page 分页页数
     * @param size 分页大小
     */
    @GetMapping("/queryByPage")
    public ResponseEntity<Page<MovieClassify>> queryByPage(MovieClassify movieClassify,String page,String size) {
        Sort sort = Sort.by(Sort.Direction.DESC,"filmClassifyName");
        PageRequest pageRequest = PageRequest.of(Integer.parseInt(page),Integer.parseInt(size), sort);
        return ResponseEntity.ok(this.movieClassifyService.queryByPage(movieClassify, pageRequest));
    }

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("/queryById/{id}")
    public ResponseEntity<MovieClassify> queryById(@PathVariable("id") String id) {
        return ResponseEntity.ok(this.movieClassifyService.queryById(id));
    }

    /**
     * 新增数据
     *
     * @param movieClassify 实体
     * @return 新增结果
     */
    @PostMapping("/add")
    public ResponseEntity<MovieClassify> add(MovieClassify movieClassify) {
        return ResponseEntity.ok(this.movieClassifyService.insert(movieClassify));
    }

    /**
     * 编辑数据
     *
     * @param movieClassify 实体
     * @return 编辑结果
     */
    @PutMapping("/edit")
    public ResponseEntity<MovieClassify> edit(MovieClassify movieClassify) {
        return ResponseEntity.ok(this.movieClassifyService.update(movieClassify));
    }

    /**
     * 删除数据
     *
     * @param id 主键
     * @return 删除是否成功
     */
    @DeleteMapping("/deleteById")
    public ResponseEntity<Boolean> deleteById(String id) {
        return ResponseEntity.ok(this.movieClassifyService.deleteById(id));
    }

}

