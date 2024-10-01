package com.imansyaefulloh.spring.core;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = {
    "com.imansyaefulloh.spring.core.configuration"
})
public class ScanConfiguration {

}
