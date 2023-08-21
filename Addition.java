import java.util.Scanner;

public class Addition
{
 public static void main(String[]args)
  { 
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a First Number: ");
    int num1 = sc.nextInt();
    System.out.println("Entered Number is : " +num1);
    System.out.println("Enter a First Number: ");
    int num2 = sc.nextInt();
    System.out.println("Entered Number is : " +num2);
    
    System.out.println("The Sum of above two numbers is : " + (num1 + num2));

   }
}