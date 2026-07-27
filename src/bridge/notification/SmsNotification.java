package bridge.notification;

import bridge.provider.Provider;

public class SmsNotification implements Notification {
    private final Provider provider;

    public SmsNotification(Provider provider) {
        this.provider = provider;
    }

    @Override
    public void send() {
        System.out.println("SMS notification");
        provider.processNotification();
    }
}
