package com.leo.flowrestrict.algorithms;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import lombok.extern.slf4j.Slf4j;

/**
 * Created by leo on 2020/7/21.
 * Description:
 */
@Component
@Slf4j
public class Counter {
    @Value("${algorithms.counter.limitation}")
    private Long limitation;
    private Long timeStamp = System.currentTimeMillis();
    private Integer timeGap = 1000;
    private AtomicLong lim;

    @Value("${algorithms.counter.limitation}")
    public void setLim(Long limitation) {
        lim = new AtomicLong(limitation);
    }


    public boolean filter() {
        long gap = System.currentTimeMillis() - timeStamp;
        log.info("Time Gap :{}", gap);
        if (gap >= timeGap) {
            timeStamp = System.currentTimeMillis();
            lim.set(limitation);
            lim.decrementAndGet();
            return true;
        } else {
            if (lim.get() <= 0) {
                return false;
            }
            lim.decrementAndGet();
            return true;
        }

    }
}
