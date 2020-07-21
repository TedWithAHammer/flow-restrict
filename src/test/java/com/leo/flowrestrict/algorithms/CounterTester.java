package com.leo.flowrestrict.algorithms;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * Created by leo on 2020/7/21.
 * Description:
 */
@SpringBootTest
public class CounterTester {
    @Autowired
    private Counter counter;

    @Test
    public void testCount() {
        ExecutorService service = Executors.newFixedThreadPool(100);
        while (true) {
            service.submit(() -> System.out.print(String.format("[TimeMills:%d Thread:%s] passed:%s\n", System
                    .currentTimeMillis(), Thread.currentThread().getName(), counter.filter() ? "true" : "fail")));
        }
    }
}
