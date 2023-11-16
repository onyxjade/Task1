import static java.lang.Math;

public class task9 {

    public static int add(int a , int b) {
        System.out.println(Math.addExact(15 , 29));
        return b;
    }

    public static int subtract(int a, int b) {
        System.out.println(Math.subtractExact(15 , 29));
        return b;
    }

    public static int multiply(int a, int b) {
        System.out.println(Math.multiplyExact(15 , 29));
        return b;
    }

    public static int divide(int a, int b) {
        System.out.println(Math.floorDiv(15 , 29));
        return b;
    }

    public static void main(String[] args) {
        System.out.println(15 + 29);
        System.out.println(15 - 29);
        System.out.println(15 * 29);
        System.out.println(15 / 29);
    }
}