package home;

public class prvniZkouska {
    public static void main(String[] args) {
        int y;

        for (int x = 0; x < 10; x++) {
            y = (int) (Math.random() * 45 + 1);
            System.out.println(y);
        }
    }
}
