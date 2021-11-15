//import java.util.Scanner;

class IllegalAgeException extends Exception {
    IllegalAgeException(String a) {
        super(a);
    }
}

public class Vote {
    static void validate(int age) throws IllegalAgeException {
        if (age < 18 || age >= 60)
            throw new IllegalAgeException("Not valid");
        else

            System.out.println("Welcome to vote");
    }

    public static void main(String args[]) {
        // Scanner s = new Scanner(System.in);
        // System.out.println("Enter age");
        try {
            int a = Integer.parseInt(args[1]);
            validate(a);
            System.out.println(args[0]);
        } catch (IllegalAgeException m) {
            System.out.println("Exception occured: " + m);
        } catch (Exception e) {
            System.out.println(e);
        } finally {
            // s.close();
        }
        // System.out.println("rest of the code...");
    }
}
