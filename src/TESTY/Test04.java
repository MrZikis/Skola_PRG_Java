package TESTY;

import java.util.Scanner;

public class Test04 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // 1

//        String[] name1 =  {"Lukáš", "Adolf", "Rony", "Michal", "Petr"};
//        String[] name2 =  {"Pašek", "Novák", "Samandl", "Bohatý", "Vachovec"};
//
//        int randomJmeno1 = (int)(Math.random()*name1.length);
//        int randomJmeno2 = (int)(Math.random()*name2.length);
//
//        String noveJmeno = name1[randomJmeno1] +  " " + name2[randomJmeno2];
//        System.out.println(noveJmeno);

        // 2
//        String sentences = "Ahojky, jak se máš? Je to fajne. PRoč jseš teplej? Zabiju se.";
//        int counter = 0;
//
//        for (int i = 0; i < sentences.length(); i++) {
//            if ('?' == sentences.charAt(i) || '!' == sentences.charAt(i) || '.' == sentences.charAt(i)) {
//                counter++;
//            }
//        }

//        System.out.println("Počet vět: " + counter);

        // 3
        System.out.println("Zadej tel. číslo: ");
        String inputCislo = sc.nextLine();


        if (inputCislo.substring(0,4).equals("+420")) {

            if (inputCislo.substring(4,inputCislo.length()).length() == 9) {
                System.out.println("Čislo je ok");
            } else {
                System.out.println("Špatná délka čísla");
            }

        } else {
            System.out.println("Chybí / špatné +420");
        }


    }
}
