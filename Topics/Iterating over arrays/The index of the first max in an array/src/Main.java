import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner input = new Scanner(System.in);

        int size = input.nextInt();
        int[] array = new int[size];
        int pos = 0;

        for (int i = 0; i < size; i++) {
            array[i]= input.nextInt();
        }

        int max = array[0];

        for (int i = 1; i < array.length; i++) {
            if (max < array[i]) {
              pos = i;
              max = array[i];
            }
        }
        System.out.println(pos);
    }
}