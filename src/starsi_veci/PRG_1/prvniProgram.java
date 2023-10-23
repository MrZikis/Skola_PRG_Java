package starsi_veci.PRG_1;

import java.util.Scanner;

public class prvniProgram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);  //Vytvoří scanner

        System.out.println("Jak velké pole?");
        int velikostPole = sc.nextInt() + 1;

        String jmena[];
        jmena = new String[velikostPole];

        System.out.println("Vypiš jména: ");
        for (int k = 0; k < jmena.length; k++) {
            System.out.println("Zadej jméno číslo " + (k + 1) + ":");
            jmena[k] = sc.nextLine();
        }

//        System.out.println(jmena[0]);
//        for (int i = 0; i < jmena.length; i++) {
//            System.out.println(jmena[i]);
//        }



    }
}

//Zatím nefunkční
//Má za úkol načíst od uživatele jména hráčů a skóré hráču a potom skoré porovnat a vypsat tabulku s úmístěním
//Zkouska jestli funguje GIT :)
