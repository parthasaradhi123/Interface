class Test
{
	int i;
	Test(int i)
	{
		this.i=i;
	}
	
	public Test disp(int i) 
	{
		if(this.i ==i)
		{
			return this;
		}
		else
		{
			return new Test(i);
		}
	}
}


public class UserDefinedObject {

	public static void main(String[] args) 
	{
		Test t = new Test(10);
		Test t1 = t.disp(10);
		Test t2 = t1.disp(100);
		Test t3 = t2.disp(100);
		
	  System.out.println(t==t1);
	  System.out.println(t1 == t2);
	  System.out.println(t3 == t2);

	}

}
