
@FunctionalInterface
interface Iadd
{
	void add(int a , int b);
	
}

@FunctionalInterface
interface ISub
{
	int sum(int a);
}



public class NonLambda 
{
	public static void main(String args[])
	{
		Iadd a = ( int x, int y)->
					{
//						int num = 10;
//						int num1 = 20;
						int res = x+y;
						System.out.println("The sum of two numbers is :: "+res);
						
					};
	a.add(10,20);
	
	  ISub s = x->x-5;
//		  				int res = x-5;
//		  					return res;	
	                
	  int i1 = s.sum(10);
	  System.out.println(i1);
	}
}
