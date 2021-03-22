
import java.util.ArrayList;
import java.util.Scanner;

public class swapPairs {
    public static void main(String[] args){
        ArrayList<String> myList = new ArrayList<String>();
        Scanner str = new Scanner(System.in);
        String inputStr = "";
        boolean isStop = false;
        do {
            System.out.print("Enter your String?");
            inputStr = str.next();
            isStop = inputStr.toLowerCase().equals("stop");
            if (!isStop) {
                myList.add(inputStr);
            }
        }
         while (!isStop);

        System.out.println("Your list look like: " + myList);

        for (int i = 0; i < myList.size()/2 ; i++){
            String temp = myList.get(2 * i + 1);
            myList.set(2 * i + 1, myList.get(2 * i));
            myList.set(2 * i, temp);
        }
        System.out.println("After swapping, your list look like: " + myList);
    }

}
