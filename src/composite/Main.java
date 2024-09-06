package composite;

public class Main {
    public static void main(String[] args) {
        Component ram = new Leaf("ram");
        Component cpu = new Leaf("cpu");
        Composite laptop = new Composite();

        laptop.addComponent(ram);
        laptop.addComponent(cpu);
        laptop.componentType();

        for(Component component : laptop.getComponentList()) {
            component.componentType();
        }
    }
}
