public class QuadraticEquation {
    public static void main(String[] args) {
        double a = 1, b = -7, c = 12;
        double root1, root2;
        //determinant (b^2 - 4*a*c)
        //if determinant greater than 0, there are two values of root
        if (b * b > 4 * a * c) {
            var sqrt = Math.sqrt(b * b - 4 * a * c);
            root1 = (-b + sqrt)/2*a;
            root2 = (-b - sqrt)/2*a;
            System.out.println("root1 is " + root1);
            System.out.println("root2 is " + root2);

        }
        //if determinant equals to 0, there are two equal roots
        else if (b * b == 4 * a * c) {
            root1 = root2 = -b/(2 * a);
            System.out.println("root1 equals to root2 at" + root1);

        }
        //if determinant is smaller than 0,
        else {
            System.out.println("root 1 and root2 don't exist");
        }
    }
}
