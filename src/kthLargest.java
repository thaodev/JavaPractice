//import java.util.Arrays;
//import java.util.Scanner;

public class kthLargest {

    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//        System.out.println("What is your integer? ");
        int k = 2;

        int[] a = {74, 85, 102, 99, 101, 56, 84};
        int temp = 0;
        boolean fixed = false;
        while (fixed == false) {
            fixed = true;
            for (int i = 0; i < a.length - 1; i++) {
                if (a[i] > a[i + 1]) {
                    temp = a[i + 1];
                    a[i + 1] = a[i];
                    a[i] = temp;
                    fixed = false;
                }
            }
        }

        System.out.println(a[k]);
    }
}
