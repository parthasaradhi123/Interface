interface IDemo
{
	void m1();
	
}
interface IDemo1
{
	void m1();
}

class DemoImp implements IDemo,IDemo1
{
	@Override
	public void m1()
	{
		System.out.println("I am implementing a common method only once "
				+ " that is present in both interfaces :: ");
	}

	 
}


public class NewInhe {

	public static void main(String[] args)
	{
			IDemo d = new DemoImp();
			
			d.m1();

	}

}
