import java.util.Scanner;
public class addwithoutOperator {
    public static void main(String args[]) {
    Scanner s =new Scanner(System.in);
    System.out.println("enter the numbers");
   int a=s.nextInt();
   int b=s.nextInt();
   for(int i=0;i<b;i++)
   {
       a=a+1;
   }
   System.out.println("The result is"+a);
    }
}
   
      