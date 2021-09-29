public class Bank {
    public static void main(String[] args) {
        // Если клиент положил в банк 1000€ под 3,5%, какая сумма будет его ждать через семь лет?
/*
        double bankPerCent = 3.5;
*/
        double amount = 1000;
        int year = 7;
        System.out.println(findSumBankAmount(year, amount));
    }

    public static double findSumBankAmount(int year, double amount) {
        double bankPerCent = 3.5;
        double yearPerCent = bankPerCent * amount / 100;
        double result = amount + yearPerCent * year;
        // return amount + (bankPerCent * amount / 100) * year;
        return result;
    }

}
