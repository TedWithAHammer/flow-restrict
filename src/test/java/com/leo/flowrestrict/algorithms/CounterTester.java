package com.leo.flowrestrict.algorithms;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.leo.flowrestrict.extension.JunitEnvironmentExtension;
import com.leo.flowrestrict.extension.JunitExceptionHandler;
import com.leo.flowrestrict.extension.JunitLifeCycleCallback;
import com.leo.flowrestrict.extension.JunitLoggingExtension;
import com.leo.flowrestrict.extension.JunitParameterResolver;

import lombok.extern.slf4j.Slf4j;

/**
 * Created by leo on 2020/7/21.
 * Description:
 */
@SpringBootTest
@ExtendWith(JunitLoggingExtension.class)
@ExtendWith(JunitEnvironmentExtension.class)
@ExtendWith(JunitLifeCycleCallback.class)
@ExtendWith(JunitParameterResolver.class)
@ExtendWith(JunitExceptionHandler.class)
@Slf4j
public class CounterTester {
    @Autowired
    private Counter counter;

    @Test
    public void testCount() {
        ExecutorService service = Executors.newFixedThreadPool(100);
        log.info("junit test running");
//        while (true) {
//            service.submit(() -> System.out.print(String.format("[TimeMills:%d Thread:%s] passed:%s\n", System
//                    .currentTimeMillis(), Thread.currentThread().getName(), counter.filter() ? "true" : "fail")));
//        }
    }
}
