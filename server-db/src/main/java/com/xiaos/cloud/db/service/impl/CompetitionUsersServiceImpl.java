package com.xiaos.cloud.db.service.impl;

import cn.hutool.poi.excel.ExcelReader;
import cn.hutool.poi.excel.ExcelUtil;
import com.xiaos.cloud.db.entity.CompetitionUsers;
import com.xiaos.cloud.db.mapper.CompetitionUsersMapper;
import com.xiaos.cloud.db.service.CompetitionUsersService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.xiaos.cloud.db.util.transferToFile;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.OutputStream;
import java.time.LocalDateTime;
import java.util.List;

/**
 * <p>
 * 用户表 服务实现类
 * </p>
 *
 * @author xiaos
 * @since 2023-02-20
 */
@Service
public class CompetitionUsersServiceImpl extends ServiceImpl<CompetitionUsersMapper, CompetitionUsers> implements CompetitionUsersService {


    @Autowired CompetitionUsersMapper studentMapper;
    @Override
    public boolean addStudentByExcel(MultipartFile file) {
        File file1 = transferToFile.transferToFile(file);
        ExcelReader reader = ExcelUtil.getReader( file1,0);
        List<CompetitionUsers> all = reader.readAll(CompetitionUsers.class);
        all.forEach(competitionUsers -> {
            competitionUsers.setAddTime(LocalDateTime.now());
            studentMapper.insert(competitionUsers);
        });
        return true;

    }
}
