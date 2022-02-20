import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] array = scanner.nextLine().split(" ");
        boolean ordered = true;

        for (int i = 1; i < array.length; i++){
            if (array[i-1].length() > array[i].length()){
                for (int j = 0; j < array[i].length(); j++) {
                    if (array[i - 1].charAt(j) >= array[i].charAt(j)) {
                        ordered = false;
                        break;
                    }
                }
            } else if (array[i-1].length() < array[i].length()){
                for (int j = 0; j < array[i-1].length(); j++) {
                    if (array[i - 1].charAt(j) > array[i].charAt(j)) {
                        ordered = false;
                        break;
                    }
                }
            } else {
                for (int j = 0; j < array[i].length(); j++) {
                    if (array[i - 1].charAt(j) > array[i].charAt(j)) {
                        ordered = false;
                        break;
                    }
                }
            }
        }
        System.out.println(ordered);
    }
}