package com.zr.kafkademo.controller;

import lombok.extern.slf4j.Slf4j;
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
    @GetMapping("test/log")
    public void testLogLevel(){
        log.error("----------LOGGER error----------");
        log.warn("----------LOGGER warn----------");
        log.info("----------LOGGER info----------");
        log.debug("----------LOGGER debug----------");
        log.trace("----------LOGGER trace----------");
    }
}
