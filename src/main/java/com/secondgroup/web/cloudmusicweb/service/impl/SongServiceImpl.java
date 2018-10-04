package com.secondgroup.web.cloudmusicweb.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.secondgroup.web.cloudmusicweb.entity.Song;
import com.secondgroup.web.cloudmusicweb.exception.ExcelException;
import com.secondgroup.web.cloudmusicweb.mapper.SongMapper;
import com.secondgroup.web.cloudmusicweb.service.ISongService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.io.InputStream;
import java.sql.Time;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author secondground
 * @since 2018-09-21
 */
@Service
@Transactional(readOnly = true)
public class SongServiceImpl extends ServiceImpl<SongMapper, Song> implements ISongService {

    @Autowired
    private SongMapper songMapper;


    @Transactional(readOnly = false,rollbackFor = Exception.class)
    @Override
    public boolean batchImport(String fileName, MultipartFile file) throws ExcelException, Exception {
        boolean notNull = false;

        List<Song> songList = new ArrayList<Song>();

        if (!fileName.matches("^.+\\.(?i)(xls)$") && !fileName.matches("^.+\\.(?i)(xlsx)$")) {
            throw new ExcelException("上传文件格式不正确");
        }
        boolean isExcel2003 = true;
        if (fileName.matches("^.+\\.(?i)(xlsx)$")) {
            isExcel2003 = false;
        }
        InputStream is = file.getInputStream();
        Workbook wb = null;
        if (isExcel2003) {
            wb = new HSSFWorkbook(is);
        } else {
            wb = new XSSFWorkbook(is);
        }
        Sheet sheet = wb.getSheetAt(0);
        if(sheet!=null){
            notNull = true;
        }
        Song song;
        for (int r = 1; r <= sheet.getLastRowNum(); r++) {
            Row row = sheet.getRow(r);
            if (row == null) {
                continue;
            }

            String name = row.getCell(0).getStringCellValue();
            String picUrl = row.getCell(1).getStringCellValue();
            String size = row.getCell(2).getStringCellValue();
            String lyric = row.getCell(3).getStringCellValue();
            String storageUrl = row.getCell(4).getStringCellValue();
            String note = row.getCell(5).getStringCellValue();
            song = new Song();
            song.setName(name);
            song.setPicUrl(picUrl);
            song.setIsActive(1);
            song.setIsVip(0);
            song.setSize(size);
            song.setLyric(lyric);
            song.setStorageUrl(storageUrl);
            song.setPlayback((long) 0);
            song.setCollection((long) 0);
            song.setUploadTime(LocalDateTime.now());
            song.setNote(note);
            song.setDurationTime("1900-01-01 12:23:12");
            song.setIntegral(1);
            song.setSongAlbum(1);
            song.setSongKindIncrease(1);
            song.setSongCommentIncrease(1);
            songList.add(song);


        }

        for (Song songResord : songList) {
            String name = songResord.getName();
            Integer hasSong = songMapper.selectCount(new QueryWrapper<Song>().eq("name", name));
            if (hasSong == 0) {
                songMapper.insert(songResord);
                System.out.println(" 插入 "+songResord);
            } else {
                songMapper.update(songResord,new QueryWrapper<Song>().eq("name",name));
                System.out.println(" 更新 "+songResord);
            }
        }

        return false;
    }
}
