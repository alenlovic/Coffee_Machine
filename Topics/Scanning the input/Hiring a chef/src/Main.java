import javax.sound.midi.Soundbank;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // start coding here

        int N = scanner.nextInt();
        int M = scanner.nextInt();
        int K = scanner.nextInt();

        if (K > N * M) {
            System.out.println("NO");
        } else {
            System.out.println("YES");
        }



    }
}