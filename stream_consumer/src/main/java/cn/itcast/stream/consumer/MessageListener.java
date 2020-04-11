package cn.itcast.stream.consumer;

import cn.itcast.stream.channer.MyProcessor;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.cloud.stream.messaging.Sink;
import org.springframework.stereotype.Component;

/**
 * @author 林俊杰
 * @create 2020-04-09 14:38
 */
@Component
@EnableBinding(MyProcessor.class)
public class MessageListener {
    //监听binding中的消息
    @StreamListener(MyProcessor.MYINPUT)
    public void input(String message) {
        System.out.println("获取到消息："+message);
    }
}
