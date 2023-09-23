package home;

import java.util.Scanner;

public class domaciCviceni1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //První úkol - je číslo dělitelné 5?
//        System.out.println("Zadej číslo pro ověření jestli je dělitelné 5:");
//        int cislo = sc.nextInt();
//
//        if (cislo % 5 == 0) {
//            System.out.println("Číslo je dělitelné 5!");
//        } else {
//            System.out.println("Číslo není dělitelné 5!");
//        }


        //Druhý úkol - hra kostky

//        int prvniKostka = (int) (Math.random() * 6 + 1);
//        int druhaKostka = (int) (Math.random() * 6 + 1);
//
//        System.out.println("Na první kostce padlo " + prvniKostka);
//        System.out.println("Na první kostce padlo " + druhaKostka);
//
//        if ((prvniKostka + druhaKostka >= 10) || (prvniKostka == druhaKostka)) {
//            System.out.println("Vyhrál jsi!");
//        } else {
//            System.out.println("Bohužel jsi prohrál!");
//        }


        //Třetí úkol - Je číslo v intervalu?
//        System.out.println("Zadej číselnou hodnotu:");
//        double cislo = sc.nextDouble();

//        if ((cislo > -100 && 100 > cislo) && cislo != 0) {
//            System.out.println("Číslo patří do intervalu (-100;100) a není nula");
//        } else if (cislo == 0){
//            System.out.println("Číslo nemůže být nula!");
//        } else {
//            System.out.println("Číslo nepatří do intervalu (-100;100)");
//        }

          // Třetí úkol (b) - Číslo nepatří do intervalu

//        if (cislo < -100 || 100 < cislo) {
//            System.out.println("Číslo nepatří do intervalu (-100;100)");
//        } else {
//            System.out.println("Číslo patří do intervalu (-100;100)");
//        }


        // Čtvrtý úkol - věk a kino
//        int cenaListku = 500;
//        System.out.println("Zadej věk:");
//        int vek = sc.nextInt();
//        int sale;
//
//        if ((vek >= 1 && vek <= 12) || vek >= 70 ) {
//            System.out.println("Sleva je 40%");
//            sale = (int) (cenaListku * 0.6);
//            System.out.println("Cena po slevě: " + sale);
//        } else if (vek >= 13 && vek <= 18) {
//            System.out.println("Sleva je 20%");
//            sale = (int) (cenaListku * 0.8);
//            System.out.println("Cena po slevě: " + sale);
//        } else if (vek <= 0){
//            System.out.println("Zadán neplatný věk");
//        } else {
//            System.out.println("nemáte žádnou slevu");
//            System.out.println("Cena: " + cenaListku);
//        }


        //Patý úkol - koupení pozemku
        System.out.println("Cena za jeden m2 je 640 Kč");
        System.out.println("Zadej dostupné prostředky na koupení pozemku:");
        int penize = sc.nextInt();
        System.out.println("Teď zadej délku a šířku (v metrech): ");
        double delka = sc.nextDouble();
        double sirka = sc.nextDouble();

        double pozemek = delka * sirka;
        int finalniCena = (int) (pozemek * 640);

        System.out.println("Cena pozemku je: " + finalniCena + " Kč");

        if (penize > finalniCena) {
            System.out.println("Máš na to!");
        } else {
            System.out.println("Bohužel nemáš dostatečné prostředky :(");
        }

    }
}
