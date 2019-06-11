package com.el.bootsync.service.impl;

import com.el.bootsync.service.AsyncService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

/**
 * @Auther: roman.zhang
 * @Date: 2019/6/11 9:54
 * @Version:V1.0
 * @Description:AsyncServiceImpl
 */
@Service
public class AsyncServiceImpl implements AsyncService {
    private static final Logger logger = LoggerFactory.getLogger(AsyncServiceImpl.class);

    /**
     * @Async(“asyncServiceExecutor”)，asyncServiceExecutor是前面ExecutorConfig.
     * java中的方法名，表明executeAsync方法进入的线程池是asyncServiceExecutor方法创建的
     */
    @Override
    @Async("asyncServiceExecutor")
    public void executeAsync() {
        logger.info("start executeAsync");

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        logger.info("end executeAsync");
    }
}
