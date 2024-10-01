package com.imansyaefulloh.spring.core;

import com.imansyaefulloh.spring.core.configuration.BarConfiguration;
import com.imansyaefulloh.spring.core.configuration.FooConfiguration;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import({
    FooConfiguration.class,
    BarConfiguration.class,
})
public class MainConfiguration {

}
