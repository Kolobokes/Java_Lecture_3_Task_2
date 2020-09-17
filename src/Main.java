public class Main {
    public static void main(String[] args) {
        int account_balance = 10;
        int transfer = 1001;
        int bonus = 0;

        if (transfer > 1_000) {
            bonus = transfer / 100;
        }

        System.out.println(bonus);

    }
}
