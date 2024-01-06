# springcloud-eureka-study

### 1.Eureka - 远程调用

1.搭建Provvider 和 Consumer服务

2.使用RestTemplate完成远程调用

3.搭建Eureka Server服务

4.改造Provider 和 Consumer成为Eureka Client

5.Consumer服务 通过Eureka Server中抓取Provider地址 完成远程调用


### 2.Eureka - 相关配置及特性

eureka一共有4部分配置

1.server:eureka的服务端配置

2.client:eureka的客户端配置

3.instance:eureka的实例配置

    eureka:
      instance:
        hostname: localhost #主机名
        prefer-ip-address: false #是否将自己的ip注册到eureka中，默认false 注册主机名
        ip-address: 127.0.0.1 #设置当前实例ip
        instance-id: #修改instance-id显示
        lease-renewal-interval-in-seconds: 30 #每一次eureka client 向eureka server 发送心跳的时间间隔
        lease-expiration-duration-in-seconds: 90 #如果90秒内eureka-server没有收到eureka client的心跳包，则剔除该服务

4.dashboard:eureka的web控制台配置


