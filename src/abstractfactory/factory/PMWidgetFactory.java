package abstractfactory.factory;

import abstractfactory.scrollbar.PMScrollBar;
import abstractfactory.scrollbar.ScrollBar;
import abstractfactory.window.PMWindow;
import abstractfactory.window.Window;

/**
 * @author Mallika Dey
 */
public class PMWidgetFactory implements WidgetFactory {
    @Override
    public Window createWindow() {
        return new PMWindow();
    }

    @Override
    public ScrollBar createScrollbar() {
        return new PMScrollBar();
    }
}
