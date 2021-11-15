class InvalidCountryException extends Exception {
    InvalidCountryException(String s) {
        super(s);
    }
}

public class UserRegistration {
    static void registeruser(String n, String c) throws InvalidCountryException {
        String a = "User Outside India cannot be registered";
        String r = "India";
        if (c.equals(r) == false) {
            throw new InvalidCountryException(a);
        } else
            System.out.println("User registration done successfully ");
    }

    public static void main(String[] args) {
        try {
            registeruser(args[0], args[1]);
        } catch (InvalidCountryException e) {
            System.out.println(e);
        }
    }
}
