package com.stellariver.bilbo;

import com.intellij.notification.NotificationGroupManager;
import com.intellij.notification.NotificationType;
import com.intellij.openapi.project.Project;

public class LogUtil {

    public static void info(Project project, String content) {
        log(project, content, NotificationType.INFORMATION);
    }

    public static void warning(Project project, String content) {
        log(project, content, NotificationType.WARNING);
    }

    public static void error(Project project, String content) {
        log(project, content, NotificationType.ERROR);
    }

    private static void log(Project project, String content, NotificationType notificationType) {
        NotificationGroupManager.getInstance()
                .getNotificationGroup("bilboNotificationGroup")
                .createNotification(content, notificationType)
                .notify(project);
    }
}
