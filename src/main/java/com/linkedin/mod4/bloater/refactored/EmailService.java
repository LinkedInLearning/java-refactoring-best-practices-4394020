package com.linkedin.mod4.bloater.refactored;

public class EmailService {
    public void sendEmail(String recipient, String subject, String message) {
        EmailService emailService = new EmailService(); // dependency injection would be preferred here
        emailService.sendEmail(recipient, subject, message);
    }
}
