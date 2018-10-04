package com.secondgroup.web.cloudmusicweb.service;

import com.secondgroup.web.cloudmusicweb.entity.Song;
import com.baomidou.mybatisplus.extension.service.IService;
import com.secondgroup.web.cloudmusicweb.exception.ExcelException;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author secondground
 * @since 2018-09-21
 */
public interface ISongService extends IService<Song> {

    boolean batchImport(String fileName, MultipartFile file) throws ExcelException, IOException, Exception;
}
