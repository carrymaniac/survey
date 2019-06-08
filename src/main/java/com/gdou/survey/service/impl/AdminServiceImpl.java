package com.gdou.survey.service.impl;

import com.gdou.survey.dao.AdminDao;
import com.gdou.survey.entity.Admin;
import com.gdou.survey.service.AdminService;
import com.gdou.survey.util.MD5Util;
import com.gdou.survey.util.NumberUtil;
import com.gdou.survey.util.SystemUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service(value = "adminService")
public class AdminServiceImpl implements AdminService {
    @Autowired
    private AdminDao adminDao;

    public Admin login(String adminName, String password) {
        Admin admin = adminDao.getAdminByUserNameAndPassword(adminName, MD5Util.MD5Encode(password,"UTF-8"));
            if(admin != null ){
                String token = getNewToken(System.currentTimeMillis()+"",admin.getId());
                if(adminDao.updateAdminToken(admin.getId(),token)>0){
                    //更新成功
                    admin.setUserToken(token);
                    return admin;
                }
            }
        return null;
    }

    public Admin getAdminByToken(String token) {
        return adminDao.getAdminByToken(token);
    }

    public Admin getAdminById(Long id) {
        return adminDao.getAdminById(id);
    }

    public Admin getAdminByAdminName(String adminName) {
        return adminDao.getAdminByUserName(adminName);
    }


    /**
     * 获取token值
     *
     * @param sessionId
     * @param userId
     * @return
     */
    private String getNewToken(String sessionId, Long userId) {
        String src = sessionId + userId + NumberUtil.genRandomNum(4);
        return SystemUtil.genToken(src);
    }
}
