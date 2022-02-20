// write your answer here
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    // put your code here
    Scanner input = new Scanner(System.in);

    int brojElemenata = input.nextInt();
    int max = 0;

    for (int n = 1; n <= brojElemenata; n++) {
      int niz = input.nextInt();
      if (niz % 4 == 0) {
        max = Math.max(niz, max);
      }
    }
    System.out.println(max);
  }
}
