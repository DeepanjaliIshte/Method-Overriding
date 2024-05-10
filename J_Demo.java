
public class J_Demo
{
	public static void main(String[] args)
	{
		try 
		{
			J obj = new K();
			obj.f1();
		}
		catch (Exception e) 
		{
			//  handle exception
			System.out.println("e");
		}
	}

}
