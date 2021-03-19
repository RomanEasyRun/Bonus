public class Main {
    public static void main(String[] args) {
        int balance = 30;
        int transfer = 1400;
        int condition = 1000;
        int bonus = transfer / 100;
        if (transfer >= condition) {
        } else {
            bonus = 0;
        }
        int total = balance + transfer + bonus;
        System.out.println(bonus);
        System.out.println(total);
    }
}
