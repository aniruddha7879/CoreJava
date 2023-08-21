public class Loop
{
 public static void main(String[]args)
  { 
    String Bikes[] = {"KTM", "BMW", "Royal Enfield", "Avenger", "R15"};
    System.out.println(Bikes[2]);
    System.out.println(Bikes.length);

    for (int i=0; i < Bikes.length; i++)
    System.out.println(Bikes[i]);
  }
}