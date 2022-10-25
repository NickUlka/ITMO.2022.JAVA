package lab4.part2;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Random;

public class task5 {
    public static void main(String[] args) {
        int[] array = new int[7];
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt();
        }
        System.out.println("Первоначальный массив " + Arrays.toString(array));
        int[] result = mergeSort(array);
        System.out.println("Отсортированный массив " + Arrays.toString(result));
    }

    public static int[] mergeSort(int[] ints) {
        System.out.println(Arrays.toString(ints));
        if (ints.length < 2) {
            return ints;
        }

        int mid = ints.length / 2;
        int[] left = new int[mid];
        int[] right;

        if(ints.length % 2 == 0) {
            right = new int[mid];
        } else {
            right = new int[mid + 1];
        }

        for (int i = 0; i < left.length; i++) {
            left[i] = ints[i];
        }

        for (int j = 0; j < right.length; j++) {
            right[j] = ints[mid + j];
        }

        left = mergeSort(left);
        right = mergeSort(right);


        return mergeParts(left, right);
    }


    private static int[] mergeParts(int[] left, int[] right){
        int[] result = new int[left.length + right.length];

        int leftPointer = 0;
        int rightPointer = 0;
        int resultPointer = 0;

        while (leftPointer < left.length || rightPointer < right.length) {
            if (leftPointer < left.length && rightPointer < right.length) {
                if (left[leftPointer] < right[rightPointer]) {
                    result[resultPointer++] = left[leftPointer++];
                } else {
                    result[resultPointer++] = right[rightPointer++];
                }
            } else if (leftPointer < left.length) {
                result[resultPointer++] = left[leftPointer++];

            } else if (rightPointer < right.length) {
                result[resultPointer++] = right[rightPointer++];
            }

        }

        return result;
    }



}
