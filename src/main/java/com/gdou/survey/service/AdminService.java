package com.gdou.survey.service;

import com.gdou.survey.entity.Admin;


public interface AdminService {

    Admin login(String adminName,String password);
    Admin getAdminByToken(String token);
    Admin getAdminById(Long id);
    Admin getAdminByAdminName(String adminName);

}
