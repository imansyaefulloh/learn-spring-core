package com.imansyaefulloh.spring.core;

import com.imansyaefulloh.spring.core.data.cyclic.CyclicA;
import com.imansyaefulloh.spring.core.data.cyclic.CyclicB;
import com.imansyaefulloh.spring.core.data.cyclic.CyclicC;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CyclicConfiguration {

    @Bean
    public CyclicA cyclicA(CyclicB cyclicB) {
        return new CyclicA(cyclicB);
    }

    @Bean
    public CyclicB cyclicB(CyclicC cyclicC) {
        return new CyclicB(cyclicC);
    }

    @Bean
    public CyclicC cyclicC(CyclicA cyclicA) {
        return new CyclicC(cyclicA);
    }
}
