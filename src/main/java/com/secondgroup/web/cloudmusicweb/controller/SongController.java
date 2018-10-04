package com.secondgroup.web.cloudmusicweb.controller;


import com.secondgroup.web.cloudmusicweb.exception.ExcelException;
import com.secondgroup.web.cloudmusicweb.service.ISongService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

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

}
