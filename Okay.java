/* 
 * By naming a class interface we will achieve 100% abstraction and inside these interface class  all the methods
 * are abstract methods and their access specifiers are public by default if you dont specify anything they will
 * consoider it as abstract methods
 * */

interface IStudent   // Naming conventions followed by all the developers across globe to write a interface Iclassname
{
	void study();
	public abstract void write();
	public default void play()
	{
		System.out.println("I am in interface using default method ::  ");
	}
	public static void happy()
	{
		System.out.println("I am in interface using static method :: ");
	}
	static String s = "Partha";
	String ss = "hey";
	//private String sss = "hello"; //--> Inside an interface we cannot use private members
}

class StudentImp1 implements IStudent  // That's how you take the data present in the interface using the implements 
                                    // keyword and also don't forgot naming conventions.
{
	public void study()
	{
		System.out.println("Here I am in the StudentImp1 interface ::");
	}
	
	public void write()
	{
		System.out.println("The student is wiriting in the StudentImp1 interface");
	}
	
}
abstract class SubStudentImp1 implements IStudent
{

	public void study()
	{
		System.out.println("Here I am in the SubStudentImp1 class ::");
	}
    //public void write(); 
	public abstract void write(); // you can simply dont write these method and make the class as abstract it works
	                                 // fine or else you can just define the signature and make the class as abstract
}

class Sub1 extends SubStudentImp1
{
	
	public void write()
	{
		System.out.println("I am writing in the inhertiance class :: ");
	}
	
	public void exp()  // These is a specalized method present in child class so in order to acces it downcast
	{
		System.out.println("=================================");
		System.out.println(s.concat("Saradhi Reddy"));
		System.out.println("=================================");

	}
}













public class Okay {

	public static void main(String[] args) 
	{
		IStudent obj = new Sub1();
		
		obj.play(); // Inside a interface apart from the abstract methods we can declar default methods.
		
		//obj.happy(); if we define any static method inside an interface it is not working.

		obj.study();
		obj.write();
		((Sub1) obj).exp(); // Specalized method 
		
		//IStudent s1 = new SubStudentImp1(); cannot create an object for the abstract class make sense.
		
		//IStudent s1 = new IStudent(); we cannot create an object for the interface 
		
		IStudent s = new StudentImp1(); //This object has implemented the interface and implemented the entire methods
		                                  // so we can create an object for this class but we cannot create object for 
		                                  // above two scenarios.
		s.study();
		s.write();
		s.play();
		
	}

}
