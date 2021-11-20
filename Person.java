// user defined class person

public class Person
{
  // attributes of the class
  public int age;
  public char gender;
  // method
  public void display()
  {
    System.out.println(age);
    System.out.println(gender);
  }
}
 class PersonMain {
  public static void main(String[] args) {
    Person neeraj = new Person(); // object creation
    neeraj.age = 30;
    neeraj.gender='M';
    neeraj.display();
  }
}