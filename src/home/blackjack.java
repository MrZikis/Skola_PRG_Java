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


        clearConsole();
        System.out.println("                        ------------------------------");
        System.out.println("                        Vítejte ve hře Blackjack DEMO!");
        System.out.println("                        ------------------------------");
        System.out.println(" Úkolem hry je mít součtem všech karet nejbližší číslo k 21.");
        System.out.println(" Na začátku každý hráč dostane 2 karty, poté se rozhoduje zda si lízne další kartu nebo ukončí svoje karty.");
        System.out.println(" Kartu si lze líznout pokud hráč bude mít méně jak 21 a neukončil svoje karty");
        System.out.println(" Lízaní se střídá - nejdříve hraje hráč 1 a následně hráč 2");
        System.out.println(" Jakmile si už nikdo nebude moci líznout kartu, hra se vyhodnotí a oznámí kdo vyhrál");
        System.out.println(" Přeji hodně štěstí!");
        System.out.println(" --------");
        System.out.println(" ");
        System.out.println(" Pro start hry zmáčkni -> ENTER <-");
        sc.nextLine();
        clearConsole();
        System.out.println(" Zadej jméno pro hráče 1: (bez diakritiky)\n");
        System.out.print(" "); String jmenoHrac1 = sc.nextLine();
        clearConsole();
        System.out.println(" Zadej jméno pro hráče 2: (bez diakritiky)\n");
        System.out.print(" "); String jmenoHrac2 = sc.nextLine();

        while(chciHratHrac1) {
            clearConsole();
            if (chciHratHrac1) {
                System.out.println(" " + jmenoHrac1);
                for (int karta : kartyHrac1) {
                    if (karta >= 10) {
                        System.out.println("  ---- ");
                        System.out.println(" |    |");
                        System.out.println(" | " + karta + " |");
                        System.out.println(" |    |");
                        System.out.println("  ----");
                    } else {
                        System.out.println("  --- ");
                        System.out.println(" |   |");
                        System.out.println(" | " + karta + " |");
                        System.out.println(" |   |");
                        System.out.println("  ---");
                    }
                }
                System.out.println(" Celkem: " + sectiKarty(kartyHrac1));
                System.out.println("\n Přeješ si vzít ještě jednu kartu (true) nebo stát (false)");
                System.out.print(" "); liznoutHrac1 = sc.nextBoolean();
                if (liznoutHrac1) {
                    clearConsole();
                    int liznutaKarta = (int) (Math.random() * 11 + 1);
                    System.out.println(" " + jmenoHrac1);
                    System.out.println(" Líznul jsis: " + liznutaKarta);
                    kartyHrac1.add(liznutaKarta);
                    for (int karta : kartyHrac1) {
                        if (karta >= 10) {
                            System.out.println("  ---- ");
                            System.out.println(" |    |");
                            System.out.println(" | " + karta + " |");
                            System.out.println(" |    |");
                            System.out.println("  ----");
                        } else {
                            System.out.println("  --- ");
                            System.out.println(" |   |");
                            System.out.println(" | " + karta + " |");
                            System.out.println(" |   |");
                            System.out.println("  ---");
                        }
                    }
                    System.out.println(" Celkem: " + sectiKarty(kartyHrac1));
                    if (sectiKarty(kartyHrac1) > 21) {
                        System.out.println("\n --------------------------------------------------------------------");
                        System.out.println(" Přesáhl jsi 21! Pro výhru ti musí chybět méně k 21 než druhému hráči.");
                        System.out.println(" ---------------------------------------------------------------------");
                        chciHratHrac1 = false;
                    }
                    System.out.println("\n Pokračovat (enter)");
                    sc.nextLine();
                    sc.nextLine();
                } else {
                    chciHratHrac1 = false;
                    System.out.println("\n Pokračovat (enter)");
                    sc.nextLine();

                }

            }
        }
            sc.nextLine();
            clearConsole();

        while (chciHratHrac2) {
            clearConsole();
            if (chciHratHrac2) {
                System.out.println(" " + jmenoHrac2);
                for (int karta : kartyHrac2) {
                    if (karta >= 10) {
                        System.out.println("  ---- ");
                        System.out.println(" |    |");
                        System.out.println(" | " + karta + " |");
                        System.out.println(" |    |");
                        System.out.println("  ----");
                    } else {
                        System.out.println("  --- ");
                        System.out.println(" |   |");
                        System.out.println(" | " + karta + " |");
                        System.out.println(" |   |");
                        System.out.println("  ---");
                    }
                }
                System.out.println(" Celkem: " + sectiKarty(kartyHrac2));
                System.out.println("\n Přeješ si vzít ještě jednu kartu (true) nebo stát (false)");
                System.out.print(" ");liznoutHrac2 = sc.nextBoolean();
                if (liznoutHrac2) {
                    clearConsole();
                    int liznutaKarta = (int) (Math.random() * 11 + 1);
                    System.out.println(" " + jmenoHrac2);
                    System.out.println(" Líznul jsis: " + liznutaKarta);
                    kartyHrac2.add(liznutaKarta);
                    for (int karta : kartyHrac2) {
                        if (karta >= 10) {
                            System.out.println("  ---- ");
                            System.out.println(" |    |");
                            System.out.println(" | " + karta + " |");
                            System.out.println(" |    |");
                            System.out.println("  ----");
                        } else {
                            System.out.println("  --- ");
                            System.out.println(" |   |");
                            System.out.println(" | " + karta + " |");
                            System.out.println(" |   |");
                            System.out.println("  ---");
                        }
                    }
                    System.out.println(" Celkem: " + sectiKarty(kartyHrac2));
                    if (sectiKarty(kartyHrac2) > 21) {
                        System.out.println("\n --------------------------------------------------------------------");
                        System.out.println(" Přesáhl jsi 21! Pro výhru ti musí chybět méně k 21 než druhému hráči.");
                        System.out.println(" --------------------------------------------------------------------");
                        chciHratHrac2 = false;
                    }
                    System.out.println("\n Pokračovat (enter)");
                    sc.nextLine();
                    sc.nextLine();
                } else {
                    chciHratHrac2 = false;
                    System.out.println("\n Pokračovat (enter)");
                    sc.nextLine();

                }

            }
        }

        clearConsole();
        System.out.println("Vyhodnocování");
        String vyhra;

        if ( (Math.abs(21 - sectiKarty(kartyHrac2))) > (Math.abs(21 - sectiKarty(kartyHrac1))) ) {
            vyhra = "Hru vyhrál " + jmenoHrac1 + "! K 21 mu chybělo: " + Math.abs(21 - sectiKarty(kartyHrac1)) + " bodů." ;

        } else if ( (Math.abs(21 - sectiKarty(kartyHrac2))) < (Math.abs(21 - sectiKarty(kartyHrac1))) ) {
            vyhra = "Hru vyhrál " + jmenoHrac2 + "! K 21 mu chybělo: " + Math.abs(21 - sectiKarty(kartyHrac2)) + " bodů." ;

        } else if ( (Math.abs(21 - sectiKarty(kartyHrac2))) == (Math.abs(21 - sectiKarty(kartyHrac1))) ) {
            vyhra = "Je to remíza! Oboum hráčům zbývalo " + Math.abs(21 - sectiKarty(kartyHrac1)) + " bodů." ;

        } else {
            System.out.println("Chyba při vyhodnocování");
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
                    clearConsole();
                    System.out.println("   --------------");
                    System.out.println("      Výsledky   ");
                    System.out.println("   --------------");
                    System.out.println("\n " + jmenoHrac1 + " má " + sectiKarty(kartyHrac1) + " bodů." + "\n " + jmenoHrac2 +" má " + sectiKarty(kartyHrac2) + " bodů.");
                    System.out.println(" ");
                    System.out.println(" " + vyhra);
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

    public static void clearConsole() {
        try {
            final String os = System.getProperty("os.name");

            if (os.contains("Windows")) {
                // Pokud používáte Windows, použijte "cls" k vyčištění konzole
                new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
            } else {
                // Pokud používáte jiný operační systém, použijte "clear" nebo "reset"
                new ProcessBuilder("clear").inheritIO().start().waitFor();
            }
        } catch (final Exception e) {
            // Obsluha chyb, pokud proces vyčištění konzole selže
            e.printStackTrace();
        }
    }

}
