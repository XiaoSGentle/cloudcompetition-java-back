package com.xiaos.cloud.db.service;

import com.xiaos.cloud.db.entity.CompetitionUsers;
import com.baomidou.mybatisplus.extension.service.IService;
import org.springframework.web.multipart.MultipartFile;

/**
 * <p>
 * 用户表 服务类
 * </p>
 *
 * @author xiaos
 * @since 2023-02-20
 */
public interface CompetitionUsersService extends IService<CompetitionUsers> {
    boolean addStudentByExcel(MultipartFile file);
}
