import java.sql.SQLOutput;
import java.util.Scanner;
public class RecursiveSofArray {
    public static int sumOfArray(int[] arr, int n) {
        if (n == 1) return arr[0];
        return arr[n-1] + sumOfArray(arr, n-1);

    }
    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("How many elements in your array? ");
            int n = sc.nextInt();
            int[] arr = new int[n];
            for(int i=0;i<n;i++) {
                System.out.println("enter array's elements: ");
                arr[i] = sc.nextInt();
            }
            System.out.print("Sum of you array would be: " + sumOfArray(arr, n));
        }
    }

