package lab3.task4;

public class Tree {
    public int age;
    public boolean isAlive;
    public String name;

    public  Tree (int age, String name)
    {
        this.age = age;
        this.name=name;
    }
    public  Tree (int age,boolean isAlive, String name)
    {
        this.age = age;
        this.isAlive=isAlive;
        this.name=name;
    }
    public Tree() {
        System.out.println("Пустой конструктор без парамтров сработал");
    }
}
class JavaProgram {
    public static void main(String[] args) {
      Tree tree1=new Tree();
      Tree tree2= new Tree(3,"береза");
      Tree tree3=new Tree(100, true, "дуб");
      System.out.println("Дерево: "+tree2.name+", "+tree2.age+"-летнее");
        System.out.println("Дерево: "+tree3.name+", "+tree3.age+"-летнее, живое - "+tree3.isAlive);
    }}
