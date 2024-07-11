package secnariobased.creational.problem1.weightmeasurement;

public class WeightModuleInterface implements WeightMeasurer{
    @Override
    public void measure() {
        System.out.println("Weight measuring using weight module interface");
    }
}
