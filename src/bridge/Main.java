package bridge;

import bridge.notification.EmailNotification;
import bridge.notification.Notification;
import bridge.notification.SmsNotification;
import bridge.provider.AwsProvider;
import bridge.provider.TwilioProvider;

public class Main {
    public static void main(String[] args) {
        Notification notification = new EmailNotification(new AwsProvider());
        notification.send();
        Notification smsNotification = new SmsNotification(new TwilioProvider());
        smsNotification.send();
    }
}
