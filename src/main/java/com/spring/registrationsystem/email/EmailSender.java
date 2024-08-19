package com.spring.registrationsystem.email;

public interface EmailSender {
    void send(String to, String email);
}
