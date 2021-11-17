class Myclass
{
	public int num1;
	public int num2;
	Myclass()
	{
		num1 = 50_000;
		num2 = 1_45_000;
	}
	public void display()
	{
		System.out.println(num1 + "  " + num2);
	}
}
public class Finaldemo
{
	public static void main(String[] args)
	{
		final Myclass obj = new Myclass();
		obj.num1=78;
		obj.num2=79;
		obj.display();
		Myclass obj2=obj;
		//Myclass onj2 = new Myclass();
		//obj = obj2;
	}
}