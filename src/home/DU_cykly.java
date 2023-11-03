package home;

import java.util.Scanner;

public class DU_cykly {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Ukol 1

//        int cislo = sc.nextInt();
//        int soucet = 0;
//
//        while(cislo != -1) {
//            soucet += cislo;
//            cislo = sc.nextInt();
//        }
//        System.out.println("Součet je: " + soucet);

        //Ukol 2

//        int cislo = sc.nextInt();
//        int faktorial = 1;
//
//        for (int i = 1; i <= cislo; i++) {
//            faktorial = faktorial*i;
//        }
//        System.out.println(faktorial);

        //Ukol 3


//            int ranNum = (int) (Math.random() * 100 + 1);
//            int tip = sc.nextInt();
//
//            while(ranNum != tip) {
//                if (tip > ranNum) {
//                    System.out.println("Moc vysoko");
//                } else if (tip < ranNum) {
//                    System.out.println("Moc nízko");
//                }
//                tip = sc.nextInt();
//            }
//            System.out.println("Vyhrál jsi!");

        //Ukol 4

//        int counter = 0;
//
//        for (int i = 0; i < 100000; i++) {
//            int num = (int) (Math.random() * 100 + 1);
//            if (num == 42) {
//                counter++;
//            }
//        }
//
//        System.out.println("Číslo 42 padlo: " + counter + "x");


        // Ukol 5
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
                for (int j = 1; j <= n; j++) {
                    System.out.print(j + (i*n));
                    System.out.print("\t");
                }
                System.out.println("");
        }

        // SAMOVA RETARDOVANA VERZE
//        int velikost = sc.nextInt();
//        for (int i = 1; i <= velikost*velikost; i++) {
//            if (i % velikost == 0) {
//                System.out.println(i);
//            } else {
//                System.out.print(i+"\t");
//            }
//        }

    }
}
