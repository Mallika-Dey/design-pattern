package abstractfactory.factory;

import abstractfactory.scrollbar.MotifScrollBar;
import abstractfactory.scrollbar.ScrollBar;
import abstractfactory.window.MotifWindow;
import abstractfactory.window.Window;

/**
 * @author Mallika Dey
 */
public class MotifWidgetFactory implements WidgetFactory {
    @Override
    public Window createWindow() {
        return new MotifWindow();
    }

    @Override
    public ScrollBar createScrollbar() {
        return new MotifScrollBar();
    }
}
