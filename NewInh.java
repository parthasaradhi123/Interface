interface IName
{
	public static final  int a =10;
	public static final int b = 20;
	int c = 30;
	
	public abstract void m1();
	void m2();
	public abstract void m3();
	void m4(int i);
	
}
interface IName1  
{
	public static final int x = 420;
	public static final String name = "partha";
	
	void m5();
	public abstract int dip(int j);
	
}

interface IName2 extends IName, IName1
{
	public void m6();
}

abstract class Partha implements IName2,IName,IName1
{
	public void m1()
	{
		System.out.println("I am in partha class but belong to IName interface m1() :: ");
	}
	
	public void m2()
	{
		System.out.println("I am in partha class but belong to IName interface m2() :: ");
	}
	public void m3()
	{
		System.out.println("I am in partha class but belong to IName interface m2() :: ");
	}
	public void m4(int x)
	{
		System.out.println(x);
	}
//	public void m5()
//	{
//		System.out.println("I am in partha class but belong to IName1 interface m5() :: ");
//	}
//	
//	public int dip(int c)
//	{
//		return c;
//	}
	
	
}

abstract class Partha1 extends Partha
{
	public void m5()
	{
		System.out.println("I am in partha1 class but belong to IName1 interface m5() :: ");
	}
	
	public int dip(int c)
	{
		return c;
	}
}
class Partha2 extends Partha1
{
	public void m6()
	{
		System.out.println("I am in partha2 class but belong to IName2 interface m6() :: ");
	}
}




public class NewInh {

	 

	public static void main(String[] args)
	{
		
		
		int a =1;
		int b = 2;
		int c = 3;
		int x = 4;
		String name = "ParthaSaradhiReddy";
		
		
		IName in = new Partha2();
		
		in.m1();
		in.m2();
		in.m3();
		in.m4(in.a);
		System.out.println("=============================================================="); 
		((IName1) in).m5(); // here we are downcasting because we have created parent type reference to IName 
		                    // not for IName1 so in order to access IName1 Variables we should downcast the IName
		((IName2) in).m6();
		int d = ((IName1) in).dip(in.b);
		
		System.out.println(d);
		
		
		System.out.println(in.a);
		System.out.println(in.b);
		System.out.println(in.c);
		System.out.println(IName1.x);
		System.out.println(IName1.name);
		System.out.println("===================================================");
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(x);
		System.out.println(name);
		
	}

}
