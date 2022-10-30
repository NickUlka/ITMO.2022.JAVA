package lab6.task1;

public class Employee extends Person {
    private String bank;

    public Employee(String name, String surname, String bank) {
        super(name, surname);
        this.bank = bank;
    }

    @Override
    public void display() {
        System.out.printf("Служащий банка %s - %s %s\n", bank, getName(), getSurname());
    }
}
