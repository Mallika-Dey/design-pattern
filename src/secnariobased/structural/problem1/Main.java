package secnariobased.structural.problem1;

import java.io.File;

public class Main {
    public static void main(String[] args) {
        File file = new File("C:\\Users\\Mallika\\Desktop\\projects\\abc.txt");

        CharacterSumCalculator characterSumCalculator = new CharacterToIntegerAdapter(new IntegerSumCalculator());
        System.out.println(characterSumCalculator.calculate(file));
    }
}
