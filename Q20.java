// Create an array which will be able to store only numbers like int, float, double etc, but not any other data type

import java.util.ArrayList;

public class Q20 {
    public static void main(String[] args) {
        ArrayList<Object> a1=new ArrayList<>();
        Object obj = 10;
        Object obj1 = 10.06;
        Object obj2 = 'a';
        if(obj instanceof Number){
            a1.add(obj);
        }
        if(obj2 instanceof Number){
            a1.add(obj2);
        }
        if (obj1 instanceof Number){
            a1.add(obj1);
        }
        for(Object res : a1){
            System.out.println(res);
        }
    }
}
