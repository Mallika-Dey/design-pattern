package composite;

public class Leaf implements Component {
    private String componentName;

    public Leaf(String componentName) {
        this.componentName = componentName;
    }

    public Leaf() {
    }

    @Override
    public void componentType() {
        System.out.println(this.componentName);
    }
}
