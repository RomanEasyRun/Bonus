public class Main {
    public static void main(String[] args) {
        int balance = 30;
        int transfer = 1400;
        int conditionOne = 100;
        int conditionTwo = 1000;
        int bonus = transfer / conditionOne;
        int total = balance + transfer + bonus;
        if (transfer > conditionTwo) {
            transfer = conditionTwo;
        }
        System.out.println(bonus);
        System.out.println(total);
    }
}
