package com.itxuyj.controller;

import com.itxuyj.domain.Goods;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * 服务调用方
 */
@RestController
@RequestMapping("/order")
public class OrderController {

    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/goods/{id}")
    public Goods findGoodsById(@PathVariable("id") int id) {

        System.out.println("findGoodsById..." + id);
        /*
            远程调用Goods服务中的findOne接口
            使用RestTemplate
            1.定义Bean  restTemplate
            2.注入Bean
            3.调用方法
         */
        return restTemplate.getForObject("http://localhost:8667/goods/findOne/" + id, Goods.class);
    }
}
