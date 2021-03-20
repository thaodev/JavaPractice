import java.util.Arrays;
import java.util.Scanner;

public class kthLargest {

    static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("What is your integer? ");
        int k = input.nextInt();

        int[] a = {74, 85, 102, 99, 101, 56, 84};
        int temp = 0;
        boolean fixed = false;
        while (fixed == false) {
            fixed = true;
            for (int i = 0; i < a.length - 1; i++) {
                if (a[i] > a[i + 1]) {
                    temp = a[i + 1];
                    a[i + 1] = a[1];
                    a[1] = temp;
                    fixed = false;
                }
            }
        }
        if (k == 0) {
            System.out.println(a[a.length - 1]);
        } else if (k == 1) {
            //return a[a.length - 2];
            System.out.println(a[a.length-2]);
        } else {
            //return a[a.length - k];
            System.out.println(a[a.length - k]);
        }
    }
}
