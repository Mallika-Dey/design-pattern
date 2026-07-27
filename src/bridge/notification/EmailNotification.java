package bridge.notification;

import bridge.provider.Provider;

public class EmailNotification implements Notification {
    private final Provider provider;

    public EmailNotification(Provider provider) {
        this.provider = provider;
    }

    @Override
    public void send() {
        System.out.println("Email notification");
        provider.processNotification();
    }
}
