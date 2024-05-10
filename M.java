
public class M 
{
	// final void f1() -----------> Give you error bcoz abstract method can't be defined as final.
	 void f1()
	{
		System.out.println("f1() of M");
	}
}
class H extends M
{
	 void f1()
	{
		System.out.println("f1() of H");
	}
}
