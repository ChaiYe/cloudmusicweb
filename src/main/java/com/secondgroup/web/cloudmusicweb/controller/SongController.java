package com.secondgroup.web.cloudmusicweb.controller;


import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.secondgroup.web.cloudmusicweb.entity.Song;
import com.secondgroup.web.cloudmusicweb.exception.ExcelException;
import com.secondgroup.web.cloudmusicweb.pagemodel.Grid;
import com.secondgroup.web.cloudmusicweb.service.ISongService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpSession;
import java.util.List;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author secondground
 * @since 2018-09-21
 */
@RestController
@RequestMapping("/song")
public class SongController {

    @Autowired
    private ISongService songService;

    @PostMapping("/import")
    @ResponseBody
    public boolean addSong(@RequestParam("file") MultipartFile file) {

        boolean a = false;

        String fileName = file.getOriginalFilename();

        try {
            a = songService.batchImport(fileName, file);
        } catch (Exception e) {
            e.printStackTrace();
        } catch (ExcelException e) {
            e.printStackTrace();
        }

        return a;

    }

    @RequestMapping("/song_page")
    public Grid<Song> getSongs(@RequestParam(value ="page",defaultValue = "1") Integer current, @RequestParam(value ="limit" ,defaultValue = "10") Integer size, @RequestParam(value = "condition",defaultValue = "") String condition, HttpSession session){
        QueryWrapper<Song> songQueryWrapper=new QueryWrapper<>();

        List<Song> songList= songService.getPage(current,size,condition);

        Grid<Song> songGrid = new Grid<>();
        songGrid.setCode(0);
        songGrid.setMsg("");
        songGrid.setCount((long) songService.count(songQueryWrapper));
        songGrid.setData(songList);

        return songGrid;
    }


    @RequestMapping("/del_song")
    public Boolean delSong(Integer id){
        boolean b = songService.removeById(id);
        return b;
    }

    @RequestMapping("/del_songs")
    public Boolean delSongs(@RequestBody List<Song> songs){
        for(Song song:songs){
            delSong(song.getSongId());
        }
        return true;
    }



}
