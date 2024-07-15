package secnariobased.creational.problem1.hardware;

import secnariobased.creational.problem1.display.screeninterface.Display;
import secnariobased.creational.problem1.identification.IdentificationCard;
import secnariobased.creational.problem1.microcontroller.MicroController;
import secnariobased.creational.problem1.storage.Storage;

public class HardwarePackage {
    private MicroController microController;
    private IdentificationCard identificationCard;
    private Storage storage;
    private Display display;

    public HardwarePackage(HardwarePackageFactory hardwarePackageFactory) {
        microController = hardwarePackageFactory.getMicroController();
        identificationCard = hardwarePackageFactory.getIdentificationCard();
        storage = hardwarePackageFactory.getStorage();
        display = hardwarePackageFactory.getDisplay();
    }

    public Display getDisplay() {
        return display;
    }

    public Storage getStorage() {
        return storage;
    }

    public IdentificationCard getIdentificationCard() {
        return identificationCard;
    }

    public MicroController getMicroController() {
        return microController;
    }
}
