import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner input = new Scanner(System.in);

        int len = input.nextInt();

        int[] array = new int[len];

        for (int i = 0; i < len; i++) {
            array[i] = input.nextInt();
        }

            int count = 0;
            int n = input.nextInt();
            for (int i = 0; i < array.length; i++) {
                if (array[i] == n) {
                    count++;
                }
            }
            System.out.println(count);
        }
    }