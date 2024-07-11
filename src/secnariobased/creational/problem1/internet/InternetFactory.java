package secnariobased.creational.problem1.internet;

public class InternetFactory {
    public Internet internetProvider(String internetType) {
        if (internetType.equalsIgnoreCase("wifi")) {
            return new WiFi();
        } else if (internetType.equalsIgnoreCase("gsm")) {
            return new GSM();
        } else if (internetType.equalsIgnoreCase("ethernet")) {
            return new Ethernet();
        }
        return null;
    }
}
