package bridge.provider;

public class TwilioProvider implements Provider{
    @Override
    public void processNotification() {
        System.out.println("Twilio notification provider");
    }
}
