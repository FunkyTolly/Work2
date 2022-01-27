package Work;

public class JavaHomeWork {

    public static void main(String[] args) {


        ResetTwoNumer(1, 9);
        System.out.println(ResetTwoNumer(1, 9));
        NumberZero();
        ReturnNumberOne(666);
        System.out.println(ReturnNumberOne(666));
        MetodFor();
        ADER();
    }



    public static boolean ResetTwoNumer(int a, int b) {
        return a + b >= 10 && a + b <= 20;
    }

    public static void NumberZero() {
        int x = 12;
        if (x < 0) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }

    public static boolean ReturnNumberOne(int z) {
        if (z <= 0) {
            return true;
        } else {
            return false;
        }

    }

    public static void MetodFor() {
        String srt = "Boston";
        int y = 2;
        for (int i = 0; i < y; i++) {
            System.out.println(srt);
        }
    }

    public static  boolean ADER() {        // не сам сделал, пробовал, но было сложно :/
        int y = 2022;
        if (y % 4 != 0) {
            return false;
        } else if (y % 400 == 0) {
            return true;
        } else if (y % 100 == 0) {
            return false;
        } else {
            return true;
        }
    }
}

