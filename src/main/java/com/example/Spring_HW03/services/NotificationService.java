package com.example.Spring_HW03.services;

import com.example.Spring_HW03.domain.User;
import org.springframework.stereotype.Service;

@Service
public class NotificationService {

    public String notifyUser(User user) {
        System.out.println("A new user has been created: " + user.getName());
        return null;
    }

    public void sendNotification(String s) {
        System.out.println(s);
    }
}