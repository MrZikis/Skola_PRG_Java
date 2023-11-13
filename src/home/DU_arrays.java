package home;

import java.util.Arrays;
import java.util.Scanner;

public class DU_arrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 1.úkol
//        System.out.println("Zadej velikost pole:");
//        int velikostPole = sc.nextInt();
//        int[] array1 = new int[velikostPole];
//
//        for (int i = 0; i < array1.length; i++) {
//            array1[i] = (int) (Math.random()*100+1);
//        }
//        System.out.println(Arrays.toString(array1));

        // 2.úkol
//        System.out.println("Zadej velikost pole:");
//        int velikostPole2 = sc.nextInt();
//        int[] array2 = new int[velikostPole2];
//        int SudaCounter = 0;
//        int LichaCounter = 0;
//
//        for (int i = 0; i < array2.length; i++) {
//            array2[i] = (int) (Math.random()*100+1);
//            if (array2[i]%2 == 0) {
//                SudaCounter += array2[i];
//            } else {
//                LichaCounter += array2[i];
//            }
//        }
//
//        System.out.println(Arrays.toString(array2));
//
//        System.out.println("Součet sudých čísel: " + SudaCounter);
//        System.out.println("Součet lichých čísel: " + LichaCounter);

        // 3.úkol
//        int[] array3 = {4, 9, 36, 100, 400};
//        double[] arrayOdmocnina = new double[array3.length];
//
//        for (int i = 0; i < array3.length; i++) {
//            arrayOdmocnina[i] = Math.sqrt(array3[i]);
//        }
//
//        System.out.println(Arrays.toString(array3));
//        System.out.println(Arrays.toString(arrayOdmocnina));

        // 4.úkol
//        System.out.println("Zadej velikost pole:");
//        int velikostPole4 = sc.nextInt();
//        int[] array4 = new int[velikostPole4];
//
//        for (int i = 0; i < array4.length; i++) {
//            array4[i] = (int) (Math.random()*10+1);
//        }
//        System.out.println(Arrays.toString(array4));
//
//        System.out.println("Zadej hodnotu, kterou chces vyhledat:");
//        int input = sc.nextInt();
//
//        int counter = 0;
//        int y = 0;
//        int[] indexy = new int[array4.length];
//
//        for (int i = 0; i < array4.length; i++) {
//            if (array4[i] == input) {
//                counter++;
//                indexy[y] = i;
//                y++;
//            }
//        }
//
//        System.out.println("Vyskytuje se: " + counter + "x");
//        System.out.println("Indexy:");
//        for (int i = 0; i < counter-1; i++) {
//            System.out.println(indexy[i]);
//        }

        // 5.úkol

//        int[] array5 = new int[10];
//        int input2;
//
//        System.out.println("Zadávej hodnoty dokud pole nenaplníš v intervalu <10;100>");
//
//        for (int i = 0; i < array5.length; i++) {
//            do {
//                input2 = sc.nextInt();
//                if (!(input2 >= 10 && input2 <= 100)) {
//                    System.out.println("Špatná hodnota!");
//                }
//            } while(!(input2 >= 10 && input2 <= 100));
//
//            System.out.println("Číslo " + input2 + " je zapsáno na index: " + i);
//            array5[i] = input2;
//        }
//
//        System.out.println(Arrays.toString(array5));

        //BONUS - sportka

        int[] pickedNumbers = new int[10];
        int[] guesses = new int[5];

        // Losování sportky
        for (int i = 0; i < pickedNumbers.length; i++) {
            pickedNumbers[i] = (int) (Math.random()*30+1);
        }

        // Hádání čísel
        int guess;
        System.out.println("Zadávej hodnoty 1 - 30 a vyhraj miliony!");

        for (int i = 0; i < guesses.length; i++) {
            do {
                guess = sc.nextInt();
                if (!(guess >= 1 && guess <= 30)) {
                    System.out.println("Špatná hodnota!");
                }
            } while(!(guess >= 1 && guess <= 30));

            System.out.println("Číslo " + guess + " bylo zapsáno!");
            guesses[i] = guess;
        }

        //Ověřování
        int AnsCounter = 0;
        boolean correct;
        System.out.println();
        System.out.println("Vybraná čísla:");
        System.out.println(Arrays.toString(pickedNumbers));

        System.out.println();
        System.out.println("Vaše čísla:");
        for (int i = 0; i < guesses.length; i++) {
            correct = false;
            for (int j = 0; j < pickedNumbers.length; j++) {
                if (guesses[i] == pickedNumbers[j]) {
                    correct = true;
                    AnsCounter++;
                    break;
                }
            }
            if (correct) {
                System.err.print(guesses[i] + "\t");
            } else {
                System.out.print(guesses[i] + "\t");
            }
        }



        System.out.println();
        System.out.println("Počet stejných čísel: " + AnsCounter);
    }
}
