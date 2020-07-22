package com.leo.flowrestrict.extension;

import org.junit.jupiter.api.extension.AfterAllCallback;
import org.junit.jupiter.api.extension.AfterEachCallback;
import org.junit.jupiter.api.extension.BeforeAllCallback;
import org.junit.jupiter.api.extension.BeforeEachCallback;
import org.junit.jupiter.api.extension.ExtensionContext;

import lombok.extern.slf4j.Slf4j;

/**
 * Created by leo on 2020/7/22.
 * Description:
 */
@Slf4j
public class JunitLifeCycleCallback implements
        BeforeAllCallback, AfterAllCallback, BeforeEachCallback, AfterEachCallback {
    @Override
    public void afterAll(ExtensionContext extensionContext) throws Exception {
        log.info("[JunitLifeCycleCallback] afterAll");
    }

    @Override
    public void afterEach(ExtensionContext extensionContext) throws Exception {
        log.info("[JunitLifeCycleCallback] afterEach");

    }

    @Override
    public void beforeAll(ExtensionContext extensionContext) throws Exception {
        log.info("[JunitLifeCycleCallback] beforeAll");

    }

    @Override
    public void beforeEach(ExtensionContext extensionContext) throws Exception {
        log.info("[JunitLifeCycleCallback] beforeEach");

    }
}
