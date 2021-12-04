//Write a program to check whether the given mail id is valid or not

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Q18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Email id");
        String s = sc.next();
        Pattern p = Pattern.compile("[A-Za-z0-9._%+-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,}");
        Matcher m = p.matcher(s);
        int count=0;
        while (m.find()){
            count+=1;
        }
        if(count==1){
            System.out.println("Valid Email ID");
        }
        else {
            System.out.println("Invalid Email ID");
        }
    }
}
