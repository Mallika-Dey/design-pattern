package abstractfactory;

import abstractfactory.factory.WidgetFactory;

/**
 * @author Mallika Dey
 */
public class WidgetLoader {
    WidgetFactory widgetFactory = null;

    public WidgetLoader() {
    }

    public void setWidgetFactory(WidgetFactory widgetFactory) {
        this.widgetFactory = widgetFactory;
    }

    public void showFactory() {
        if (widgetFactory == null) {
            System.out.println("No factory is found");
            return;
        }

        widgetFactory.createWindow().typeOfWindow();
        widgetFactory.createScrollbar().typeOfScrollBar();
    }
}
