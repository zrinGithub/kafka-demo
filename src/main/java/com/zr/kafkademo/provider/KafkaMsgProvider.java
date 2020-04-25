package com.zr.kafkademo.provider;

import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

/**
 * Description:
 *
 * @author zhangr
 * 2020/4/25 20:25
 */
@Component
@Slf4j
public class KafkaMsgProvider {
    @Resource
    private KafkaTemplate<String,String> kafkaTemplate;

    @Scheduled(cron = "0 0 * * * ? ")
    public void send(){

    }
}
