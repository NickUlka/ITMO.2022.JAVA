package lab4.part2;

import java.util.Arrays;

public class task1 {
    static private boolean isTrue;

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6};
        System.out.println("Массив " + Arrays.toString(array));
        if (isSorted(array)) {
            System.out.println("OK");
        } else {
            System.out.println("Please, try again");
        }
    }

    public static boolean isSorted(int[] array) {

        for (int i = 1; i < array.length; i++) {

            if (array[i] > array[i - 1]) {
                isTrue = true;
            } else {
                isTrue = false;
                break;
            }
        }
        return isTrue;
    }
}

