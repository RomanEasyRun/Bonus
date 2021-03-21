public class Main {
    public static void main(String[] args) {
        int balance = 30;
        int transfer = 1200;
        int condition = 1000;
        int bonus;
        if (transfer >= condition) {
            bonus = transfer / 100;
        } else {
            bonus = 0;
        }
        int finalBalance = balance + transfer + bonus;
        System.out.println(bonus);
        System.out.println(finalBalance);
    }
}
