public class StringFirstExample {
    public static void main(String[] args) {
        helloString();
    }

    public static void helloString() {
        String sentence = "London is the capital of Great Britain!";
        int size = sentence.length();
        System.out.println(size);

        String firstWord = sentence.substring(0, 6);
        System.out.println(firstWord);

        String title = sentence.toUpperCase();
        System.out.println(title);

        String myFrontNumber = "123456789";
        int trueNumber = Integer.parseInt(myFrontNumber);
        System.out.println(myFrontNumber);
        System.out.println(trueNumber);

        String anotherNumberFromFront = "15 лет";
/*        int age = Integer.parseInt(anotherNumberFromFront);
        System.out.println(age);*/

        String strAge = anotherNumberFromFront.substring(0, 2);
        int age = Integer.parseInt(strAge);
        System.out.println(age);
    }
}
