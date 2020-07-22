package com.leo.flowrestrict.extension;

import org.junit.jupiter.api.extension.ExtensionContext;
import org.junit.jupiter.api.extension.ParameterContext;
import org.junit.jupiter.api.extension.ParameterResolutionException;
import org.junit.jupiter.api.extension.ParameterResolver;

import lombok.extern.slf4j.Slf4j;

/**
 * Created by leo on 2020/7/22.
 * Description:
 */
@Slf4j
public class JunitParameterResolver implements ParameterResolver {
    @Override
    public boolean supportsParameter(ParameterContext parameterContext, ExtensionContext extensionContext) throws
            ParameterResolutionException {
        log.info("[JunitParameterResolver] supportsParameter");
        return false;
    }

    @Override
    public Object resolveParameter(ParameterContext parameterContext, ExtensionContext extensionContext) throws
            ParameterResolutionException {
        log.info("[JunitParameterResolver] resolveParameter");
        return null;
    }
}
