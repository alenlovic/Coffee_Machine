import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here

        Scanner input = new Scanner(System.in);

        int size = input.nextInt();
        int[] array = new int[size];

        for (int j = 0; j < size; j++) {
            array[j] = input.nextInt();
        }

        int sum = 0;
        for (int i = 0; i < size; i++) {
            sum += array[i];
        }

        System.out.println(sum);

    }
}