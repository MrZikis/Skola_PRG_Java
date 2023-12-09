package home;

import java.text.Normalizer;
import java.util.Arrays;
import java.util.Scanner;

public class DU_stringy {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // 1. Je username v poli?

//        String[] users = {"honza","ziki","paja","simuel"};
//
//        System.out.println("Zadej jméno pro vyhledání v poli:");
//        String input = sc.nextLine();
//
//
//        for (int i = 0; i < users.length; i++) {
//            if (users[i].equals(input) ) {
//                System.out.println("Jméno: " + users[i] + " se v poli nachází");
//                break;
//            } else if (i == users.length - 1 && !(users[i].equals(input))) {
//                System.out.println("Jméno: " + input + " se v poli NEnachází");
//            }
//        }

        // 2. Jsou v proměnné zdvojená písmena?

//        String input1 = "hello";
//        Boolean verify = false;
//
//        for (int i = 0; i < input1.length()-1; i++) {
//            if (input1.charAt(i) == input1.charAt(i+1)) {
//                System.out.println("Ve stringu ${input1} jsou zdvojená písmena");
//                verify = true;
//            } else if (i == input1.length() - 2 && !verify) {
//                System.out.println("Ve stringu ${input1} NEjsou zdvojená písmena");
//            }
//        }

        // 3. malý a velký písmena

//        String input2 = "SDhjaisADSHuipa";
//        String novy = "";
//
//        for (int i = 0; i < input2.length(); i++) {
//            if (i%2 == 0) {
//                novy += input2.toLowerCase().charAt(i);
//            } else {
//                novy += input2.toUpperCase().charAt(i);
//            }
//        }
//        System.out.println(novy);

        // 4. počet slov ve větě
//        String input3 = "Ahoj, já jsem Ondra Vlček a jsem pedofil.";
//
//        String[] poleSlov = input3.split(" ");
//        System.out.println("Počet slov: " + poleSlov.length);

        // 5. nejdelsi jmeno v poli
//        int indexNejdelsiho = 0;
//        int delkaNejdelsiho = 0;
//        String[] names = {"honza přibyl","ziki zikmund","paja nemeckojc","simuel samandl","Erton Von Tvoje Mamus"};
//
//        for (int i = 0; i < names.length; i++) {
//            if (names[i].length() > delkaNejdelsiho) {
//                delkaNejdelsiho = names[i].length();
//                indexNejdelsiho = i;
//            }
//
//        }
//
//        System.out.println("Nejdelsi jmeno je: " + names[indexNejdelsiho] + " s poctem znaku: " + delkaNejdelsiho);

        // 6. opačné celé číslo

//        int number = 24004864;
//
//        String numberString = Integer.toString(number);
//        String novyString = "";
//
//        for (int i = numberString.length(); i > 0; i--) {
//            novyString += numberString.charAt(i-1);
//        }
//
//        System.out.println(novyString);

        // 7. nazev souboru a typ
//        System.out.println("Zadej jmeno souboru: ");
//        String nameFile = sc.nextLine();
//
//        System.out.println("Zadej typ souboru: ");
//        String typeFile = sc.nextLine();
//
//        System.out.println(nameFile + "." + typeFile);

        // BONUS - Palindromy

//        String slovo = "Únik skinů";
//
//        String normalizace = Normalizer.normalize(slovo, Normalizer.Form.NFD);
//
//        String slovoBezDiakritiky = normalizace.replaceAll("\\p{InCombiningDiacriticalMarks}+", "");
//
//        String slovoBezMezer = slovoBezDiakritiky.replaceAll("[^a-zA-Z]", "").toLowerCase();
//
//        System.out.println(slovoBezMezer);

        // dale potom cyklus co vezme tu sracku a porovna ty znaky... jsem lina pica


        // BONUS - morseovka

//        String input4 = "AhojkySulinci";
//        String[] morsePole = new String[input4.length()];
//
//        String[] morseCode = {
//                "A .-", "B -...", "C -.-.", "D -..", "E .",
//                "F ..-.", "G --.", "H ....", "I ..", "J .---",
//                "K -.-", "L .-..", "M --", "N -.", "O ---",
//                "P .--.", "Q --.-", "R .-.", "S ...", "T -",
//                "U ..-", "V ...-", "W .--", "X -..-", "Y -.--",
//                "Z --.."
//        };
//
//        for (int i = 0; i < input4.length(); i++) {
//            for (int j = 0; j < morseCode.length; j++) {
//                if (input4.toUpperCase().charAt(i) == morseCode[j].charAt(0)) {
//                      morsePole[i] = morseCode[j];
//                }
//            }
//        }
//
//        System.out.println(Arrays.toString(morsePole));

    }
}
