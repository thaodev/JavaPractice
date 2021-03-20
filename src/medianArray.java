import java.util.Arrays;

public class medianArray {
    public static void main(String[] args) {
        int[] array = {23, 45, 1, -4, 10};
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
        System.out.println(Arrays.toString(array));
        if ((array.length) % 2 != 0) {
            System.out.println("The median of the array is " + array[(array.length)/2]);
        }
        else {
            double median = (array[(array.length)/2 - 1] + array[(array.length)/2 + 1])/2.0;
            System.out.println("The median of the array is " + median);
        }
    }
}
