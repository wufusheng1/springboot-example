/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2015 All Rights Reserved.
 */
package com.fswu.springboot.newer;

import org.apache.log4j.Logger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author wufs
 * @version $Id: SampleController.java, v 0.1 2017-01-14 ����12:50 wufs Exp $
 */
@Controller
@EnableAutoConfiguration
@SpringBootApplication
public class SampleController {

    private final static Logger LOGGER = Logger.getLogger(SampleController.class);

    @RequestMapping("/")
    @ResponseBody
    String home() {
        LOGGER.info("Receive hello request");
        return "Hello World!";
    }

    public static void main(String[] args) throws Exception {
        SpringApplication.run(SampleController.class, args);
    }
}
