public class HomeWorkSolutionFive {
    public static void main(String[] args) {
        double customerRadius = 20.5;
        double teacherRadius = 13.5;
        double merkelRadius = 30.5;
        double navalnyRadius = 33.5;

/*        System.out.println(circleSquare(45));
        System.out.println(circleSquare(customerRadius));
        System.out.println(circleSquare(merkelRadius));*/
        double myLovelyResult = findCircleLength(merkelRadius);


        System.out.println("Длина окружности = " + myLovelyResult);
    }

    //Написать программу для вычисления площади круга.
    public static double circleSquare(double r) {
        final double PI = Math.PI;
        double pipi = 3.14;
        //   return Math.PI * radius * radius;
        return pipi * r * r;
    }

    public static double findCircleLength(double radius) {
        double result = 100 * Math.PI * radius * 200;
        return result;
    }

    public static byte example() {


        return 14;
    }
}
