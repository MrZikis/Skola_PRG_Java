package starsi_veci.PRG_3;

import java.util.Scanner;

public class Cviceni3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Task:
        //Udělat slot machine -> 3 náhodná čísla (1 - 4)
        //Čísla musí být stejná pro výhru

        int a1 = (int) (Math.random() * 4 + 1);
        int a2 = (int) (Math.random() * 4 + 1);
        int a3 = (int) (Math.random() * 4 + 1);

        int counter = 0;

        if (a1 == a2 && a2 == a3) {
            System.out.println("Vyhrál jsi!");
        } else {
            counter++;
            a1 = (int) (Math.random() * 4 + 1);
            a2 = (int) (Math.random() * 4 + 1);
            a3 = (int) (Math.random() * 4 + 1);
        }

        //Tri strany trojuhelniku
        //Je pravouhly?
        int a = 4;
        int b = 4;
        int c = 4;

        if (c*c == a*a + b*b && a*a == c*c + b*b && b*b == c*c + a*a) {
            System.out.println("Trojuhelnik je pravouhly!");
        } else {
            System.out.println("Není pravoúhlý");
        }

        //DnD: Mate postavu s zivotama
        //Uzivatel zada obranu
        //Uzivatel zada DMG
        //Vypise se jestli hrac prezil

        int health = 100;
        System.out.println("Zadej damage:");
        int dmg = sc.nextInt();
        System.out.println("Zadej tvůj armor:");
        int armor = sc.nextInt();

        if (dmg < armor) {
            if (health - dmg + armor > 0) {
                System.out.println("Postava přežila GG");
            } else {
                System.out.println("Zemřel jsi ToT");
            }
        } else {
            System.out.println("Postava vůbec neztratila DMG");
        }

    }
}
