
/* Write a program to check whether the given no is a valid mobile number or not? The mobile no is entered by the command line
 argument
 */

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Q17 {
    public static void main(String[] args) {
        Pattern p = Pattern.compile("(0|91)?[6-9][0-9]{9}");
        Matcher m = p.matcher(args[0]);
        int count = 0;
        while (m.find()){
            count+=1;
        }
        if(count==1){
            System.out.println("Valid Mobile Number");
        }
        else {
            System.out.println("Invalid Mobile Number");
        }
    }
}
