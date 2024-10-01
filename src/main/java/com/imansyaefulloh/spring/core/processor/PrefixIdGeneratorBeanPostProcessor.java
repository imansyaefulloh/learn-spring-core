package com.imansyaefulloh.spring.core.processor;

import com.imansyaefulloh.spring.core.aware.IdAware;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.core.Ordered;
import org.springframework.stereotype.Component;

import java.util.UUID;

@Slf4j
@Component
public class PrefixIdGeneratorBeanPostProcessor implements BeanPostProcessor, Ordered {

    @Override
    public int getOrder() {
        return 2;
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        log.info("Prefix Id Generator Processor for Bean {}", beanName);
        if (bean instanceof IdAware) {
            log.info("Set Prefix Id Generator for Bean {}", beanName);
            IdAware idAware = (IdAware) bean;
            idAware.setId("MY-PREFIX-" + idAware.getId());
        }
        return bean;
    }


}
