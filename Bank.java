interface IAccount
{
	
	// Abstract methods
	// 100% abstraction 
	
//	public abstract void withDraw();
//	public abstract void deposit();
//	public abstract void checkBalance();
	
	// if it is a interface class then there is no need to mention abstract in every methos
	
//	public  void withDraw();
//	public void deposit();
//	public  void checkBalance();
	
	
	// In interface if we dont specify the method as abstract also no issue if you dont specify any
	// access specifier then by default it will take public dont take default specifier
	   void withDraw();
	   void deposit();
	   void checkBalance();
	
}

abstract class AccountImp1 implements IAccount
{
	public void withDraw()
	{
		System.out.println("I am in Savings class which implements the IAccount class");
	}
	public void deposit()
	{
		System.out.println("I am in Savings class which implements the IAccount class");

	}
	public abstract void checkBalance();
	 
  
}

class subAccountImp1 extends AccountImp1
{
	 public void checkBalance()
	 {
		System.out.println(" I am in  Inheritance class which is extending the savings class :: ");
	 }
}

 





public class Bank {

	public static void main(String[] args) 
	{
		IAccount a = new subAccountImp1();
		
		a.deposit();
		a.withDraw();
		a.checkBalance();

	}

}
