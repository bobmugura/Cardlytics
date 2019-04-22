package Cardlytics;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

/**
 * Take as input the path to a file containing one integer per line. For each
 * integer in the file, output to the console a comma-delimited list of the
 * integer's prime factors. The list of integers on each line of the output
 * should multiply to produce the input integer.
 */
public class Question3 {
    public static void main(String[] args) {
        String fileName = "Question3.txt";
        PrimeFactor q3 = new PrimeFactor(fileName);
        q3.consolePrimeFactors();
    }
}

class PrimeFactor {

    String fileName;

    PrimeFactor(String fileName) {
        this.fileName = fileName;
    }

    boolean consolePrimeFactors() {
        try {
            String filePath = new File("").getAbsolutePath();
            FileReader reader = new FileReader(filePath + "/src/main/java/Cardlytics/" + fileName);
            BufferedReader bufferedReader = new BufferedReader(reader);

            String line;
            while ((line = bufferedReader.readLine()) != null) {
                System.out.println(getPrimeFactors(line));
            }
            reader.close();
            return true;
        } catch (IOException e) {
            e.printStackTrace();
            return false;
        }
    }

    private String getPrimeFactors(String input) {
        ArrayList<Integer> primeFactors = new ArrayList<Integer>();
        int n = Integer.parseInt(input);
        if (n < 4) {
            return "No prime factors";
        } else {
            while (n % 2 == 0) {
                primeFactors.add(2);
                n = n / 2;
            }

            for (int i = 3; i < Math.sqrt(n); i += 2) {
                while (n % i == 0) {
                    primeFactors.add(i);
                    n = n / i;
                }
            }
            if (n != 1) {
                primeFactors.add(n);
            }
        }

        return getPrimeFactorsWithComma(primeFactors);
    }

    private String getPrimeFactorsWithComma(ArrayList<Integer> primeFactors) {
        String result = "";
        for (int factor : primeFactors) {
            result += factor + ", ";
        }
        result = result.substring(0, result.length() - 2);

        return result;
    }
}
