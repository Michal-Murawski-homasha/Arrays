import java.util.Arrays;

public class ArraySorting {
    public static void main(String[] args) {
        int[] someNumbers = {16, 512, 24, 1024, 8, 4, 64, 32, 128, 2, 256};
        System.out.println(Arrays.toString(someNumbers));
        int j = 0;
        int[] sortNumbers = new int[someNumbers.length];
        for (int i = 0; i < someNumbers.length; i++) {
            if (someNumbers[i] < j) {
                j = someNumbers[i];
                for (j = 0; j < sortNumbers.length; j++) {
                    sortNumbers[j] = j;
                }
            }
        }
        System.out.println(Arrays.toString(sortNumbers));
    }
}
