package secnariobased.creational.problem1.display;

import secnariobased.creational.problem1.controller.ButtonController;
import secnariobased.creational.problem1.display.screeninterface.Display;

public class LEDDisplay extends Display {
    public LEDDisplay(ButtonController controller) {
        super(controller);
    }

    @Override
    public void display() {
        System.out.println("led display");
    }
}
