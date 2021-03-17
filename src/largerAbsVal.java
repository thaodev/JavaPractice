import java.util.Scanner;

public class largerAbsVal {
    public static int largerAbsoluteVal(int x, int y) {
        return Math.max(Math.abs(x), Math.abs(y));
                }
    public static void main(String[] args)     {
        System.out.println(largerAbsoluteVal(-7, 3));
    }
}
