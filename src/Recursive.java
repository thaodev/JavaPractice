import java.util.Scanner;

public class Recursive {
    public static int factorial(int n) {
        if (n==1) return 1;
        return n*factorial(n-1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("What is your number? ");
        int num = sc.nextInt();
        System.out.println(factorial(num));
    }
}
