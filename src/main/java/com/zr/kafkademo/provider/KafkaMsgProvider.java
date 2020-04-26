package com.zr.kafkademo.provider;

import com.zr.kafkademo.bean.TestInfo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.util.UUID;

/**
 * Description:
 *
 * @author zhangr
 * 2020/4/25 20:25
 */
//@Component
@Slf4j
public class KafkaMsgProvider {
    @Resource
    private KafkaTemplate<String, Object> kafkaTemplate;

    @Scheduled(cron = "0 0 * * * ? ")
    public void send() {
        String key = UUID.randomUUID().toString();
        final TestInfo info = new TestInfo(key, System.currentTimeMillis());
        //使用uuid作为key
        kafkaTemplate.send("test-info", key, info);
    }
}
