import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner input = new Scanner(System.in);

        int size = input.nextInt();
        int[] array = new int[size];

        int count = 0;

        for (int i = 0; i < size; i++) {
            array[i] = input.nextInt();
        }

        for (int i = 0; i < array.length - 2; i++) {
            if (array[i] +1 == array[i+1] && array[i] +2 == array[i+ 2]) {
                count++;
            }
        }
        System.out.println(count);



    }
}