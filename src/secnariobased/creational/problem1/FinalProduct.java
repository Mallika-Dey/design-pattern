package secnariobased.creational.problem1;

import secnariobased.creational.problem1.clientpackage.Package;
import secnariobased.creational.problem1.framework.Framework;

public class FinalProduct {
    private Package aPackage;
    private Framework framework;

    public FinalProduct(Package aPackage, Framework framework) {
        this.aPackage = aPackage;
        this.framework = framework;
    }
}
