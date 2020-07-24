package com.leo.flowrestrict.algorithms;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import lombok.extern.slf4j.Slf4j;

/**
 * Created by leo on 2020/7/23.
 * Description:
 */
@Component
@Slf4j
public class TokenBucket {
    @Value("${algorithms.token-bucket.rate}")
    public void setRate(Long rate) {
        this.rate = rate;
    }

    @Value("${algorithms.token-bucket.cap}")
    public void setCap(Long cap) {
        this.cap = cap;
    }

    private Lock lock = new ReentrantLock();

    private Long rate;
    private Long cap;
    private Long tokens;
    private Long timeStamp;

    public Boolean filter() {
        try {
            lock.lock();
            Long now = System.currentTimeMillis();
            tokens = Math.min(cap, tokens + (now - timeStamp) * rate);
            timeStamp = now;
            if (tokens > 0) {
                tokens -= 1;
                return true;
            } else {
                return false;
            }
        } catch (Throwable t) {
            log.error("[Bucket Error Happen]", t);

        } finally {
            lock.unlock();
        }
        return false;

    }
}
