package TEST01;

import java.util.Scanner;

public class test01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Cvičení 1 - může darovat krev
        System.out.println("Zadejte Vaši váhu:");
        int vaha = sc.nextInt();

        if (vaha >= 50 && vaha <= 170) {
            System.out.println("Můžeš darovat krev");
        } else if (vaha < 50){
            System.out.println("Jseš moc hubenej tyčko");
        } else {
            System.out.println("Jseš moc těžkej špeku");
        }


        //Cvičení 2 - kostky
        int kostka1 = (int) (Math.random() * 6 + 1);
        int kostka2 = (int) (Math.random() * 6 + 1);
        System.out.println("Na první kostce padlo: " + kostka1 + " a na druhé padlo: " + kostka2);

        if (((kostka1 + kostka2) < 10) || (kostka1 == 6 && kostka2 == 6)) {
            System.out.println("Vyhrál jsi!");
        } else {
            System.out.println("Jsi NULA!");
        }


        //Cvičení 3 - prodávání Ginu
        System.out.println("Cena jedné lahve je 540,-");
        System.out.println("Zadej počet lahví, které chcete zakoupit: ");
        int lahve = sc.nextInt();

        if (lahve <= 5) {
            System.out.println("Plná cena");
            System.out.println("Cena: " + (lahve * 540) + " CZK");
        } else if (lahve <= 10) {
            System.out.println("10% sleva");
            System.out.println("Cena: " + ((lahve * 540) * 0.9) + " CZK");
        } else if (lahve <= 50) {
            System.out.println("20% sleva");
            System.out.println("Cena: " + ((lahve * 540) * 0.8) + " CZK");
        } else if (lahve > 50) {
            System.out.println("Cena: 0");
            System.out.println("Objednávka zamítnuta");
        } else {
            System.out.println("Error: Neplatná hodnota");
        }

        //BONUS
        int hrac1 = sc.nextInt(); //18
        int hrac2 = sc.nextInt(); //16

        if ((Math.abs( 21 - hrac1) < (Math.abs( 21 - hrac2)) {
            System.out.println("Hrac 1 vyhrava");
        } else {
            System.out.println("Hrac2 vyhrava");
        }
    }
}
