/*
Create class box and box3d. box3d is extended class of box. The above
two classes going to full fill following requirement
Include constructor.
set value of length, breadth, height Find out area and volume.
Note: Base class and sub classes have respective methods and instance variables.
 */
//package p6;

class Box {
    // private class members cannot be accessed outside the class
    // private data members cannot inherit in the child class
    private int length;
    private int breadth;

    public Box() // non parameterised constructor
    {
        length = 0;
        breadth = 0;
    }

    public Box(int x, int y) // parameterised constructor
    {
        length = x;
        breadth = y;
    }

    // setter method to initialize the length and breadh variable
    public void setval(int x, int y) {
        length = x;
        breadth = y;
    }

    // method to calculate the area
    public int area() {
        return (length * breadth);
    }
} // end of the class

// Box class inherited in the child class
class Box3d extends Box {
    private int height;

    // non parameterised constructor
    public Box3d() {
        // constructor chaining

        super(); // used to invoke the constructor of the immediate base class (optional)
        height = 0;
    }

    // parameterised constructor
    public Box3d(int x, int y, int z) {
        super(x, y); // used to invoke the constructor of the parent class (mendatory)
        height = z;
    }

    // setter method to set the value
    public void setval(int x, int y, int z) {
        setval(x, y); // nesting of methods (when a method called inside the body of another method is
                      // called nesting
        height = z;
    }

    // method to calculate volume
    public int volume() {
        return (area() * height);
    }
}

public class Boxmain {
    public static void main(String arga[]) {
        Box obj1 = new Box(); // parent class object
        obj1.setval(10, 20); // used to initialize the attributes of the parent class
        Box3d obj2 = new Box3d(30, 40, 50); // child class object creation by using parameterised constructor
        System.out.println(obj1.area());
        System.out.println(obj2.volume());
    }
}