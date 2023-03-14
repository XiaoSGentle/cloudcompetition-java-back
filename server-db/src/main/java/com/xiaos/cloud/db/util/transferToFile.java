package com.xiaos.cloud.db.util;

import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;

public class transferToFile {

    public  static  File transferToFile(MultipartFile multipartFile) {
        File file = null;
        try {
            //获取名称
            String originalFilename = multipartFile.getOriginalFilename();
            assert originalFilename != null;
            //分割字符串数组
            String[] filename = originalFilename.split("\\.");
            file=File.createTempFile(filename[0], filename[1]);
            multipartFile.transferTo(file);
            file.deleteOnExit();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return file;
    }
}
