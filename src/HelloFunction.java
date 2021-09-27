public class HelloFunction {
    public static void main(String[] args) {
        fnFive();
        functionOne();
    }

    public static void functionOne() {
        System.out.println("Первая функция");
        functionTwo();
        functionThree();
    }

    public static void functionTwo() {
        System.out.println("Вторая функция");
    }

    public static void functionThree() {
        System.out.println("Третья функция");
        functionFour();
    }

    public static void functionFour() {
        System.out.println("Четвёртая функция");
    }
    public static void fnFive(){
        System.out.println("пятая функция");
    }
}
