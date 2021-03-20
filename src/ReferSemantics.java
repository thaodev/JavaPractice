import java.util.Arrays;
import java.util.Scanner;

public class ReferSemantics {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("What is number of elements in your array? ");
        int n = input.nextInt();
        int[] array = new int[n];
        System.out.println("Enter the elements of the array? ");
        for (int i = 0; i < n; i++) {
            array[i] = input.nextInt();
        }
        System.out.println("Your array will be as following:");
        System.out.println(Arrays.toString(array));
        int temp = 0;
        boolean fixed = false;
        while (!fixed) {
            fixed = true;
            for (int i = 0; i < array.length - 1; i++) {

                if (array[i] > array[i + 1]) {
                    temp = array[i + 1];//store the smaller in the temp
                    array[i + 1] = array[i]; // swap the order of smaller and bigger
                    array[i] = temp;//have the bigger take value from the temp
                    fixed = false;
                }
            }
        }

        System.out.println("Array in the order of increasing order following: ");
        System.out.println(Arrays.toString(array));

        System.out.println("Array in the order of decreasing order following: ");
        boolean sorted = false;
        while (sorted == false) {
            sorted = true;
            for (int i = 0; i <array.length - 1; i++) {
                if (array[i] < array[i + 1]) {
                    temp = array[i + 1];//store the smaller in the temp
                    array[i + 1] = array[i]; // swap the order of smaller and bigger
                    array[i] = temp;//have the bigger take value from the temp
                    sorted = false;
                }
            }
        }
        System.out.println(Arrays.toString(array));
    }

}

