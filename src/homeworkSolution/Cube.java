package homeworkSolution;

public class Cube {
    public static void main(String[] args) {
        short cubeSize1 = 20;
        short cubeSize2 = 5;
        short cubeSize3 = 33;

        System.out.println("Периметер куба1: " + findCubePerimeter(cubeSize1));
        System.out.println(findCubeSquare(cubeSize1));
        System.out.println("Периметер куба2: " + findCubePerimeter(cubeSize2));
        System.out.println(findCubeSquare(cubeSize2));
        System.out.println("Периметер куба3: " + findCubePerimeter(cubeSize3));
        System.out.println(findCubeSquare(cubeSize3));
    }

    public static short findCubeSquare(short cubeSize) {
        return (short) (6 * cubeSize * cubeSize);
    }

    public static short findCubePerimeter(short cubeSize) {
        return (short) (12 * cubeSize);
    }
}
