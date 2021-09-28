public class Game {
    public static void main(String[] args) {
        int var1 = 5;
        int var2 = 2;
        int var3 = var1 / var2;

        double var4 = 5.0;
        double var5 = 2.0;
        double var6 = var4 / var5;
        double var7 = var1 / var2;
        double var25 = var1 / var4;

        System.out.println("Int Var3 = " + var3);
        System.out.println("double Var6 = " + var6);
        System.out.println("double Var7 = " + var7);
        System.out.println("double Var25 = " + var25);

        int var11 = (int) (var1 / var4);

        System.out.println("Int Var11 = " + var11);
        System.out.println("Магия " + 5.0 / var2);
    }
}
