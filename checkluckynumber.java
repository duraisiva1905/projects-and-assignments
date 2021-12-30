import java.util.Scanner;
public class checkluckynumber {
    public static void main(String args[]) {
      Scanner s=new Scanner(System.in);
      System.out.println("Enter number of digits");
       int n=s.nextInt();
      System.out.println("Enter a Number");
      long a=s.nextInt();
      long b=a;
      long sum =0;
      for(int i=1;i<n;i++)
      {
          long t=a%10;
          if(i%2==0)
          {
              sum=sum+(t*t);
              a=a/10;
              if(a==0)
              {
                  break;
              }
          }
          else
          {   
              continue;
          }
          System.out.println("The number after calculation is "+sum);
      }
      if(sum%9==0)
      {
          System.out.println("The given number "+b+" "+"is  Lucky Number");
      }
      else
      {
          System.out.println("The given number "+b+" "+"is not Lucky Number"); 
      }
    }
}