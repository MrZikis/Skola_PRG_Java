package home;

import java.util.Scanner;

class Student {
    public int cisloStudenta;
    public String jmeno;
    Student(int cisloStudenta, String jmeno)
    {
        this.cisloStudenta = cisloStudenta;
        this.jmeno = jmeno;
    }
}
public class zkouskaArrays {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

//        System.out.println("Zadej jakou chceš velikost pole:  (zkoušební)");
//        int velikostPole = sc.nextInt();

        Student[] arr;
//        arr = new Student[velikostPole];
        arr = new Student[5];

        String vstupJmeno;
        for (int i = 0; i < 5; i++) {
            System.out.println("Zadej jméno pro " + i + " index");
            vstupJmeno = sc.nextLine();
            arr[i] = new Student(i, vstupJmeno);
        }

        System.out.println("");
        System.out.println("---------------");
        System.out.println("");

        for (int y = 0; y < arr.length; y++) {
            System.out.println("Jméno na indexu " + y + " : " + arr[y].cisloStudenta + " " +  arr[y].jmeno);
        }
    }
}
