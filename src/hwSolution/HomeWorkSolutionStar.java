package hwSolution;

public class HomeWorkSolutionStar {
    public static void main(String[] args) {
        // Написать формулу вычисления стоимости Евро, если курс Евро к Доллару 1,1.

        double myUSMoney = 500;
        System.out.println(currencyConverter(myUSMoney));
        System.out.println(function(1000));
    }

    public static double currencyConverter(double input) {
        final double COURSE = 1.1;
        double euro = input / COURSE;
        return euro;
    }

    public static double function(double x) {
        double z = 1.1;
        double y = x / z;
        return y;
    }
}
