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
        int lengthEven = (someNumbers.length + 1) / 2;
        int x = someNumbers[lengthEven - 1];
        int y = someNumbers[lengthEven];
        int sumEven = (x + y) / 2;
        int lengthOdd = someNumbers.length / 2;
        int sumOdd = someNumbers[lengthOdd];
        System.out.println(Arrays.toString(someNumbers));
        if (someNumbers.length % 2 == 0) {
            System.out.println("x = " + x + ", y = " + y);
            System.out.println(sumEven);
        } else {
            System.out.println(sumOdd);
        }
    }
}
