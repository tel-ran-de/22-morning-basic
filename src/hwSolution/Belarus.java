package hwSolution;

public class Belarus {
    public static void main(String[] args) {
        // Найти соотношение площади Беларуси к площади Украины.
        //Найти, во сколько раз площадь Москвы больше площади Берлина.
/*
        System.out.println(belarusToUkraine(207000, 603000));
        System.out.println(moscowToBerlin(10000, 5000));*/

        System.out.println(squareRatio(207000, 600000));
        System.out.println(squareRatio(10000, 5000));
    }

    public static double squareRatio(double sq1, double sq2) {
        return sq1 / sq2;
    }

    public static double belarusToUkraine(double bSquare, double uSquare) {
        double result = bSquare / uSquare;
        return result;
    }

    public static double moscowToBerlin(double mSquare, double bSquare) {
        return mSquare / bSquare;
    }


}
