package com.example.cinema.controller;

import com.example.cinema.entity.MovieFile;
import com.example.cinema.service.MovieFileService;
import com.example.cinema.toolkit.Constant;
import org.apache.commons.io.FileUtils;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.http.ResponseEntity;
import org.springframework.util.FileSystemUtils;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.annotation.Resource;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.util.*;

/**
 * (MovieFile)表控制层
 *
 * @author makejava
 * @since 2022-05-30 11:48:01
 */
@RestController
@CrossOrigin
@RequestMapping("movieFile")
public class MovieFileController extends HttpServlet {
    public static final String ID = "ID"; // 传递的文件夹id名
    public static final String LOCALITY_URL = "localityUrl"; //文件本地路径
    public static final String FILE_NAME = "fileName"; // 文件名
    public static final String PUBLIC_FILE = "publicFile"; //公共文件夹 名称
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

    /**
     * 上传文件
     * @param file 文件
     * @param request
     * @return
     * @throws Exception
     */
    @PostMapping("/upload")
    public Map<String,String> upload(@RequestParam("file") MultipartFile file, HttpServletRequest request) throws Exception {
        String pathID = request.getParameter(ID);
        //拼接路径
        String uri = pathID != null?Constant.DIRECTORY + pathID + "\\":Constant.DIRECTORY + PUBLIC_FILE + "\\";
        //判断文件夹是否存在，如果不存在，就新建
        File dir = new File(uri);
        if (!dir.exists()) {
            dir.mkdirs();
        }
        //获取文件名
        String fileName = file.getOriginalFilename();
        String newFileName = UUID.randomUUID() + fileName.substring(fileName.lastIndexOf("."));
        File f = new File(dir.getPath() + File.separator + newFileName);
        FileUtils.copyInputStreamToFile(file.getInputStream(), f);
        //本地路径
        String fileUrl = uri + newFileName;
        Map<String,String> map = new HashMap<>();
        map.put(LOCALITY_URL,fileUrl);
        map.put(FILE_NAME,newFileName);
        return map;
    }

    /**
     * 删除指定文件夹或文件
     * @param path 文件夹或文件路径   本地路径
     * @return Boolean 删除成功返回true，删除失败返回false。
     * @param fileName 文件名
     */
    @PostMapping("/file/delete")
    public Boolean uploadCustomPathFile(String path,String fileName){
        String paths = Constant.DIRECTORY + path +"\\" + fileName;
        return FileSystemUtils.deleteRecursively(new File(paths));
    }
}

