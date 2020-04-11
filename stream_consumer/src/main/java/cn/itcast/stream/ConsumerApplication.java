package cn.itcast.stream;

/**
 * @author 林俊杰
 * @create 2020-04-09 13:47
 */

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;




/**
 * 1.引入依赖
 * 2.配置Application.yml
 * 3.需要配置一个通道的接口
 * 内置获取消息的通道接口
 * 4.绑定通道
 * 5.配置一个监听方法：当程序从中间件获取数据之后，执行的业务逻辑方法
 *        需要在监听方法上配置@StreamListener
 */
@SpringBootApplication

public class ConsumerApplication {


    public static void main(String[] args) {
        SpringApplication.run(ConsumerApplication.class);
    }
}
