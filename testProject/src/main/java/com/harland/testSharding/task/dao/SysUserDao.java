package com.harland.testSharding.task.dao;

import org.apache.ibatis.annotations.Param;

public interface SysUserDao {

    void updateUserInfo(@Param("name") String name, @Param("avatar") byte[] data);

}
