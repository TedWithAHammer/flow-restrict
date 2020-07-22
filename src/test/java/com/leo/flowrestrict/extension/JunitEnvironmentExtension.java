package com.leo.flowrestrict.extension;

import java.io.EOFException;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

import org.junit.jupiter.api.extension.ConditionEvaluationResult;
import org.junit.jupiter.api.extension.ExecutionCondition;
import org.junit.jupiter.api.extension.ExtensionContext;
import org.yaml.snakeyaml.Yaml;
import org.yaml.snakeyaml.constructor.Constructor;

import com.leo.flowrestrict.bean.ApplicationYml;

import lombok.extern.slf4j.Slf4j;

/**
 * Created by leo on 2020/7/22.
 * Description:
 */
@Slf4j
public class JunitEnvironmentExtension implements ExecutionCondition {
    @Override
    public ConditionEvaluationResult evaluateExecutionCondition(ExtensionContext extensionContext) {
        Yaml yaml = new Yaml(new Constructor(ApplicationYml.class));
        ApplicationYml yml = yaml.load(this.getClass().getClassLoader().getResourceAsStream("application.yml"));

        String env = yml.getSpring().getProfiles().getActive();
        log.info("[JunitEnvironmentExtension]spring.profiles.active:{}", env);
        if ("qa".equals(env)) {
            log.info("[JunitEnvironmentExtension] dev profile activate");
            return ConditionEvaluationResult.disabled("Test disable on qa env");
        }
        return ConditionEvaluationResult.enabled("Test enable on other env");
    }
}
