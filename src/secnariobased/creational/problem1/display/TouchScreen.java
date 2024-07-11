package secnariobased.creational.problem1.display;

import secnariobased.creational.problem1.controller.ScreenController;
import secnariobased.creational.problem1.display.screeninterface.Display;

public class TouchScreen extends Display {
    public TouchScreen(ScreenController controller) {
        super(controller);
    }

    @Override
    public void display() {
        System.out.println("touch screen display");
    }
}
