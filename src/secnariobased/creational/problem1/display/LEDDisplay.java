package secnariobased.creational.problem1.display;

import secnariobased.creational.problem1.controller.Controller;
import secnariobased.creational.problem1.display.screeninterface.Display;

public class LEDDisplay extends Display {
    public LEDDisplay(Controller controller) {
        super(controller);
    }

    @Override
    public void display() {
        System.out.println("led display");
    }
}
