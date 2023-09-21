package PRG_3;

import java.util.Scanner;

public class cviceni3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

//        System.out.println("Zadej skore:");
//        int score =  sc.nextInt();
//        System.out.println("Zadej průměr:");
//        double prumer = sc.nextDouble();
//
//        if(score >= 1400 && prumer <= 3.0) {
//            System.out.println("prošel");
//        } else {
//            System.out.println("Neprošel");
//        }

        // Další cvičení

        System.out.println("Za kolik jsi nakoupil?");
        int cena = sc.nextInt();
        System.out.println("Máš kupón?");
        boolean discountTicket = sc.nextBoolean();
        int finalCena = 0;

        if (discountTicket == true) {
            if (cena >= 100) {
                finalCena = (int)(cena * 0.8);
            } else if (cena >= 50) {
                finalCena = (int)(cena * 0.9);
            } else {
                finalCena = cena;
            }
            System.out.println("Se slevou je cena: " + finalCena);
        } else {
            System.out.println("Bez kuponu je cena: " + cena);
        }
    }
}
