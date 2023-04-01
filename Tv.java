interface IRemote 
{
	//srs
//	public static final int MIN_VOLUME = 0;
//	public static final int MAX_VOLUME = 100; // by default it is how the value is given
	
	int MIN_VOLUME = 20;
	int MAX_VOLUME = 100;
	
}
public class Tv implements IRemote{   

	
	static final int  x =10;
	public static void main(String[] args) 
	{
		int MIN_VOLUME = 100;
		//IRemote.MIN_VOLUME = 25;  we cannot change the value of an interface variable because it is final.
		
		System.out.println(IRemote.MIN_VOLUME); // If a local variable is available with same name go for these way
		System.out.println(MIN_VOLUME); // we can access that interface varibale directly if no local varaible is present 
		                                // with same name 

	}

}
