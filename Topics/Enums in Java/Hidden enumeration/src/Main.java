public class Main {
  /** enum Secret {
        STAR, CRASH, START;
    }*/

    public static void main(String[] args) {
        int count = 0;
        for (Secret status : Secret.values()) {
            if (status.toString().startsWith("STAR")) {
                count++;
            }
        }
        System.out.println(count);
    }
}