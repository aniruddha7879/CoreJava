package Inheritance;

class Student //SuperClass
{
	int rollno, marks;
	String name;
	
	void input()
	{
		System.out.println("Enter your rollno, name. & marks : ");
	}
}

class Tom extends Student{
	void display()
	{
		rollno = 1;
		marks = 89;
		name = "Tom";
		
		System.out.println(rollno+ " " +name+ " " +marks);
	}
}



public class Single {

	public static void main(String[] args) {
		Tom obj = new Tom();
		obj.input();                                        
	    obj.display();
		
	}
	

}
