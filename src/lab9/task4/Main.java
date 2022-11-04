package lab9.task4;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Map<User, Integer> gamers =new HashMap<>();
        gamers.put(new User("Иван"),5);
        gamers.put(new User("Елена"),15);
        gamers.put(new User("Дина"),50);
        gamers.put(new User("Денис"),5);
        Scanner scanner=new Scanner(System.in);
        System.out.print("Введите имя игрока: ");
        String gamerName= scanner.nextLine();
        findGamer(gamers,gamerName);

    }
    static void findGamer (Map<User,Integer> gamers,String name){
        boolean isFound = false;
         for (Map.Entry<User,Integer> item: gamers.entrySet()){
             if (name.equalsIgnoreCase(item.getKey().getName())){
                 System.out.println("У игрока -"+item.getKey().getName() +" - " + item.getValue() + " очков");
                 isFound=true;
                 break;
             }
         }
         if (isFound==false){
             System.out.println("Этого игрока нет в списке");
         }

    }
}
