package PRG_cviceni_1;

import java.util.Arrays;
import java.util.Scanner;

public class prvniProgram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);  //Vytvoří scanner

        String[] jmena = {};
        int[] skore = {};

        System.out.println("Kolik je hráčů?");
        int pocetHracu = sc.nextInt();


        for (int i = 1; i < pocetHracu; i++) {
            System.out.println("Informace o hráči " + i);
            System.out.println("Jméno hráče:");
            jmena[i] = sc.nextLine();
            System.out.println("Skóre: ");
            skore[i] = sc.nextInt();
        }

        System.out.println(Arrays.toString(jmena));
        System.out.println(Arrays.toString(skore));


    }
}

//Zatím nefunkční
//Má za úkol načíst od uživatele jména hráčů a skóré hráču a potom skoré porovnat a vypsat tabulku s úmístěním
