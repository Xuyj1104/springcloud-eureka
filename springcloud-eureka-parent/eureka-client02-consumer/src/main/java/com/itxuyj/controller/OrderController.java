package com.itxuyj.controller;

import com.itxuyj.domain.Goods;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 服务调用方
 */
@RestController
@RequestMapping("/order")
public class OrderController {

    @GetMapping("/goods/{id}")
    public Goods findGoodsById(@PathVariable("id") int id) {

        System.out.println("findGoodsById..." + id);
        //远程调用Goods服务中的findOne接口
        return null;
    }
}
