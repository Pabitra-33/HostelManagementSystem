package com.example.hostelmanagementsystem.Service;

import com.example.hostelmanagementsystem.Notification;

import javax.persistence.Id;
import java.util.List;

public interface NotificationService {
    Notification saveNotification(Notification notification);
    List<Notification> getAll();
    Notification getNotificationById(Long id);

    Notification updateNotification(Notification noti , Long id);
    void deleteNotification(String not , Long id);
}
