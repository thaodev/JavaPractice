import java.util.Arrays;
import java.util.Scanner;

public class minGap {
    public static int minGap(int[] list) {
        if (list.length < 2) {
            return 0;
        } else {
            int min = list[1] - list[0];
            for (int i = 0; i < list.length - 1; i++) {
                int gap = list[i + 1] - list[i];
                if (gap < min) {
                    min = gap;
                }
            }
            System.out.println("The smallest gap in your array is " + min);
            return min;
        }
    }

    public static void main(String[] args) {
        System.out.print("How many elements in your arrays? ");
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        System.out.println("Time to fill our your array! ");
        int[] a = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Element of your array: ");
            a[i] = input.nextInt();
        }
        System.out.println("Your array looks like: " + Arrays.toString(a));
        minGap(a);
    }
}
