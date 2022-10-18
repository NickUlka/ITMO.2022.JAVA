package lab2.task2;

public class Student {
   private String name;
 private int age;
 private   String subject;
  private   double mark;

    public  Student(){
        name="Undefined";
    }

    public Student (String name, int age, String subject, double mark) {
        this.name=name;
        this.age=age;
        this.subject=subject;
        this.mark=mark;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", subject='" + subject + '\'' +
                ", mark=" + mark +
                '}';
    }
}
