package homeworkSolution;

public class HomeworkFour {

    public static void main(String[] args) {
        /*Найти площадь и периметр прямоугольника со сторонами 10 и 15*/
        int size1 = 10;
        int size2 = 15;

        int q1 = 25;
        int q2 = 35;
        int square = findRectangleSquare(size1, size2);
        System.out.println("Площадь нашего прямоугольника равна: " + square);
        int z = findRectanglePerimeter(size1, size2);
        System.out.println("Периметр нашего прямоугольника равна: " + z);
    }

    public static int findRectanglePerimeter(int x1, int x2) {
        return 2 * (x1 + x2);
    }

    public static int findRectangleSquare(int rectangleFirstSize, int rectAngleSecondSize) {
        int result = rectangleFirstSize * rectAngleSecondSize;
        return result;
    }
}
