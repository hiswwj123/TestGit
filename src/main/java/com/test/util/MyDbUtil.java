package com.test.util;

import com.mchange.v2.c3p0.ComboPooledDataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.sql.DataSource;

/**
 * @Author:wangjun
 * @Data:Createa in 2019/7/31 0031 16:57
 */
@Component
public class MyDbUtil {
    @Autowired
    private  ComboPooledDataSource dataSource;

    public  DataSource getDataSource(){
        return dataSource;
    }
}
