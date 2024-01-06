package com.itxuyj.controller;

import com.itxuyj.domain.Goods;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;

/**
 * 服务调用方
 */
@RestController
@RequestMapping("/order")
public class OrderController {

    @Autowired
    private RestTemplate restTemplate;


    @Autowired
    private DiscoveryClient discoveryClient;


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

        /*
            动态从Eureka Server 中获取 provider 的 ip 和端口
            1.注入DiscoveryClient 对象
            2.调用方法
         */

        //演示discoveryClient 使用
        List<ServiceInstance> instances = discoveryClient.getInstances("PROVIDER-SERVER");

        //判断集合是否有数据
        if (instances == null || instances.size() == 0) {
            //集合没有数据
            return null;
        }

        ServiceInstance serviceInstance = instances.get(0);
        String host = serviceInstance.getHost(); //获取ip
        int port = serviceInstance.getPort(); //获取端口

        System.out.println(host);
        System.out.println(port);

        String url = "http://"+host+"+:"+port+"/goods/findOne/" + id;
        //3.调用方法
        Goods goods = restTemplate.getForObject("http://localhost:8667/goods/findOne/" + id, Goods.class);

        return goods;
    }
}
