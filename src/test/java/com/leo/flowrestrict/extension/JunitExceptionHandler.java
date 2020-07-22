package com.leo.flowrestrict.extension;

import org.junit.jupiter.api.extension.ExtensionContext;
import org.junit.jupiter.api.extension.TestExecutionExceptionHandler;

import lombok.extern.slf4j.Slf4j;

/**
 * Created by leo on 2020/7/22.
 * Description:
 */
@Slf4j
public class JunitExceptionHandler implements TestExecutionExceptionHandler {
    @Override
    public void handleTestExecutionException(ExtensionContext extensionContext, Throwable throwable) throws Throwable {
        log.info("[JunitExceptionHandler] handleTestExecutionException");
    }
}
