import java.util.*;

public class Main {

    // write a method here
    public static int[] getFirstAndLast(int[] input) {
        int[] result = new int[2];
        result[0] = input[0];
        result[1] = input[input.length - 1];
        return result;
    }

    /* Do not change code below */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] array = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();
        int[] result = getFirstAndLast(array);
        Arrays.stream(result).forEach(e -> System.out.print(e + " "));
    }
}