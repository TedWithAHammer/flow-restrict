package com.leo.flowrestrict.extension;

import org.junit.jupiter.api.extension.ExtensionContext;
import org.junit.jupiter.api.extension.TestInstancePostProcessor;

import lombok.extern.slf4j.Slf4j;

/**
 * Created by leo on 2020/7/22.
 * Description:
 */
@Slf4j
public class JunitLoggingExtension implements TestInstancePostProcessor {
    @Override
    public void postProcessTestInstance(Object o, ExtensionContext extensionContext) throws Exception {
        log.info("post junit test");
    }
}
