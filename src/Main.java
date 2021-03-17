public class Main {
    public static void main(String[] args) {
int balance = 30;
int transfer = 1400;
int condition1 = 100;
int condition2 = 1000;
int bonus = transfer / condition1;
int total = balance + transfer + bonus;
if (transfer > condition2) {
    transfer = condition2;
}
        System.out.println(bonus);
        System.out.println(total);
    }
}
