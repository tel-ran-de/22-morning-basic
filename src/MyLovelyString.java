public class MyLovelyString {
    public static void main(String[] args) {
        String firstname = "Andrej";
        String secondName = "Podlubnyj";
        char copyright = '\u00A9';
        int age = 18;
        char space = ' ';
        String space2 = " ";
        char tab = '\t';
        char newLine = '\n';
        System.out.println(firstname + space + secondName + space + copyright + space + age);
        System.out.println(firstname + tab + secondName + tab + copyright + tab + age);
        System.out.println(firstname + " " + secondName + " " + copyright + " " + age);
        System.out.println(firstname + newLine + secondName + newLine + copyright + newLine + age);
    }
}
