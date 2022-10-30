package lab4.part1;

import java.util.Arrays;

public class task6 {
    public static void main(String[] args) {
        int[] array = {48, -13, 4, 1, 3};
        System.out.println("Массив" + Arrays.toString(array));
        System.out.println(oneThreeConsistsOf(array));
    }


    public static boolean oneThreeConsistsOf(int[] array) {
        boolean isContains = false;
        for (int j : array) {
            if (j == 1 || j == 3) {
                isContains = true;
                break;
            }
        }
        return isContains;
    }
}
