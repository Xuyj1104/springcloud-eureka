package com.itxuyj.service;

import com.itxuyj.dao.GoodsDao;
import com.itxuyj.domain.Goods;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * Goods 业务层
 */
@Service
public class GoodsService {

    @Resource
    private GoodsDao goodsDao;

    public Goods findOne(int id) {
        return goodsDao.findOne(id);
    }

}
