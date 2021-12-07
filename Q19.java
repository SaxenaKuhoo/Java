
//Write a program in java to check string contains special characters in java

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Q19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String");
        String s = sc.next();
        Pattern p = Pattern.compile("[^a-z0-9]", Pattern.CASE_INSENSITIVE);
        Matcher m = p.matcher(s);
        boolean res = m.find();
        if(res){
            System.out.println("Special characters found");
        }
        else {
            System.out.println("No special character");
        }
    }
}
© 2021 GitHub, Inc.
