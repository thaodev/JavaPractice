import java.util.Scanner;

public class LuckyNumberUserinput {
    public static void main(String[] args) {
        System.out.print("What would you say?");
        System.out.println();
        Scanner word = new Scanner(System.in);
        String ans = word.next();
        if (ans.equals("Yes")) {
            System.out.print("You said yes");
        } else if (ans.equals("No")){
            System.out.print("Pls don't say no");
        } else {
            System.out.print("Alright, I let you go");
        }

    }
}
