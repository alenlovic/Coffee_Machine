// write your answer here
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    // put your code here
    Scanner scanner = new Scanner(System.in);

    int input = scanner.nextInt();

    for (int n = 1; n*n <= input; n++) {
      System.out.println(n*n);
    }



  }
}
