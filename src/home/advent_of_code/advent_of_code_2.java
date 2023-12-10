package home.advent_of_code;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;

public class advent_of_code_2 {
    public static void main(String[] args) {
        // Název souboru (případně s cestou k souboru)
        String fileName = "AOC_inputs/input2.txt";
        int red = 12;
        int green = 13;
        int blue = 14;

        int finalsoucet = 0;

        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String line;

            // Čtení dat po řádcích
            while ((line = reader.readLine()) != null) {
                //System.out.println(line);

                // Vaření s řádky
                String[] parts = line.split(":");
               // System.out.println(Arrays.toString(parts));
                int gameNumber = Integer.parseInt(parts[0].trim().replaceAll("\\D", ""));
                System.out.println(gameNumber);
                parts[1] = parts[1].replaceAll("\\s", "");
                parts[1] = parts[1].replaceAll(",", ";");
                String[] poleGames = parts[1].split(";");
                System.out.println(Arrays.toString(poleGames));

                for (int i = 0; i < poleGames.length; i++) {
                    String barva = poleGames[i].replaceAll("\\d", "");
                    int cislo = Integer.parseInt(poleGames[i].replaceAll("[^\\d]", ""));

                    if (barva.equals("red")) {
                        if (cislo > red) {
                            break;
                        }
                    } else if (barva.equals("green")) {
                        if (cislo > green) {
                            break;
                        }
                    } else if (barva.equals("blue")) {
                        if (cislo > blue) {
                            break;
                        }
                    }

                    if (i == poleGames.length - 1) {
                        finalsoucet += gameNumber;
                        System.out.println("ano pocita se");
                    }

                }



            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println(finalsoucet);

    }
}
