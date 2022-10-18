package lab2.task1;

public class Calculator {
    public static void main(String[] args)
    {
System.out.println("10_000+23 = " + sum( 10_000,23) + " integer" );
        System.out.println ("10_000/23 = " +(divide(10_000d,23d)+" double"));
        System.out.println("23-10_0000 = "+(substr(23,10_000)+" integer"));
        System.out.println("10_000*23 = "+(multiply(10_000L,23L)+" long"));
    }
    static  int sum (int x, int y) {
        return x + y;
    }

    static  double sum (double x, double y) {
        return x + y;
    }

    static  long sum (long x, long y) {
        return x + y;
    }
    static  int divide (int x, int y) {
        return x / y;
    }

    static  double divide (double x, double y) {
        return x / y;
    }

    static  long divide (long x, long y) {
        return x / y;
    }
    static  int multiply (int x, int y) {
        return x * y;
    }

    static  double multiply (double x, double y) {
        return x * y;
    }

    static  long multiply (long x, long y) {
        return x * y;
    }
    static  int substr (int x, int y) {
        return x - y;
    }

    static  double substr (double x, double y) {
        return x - y;
    }

    static  long substr (long x, long y) {
        return x - y;
    }
}
