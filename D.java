
public abstract class D 
{
	abstract Object f1();
}
class S extends D
{
	S f1()
	{
	System.out.println("f1() of S");
		return(new S());
	}
}
