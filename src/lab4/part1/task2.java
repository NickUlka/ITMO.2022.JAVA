package lab4.part1;

public class task2 {
    public static void main(String[] args) {
        System.out.print("Делится на 3: ");
        divideByThreeFive(3);
        System.out.print("\nДелится на 5: ");
        divideByThreeFive(5);
        System.out.print("\nДелится на 3 и на 5: ");
        divideByThreeAndFive(3, 5);
    }

    public static void divideByThreeFive(int num) {
        for (int i = 1; i < 101; i++) {
            if (i % num == 0) {
                System.out.print(i + " ");
            }
        }
    }

    public static void divideByThreeAndFive(int three, int five) {
        for (int i = 1; i < 101; i++) {
            if (i % three == 0 && i % five == 0) {
                System.out.print(i + " ");
            }
        }
    }
}
