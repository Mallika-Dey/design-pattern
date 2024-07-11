package secnariobased.creational.problem1.display;

import secnariobased.creational.problem1.controller.ButtonController;
import secnariobased.creational.problem1.display.screeninterface.Display;

public class LCDDisplay extends Display {
    public LCDDisplay(ButtonController controller) {
        super(controller);
    }

    @Override
    public void display() {
        System.out.println("lcd display");
    }
}
