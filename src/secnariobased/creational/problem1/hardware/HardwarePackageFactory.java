package secnariobased.creational.problem1.hardware;

import secnariobased.creational.problem1.display.screeninterface.Display;
import secnariobased.creational.problem1.identification.IdentificationCard;
import secnariobased.creational.problem1.microcontroller.MicroController;
import secnariobased.creational.problem1.storage.Storage;

public interface HardwarePackageFactory {
    public MicroController getMicroController();

    public IdentificationCard getIdentificationCard();

    public Storage getStorage();

    public Display getDisplay();
}
