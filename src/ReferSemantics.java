import java.util.Arrays;

public class ReferSemantics {
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
    }

}

