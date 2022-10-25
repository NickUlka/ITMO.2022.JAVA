package lab4.part2;

import java.util.Arrays;

public class task4 {
    public static void main(String[] args) {
        int[] array = {6, 2, 3, 4, 2, 6};
        System.out.println("Массив " + Arrays.toString(array));
        uniqNum(array);
    }

    public static void uniqNum(int[] array) {

        for (int i = 0; i < array.length; i++) {
            int count=0;
            for (int j = 0; j < array.length; j++) {
            if (array[i] == array[j] && i!=j) {
              ++count;
            }
            }
            if (count==0){
                System.out.println("Первое уникальное значение - "+ array[i]);
                break;
            }
        }
    }
}
