package Cvika;

public class PoleCviko {
    public static void main(String[] args) {
        int[] binaryArray = {1,0,1,0,1,1,1,0};
        double result = 0;

        for (int i = binaryArray.length-1; i >= 0 ; i--) {
            if (binaryArray[i] == 1) {
                double prevod = Math.pow(2, binaryArray.length-1-i);
                System.out.println(prevod);
                result = result + prevod;
            }
        }

        System.out.println("---");
        System.out.println(result);

        //Od pana bohateho
//        for (int i = 0; i < binaryArray.length; i++) {
//            result += binaryArray[i] * (int) Math.pow(2,i);
//        }
    }
}
