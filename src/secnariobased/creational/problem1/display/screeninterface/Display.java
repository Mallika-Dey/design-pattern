package secnariobased.creational.problem1.display.screeninterface;

import secnariobased.creational.problem1.controller.Controller;

public abstract class Display {
    private Controller controller;

    public Display(Controller controller) {
        this.controller = controller;
    }

    public abstract void display();

    public void controllerType() {
        controller.controllerType();
    }
}
