package secnariobased.creational.problem1.identification;

public class IdentificationCardFactory {
    public IdentificationCard generateIdentificationCard(String cardType) {
        if (cardType.equalsIgnoreCase("RFID")) {
            return new RFID();
        } else if (cardType.equalsIgnoreCase("NFC")) {
            return new NFC();
        }
        return null;
    }
}
