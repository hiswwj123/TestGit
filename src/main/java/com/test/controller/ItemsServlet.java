package com.test.controller;

import com.test.pojo.Items;
import com.test.service.IItemsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import java.util.List;

/**
 * @Author:wangjun
 * @Data:Createa in 2019/7/31 0031 17:08
 */
@Controller
public class ItemsServlet {
    @Autowired
    private IItemsService iItemsService;

    public List<Items> getAllItems(){
        return iItemsService.selectAllItems();
    }
}
