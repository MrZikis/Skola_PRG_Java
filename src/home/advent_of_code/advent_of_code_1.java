package home.advent_of_code;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class advent_of_code_1 {
    public static void main(String[] args) {
        // Název souboru (případně s cestou k souboru)
        String fileName = "AOC_inputs/input.txt";
        long finalSoucet = 0;

        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String line;

            // Čtení dat po řádcích
            while ((line = reader.readLine()) != null) {
                System.out.println(line);

                // Vaření s řádky
                String stringCisloZJednohotRadku = line.replaceAll("[^\\d]+", "");
                //System.out.println(stringCisloZJednohotRadku);
                if (stringCisloZJednohotRadku.isEmpty()) {
                    System.out.println("nic tu neni");
                } else if (stringCisloZJednohotRadku.length() == 1) {
                    String doubleCislo = stringCisloZJednohotRadku + stringCisloZJednohotRadku;
                    int cislo = Integer.parseInt(doubleCislo);
                    finalSoucet += cislo;
                    System.out.println(cislo);
                } else if (stringCisloZJednohotRadku.length() == 2) {
                    int cislo = Integer.parseInt(stringCisloZJednohotRadku);
                    System.out.println(cislo);
                    finalSoucet += cislo;
                } else {
                    String cislo1 = String.valueOf(stringCisloZJednohotRadku.charAt(0));
                    String cislo2 = String.valueOf(stringCisloZJednohotRadku.charAt(stringCisloZJednohotRadku.length()-1));
                    String fullCislo = cislo1 + cislo2;
                    int cislo = Integer.parseInt(fullCislo);
                    System.out.println(fullCislo);
                    finalSoucet += cislo;
                }

            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println(finalSoucet);
    }
}
