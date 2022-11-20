public class main {
    public static void main(String[] args) {
        int balance = 100;
        int bonus = 1;
        int x = 1100;

        if (x > 100) {
            bonus = (x / 100);
        } else {
            bonus = 0;
            System.out.println((balance + x + bonus));}
    }
}
