package TESTY;

import java.util.Scanner;

public class Test02 {
    public static void main(String[] args) {

        //Ukol 1
//        int hrac1 = 1500;
//        int DMGcounter = 0;
//
//        while(hrac1 > 0){
//            int damage = (int) (Math.random() * 51 + 100);
//            hrac1 = hrac1 - damage;
//            DMGcounter++;
//            //System.out.println(damage);
//        }
//        System.out.println("Hráč dal damage " + DMGcounter + "x");
//
//        //Ukol 2
        Scanner sc = new Scanner(System.in);
//
//        System.out.println("Napiš PIN v rozmezí 1000 - 9999");
//        int PIN = sc.nextInt();
//        while(!(9999 >= PIN && PIN >= 1000)) {
//            PIN = sc.nextInt();
//        }
//        System.out.println("PIN je zadanej");

        //Ukol 3

//        int n = sc.nextInt();
//
//        for (int i = 1; i <= n; i++) {
//            if (i % 2 == 0) {
//                System.out.print(i + "\t");
//            }
//        }

        //BONUS

        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
                for (int j = 1; j <= n; j++) {
//                    System.out.println(j + (i*n));
                    if ((i+j) % 2 == 0 ) {
                        System.out.print("X\t");
                    } else {
                        System.out.print("O\t");
                    }
                }
                System.out.println("");
        }


    }
}
