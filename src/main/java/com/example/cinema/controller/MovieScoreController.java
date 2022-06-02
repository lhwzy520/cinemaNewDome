package com.example.cinema.controller;

import com.example.cinema.entity.MovieScore;
import com.example.cinema.service.MovieScoreService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * (MovieScore)表控制层
 *
 * @author makejava
 * @since 2022-05-30 11:48:01
 */
@RestController
@CrossOrigin
@RequestMapping("movieScore")
public class MovieScoreController {
    /**
     * 服务对象
     */
    @Resource
    private MovieScoreService movieScoreService;

    /**
     * 分页查询
     *
     * @param movieScore 筛选条件
     * @return 查询结果
     */
    @GetMapping("/queryByPage")
    public ResponseEntity<Page<MovieScore>> queryByPage(MovieScore movieScore,String page,String size) {
        Sort sort = Sort.by(Sort.Direction.DESC,"rexx");
        PageRequest pageRequest = PageRequest.of(Integer.parseInt(page),Integer.parseInt(size), sort);
        return ResponseEntity.ok(this.movieScoreService.queryByPage(movieScore, pageRequest));
    }

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("/queryById/{id}")
    public ResponseEntity<MovieScore> queryById(@PathVariable("id") String id) {
        return ResponseEntity.ok(this.movieScoreService.queryById(id));
    }

    /**
     * 新增数据
     *
     * @param movieScore 实体
     * @return 新增结果
     */
    @PostMapping("/add")
    public ResponseEntity<MovieScore> add(MovieScore movieScore) {
        return ResponseEntity.ok(this.movieScoreService.insert(movieScore));
    }

    /**
     * 编辑数据
     *
     * @param movieScore 实体
     * @return 编辑结果
     */
    @PutMapping("/edit")
    public ResponseEntity<MovieScore> edit(MovieScore movieScore) {
        return ResponseEntity.ok(this.movieScoreService.update(movieScore));
    }

    /**
     * 删除数据
     *
     * @param id 主键
     * @return 删除是否成功
     */
    @DeleteMapping("/deleteById")
    public ResponseEntity<Boolean> deleteById(String id) {
        return ResponseEntity.ok(this.movieScoreService.deleteById(id));
    }

}

