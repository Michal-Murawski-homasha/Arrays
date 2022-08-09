import java.util.Arrays;

public class AverageNumbers {
    public static void main(String[] args) {
        int[] someNumbers = {16, 512, 24, 1024, 8, 4, 64, 32, 128, 2, 256};
        int j = 0;
        System.out.println("Contets of the array: " + Arrays.toString(someNumbers));
        for (int i = 0; i < someNumbers.length; i++) {
                j += someNumbers[i];
        }
        System.out.println("Sum = " + j);
        System.out.println("Average = " + j / someNumbers.length);
    }
}
