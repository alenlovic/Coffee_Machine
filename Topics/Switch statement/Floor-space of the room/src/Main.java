import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // start coding here

        String str = scanner.nextLine();
        double a, b, c, r, p, result;

        switch (str) {
            case "rectangle":
                a = scanner.nextDouble();
                b = scanner.nextDouble();
                System.out.println(result = a * b);
                break;
            case "circle":
                r = scanner.nextDouble();
                result = r * r * 3.14f;
                System.out.printf("%.2f", result);
                break;
            case "triangle":
                a = scanner.nextDouble();
                b = scanner.nextDouble();
                c = scanner.nextDouble();
                p = (a + b + c) / 2;
                System.out.println(result = Math.sqrt(p * (p-a) * (p-b) * (p-c)));
                break;

        }
    }
}