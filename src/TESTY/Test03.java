package TESTY;

import java.util.Arrays;
import java.util.Scanner;

public class Test03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        // Ukol 1
//        int[] array1 = new int[20];
//        int soucet = 0;
//
//        for (int i = 0; i < array1.length; i++) {
//            array1[i] = (int) (Math.random()*201 - 100);
//            soucet += array1[i];
//            System.out.println(array1[i]);
//        }
//        System.out.println("---");
//        if (soucet < 0) {
//            System.out.println(soucet);
//        } else {
//            System.err.println(soucet);
//        }

        // Ukol 2
//        int[] array2 = new int[10];
//        for (int i = 0; i < array2.length; i++) {
//            array2[i] = (int) (Math.random()*60 - 30);
//        }
//        System.out.println(Arrays.toString(array2));
//
//        for (int i = 0; i < array2.length; i++) {
//            if (array2[i] >= -10 && array2[i] <= 10 ) {
//                System.out.print(array2[i] + "\t");
//            }
//        }

        // Ukol 3
//        int[] score = new int[8];
        int[] score = {78,84,61,77,99,64,88,94};
        int soucetPole = 0;
        for (int i = 0; i < score.length; i++) {
            //score[i] = (int) (Math.random()*101);
            soucetPole += score[i];
        }
        System.out.println(Arrays.toString(score));

        // prumerne skore
        int prumer = (int) soucetPole / score.length;
        boolean proselPredmety = true;

        for (int i = 0; i < score.length; i++) {
            if (score[i] < 60) {
                proselPredmety = false;
                break;
            }
        }

        if (proselPredmety && prumer >= 70) {
            System.out.println("Student prošel");
            System.out.println("Score: " + soucetPole);
            System.out.println("Průměr studenta: " + prumer);
        } else {
            System.out.println("Student neprošel");
            System.out.println("Score: " + soucetPole);
            System.out.println("Průměr studenta: " + prumer);
        }
    }

}
