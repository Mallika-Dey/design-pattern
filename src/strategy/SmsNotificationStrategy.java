package strategy;

public class SmsNotificationStrategy implements NotificationStrategy {
    @Override
    public void send() {
        System.out.println("SMS notification");
    }
}
