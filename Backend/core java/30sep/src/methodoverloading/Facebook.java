package methodoverloading;

public class Facebook 
{
	void login(String email , String password)
	{
		System.out.println(email);
		System.out.println(password);
	}
	
	void login(long num,String password)
	{
		System.out.println(num);
		System.out.println(password);
	}
	
}
