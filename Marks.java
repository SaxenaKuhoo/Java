import java.util.Scanner;

class NegativeValueException extends Exception {
    NegativeValueException(String s) {
        super(s);
    }
}

class OutofRangeException extends Exception {
    OutofRangeException(String s) {
        super(s);
    }
}

public class Marks {
    static void value(int x, int y, int z) throws NegativeValueException, OutofRangeException {
        int sum = x + y + z;
        if (x < 0 || y < 0 || z < 0) {
            throw new NegativeValueException("Negative Value not Excepted ");
        } else if (x > 100 || y > 100 || z > 100) {
            throw new OutofRangeException("Out of Range Value not Excepted ");
        } else {
            System.out.println("Sum = " + sum);
            System.out.println("Average = " + sum / 3);
        }
    }

    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        String n;
        int a, b, c;
        for (int i = 0; i < 2; i++) {
            int k = (i + 1);
            System.out.println("Enter name of student " + k);
            n = s.next();
            System.out.println("enter marks");
            try {
                a = s.nextInt();
                b = s.nextInt();
                c = s.nextInt();
                System.out.println("Result of " + n);
                value(a, b, c);
            } catch (NegativeValueException o) {
                System.out.println(o);

            } catch (Exception e) {
                System.out.println(e);
            }
        }
        try {

        } finally {
            s.close();
        }
    }
}