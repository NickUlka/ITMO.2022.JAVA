package lab6.task1;

import lab6.task2.Displayable;

abstract class Person implements Displayable {
 private String name;
 private String surname;

 public Person (String name, String surname)
 {
     this.name =name;
     this.surname=surname;
 }

    public String getName() {
        return name;
    }
    public String getSurname() {
        return surname;
    }

 public abstract void display();
}


