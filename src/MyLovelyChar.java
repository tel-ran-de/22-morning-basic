public class MyLovelyChar {
    public static void main(String[] args) {
        // helloChar();
        helloCharTwo();
    }

    public static void helloChar() {
        char c1 = 'А';
        System.out.println(c1);
        char c2 = 100;
        System.out.println(c2);
        char c3 = '™';
        System.out.println(c3);
        // utf -8, utf -16, utf -32, utf-64 , iso, koi, win-1251
        System.out.println(0 + c1);
        char c4 = 'Я';
        System.out.println(0 + c3);
        System.out.println(0 + c4);
    }

    public static void helloCharTwo() {
        char c146 = '\u039A';
        System.out.println(c146);
        char tabulator = '\t';
        System.out.println(tabulator + "я ожидаю отступ");
    }
}
