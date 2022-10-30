package lab6.task1;

public class Main {
    public static void main(String[] args) {
        Employee employee=new Employee("Анна", "Иванова", "ВТБ");
        Client client =new Client("Иван", "Петров", "Санкт-Петербург");
        employee.display();
        client.display();
    }
}
