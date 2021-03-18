public class OddDigits {
    public static int oddDigit(int n)  {
        if (n == 0)
            return 0;
        else {
            int num = n % 10;
            if (n % 2 != 0) {
                return 10*oddDigit(n/10) + num;
            }
            return oddDigit(n/10);
        }
    }
    public static void main(String[] args) {
        System.out.println(oddDigit(34561));

    }
}
