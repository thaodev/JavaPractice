import java.util.Scanner;

public class RecursiveSum {
    public static int Sum(int n) {
        if (n == 1) return 1;
        if (n % 2 == 0) return Sum(n - 1);
        else {
            return n + Sum(n - 1);
        }
    }

    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("What is your number? ");
//        int n = sc.nextInt();
//        System.out.println(Sum(n));
//        System.out.println("Do you want to play again? ");
//        Scanner response = new Scanner(System.in);
//        String res = response.next();
        String res = "";
         do {
            Scanner num = new Scanner(System.in);
            System.out.println("What is your number? ");
            int number = num.nextInt();
            int a = Sum(number);
            System.out.println(a);
            System.out.println("Do you want to play again? ");
            Scanner response2 = new Scanner(System.in);
            res = response2.next();
        } while (res.toLowerCase().equals("yes"));

    }
}
