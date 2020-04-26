package com.zr.kafkademo.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Description:
 *
 * @author zhangr
 * 2020/4/26 14:50
 * }
 */
@Slf4j
@RestController
public class LogController {
    @Value("${customize.test-value}")
    private String testValue;

    @GetMapping("test/log")
    public void testLogLevel() {
        log.error("----------LOGGER error----------" + testValue);
        log.warn("----------LOGGER warn----------" + testValue);
        log.info("----------LOGGER info----------" + testValue);
        log.debug("----------LOGGER debug----------" + testValue);
        log.trace("----------LOGGER trace----------" + testValue);
    }
}
