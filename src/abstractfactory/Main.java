package abstractfactory;

import abstractfactory.factory.MotifWidgetFactory;

/**
 * @author Mallika Dey
 */
public class Main {
    public static void main(String[] args) {
        WidgetLoader widgetLoader = new WidgetLoader();
       widgetLoader.showFactory();

        widgetLoader.setWidgetFactory(new MotifWidgetFactory());
        widgetLoader.showFactory();
    }
}