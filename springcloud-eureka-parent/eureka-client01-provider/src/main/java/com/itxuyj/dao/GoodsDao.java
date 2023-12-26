package com.itxuyj.dao;

import com.itxuyj.domain.Goods;
import org.springframework.stereotype.Repository;

/**
 * 商品Dao
 */
@Repository
public class GoodsDao {

    public Goods findOne(int id) {
        return new Goods(1, "苹果手机", 5999, 10000);
    }
}
