package secnariobased.creational.problem1;

import secnariobased.creational.problem1.clientpackage.*;
import secnariobased.creational.problem1.clientpackage.Package;
import secnariobased.creational.problem1.framework.Framework;
import secnariobased.creational.problem1.framework.FrameworkFactory;

public class FinalProductFactory {
    private String[] packages;
    private String[] frameworks;
    private String[] internet;

    public FinalProductFactory() {
        packages = new String[]{"Silver", "Gold", "Diamond", "Platinum"};
        frameworks = new String[]{"Django", "Laravel", "Springboot"};
        internet = new String[]{"WiFi", "GSM", "Ethernet"};
    }

    public FinalProduct buildFinalProduct(int packageId, int frameworkId, int internetId) {
        if (packageId > 4 || frameworkId > 3 || internetId > 3)
            throw new IndexOutOfBoundsException("");
        Package clientPackage = createPackage(packages[packageId - 1]);
        Framework framework = new FrameworkFactory().getFactory(frameworks[frameworkId - 1]);

        return new FinalProduct(clientPackage, framework, internet[internetId - 1]);
    }

    private Package createPackage(String name) {
        if (name.equalsIgnoreCase("Silver")) return new Silver();
        if (name.equalsIgnoreCase("Gold")) return new Gold();
        if (name.equalsIgnoreCase("Diamond")) return new Diamond();
        if (name.equalsIgnoreCase("Platinum")) return new Platinum();
        return null;
    }
}
