package corejava;
interface Exam
{
	void percent_cal();
}
class Student
{
	String name;
	int roll_no, mark1, mark2;
	Student(String n, int r, int m1, int m2)
	{
		name=n;
		roll_no=r;
		mark1=m1;
		mark2=m2;
	}
	void display()
	{
		System.out.println("name of stud:"+name);
		System.out.println("rollno of stud:"+roll_no);
		System.out.println("marks of stud:"+mark1);
		System.out.println("marks of stud:"+mark2);	
	}
}
class Result extends Student implements Exam
{
	Result(String n, int r, int m1, int m2)
	{
		super(n,r,m1,m2);
	}
	public void percent_cal()
	{
		int total=(mark1+mark2);
		float percent=total*100/200;
		System.out.println("Percentage:"+percent+"%");
	}
	void display()
	{
		super.display();
	}
}
class MultipleDemo
{
	public static void main(String agrgs[])
	{
		Result R=new Result("John",12,93,84);
		R.display();
		R.percent_cal();
	}
}
