package com.test.service;

import com.test.pojo.Items;

import java.util.List;

/**
 * @Author:wangjun
 * @Data:Createa in 2019/7/31 0031 17:11
 */
public interface IItemsService {
    List<Items> selectAllItems();
}
