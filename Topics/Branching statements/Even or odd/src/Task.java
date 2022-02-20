// write your answer here 
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    // put your code here
    Scanner scanner = new Scanner(System.in);


    while (scanner.hasNext()) {
      int input = scanner.nextInt();
      if (input == 0) {
        break;
      } else if (input % 2 == 1) {
        System.out.println("odd");
      } else if (input % 2 == 0) {
        System.out.println("even");
      }
    }
  }
}
