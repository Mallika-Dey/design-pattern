package secnariobased.structural.problem1;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class CharacterToIntegerAdapter implements CharacterSumCalculator {
    private IntegerSumCalculator integerSumCalculator;

    public CharacterToIntegerAdapter(IntegerSumCalculator integerSumCalculator) {
        this.integerSumCalculator = integerSumCalculator;
    }

    @Override
    public int calculate(File file) {
        try {
            File tmpFile = convertToAscii(file);
            int sum = integerSumCalculator.calculateSum(tmpFile);
            return sum;
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
        return 0;
    }

    private File convertToAscii(File file) throws IOException {
        File tmpFile = new File("C:\\Users\\Mallika\\Desktop\\projects\\asciiFile.txt");
        FileWriter fileWriter = new FileWriter(tmpFile);
        Scanner scanner = new Scanner(file);

        while (scanner.hasNext()) {
            String str = scanner.next();
            fileWriter.write((int) str.charAt(0) + " ");
        }
        fileWriter.close();
        return tmpFile;
    }
}
