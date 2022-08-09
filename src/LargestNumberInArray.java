public class LargestNumberInArray {
    public static void main(String[] args) {
        int[] someNumbers = {16, 512, 24, 1024, 8, 4, 64, 32, 128, 2, 256};
        int j = 0;
        for (int i = 0; i < someNumbers.length; i++) {
            if (someNumbers[i] > j) {
                j = someNumbers[i];
            }
        }
        System.out.print("The largest number in the array is: " + j);
    }
}
