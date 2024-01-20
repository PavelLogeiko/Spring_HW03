package com.example.Spring_HW03.services;

import com.example.Spring_HW03.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RegistrationService {
    // автоматическое добавление поля через IOC
    @Autowired
    UserService userService;
    // автоматическое добавление поля через IOC
    @Autowired
    DataProcessingService dataProcessingService;
    NotificationService notificationService;

    // добавление поля через конструктор
    public RegistrationService () {
        notificationService = new NotificationService();
    }

    public UserService getUserService() {
        return userService;
    }

    public DataProcessingService getDataProcessingService() {
        return dataProcessingService;
    }

    public NotificationService getNotificationService() {
        return notificationService;
    }

}
