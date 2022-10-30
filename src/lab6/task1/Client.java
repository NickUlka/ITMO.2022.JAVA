package lab6.task1;

public class Client extends Person {
    private String bank;

    public Client(String name, String surname, String bank) {
        super(name, surname);
        this.bank = bank;
    }

    @Override
    public void display() {
        System.out.printf("Клиент банка %s - %s %s\n", bank, getName(), getSurname());
    }
}
