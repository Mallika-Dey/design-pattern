package secnariobased.creational.problem1.hardware;

import secnariobased.creational.problem1.controller.ScreenController;
import secnariobased.creational.problem1.display.TouchScreen;
import secnariobased.creational.problem1.display.screeninterface.Display;
import secnariobased.creational.problem1.identification.IdentificationCard;
import secnariobased.creational.problem1.identification.NFC;
import secnariobased.creational.problem1.microcontroller.MicroController;
import secnariobased.creational.problem1.microcontroller.RaspberryPi;
import secnariobased.creational.problem1.storage.BuildInStorage;
import secnariobased.creational.problem1.storage.Storage;

public class RaspberryPiHardware implements HardwarePackageFactory {
    @Override
    public MicroController getMicroController() {
        return new RaspberryPi();
    }

    @Override
    public IdentificationCard getIdentificationCard() {
        return new NFC();
    }

    @Override
    public Storage getStorage() {
        return new BuildInStorage();
    }

    @Override
    public Display getDisplay() {
        return new TouchScreen(new ScreenController());
    }
}
