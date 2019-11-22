package interfac;

public class InterfaceImpl implements InterfaceExample
{

	@Override
	public void print()
	{
		System.out.println("Implemented print method");
	}
	
	/*@Override
	public static void show()
	{
		System.out.println("Static method of interface");
		
	}
	*/
	
	@Override
	public void printNum() 
	{
		System.out.println("Implementing printNum method");
	}
		

	
	@Override
	public void display()
	{
		System.out.println("Implemented display method of Interface");
	}
	
	public static void main(String[] args) 
	{
		InterfaceExample ie = new InterfaceImpl();
		ie.print();
		ie.display();
		ie.printNum();
	}

	
}
