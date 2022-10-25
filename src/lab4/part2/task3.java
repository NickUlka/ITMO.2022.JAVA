package lab4.part2;

import java.util.Arrays;

public class task3 {

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6};
        System.out.println("Массив1 " + Arrays.toString(array));
        change(array);
        System.out.println("Массив2 " + Arrays.toString(array));
    }

    public static void change(int[]array) {
        int a= array[0];
        array[0] = array[array.length-1];
        array[array.length-1]=a;
    }

}
