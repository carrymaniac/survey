package com.gdou.survey.dao;

import com.gdou.survey.entity.Admin;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface AdminDao {
    int addAdmin(Admin admin);
    Admin getAdminById(Long id);
    Admin getAdminByUserName(String userName);
    Admin getAdminByUserNameAndPassword(@Param("userName") String userName, @Param("password") String password);
    int updateAdminToken(@Param("adminId") Long adminId, @Param("newToken") String newToken);
    Admin getAdminByToken(String adminToken);
}
