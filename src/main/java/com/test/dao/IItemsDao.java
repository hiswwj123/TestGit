package com.test.dao;

import com.test.pojo.Items;

import java.sql.SQLException;
import java.util.List;

/**
 * @Author:wangjun
 * @Data:Createa in 2019/7/31 0031 17:09
 */
public interface IItemsDao {
    List<Items> selectAllItems() throws SQLException;

}
