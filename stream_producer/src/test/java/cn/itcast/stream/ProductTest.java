package cn.itcast.stream;

import cn.itcast.stream.producer.MessageSender;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @author 林俊杰
 * @create 2020-04-09 14:17
 */

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
public class ProductTest {
    @Autowired
    private MessageSender messageSender;

    @Test
    public void testSend() {
        for (int i = 0; i < 5; i++) {
            messageSender.send("1");
        }
    }
}
