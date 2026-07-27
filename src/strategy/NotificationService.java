package strategy;

public class NotificationService {
    private final NotificationStrategy strategy;

    public NotificationService(NotificationStrategy strategy) {
        this.strategy = strategy;
    }

    public void send() {
        strategy.send();
    }
}
