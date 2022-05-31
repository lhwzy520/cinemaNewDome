package com.example.cinema.controller;

import com.example.cinema.entity.MovieFilmCollect;
import com.example.cinema.service.MovieFilmCollectService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * (MovieFilmCollect)表控制层
 *
 * @author makejava
 * @since 2022-05-30 11:48:01
 */
@RestController
@RequestMapping("movieFilmCollect")
public class MovieFilmCollectController {
    /**
     * 服务对象
     */
    @Resource
    private MovieFilmCollectService movieFilmCollectService;

    /**
     * 分页查询
     *
     * @param movieFilmCollect 筛选条件
     * @return 查询结果
     */
    @GetMapping("/queryByPage")
    public ResponseEntity<Page<MovieFilmCollect>> queryByPage(MovieFilmCollect movieFilmCollect,String page,String size) {
        Sort sort = Sort.by(Sort.Direction.DESC,"rexx");
        PageRequest pageRequest = PageRequest.of(Integer.parseInt(page),Integer.parseInt(size), sort);
        return ResponseEntity.ok(this.movieFilmCollectService.queryByPage(movieFilmCollect, pageRequest));
    }

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("/queryById/{id}")
    public ResponseEntity<MovieFilmCollect> queryById(@PathVariable("id") String id) {
        return ResponseEntity.ok(this.movieFilmCollectService.queryById(id));
    }

    /**
     * 新增数据
     *
     * @param movieFilmCollect 实体
     * @return 新增结果
     */
    @PostMapping("/add")
    public ResponseEntity<MovieFilmCollect> add(MovieFilmCollect movieFilmCollect) {
        return ResponseEntity.ok(this.movieFilmCollectService.insert(movieFilmCollect));
    }

    /**
     * 编辑数据
     *
     * @param movieFilmCollect 实体
     * @return 编辑结果
     */
    @PutMapping("/edit")
    public ResponseEntity<MovieFilmCollect> edit(MovieFilmCollect movieFilmCollect) {
        return ResponseEntity.ok(this.movieFilmCollectService.update(movieFilmCollect));
    }

    /**
     * 删除数据
     *
     * @param id 主键
     * @return 删除是否成功
     */
    @DeleteMapping("/deleteById")
    public ResponseEntity<Boolean> deleteById(String id) {
        return ResponseEntity.ok(this.movieFilmCollectService.deleteById(id));
    }

}

