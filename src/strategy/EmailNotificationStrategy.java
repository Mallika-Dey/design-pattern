package strategy;

public class EmailNotificationStrategy implements NotificationStrategy {
    @Override
    public void send() {
        System.out.println("Email notification");
    }
}
