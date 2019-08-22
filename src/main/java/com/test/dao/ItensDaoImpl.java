package com.test.dao;

import com.test.dao.IItemsDao;
import com.test.pojo.Items;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanListHandler;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.sql.SQLException;
import java.util.List;

/**
 * @Author:wangjun
 * @Data:Createa in 2019/7/31 0031 17:10
 */
public class ItensDaoImpl implements IItemsDao {
    @Autowired
    private static QueryRunner queryRunner;

    public QueryRunner getQueryRunner() {
        return queryRunner;
    }

    public void setQueryRunner(QueryRunner queryRunner) {
        this.queryRunner = queryRunner;
    }

    @Override
    public List<Items> selectAllItems() throws SQLException {
        String sql = "select * from items";
        return queryRunner.query(sql,new BeanListHandler<Items>(Items.class));
    }
}
