package com.example.cinema.controller;

import com.example.cinema.entity.MovieFilmHistory;
import com.example.cinema.service.MovieFilmHistoryService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * (MovieFilmHistory)表控制层
 *
 * @author makejava
 * @since 2022-05-30 11:48:01
 */
@RestController
@RequestMapping("movieFilmHistory")
public class MovieFilmHistoryController {
    /**
     * 服务对象
     */
    @Resource
    private MovieFilmHistoryService movieFilmHistoryService;

    /**
     * 分页查询
     *
     * @param movieFilmHistory 筛选条件
     * @return 查询结果
     */
    @GetMapping("/queryByPage")
    public ResponseEntity<Page<MovieFilmHistory>> queryByPage(MovieFilmHistory movieFilmHistory,String page,String size) {
        Sort sort = Sort.by(Sort.Direction.DESC,"rexx");
        PageRequest pageRequest = PageRequest.of(Integer.parseInt(page),Integer.parseInt(size), sort);
        return ResponseEntity.ok(this.movieFilmHistoryService.queryByPage(movieFilmHistory, pageRequest));
    }

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("/queryById/{id}")
    public ResponseEntity<MovieFilmHistory> queryById(@PathVariable("id") String id) {
        return ResponseEntity.ok(this.movieFilmHistoryService.queryById(id));
    }

    /**
     * 新增数据
     *
     * @param movieFilmHistory 实体
     * @return 新增结果
     */
    @PostMapping("/add")
    public ResponseEntity<MovieFilmHistory> add(MovieFilmHistory movieFilmHistory) {
        return ResponseEntity.ok(this.movieFilmHistoryService.insert(movieFilmHistory));
    }

    /**
     * 编辑数据
     *
     * @param movieFilmHistory 实体
     * @return 编辑结果
     */
    @PutMapping("/edit")
    public ResponseEntity<MovieFilmHistory> edit(MovieFilmHistory movieFilmHistory) {
        return ResponseEntity.ok(this.movieFilmHistoryService.update(movieFilmHistory));
    }

    /**
     * 删除数据
     *
     * @param id 主键
     * @return 删除是否成功
     */
    @DeleteMapping("/deleteById")
    public ResponseEntity<Boolean> deleteById(String id) {
        return ResponseEntity.ok(this.movieFilmHistoryService.deleteById(id));
    }

}

