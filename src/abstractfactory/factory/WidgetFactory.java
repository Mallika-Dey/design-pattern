package abstractfactory.factory;

import abstractfactory.scrollbar.ScrollBar;
import abstractfactory.window.Window;

/**
 * @author Mallika Dey
 */
public interface WidgetFactory {
    Window createWindow();

    ScrollBar createScrollbar();
}
