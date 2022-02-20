import java.util.*;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // write your code here
        Scanner input = new Scanner(System.in);

        int sizeOfArray = 3;
        int[] firstBox = new int[sizeOfArray];
        int[] secondBox = new int[sizeOfArray];

        for (int i = 0; i < sizeOfArray; i ++) {
         firstBox[i] = input.nextInt();
        }

        for (int i = 0; i < sizeOfArray; i ++) {
            secondBox[i] = input.nextInt();
        }

        Arrays.sort(firstBox);
        Arrays.sort(secondBox);

        if (firstBox[0] < secondBox[0] && firstBox[1] < secondBox[1] && firstBox[2] < secondBox[2]) {
            System.out.println("Box 1 < Box 2");
        } else if (firstBox[0] > secondBox[0] && firstBox[1] > secondBox[1] && firstBox[2] > secondBox[2]){
            System.out.println("Box 1 > Box 2");
        } else {
            System.out.println("Incompatible");
        }
    }
}