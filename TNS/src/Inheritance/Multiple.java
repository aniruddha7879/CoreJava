package Inheritance;

class Operator1 //SuperClass
{
	int a, b, c;
	
	void sum()
	{
		a=50;
		b=50;
		c=a+b;
		System.out.println("The Addition of two numbers is : "+c );
	}
	void sub()
	{
		a=50;
		b=50;
		c=a-b;
		System.out.println("The Subtraction of two numbers is : "+c );
	}
}

class Operator2 extends Operator1{
	void mul()
	{
		a=50;
		b=50;
		c=a*b;
		System.out.println("The Multiplication of two numbers is : "+c );
	}
	void div()
	{
		a=50;
		b=50;
		c=a/b;
		System.out.println("The Division of two numbers is : "+c );
	}
}
class Operator3 extends Operator2{
	void rem()
	{
		a=50;
		b=50;
		c=a%b;
		System.out.println("The Reminder of two numbers is : "+c );
	}
}



public class Multiple {

	public static void main(String[] args) {
		Operator3 obj = new Operator3();
		obj.sum();
		obj.sub();
		obj.mul();
		obj.div();
		obj.rem();
	}
	
}
