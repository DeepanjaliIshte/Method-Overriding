// write a program for the following
public class Even 
{
	int a,ans;
	Even (int x)
	{
		a=x;
	}
	void cal()
	{
		if(a%2==0)
		{
			ans=a;
		}
	}
	void display()
	{
		System.out.println(ans+" is even number.");
	}
}
class Swap extends Even
{
	int b;
	Swap (int x,int y)
	{
		super(x);
		b=y;
	}
	void cal_Swap()
	{
		int t;
		t=a;
		a=b;
		b=t;
	}
	void display()
	{
		System.out.println(ans+ " is even number.");
		System.out.println("Swap of 2 numbers is "+a+" and " +b);
	}
}