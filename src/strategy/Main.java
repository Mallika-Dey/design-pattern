package strategy;

public class Main {
    public static void main(String[] args) {
        NotificationService notificationService = new NotificationService(new EmailNotificationStrategy());
        notificationService.send();

        notificationService = new NotificationService(new SmsNotificationStrategy());
        notificationService.send();
    }
}
