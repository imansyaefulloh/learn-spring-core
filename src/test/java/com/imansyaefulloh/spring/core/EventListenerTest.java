package com.imansyaefulloh.spring.core;

import com.imansyaefulloh.spring.core.listener.LoginAgainSuccessListener;
import com.imansyaefulloh.spring.core.listener.LoginSuccessListener;
import com.imansyaefulloh.spring.core.listener.UserListener;
import com.imansyaefulloh.spring.core.service.UserService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

public class EventListenerTest {

    @Configuration
    @Import({
        UserService.class,
        LoginSuccessListener.class,
        LoginAgainSuccessListener.class,
        UserListener.class
    })
    public static class TestConfiguration {

    }

    private ConfigurableApplicationContext applicationContext;

    @BeforeEach
    void setUp() {
        applicationContext = new AnnotationConfigApplicationContext(TestConfiguration.class);
        applicationContext.registerShutdownHook();
    }

    @Test
    void testEvent() {
        UserService userService = applicationContext.getBean(UserService.class);
        userService.login("iman", "secret");
        userService.login("iman2", "secret123");
        userService.login("iman3", "invalid");
    }
}
