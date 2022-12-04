package com.learning;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class UserService {
    public NotificationService notificationService;
    public UserService(NotificationService notificationService){
        this.notificationService = notificationService;
    }
}
