package com.lee.hust_prepared.service;

import org.springframework.stereotype.Service;

import javax.xml.ws.ServiceMode;

/**
 * @author 李航
 * @school 哈尔滨理工大学
 * @date 2018/1/13 21:55
 * @desc
 **/
@Service
public class HService {
    public String say() {
        return "this is hust";
    }
}
