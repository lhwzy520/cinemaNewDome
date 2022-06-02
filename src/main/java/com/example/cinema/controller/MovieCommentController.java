package com.example.cinema.controller;

import com.example.cinema.entity.MovieComment;
import com.example.cinema.service.MovieCommentService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * (MovieComment)表控制层
 *
 * @author makejava
 * @since 2022-05-30 11:48:00
 */
@RestController
@CrossOrigin
@RequestMapping("movieComment")
public class MovieCommentController {
    /**
     * 服务对象
     */
    @Resource
    private MovieCommentService movieCommentService;

    /**
     * 分页查询
     *
     * @param movieComment 筛选条件
     * @return 查询结果
     */
    @GetMapping("/queryByPage")
    public ResponseEntity<Page<MovieComment>> queryByPage(MovieComment movieComment,String page,String size) {
        Sort sort = Sort.by(Sort.Direction.DESC,"rexx");
        PageRequest pageRequest = PageRequest.of(Integer.parseInt(page),Integer.parseInt(size), sort);
        return ResponseEntity.ok(this.movieCommentService.queryByPage(movieComment, pageRequest));
    }

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("/queryById/{id}")
    public ResponseEntity<MovieComment> queryById(@PathVariable("id") String id) {
        return ResponseEntity.ok(this.movieCommentService.queryById(id));
    }

    /**
     * 新增数据
     *
     * @param movieComment 实体
     * @return 新增结果
     */
    @PostMapping("/add")
    public ResponseEntity<MovieComment> add(MovieComment movieComment) {
        return ResponseEntity.ok(this.movieCommentService.insert(movieComment));
    }

    /**
     * 编辑数据
     *
     * @param movieComment 实体
     * @return 编辑结果
     */
    @PutMapping("/edit")
    public ResponseEntity<MovieComment> edit(MovieComment movieComment) {
        return ResponseEntity.ok(this.movieCommentService.update(movieComment));
    }

    /**
     * 删除数据
     *
     * @param id 主键
     * @return 删除是否成功
     */
    @DeleteMapping("/deleteById")
    public ResponseEntity<Boolean> deleteById(String id) {
        return ResponseEntity.ok(this.movieCommentService.deleteById(id));
    }

}

