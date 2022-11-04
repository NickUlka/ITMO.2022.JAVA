package lab9.task2;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Program {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add ("Иванов");
        list.add ("Иванова");
        list.add ("Иванов");
        list.add ("Иванова");
        System.out.println("Первоначальный списк:\n" +list);
        Set<String> listNoDupl = noDuplicate(list);
        System.out.println("Список без дубликатов:\n" +listNoDupl);
    }

    static Set<String> noDuplicate (List<String> l){
        return new HashSet<>(l);}
}
