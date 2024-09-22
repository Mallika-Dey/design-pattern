package secnariobased.structural.problem1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * Adaptee
 */
public class IntegerSumCalculator {
    public int calculateSum(File file) throws FileNotFoundException {
        int ans = 0;
        Scanner scanner = new Scanner(file);
        while (scanner.hasNextInt()) {
            ans += scanner.nextInt();
        }
        return ans;
    }
}
