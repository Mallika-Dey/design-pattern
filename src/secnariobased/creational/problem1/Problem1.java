package secnariobased.creational.problem1;

import secnariobased.creational.problem1.clientpackage.FinalProduct;

import java.util.Scanner;

public class Problem1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("select package: 1. Silver, 2. Gold, 3. Diamond, 4. Platinum");
        int packageNo = input.nextInt();
        System.out.println("select framework: 1. Django, 2. Laravel, 3. Springboot");
        int frameworkNo = input.nextInt();
        System.out.println("select internet: 1. WiFi, 2. GSM, 3. Ethernet");
        int internetNo = input.nextInt();

        FinalProduct finalProduct = new FinalProductFactory().buildFinalProduct(packageNo, frameworkNo, internetNo);

        finalProduct.getHardwarePackage().getDisplay().display();
        finalProduct.getInternet().networkType();
        finalProduct.getWeightMeasurer().measure();
        finalProduct.getHardwarePackage().getStorage().storageType();
    }
}
