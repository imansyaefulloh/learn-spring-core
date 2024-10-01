package com.imansyaefulloh.spring.core.listener;

import com.imansyaefulloh.spring.core.event.LoginSuccessEvent;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class LoginAgainSuccessListener implements ApplicationListener<LoginSuccessEvent> {


    @Override
    public void onApplicationEvent(LoginSuccessEvent event) {
        log.info("Sucessfully logged again in for user {}", event.getUser());
    }
}
