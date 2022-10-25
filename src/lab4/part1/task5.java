package lab4.part1;

import java.lang.reflect.Array;
import java.util.Arrays;

public class task5 {
    public static void main(String[] args) {
        int[] array = {48,33,15,4,3,3};
        System.out.println("Массив" + Arrays.toString(array));
        if (minLengthArray(array)){
      if (threeFirstLast(array)){
          System.out.println(threeFirstLast(array));
      }}
        else {System.out.println("Длина массива должна быть больше одного знака");}
    }
public static boolean threeFirstLast (int []array)
{
    return array[0]==3 || array[array.length-1]==3;
}
public static boolean minLengthArray (int[]array)
{
 return array.length>=2;
}
}
