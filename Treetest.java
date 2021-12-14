package Collection;
//inserting object in TreeSet and customise sort in descending order
import java.util.*;
import java.util.TreeSet;
import java.util.Comparator;
class Sorting implements Comparator
{
    @Override
    public int compare(Object o1,Object o2)
    {
        String s1= (String)o1;
        String s2= (String)o2;
        int i=s1.compareTo(s2);
        if(i>=1){
            return -1;
        }
        else if(i<=-1){
            return 1;
        }
        return 0;
    }
}
public class Treetest {
    public static void main(String[] args) {
        TreeSet<String> obj=new TreeSet<>(new Sorting());
        obj.add("kaa");
        obj.add("zoo");
        obj.add("abc");
        obj.add("abf");
        System.out.println(obj);
    }
}
