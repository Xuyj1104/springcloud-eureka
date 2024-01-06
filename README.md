# springcloud-eureka-study

# Eureka - 远程调用

1.搭建Provvider 和 Consumer服务

2.使用RestTemplate完成远程调用

3.搭建Eureka Server服务

4.改造Provider 和 Consumer成为Eureka Client

5.Consumer服务 通过Eureka Server中抓取Provider地址 完成远程调用

需求：创建两个模块，A模块和B模块，在B模块调用A模块的接口

解决：使用Spring提供的RestTemplate实现接口调用

实现步骤：

1.将RestTemplate加载至spring容器；

    @Configuration
    public class RestTemplateConfig {

        @Bean
        public RestTemplate restTemplate() {
            return new RestTemplate();
        }
    }

2.
