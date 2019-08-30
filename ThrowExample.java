package corejava;

public class ThrowExample 
{
	static void checkEligibility(int stuage, int stuweight) 
	{
		if(stuage<12 && stuweight<40) 
		{
			throw new ArithmeticException("stu is nt eligible for registration");
		}
		else 
		{
			System.out.println("stud entry is valid");
		}
	}
	public static void main(String args[]) 
	{
		System.out.println("welcome to the reg process");
		checkEligibility(10, 39);
		System.out.println("hv a nyc day");
	}
}

































