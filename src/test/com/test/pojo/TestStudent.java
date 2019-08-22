package com.test.pojo;

import com.test.controller.ItemsServlet;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

/**
 * @Author:wangjun
 * @Data:Createa in 2019/7/31 0031 17:29
 */
public class TestStudent {
    @Test
    public void testSelectAllItems(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");

        ItemsServlet itemsServlet = applicationContext.getBean("itemsServlet", ItemsServlet.class);
        List<Items> allItems = itemsServlet.getAllItems();
        System.out.println(allItems);
    }
}
