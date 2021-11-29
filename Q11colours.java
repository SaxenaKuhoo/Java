/*store colours in the form of an array
        ex: String colours[]={"white","blue","black","green","red","yellow"};
        display all colours repeatedly by generating colour index from Random class. If the random colour index matches to
        red stop display.
        Note: perform this task by implementing Runnabe interface*/

import java.util.Random;

public class Q11colours implements Runnable{
    public void run(){
        String arr[] = {"white","blue","black","green","red","yellow"};
        Random random = new Random();
        while (true){
            int index = random.nextInt(arr.length);
            if(arr[index]=="red"){
                break;
            }
            else {
                System.out.println(arr[index]);
            }
        }
    }

       public static void main(String[] args) {
        Thread obj2 = new Thread(new Q11());
        obj2.start();
    }
}
