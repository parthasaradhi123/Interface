class Parent
{
	public static void disp()
	{
		System.out.println("Hello I am parent ");
	}
}
class Child extends Parent
{
	public static  void disp()
	{
		System.out.println("I am in child");
	}
}








public class MethodHiding {

	public static void main(String[] args) 
	{
		 Parent p = new Child();
		 p.disp();
		 

	}

}
