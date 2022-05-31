package com.example.cinema.controller;

import com.example.cinema.entity.MovieFilmCategory;
import com.example.cinema.service.MovieFilmCategoryService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * (MovieFilmCategory)表控制层
 *
 * @author makejava
 * @since 2022-05-30 11:48:01
 */
@RestController
@RequestMapping("movieFilmCategory")
public class MovieFilmCategoryController {
    /**
     * 服务对象
     */
    @Resource
    private MovieFilmCategoryService movieFilmCategoryService;

    /**
     * 分页查询
     *
     * @param movieFilmCategory 筛选条件
     * @return 查询结果
     */
    @GetMapping("/queryByPage")
    public ResponseEntity<Page<MovieFilmCategory>> queryByPage(MovieFilmCategory movieFilmCategory,String page,String size) {
        Sort sort = Sort.by(Sort.Direction.DESC,"rexx");
        PageRequest pageRequest = PageRequest.of(Integer.parseInt(page),Integer.parseInt(size), sort);
        return ResponseEntity.ok(this.movieFilmCategoryService.queryByPage(movieFilmCategory, pageRequest));
    }

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("/queryById/{id}")
    public ResponseEntity<MovieFilmCategory> queryById(@PathVariable("id") String id) {
        return ResponseEntity.ok(this.movieFilmCategoryService.queryById(id));
    }

    /**
     * 新增数据
     *
     * @param movieFilmCategory 实体
     * @return 新增结果
     */
    @PostMapping("/add")
    public ResponseEntity<MovieFilmCategory> add(MovieFilmCategory movieFilmCategory) {
        return ResponseEntity.ok(this.movieFilmCategoryService.insert(movieFilmCategory));
    }

    /**
     * 编辑数据
     *
     * @param movieFilmCategory 实体
     * @return 编辑结果
     */
    @PutMapping("/edit")
    public ResponseEntity<MovieFilmCategory> edit(MovieFilmCategory movieFilmCategory) {
        return ResponseEntity.ok(this.movieFilmCategoryService.update(movieFilmCategory));
    }

    /**
     * 删除数据
     *
     * @param id 主键
     * @return 删除是否成功
     */
    @DeleteMapping("/deleteById")
    public ResponseEntity<Boolean> deleteById(String id) {
        return ResponseEntity.ok(this.movieFilmCategoryService.deleteById(id));
    }

}

