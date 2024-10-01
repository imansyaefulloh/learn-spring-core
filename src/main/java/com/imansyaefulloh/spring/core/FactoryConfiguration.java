package com.imansyaefulloh.spring.core;

import com.imansyaefulloh.spring.core.factory.PaymentGatewayClientFactoryBean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import(value = {
    PaymentGatewayClientFactoryBean.class
})
public class FactoryConfiguration {

}
