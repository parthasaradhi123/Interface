
interface Interface
{
	void m1();
	void m1(int a,int b);
}



public class AnonymosClass {

	public static void main(String[] args) 
	{
	
		Interface i = new Interface()
				{
					public void m1()
					{
						System.out.println("Hey hi I am in annonymous class :: ");
					}
					public void m1(int x, int y)
					{
						System.out.println(x+y);
					}
					
			
				};
		i.m1();
		i.m1(2, 3);
	}

}
