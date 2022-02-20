import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // start coding here

        int a = 0;
        int b;

        do {
            b = scanner.nextInt();
            if (b > a) {
                a = b;
            }
        } while (b != 0);
        System.out.println(a);
    }
}