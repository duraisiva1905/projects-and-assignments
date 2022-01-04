import java.util.Scanner;
public class powerOfNum{
    public static void main(String args[]) {
     Scanner s =new Scanner(System.in);
     System.out.println("enter a number and a power to that number respectively");
   long n=s.nextLong();
   long p=s.nextLong();
    long result=1;
   for(int i=1;i<=p;i++)
   {
      result=result*n;
   }
   System.out.println(n+" "+"power"+" "+p+" "+"is :"+result);
       }
}