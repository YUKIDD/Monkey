import java.util.Arrays;
import java.util.Random;

/**
 * Java版猴子问题
 */
class Monkey {
    public static void main(String[] args) {
        int[] apes = new int[20];

        for (int i = 0; i < apes.length; i++) {
            apes[i] = 20;
        }

        for (int i = 0; i < 365 * 20; i++) {
            for (int j = 0; j < apes.length; j++) {
                if (apes[j] != 0) {
                    apes[j] -= 1;
                    apes[god(apes.length - 1, j)] += 1;
                }
            }
        }

        Arrays.sort(apes);

        for (int ape : apes) {
            System.out.println("-".repeat(ape) + ape);
        }
    }

    public static int god(int max, int exclude) {
        int temp;
        Random random = new Random();
        do {
            temp = random.nextInt(max);
        } while (temp == exclude);
        return temp;
    }
}