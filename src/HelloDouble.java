public class HelloDouble {
    public static void main(String[] args) {
        // целые числа
        byte b1;
        short s1;
        int i1;
        long l;
        // десятичные дроби
        // плавающая точка
        float f1;
        double d1;
//        myLovelyFloat();
        // float  -->  32 bit
        // double  -->  64 bit
//        myLovelyDouble();
        myLovelyIphone();
    }

    public static void myLovelyFloat() {
        float a = (float) 3.6;
        float b = 4.6F;
        float c = 5.6f;
        float d = a + b + c;
        d = d / 2;
        System.out.println("Моя первая десятичная дробь = " + d);
    }

    public static void myLovelyDouble() {
        double a, b, c;
        a = 1;
        b = 10.99; //€
        c = a / b;
        double d1 = .1;
        double d2 = 0.1;
        System.out.println(c);
    }

    public static void myLovelyIphone() {
        double d1 = 900;
        double iphone = 1000;
        System.out.println(d1 / iphone);
    }
}
