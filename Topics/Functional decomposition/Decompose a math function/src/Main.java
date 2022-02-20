import java.util.Scanner;

class MultipleFunction {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double x = scanner.nextDouble();
        System.out.println(f(x));
    }

    public static double f(double x) {
        //call your implemented methods here.
        if (x <= 0) {
            return f1(x);
        } else if (0 < x && x < 1) {
            return f2(x);
        } else if (x >= 1) {
            return f3(x);
        } else {
            return 0;
        }
    }
    //implement your methods here
    public static double f1(double x) {
        double d1 = (Math.pow(x, 2) + 1);
        return d1;
    }
    public static double f2(double x) {
        double d2 = (1/Math.pow(x, 2));
        return d2;
    }

    public static double f3(double x) {
        double d3 = (Math.pow(x, 2) - 1);
        return d3;
    }
}