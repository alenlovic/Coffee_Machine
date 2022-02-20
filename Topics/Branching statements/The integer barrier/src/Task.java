// write your answer here
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    // put your code here
    Scanner scanner = new Scanner(System.in);

    int sum = 0;

    while (sum < 1000) {
      int input = scanner.nextInt();
      sum = sum + input;
      if (input == 0) {
        break;
      } else if (sum >= 1000) {
        break;
      }
    }
    if (sum >= 1000) {
      System.out.println(sum - 1000);
    } else {
      System.out.println(sum);
    }
  }
}

