import java.util.Scanner;

public class StringInArray {
    public static void show(String[] array) {
        for (int i = 0; i < array.length; i++) {
            if (array[i].length() > 3) {
                System.out.print("[" + array[i] + ", " + "]");
            }
        }

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("how many elements in your array? ");
        int size = sc.nextInt();
        String[] array = new String[size];
        for (int i = 0; i < size; i++) {
            System.out.println("Enter your elements ");
            array[i] = sc.next();
        }
        show(array);
    }
}
