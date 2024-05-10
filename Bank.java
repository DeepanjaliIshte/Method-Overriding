// How to create method overriding program in java.
public class Bank 
{
	int getgetRateOfInterest()
	{
		return 0;
	}
}
class SBI extends Bank
{
	int getRateOfInterest()
	{
		return 7;
		}
}
class ICICI extends Bank
{
	int getRateOfInterest()
	{	
		return 10;
		}
}
class AXIS extends Bank
{
	int getRateOfInterest()
	{
		return 17;}
}


