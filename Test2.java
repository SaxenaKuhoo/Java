// when we create the object of a child class then automatically  object of the parent class created ?
// Answer is no 
// to check this 
// i am using the Object class hashCode() method 
// if it returns the same  hashcode then object is not created 
// observe the code:- 

package p6;

class first {
    public first() {

        System.out.println(this.hashCode());
    }
}

class Second extends first {
    Second() {
        super();

        System.out.println(this.hashCode());
    }
}

public class Test2 {
    public static void main(String[] args) {
        Second obj = new Second();

    }
}