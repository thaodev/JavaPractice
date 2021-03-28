class Math {
    public static double PI = 3.14;

    public static int abs(int x) {
        if (x < 0) return x = -x;
        else return x;
    }

    public static int add(int x, int y) {
        return  x + y;

    }

    public static int substract(int x, int y) {
        return x - y;
    }

    public static int min(int x, int y){
        if (x > y) return y;
        else return x;
    }

    public static int max(int x, int y) {
        if (x < y) return y;
        else return x;
    }

    public static int pow(int x, int y) {
        int powN = 1;
        for (int i = 1; i <= y; i++) {
            powN *=x;
        }
        return powN;
    }
}

class Outcome {
    public static void main(String[] args) {
        System.out.println(Math.PI);
        System.out.println(Math.abs(-2));
        System.out.println(Math.add(2, 3));
        System.out.println(Math.substract(2, 3));
        System.out.println(Math.min(2, 3));
        System.out.println(Math.max(2, 3));
        System.out.println(Math.pow(2, 3));

    }
}
