# springcloud-eureka-study

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
