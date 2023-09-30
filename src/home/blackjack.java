package home;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Timer;
import java.util.TimerTask;

public class blackjack {

    public static void main(String[] args) {
        //Blackjack s 2 hracema

        Scanner sc = new Scanner(System.in);
        Timer timer = new Timer();

        ArrayList<Integer> kartyHrac1 = new ArrayList<>();
        ArrayList<Integer> kartyHrac2 = new ArrayList<>();

        boolean chciHratHrac1 = true;
        boolean chciHratHrac2 = true;

        boolean liznoutHrac1;
        boolean liznoutHrac2;

        //Každá hráč dostane na začátek dvě karty
        kartyHrac1.add((int)(Math.random() * 11 + 1));
        kartyHrac1.add((int)(Math.random() * 11 + 1));

        kartyHrac2.add((int)(Math.random() * 11 + 1));
        kartyHrac2.add((int)(Math.random() * 11 + 1));

        while(chciHratHrac1 || chciHratHrac2) {
            if (chciHratHrac1) {
                System.out.println("Karty hráče 1:");
                for (int karta: kartyHrac1) {
                    System.out.print(karta + " ");
                }
                System.out.println("\nPřeješ si vzít ještě jednu kartu (true) nebo stát (false)");
                liznoutHrac1 = sc.nextBoolean();
                if (liznoutHrac1) {
                    int liznutaKarta = (int)(Math.random() * 11 + 1);
                    System.out.println("Líznul jsis: " + liznutaKarta);
                    kartyHrac1.add(liznutaKarta);
                    System.out.println("Karty hráče 1:");
                    for (int karta: kartyHrac1) {
                        System.out.print(karta + " ");
                    }
                    if (sectiKarty(kartyHrac1) > 21) {
                        System.out.println("Přesáhl jsi 21! Pro výhru ti musí chybět méně k 21 než druhému hráči.");
                        chciHratHrac1 = false;
                    }
                } else {
                    chciHratHrac1 = false;
                }

            }
            if (chciHratHrac2) {
                System.out.println("\nKarty hráče 2:");
                for (int karta: kartyHrac2) {
                    System.out.print(karta + " ");
                }
                System.out.println("\nPřeješ si vzít ještě jednu kartu (true) nebo stát (false)");
                liznoutHrac2 = sc.nextBoolean();
                if (liznoutHrac2) {
                    int liznutaKarta = (int)(Math.random() * 11 + 1);
                    System.out.println("Líznul jsis: " + liznutaKarta);
                    kartyHrac2.add(liznutaKarta);
                    System.out.println("Karty hráče 2:");
                    for (int karta: kartyHrac2) {
                        System.out.print(karta + " ");
                    }
                    if (sectiKarty(kartyHrac2) > 21) {
                        System.out.println("Přesáhl jsi 21! Pro výhru ti musí chybět méně k 21 než druhému hráči.");
                        chciHratHrac2 = false;
                    }
                } else {
                    chciHratHrac2 = false;
                }

            }
        }

        System.out.println("Vyhodnocování");
        String vyhra;

        if ( (Math.abs(21 - sectiKarty(kartyHrac2))) > (Math.abs(21 - sectiKarty(kartyHrac1))) ) {
            vyhra = "Hru vyhrál hráč 1! K 21 mu chybělo: " + Math.abs(21 - sectiKarty(kartyHrac1)) + " bodů." ;

        } else if ( (Math.abs(21 - sectiKarty(kartyHrac2))) < (Math.abs(21 - sectiKarty(kartyHrac1))) ) {
            vyhra = "Hru vyhrál hráč 2! K 21 mu chybělo: " + Math.abs(21 - sectiKarty(kartyHrac2)) + " bodů." ;

        } else if ( (Math.abs(21 - sectiKarty(kartyHrac2))) == (Math.abs(21 - sectiKarty(kartyHrac1))) ) {
            vyhra = "Je to remíza! Oboum hráčům zbývalo " + Math.abs(21 - sectiKarty(kartyHrac1)) + " bodů." ;

        } else {
            System.out.println("Chyby při vyhodnocování");
            return;
        }


        int casVyhodnoceni = 5;

        //Načítání
        timer.scheduleAtFixedRate(new TimerTask() {
            int cas = 0; // Proměnná pro sledování uplynulého času

            @Override
            public void run() {

                System.out.print(".");
                cas++;

                if (cas == casVyhodnoceni) {
                    System.out.println("\nVýsledky: \nhráč 1 má " + sectiKarty(kartyHrac1) + " bodů." + "\nhráč 2 má " + sectiKarty(kartyHrac2) + " bodů.");
                    System.out.println(vyhra);
                    timer.cancel(); // Ukončíme časovač
                }
            }
        }, 1000, 1000);




    }

    // Metoda pro sečítání karet v ruce
    public static int sectiKarty(ArrayList<Integer> pole) {
        int soucet = 0;

        // Projdeme všechny prvky pole a sečteme je
        for (int cislo:pole) {
            soucet += cislo;
        }

        return soucet;
    }

}
