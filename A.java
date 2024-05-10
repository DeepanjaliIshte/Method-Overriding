
public class A 
{
	void f1()			// Overridden method
	{
		System.out.println(" f1() of A ");
	}
}
class B extends A
{
	void f1()			// Overriding method
	{
		System.out.println("f1() of B" );
	}
}
