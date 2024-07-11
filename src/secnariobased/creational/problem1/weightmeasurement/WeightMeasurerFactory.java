package secnariobased.creational.problem1.weightmeasurement;

public class WeightMeasurerFactory {
    public WeightMeasurer createWeightMeasurer(String measurerName) {
        if (measurerName.equalsIgnoreCase("load sensor")) {
            System.out.println("generating load sensor");
            return new LoadSensor();
        } else if (measurerName.equalsIgnoreCase("weight module")) {
            System.out.println("generating weight module");
            return new WeightModuleInterface();
        }
        System.out.println("No weight measurer found");
        return null;
    }
}
