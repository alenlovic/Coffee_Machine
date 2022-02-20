import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // start coding here
        String replaceNumber = scanner.next();

        String tools = replaceNumber.replace("a", "b");

        System.out.println(tools);
    }
}