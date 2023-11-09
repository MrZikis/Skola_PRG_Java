package Cvika;

import java.lang.reflect.Array;
import java.util.Arrays;

public class arrays {
    public static void main(String[] args) {
        int[] pole = {15, 15, 1};
        int[] poleJinak = new int[10];

        for (int i = 0; i < poleJinak.length; i++) {
            System.out.println(poleJinak[i]);
        }

        System.out.println(Arrays.toString(poleJinak));
    }
}
