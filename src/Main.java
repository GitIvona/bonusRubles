public class Main {
    public static void main(String[] args) {
        int currentAccount = 10;
        int cashInflow = 1001;
        int bonusRubles;
        int sum = currentAccount + cashInflow;
        if (cashInflow > 1000) {
            bonusRubles = cashInflow / 100;
        } else {
            bonusRubles = 0;
        }


        System.out.println("Бонус равен : " + bonusRubles + " руб.");
        System.out.println("Итоговый счет равен : " + sum + " руб.");


    }
}
