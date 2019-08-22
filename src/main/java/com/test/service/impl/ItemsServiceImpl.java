package com.test.service.impl;

import com.test.dao.IItemsDao;
import com.test.pojo.Items;
import com.test.service.IItemsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.SQLException;
import java.util.List;

/**
 * @Author:wangjun
 * @Data:Createa in 2019/7/31 0031 17:12
 */
@Service
public class ItemsServiceImpl implements IItemsService {
    @Autowired
    private IItemsDao iItemsDao;
    @Override
    public List<Items> selectAllItems() {
       List<Items> itemsList = null;
        try {
            itemsList = iItemsDao.selectAllItems();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return itemsList;
    }
}
