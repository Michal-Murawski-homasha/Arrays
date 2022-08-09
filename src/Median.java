import java.util.Arrays;

public class Median {
    public static void main(String[] args) {
        int[] someNumbers = {16, 512, 24, 1024, 8, 4, 64, 32, 128, 2, 256};
        System.out.println(Arrays.toString(someNumbers));
//        int[] sortNumbers = new int[someNumbers.length];
        for (int i = 0; i < someNumbers.length; i++) {
            for (int j = 0; j < someNumbers.length - 1; j++) {
                if (someNumbers[j] > someNumbers[j + 1]) {
                    int tmp = someNumbers[j + 1];
                    someNumbers[j + 1] = someNumbers[j];
                    someNumbers[j] = tmp;
                }
            }
        }

        System.out.println(Arrays.toString(someNumbers));
    }
}
