package Cvika;

import java.lang.reflect.Array;
import java.util.Arrays;

public class arrays {
    public static void main(String[] args) {
//        int[] pole = {15, 15, 1};
//        int[] poleJinak = new int[10];
//
//        for (int i = 0; i < poleJinak.length; i++) {
//            System.out.println(poleJinak[i]);
//        }
//
//        System.out.println(Arrays.toString(poleJinak));
        
        int[] arr = {15,23,25,30};
        int[] array = new int[10];
        
        //Naplneni pole
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random()*100 - 49);
        }

        //Vypsani
        //Foreach - lepší pro stringy nebo objekty
//        for (Integer i: array) {
//            System.out.println(i);
//        }

        //For
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
}
