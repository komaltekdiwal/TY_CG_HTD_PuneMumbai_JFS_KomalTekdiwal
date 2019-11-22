package methodoverloading;

public class Train 
{
	void search(String name)
	{
		System.out.println("Search train with name");
	}
	
	void search(int num)
	{
		System.out.println("Search train with num");
	}
}
