
public abstract class J 
{
	abstract void f1() throws Exception;
}
class K extends J
{
	void f1() throws Exception
	{
		System.out.println(" f1() of K ");
	}
}
