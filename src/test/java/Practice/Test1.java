package Practice;

import io.testing.ourpack.AdditionClass;
import io.testing.ourpack.DivisionClass;
import io.testing.ourpack.SubtractionClass;

public class Test1
{
	public static void main(String[] args) throws Exception
	{
		AdditionClass a=new AdditionClass();
		int add1=a.addition1(54,85);
		System.out.println("Addition result of first method is "+add1);
		int add2=AdditionClass.addition2(45,78);
		System.out.println("Addition result of second method is "+add2);
		SubtractionClass s=new SubtractionClass();
		int sub1=s.subtraction1(54, 12);
		System.out.println(sub1);
		int sub2=s.subtraction2(54, 12);
		System.out.println(sub2);
		DivisionClass d=new DivisionClass();
		float div=d.division1(756, 15);
		System.out.println(div);
		float ft=DivisionClass.division2(45, 4);
		System.out.println(ft);	

	}
}
