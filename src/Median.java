import java.util.Arrays;

public class Median {
    public static void main(String[] args) {
        int[] someNumbers = {16, 512, 24, 1024, 8, 4, 64, 32, 128, 2, 256};
        System.out.println(Arrays.toString(someNumbers));
        for (int i = 0; i < someNumbers.length; i++) {
            for (int j = 0; j < someNumbers.length - 1; j++) {
                if (someNumbers[j] > someNumbers[j + 1]) {
                    int tmp = someNumbers[j + 1];
                    someNumbers[j + 1] = someNumbers[j];
                    someNumbers[j] = tmp;
                }
            }
        }
            /*int l = (someNumbers.length + 1) / 2;
            int x = someNumbers[l - 1];
            int y = someNumbers[l];
            int sum = (x + y) / 2;*/
            int l = someNumbers.length / 2;
            int sum = someNumbers[l];
        System.out.println(Arrays.toString(someNumbers));
//        System.out.println("x = " + x + ", y = " + y);
        System.out.println(sum);
    }
}
