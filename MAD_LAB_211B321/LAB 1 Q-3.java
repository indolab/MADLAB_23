import java.util.Scanner;

public class Main
{
   public static void main(String[] args)
   {
      Scanner scan = new Scanner(System.in);
      
      System.out.print("Enter the Number: ");
      int num = scan.nextInt();
      
      System.out.println("\n---Multiplication Table of " +num+ "---");
      for(int i=1; i<=10; i++)
         System.out.println(num+ " * " +i+ " = " +(num*i));
   }
}