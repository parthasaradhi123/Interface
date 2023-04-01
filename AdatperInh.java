interface Ih
{
	void m1();
	void m2();
	void m3();
	void m4();
	void m5();
	void m6();
	void m7();
	void m8();
}

abstract class Adapter implements Ih   
{
	public void m1(){};
	public void m2(){};
	public void m3(){};
	public void m4(){};
	public void m5(){};
	public void m6(){};
	public void m7(){};
	public void m8(){};
}
class H extends Adapter
{
	public void m1()
	{
		System.out.println(" I want only  this method :: ");
	}
}



public class AdatperInh {

	public static void main(String[] args) 
	{
		Ih a = new H();
		 a.m1();
		 
	}

}
