package lab9.task3;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
         List<Integer> arrayList = new ArrayList<>();
         List<Integer> linkedList = new LinkedList<>();
        System.out.println("Продолжительность формирования ArrayList - "+CheckTime(arrayList)+" секунд");
        System.out.println("Продолжительность формирования LinkedList - "+CheckTime(linkedList)+" секунд");
    }

    static Random random = new Random();


    static void generateNumber(List<Integer> list) {
        for (int i = 0; i < 1_000_000; i++) {
            list.add(random.nextInt(100_000_000));
        }
    }

    static void chooseNumber(List<Integer> list) {
        for (int i = 0; i < 10_000; i++) {
            list.get(random.nextInt(10_001));
        }
    }

    static double CheckTime(List<Integer> list) {
     double begin = System.currentTimeMillis();
        generateNumber(list);
        chooseNumber(list);
        return (begin-System.currentTimeMillis())/1000;
    }
}
