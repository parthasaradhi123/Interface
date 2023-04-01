interface IB
{
	void m1();
}
interface BImp
{
	void m1(int i);
}

class ImpSub implements IB,BImp
{
	public void m1()
	{
		System.out.println("Hey i am in m1() method which is overloaded ::");
	}
	
	public void m1(int j)
	{
		System.out.println("Hey i am in m1() method but it takes arguments  ::"+j);
	}
}





public class InterfaceOverloaded {

	public static void main(String[] args)
	{
		 ImpSub i = new ImpSub();
		 
		 i.m1();
		 i.m1(100);

	}

}
