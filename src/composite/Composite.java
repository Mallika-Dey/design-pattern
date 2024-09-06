package composite;

import java.util.ArrayList;
import java.util.List;

public class Composite implements Component {
    private List<Component> componentList;

    public Composite() {
        this.componentList = new ArrayList<>();
    }

    public Composite(List<Component> componentList) {
        this.componentList = componentList;
    }

    public void addComponent(Component component) {
        this.componentList.add(component);
    }

    public List<Component> getComponentList() {
        return componentList;
    }

    @Override
    public void componentType() {
        System.out.println("composite component");
    }
}
