package bridge.provider;

public class AwsProvider implements Provider {
    @Override
    public void processNotification() {
        System.out.println("AWS notification provider");
    }
}
