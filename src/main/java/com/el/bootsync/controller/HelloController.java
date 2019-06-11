package com.el.bootsync.controller;

import com.el.bootsync.service.AsyncService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Auther: roman.zhang
 * @Date: 2019/6/11 9:58
 * @Version:V1.0
 * @Description:HelloController
 */
@RestController
public class HelloController {
    private static final Logger logger = LoggerFactory.getLogger(HelloController.class);

    @Autowired
    private AsyncService asyncService;

    @RequestMapping("/")
    public String submit(){
        logger.info("start submit");

        // service层的任务
        asyncService.executeAsync();

        logger.info("end submit");

        return "success";
    }
}
