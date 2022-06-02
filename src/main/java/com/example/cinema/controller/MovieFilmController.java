package com.example.cinema.controller;
import com.example.cinema.entity.MovieFilm;
import com.example.cinema.service.MovieFilmService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
 * (MovieFilm)表控制层
 *
 * @author makejava
 * @since 2022-05-30 11:48:01
 */
@RestController
@CrossOrigin
@RequestMapping("movieFilm")
public class MovieFilmController {
    /**
     * 服务对象
     */
    @Resource
    private MovieFilmService movieFilmService;

    /**
     * 分页查询
     *
     * @param movieFilm 筛选条件
     * @return 查询结果
     */
    @GetMapping("/queryByPage")
    public ResponseEntity<Page<MovieFilm>> queryByPage(MovieFilm movieFilm,String page,String size) {
        Sort sort = Sort.by(Sort.Direction.DESC,"rexx");
        PageRequest pageRequest = PageRequest.of(Integer.parseInt(page),Integer.parseInt(size), sort);
        return ResponseEntity.ok(this.movieFilmService.queryByPage(movieFilm, pageRequest));
    }

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("/queryById/{id}")
    public ResponseEntity<MovieFilm> queryById(@PathVariable("id") String id) {
        return ResponseEntity.ok(this.movieFilmService.queryById(id));
    }

    /**
     * 新增数据
     *
     * @param movieFilm 实体
     * @return 新增结果
     */
    @PostMapping("/add")
    public ResponseEntity<MovieFilm> add(MovieFilm movieFilm) {
        return ResponseEntity.ok(this.movieFilmService.insert(movieFilm));
    }

    /**
     * 编辑数据
     *
     * @param movieFilm 实体
     * @return 编辑结果
     */
    @PutMapping("/edit")
    public ResponseEntity<MovieFilm> edit(MovieFilm movieFilm) {
        return ResponseEntity.ok(this.movieFilmService.update(movieFilm));
    }

    /**
     * 删除数据
     *
     * @param id 主键
     * @return 删除是否成功
     */
    @DeleteMapping("/deleteById")
    public ResponseEntity<Boolean> deleteById(String id) {
        return ResponseEntity.ok(this.movieFilmService.deleteById(id));
    }

    /**
     * 根据影片名 来搜索
     * @param value  影片名
     * @return
     */
    @GetMapping("/search")
    public ResponseEntity<List<MovieFilm>> search(String value) {
        return ResponseEntity.ok(this.movieFilmService.search(value));
    }
}

