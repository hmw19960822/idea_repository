package cn.itcast.stream.channel;

/**
 * @author 林俊杰
 * @create 2020-04-09 15:06
 */

import org.springframework.cloud.stream.annotation.Input;
import org.springframework.cloud.stream.annotation.Output;
import org.springframework.messaging.MessageChannel;
import org.springframework.messaging.SubscribableChannel;

/**
 * 自定义消息通道
 */
public interface MyProcessor {
    /**
     * 消息生产者的配置
     */
    String MYOUTPUT = "myoutput";
    @Output("myoutput")
    MessageChannel myoutput();

    /**
     * 消息消费者配置
     */
    String MYINPUT = "myinput";
    @Input("myinput")
    SubscribableChannel myinput();
}
