package secnariobased.creational.problem1.clientpackage;

import secnariobased.creational.problem1.hardware.HardwarePackage;
import secnariobased.creational.problem1.internet.Internet;
import secnariobased.creational.problem1.weightmeasurement.WeightMeasurer;

public interface Package {
    HardwarePackage getHardwarePackage();
    WeightMeasurer getWeightMeasurer();
    Internet getInternet(String type);
}
