package com.example.cinema.controller;

import com.example.cinema.entity.MovieFile;
import com.example.cinema.service.MovieFileService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * (MovieFile)表控制层
 *
 * @author makejava
 * @since 2022-05-30 11:48:01
 */
@RestController
@RequestMapping("movieFile")
public class MovieFileController {
    /**
     * 服务对象
     */
    @Resource
    private MovieFileService movieFileService;

    /**
     * 分页查询
     *
     * @param movieFile 筛选条件
     * @return 查询结果
     */
    @GetMapping("/queryByPage")
    public ResponseEntity<Page<MovieFile>> queryByPage(MovieFile movieFile,String page,String size) {
        Sort sort = Sort.by(Sort.Direction.DESC,"rexx");
        PageRequest pageRequest = PageRequest.of(Integer.parseInt(page),Integer.parseInt(size), sort);
        return ResponseEntity.ok(this.movieFileService.queryByPage(movieFile, pageRequest));
    }

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("/queryById/{id}")
    public ResponseEntity<MovieFile> queryById(@PathVariable("id") String id) {
        return ResponseEntity.ok(this.movieFileService.queryById(id));
    }

    /**
     * 新增数据
     *
     * @param movieFile 实体
     * @return 新增结果
     */
    @PostMapping("/add")
    public ResponseEntity<MovieFile> add(MovieFile movieFile) {
        return ResponseEntity.ok(this.movieFileService.insert(movieFile));
    }

    /**
     * 编辑数据
     *
     * @param movieFile 实体
     * @return 编辑结果
     */
    @PutMapping("/edit")
    public ResponseEntity<MovieFile> edit(MovieFile movieFile) {
        return ResponseEntity.ok(this.movieFileService.update(movieFile));
    }

    /**
     * 删除数据
     *
     * @param id 主键
     * @return 删除是否成功
     */
    @DeleteMapping("/deleteById")
    public ResponseEntity<Boolean> deleteById(String id) {
        return ResponseEntity.ok(this.movieFileService.deleteById(id));
    }

}

