package com.imansyaefulloh.spring.core;

import com.imansyaefulloh.spring.core.data.MultiFoo;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@ComponentScan(basePackages = {
    "com.imansyaefulloh.spring.core.service",
    "com.imansyaefulloh.spring.core.repository",
    "com.imansyaefulloh.spring.core.configuration",
})
@Import(MultiFoo.class)
public class ComponentConfiguration {

}
