import java.util.Scanner;

public class LuckyNumberDoWhile {
    public static void main(String[] args) {
        System.out.print("Would you like to play?");
        System.out.println();
        Scanner input = new Scanner(System.in);
        String ans = input.next();
        int count = 1;
        do {
            int lucky_number = 55;
            Scanner guess = new Scanner(System.in);
            int num = guess.nextInt();
            if (num > lucky_number) {
                System.out.print("Your guess is greater than the lucky number");
                System.out.println();
            }
            else if (num < lucky_number) {
                System.out.print("Your guess is smaller than the lucky number");
                System.out.println();
            }
            else {System.out.print("You are right after " + count + " times of guessing"); }
            count++;
        }
        while (ans.equals("Yes"));



    }
}
