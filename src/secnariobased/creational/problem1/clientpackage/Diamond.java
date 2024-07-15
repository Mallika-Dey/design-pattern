package secnariobased.creational.problem1.clientpackage;

import secnariobased.creational.problem1.hardware.HardwarePackage;
import secnariobased.creational.problem1.hardware.RaspberryPiHardwareFactory;
import secnariobased.creational.problem1.internet.Internet;
import secnariobased.creational.problem1.internet.InternetFactory;
import secnariobased.creational.problem1.weightmeasurement.WeightMeasurer;
import secnariobased.creational.problem1.weightmeasurement.WeightMeasurerFactory;

public class Diamond implements Package{
    @Override
    public HardwarePackage getHardwarePackage() {
        return new HardwarePackage(new RaspberryPiHardwareFactory());
    }

    @Override
    public WeightMeasurer getWeightMeasurer() {
        return new WeightMeasurerFactory().createWeightMeasurer("load sensor");
    }

    @Override
    public Internet getInternet(String type) {
        return new InternetFactory().internetProvider(type);
    }
}
