interface IHi
{
	void dip();
	void m1();
	
}
class Hey
{
	public void dip1()
	{
		System.out.println("I am in Hey class that in disp method :----:----:---: ");
	}
}

class Hello extends Hey implements IHi
{
	public void dip()
	{
		System.out.println("I am In Hello class But I am dip method belong to IHi interface");
	}
	public void m1()
	{
		System.out.println("I am a interface methos m1 present in hello");
	}
}




public class ExtendInterface {

	public static void main(String[] args) 
	{
		
		 Hello h = new Hello();
	
		h.dip();
		h.m1();
		h.dip1();
		
		

	}

}
