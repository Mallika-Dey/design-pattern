package secnariobased.creational.problem1.clientpackage;

import secnariobased.creational.problem1.framework.Framework;
import secnariobased.creational.problem1.hardware.HardwarePackage;
import secnariobased.creational.problem1.internet.Internet;
import secnariobased.creational.problem1.weightmeasurement.WeightMeasurer;

public class FinalProduct {
    private HardwarePackage hardwarePackage;
    private WeightMeasurer weightMeasurer;
    private Framework framework;
    private Internet internet;

    public FinalProduct(Package clientPackage, Framework framework, String internetType) {
        this.hardwarePackage = clientPackage.getHardwarePackage();
        this.weightMeasurer = clientPackage.getWeightMeasurer();
        this.framework = framework;
        this.internet = clientPackage.getInternet(internetType);
    }

    public HardwarePackage getHardwarePackage() {
        return hardwarePackage;
    }

    public void setHardwarePackage(HardwarePackage hardwarePackage) {
        this.hardwarePackage = hardwarePackage;
    }

    public Framework getFramework() {
        return framework;
    }

    public void setFramework(Framework framework) {
        this.framework = framework;
    }

    public Internet getInternet() {
        return internet;
    }

    public void setInternet(Internet internet) {
        this.internet = internet;
    }

    public WeightMeasurer getWeightMeasurer() {
        return weightMeasurer;
    }

    public void setWeightMeasurer(WeightMeasurer weightMeasurer) {
        this.weightMeasurer = weightMeasurer;
    }
}
