package secnariobased.creational.problem1.hardware;

import secnariobased.creational.problem1.controller.ButtonController;
import secnariobased.creational.problem1.display.LEDDisplay;
import secnariobased.creational.problem1.display.screeninterface.Display;
import secnariobased.creational.problem1.identification.IdentificationCard;
import secnariobased.creational.problem1.identification.RFID;
import secnariobased.creational.problem1.microcontroller.ArduinoMega;
import secnariobased.creational.problem1.microcontroller.MicroController;
import secnariobased.creational.problem1.storage.SDCardStorage;
import secnariobased.creational.problem1.storage.Storage;

public class ArduinoMegaHardwareFactory implements HardwarePackageFactory {

    @Override
    public MicroController getMicroController() {
        return new ArduinoMega();
    }

    @Override
    public IdentificationCard getIdentificationCard() {
        return new RFID();
    }

    @Override
    public Storage getStorage() {
        return new SDCardStorage();
    }

    @Override
    public Display getDisplay() {
        return new LEDDisplay(new ButtonController());
    }
}
