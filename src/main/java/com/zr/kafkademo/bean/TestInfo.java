package com.zr.kafkademo.bean;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * Description:
 *
 * @author zhangr
 * 2020/4/25 19:11
 */
@Data
@AllArgsConstructor
public class TestInfo {
    private String code;
    private Long timeStamp;
}
