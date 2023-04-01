//Wap to compute length of a string 

@FunctionalInterface 
interface IPartha
{
	 int getLength(String name);
}


//==================================================================================================//
//#1
//class Los implements IPartha
//{
//	public int getLength(String name)
//	{
//		int length = name.length();
//		return length;
//	}
//}
//========================================================================================================//


public class LaunchLambda {

	public static void main(String[] args)
	{


		IPartha p = new IPartha()
								{
									public int getLength(String name)
									{
										int l = name.length();
										return l;
									}
								};
		int x = p.getLength("Shivaya");
		System.out.println(x);
		
//==================================================================================================//
//		IPartha p = name -> 
//							{
//								int length = name.length();
//								return length;
//							};
//		int y = p.getLength("Partha");
//		System.out.println(y);
//================================================================================================//
//		Los l = new Los();
//		int x = l.getLength("ParthaSaradhiReddy");
//		System.out.println(x);
//===================================================================================================//		
		
		
	}

}
