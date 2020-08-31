package com.harland.testSharding.task.service;

import com.harland.testSharding.task.dao.SysUserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;

@Configuration
public class SysUserService implements CommandLineRunner {

    @Autowired
    private SysUserDao sysUserDao;

    @Override
    public void run(String... args) throws Exception {

        String name = String.valueOf(System.currentTimeMillis());
        File file = new File("D:\\opt\\aa.jpg");
        InputStream ins = new FileInputStream(file);
        byte[] buffer = new byte[1024];
        int len=0;
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        while((len=ins.read(buffer))!=-1){
            bos.write(buffer,0,len);
        }
        bos.flush();
        byte data[] = bos.toByteArray();
        sysUserDao.updateUserInfo(name, data);
        /*
        SysUser2 user = new SysUser2();
        user.setName(name);
        user.setAvatar(new String( IOUtils.readAllBytes(ins) ));
        sysUserDao.updateUserInfo2( user );*/

    }
}
