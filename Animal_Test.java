
public class Animal_Test 
{
	public static void main(String[] args)
	{
		Animal an=new Animal();	//	Animal reference and object.
		Animal obj=new Dog();	//	Animal 	reference but Dog
		an.move();			// Runs the method in Animal class.
		obj.move();			// Runs the method in the Dog class 
	}

}
