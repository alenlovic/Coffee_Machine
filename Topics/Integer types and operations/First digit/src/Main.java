import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here
        int number = scanner.nextInt();

        int firstDigit = Integer.parseInt(Integer.toString(number).substring(0, 1));

        System.out.println(firstDigit);


    }
}