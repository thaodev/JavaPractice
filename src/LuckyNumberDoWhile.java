import java.util.Scanner;

public class LuckyNumberDoWhile {
    public static void main(String[] args) {
        System.out.print("Would you like to play?");
        System.out.println();
        play();

    }
    public static void play() {
        Scanner input = new Scanner(System.in);
        String ans = input.next();
        int count = 1;
//        do {
//
//            int lucky_number = 55;
//            System.out.print("What is your guess?");
//            System.out.println();
//            Scanner guess = new Scanner(System.in);
//            int num = guess.nextInt();
//            if (num > lucky_number) {
//                System.out.print("Your guess is greater than the lucky number");
//                System.out.println();
//
//            } else if (num < lucky_number) {
//                System.out.print("Your guess is smaller than the lucky number");
//                System.out.println();
//            } else {
//                System.out.print("You are right after " + count + " times of guessing");
//            }
//            count++;
//            System.out.print("Do you want to continue? ");
//            System.out.println();
//            Scanner response = new Scanner(System.in);
//            String res = response.next();
//        }

//            if (res.equals("Yes")) {
//                play();
//            } else {
//                System.out.print("Fine");
//            }


//        else if (ans.equals("No")) {
//            System.out.print("You have played " + count + " times");
//        }

//        else {System.out.print("You are not even trying");}


    }


}
