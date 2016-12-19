package de.zalando.zally.rules;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Arrays;

@Configuration
public class RulesValidatorConfiguration {

    @Bean
    public RulesValidator createRulesValidator() {
        return new RulesValidator(Arrays.asList());
    }
}
