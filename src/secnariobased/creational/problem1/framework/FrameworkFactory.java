package secnariobased.creational.problem1.framework;

public class FrameworkFactory {
    public Framework getFactory(String type) {
        if (type.equalsIgnoreCase("django"))
            return new Django();
        if (type.equalsIgnoreCase("springboot"))
            return new SpringBoot();
        if (type.equalsIgnoreCase("laravel"))
            return new Laravel();
        return null;
    }
}
