import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        String jedan = scanner.nextLine().replaceAll(" ", "");
        String dva = scanner.nextLine().replaceAll(" ", "");
        
        System.out.println(jedan.equals(dva));

    }
}
