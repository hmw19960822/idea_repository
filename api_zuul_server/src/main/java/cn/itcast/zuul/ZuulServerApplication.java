package cn.itcast.zuul;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

/**
 * @author 林俊杰
 * @create 2020-04-06 17:00
 */
@SpringBootApplication
//开启zuul网关功能
@EnableZuulProxy
//eureka的服务发现
@EnableDiscoveryClient
public class ZuulServerApplication {
    public static void main(String[] args) {
        SpringApplication.run(ZuulServerApplication.class,args);
    }
}
